package Phone;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Phone {

    public static void getContacts(String[] contactList) {
        System.out.println("Ваш список контактов");
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] == null) {
                System.out.printf("%d. | %s\n", i + 1, "...");
            }else {
                System.out.printf("%d. | %s\n", i + 1, contactList[i]);
            }
            }
        }


    public static void getContact(String[] contactList, int getContactId, String editContact) {
        if (getContactId < contactList.length && getContactId > 0) {
            contactList[getContactId - 1] = editContact;
        } else {
            System.out.println("Диапазон значений от 0 до 9");
        }
    }

    public static void addContact(String[] contactList, String newContact) {
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] == null) {
                contactList[i] = newContact;
                return;
            }else if (i == contactList.length-1){
                System.out.println("Список контактов полный, необходимо удалить или отредактировать существующий контакт");
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
                     1. Вывести список контактов
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
                    System.out.println("Введите телефон");
                    addContact(contactList, sc.next());
                    getContacts(contactList);
                }
                case "3" -> {
                    getContacts(contactList);
                    System.out.println("Введите id контакта для удаления");
                    getContact(contactList, sc.nextInt(), null);
                    getContacts(contactList);
                }
                case "4" -> {
                    getContacts(contactList);
                    System.out.println("Введите id контакта для редактирования");
                    getContact(contactList, sc.nextInt(), sc.next());
                    getContacts(contactList);
                }
            }
        } while (!Objects.equals(initialAnswer, "5"));
    }
}
