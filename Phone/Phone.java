package Phone;

import java.util.Objects;
import java.util.Scanner;

public class Phone {

    public static void getContacts(String[] contactList) {
        System.out.println("Ваш список контактов");
        for (int i = 0; i < contactList.length; i++) {
            System.out.printf("%d. | %s\n", i + 1, contactList[i]);
        }
    }

    public static void getContact(String[] contactList, int getContactId, String editContact) {
        if (getContactId < contactList.length && getContactId > 0) {
            System.out.println("Введите телефон");
            contactList[getContactId - 1] = editContact;
        } else {
            System.out.println("Диапазон значений от 0 до 9");
        }
    }

    public static void addContact(String[] contactList, String newContact) {
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] == null) {
                contactList[i] = newContact;
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initialAnswer;
        String[] contactList = new String[9];

        do {
            System.out.println("""
                    Введите цифру соответствующую пункту меню:
                     1. Вывессти список контактоа
                     2. Записать контакт
                     3. Удалить контакт
                     4. Редактировать контакт
                     5. Выключить""");
            initialAnswer = sc.next();

            switch (initialAnswer.toLowerCase()) {
                case "1" -> {
                    getContacts(contactList);
                }
                case "2" -> {
                    System.out.println("Ввведите телефон");
                    addContact(contactList, sc.next());
                }
                case "3" -> {
                    getContacts(contactList);
                    System.out.println("Введите id контакта для удаления");
                    getContact(contactList, sc.nextInt(), null);
                }
                case "4" -> {
                    getContacts(contactList);
                    System.out.println("Введите id контакта для редактирования");
                    getContact(contactList, sc.nextInt(), sc.next());
                }
            }
        } while (!Objects.equals(initialAnswer, "5"));
    }
}
