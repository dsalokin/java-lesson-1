package Phone;

import java.util.Scanner;

public class Phone {

    /*
        Проект
        Реализовать программу для стационарного телефона, которая позволяет сохранять контакты в память.
        Требования:
        Память ограничена, поэтому максимально возможное количество контактов равно 10.
        Пользователь вводит новый контакт через команду ввода с терминала.
        Пользователь за раз может заполнить только 1 контакт, но в целом не более 10.
        Контакты можно редактировать и удалять по соответствующим командам в терминале.
        После каждой операции с контактами выводится список всех контактов, незаполненные места списка выводятся как, например, 6. …
        Программа не завершается, пока пользователь не введет или каким-либо образом выберет пункт «Сохранить и выйти».
        Особенности реализации: используйте массивы, условную логику и циклы

        1. Контакт 1 (номер телефона)
    */
    public static void main(String[] args) {

        String contactList = "№  | Номер телефона  | Имя                            |\n";

        Scanner sc = new Scanner(System.in);

        System.out.println("Наберте цифру соответствующую пункту меню:\n 1. Позвонить Сфинксу\n 2. Записная книжка\n 3. Настройки\n 4. Выключить");
        String initial_answer = sc.nextLine();
        switch (initial_answer.toLowerCase()) {
            case "1": {
                System.out.println("Висит груша, нельзя скушать. Что это?");
                String answer1_1 = sc.nextLine();
                if (answer1_1.equalsIgnoreCase("лампочка") || answer1_1.equalsIgnoreCase("лампа")) {
                    System.out.println("Верно!\nНа раскрашенных страницах\n" +
                            "Много праздников хранится. Что это?");
                    String answer1_2 = sc.nextLine();
                    if (answer1_2.equalsIgnoreCase("календарь")) {
                        System.out.println("Верно!\nАх, не трогайте меня:\n" +
                                "Обожгу и без огня! Что это?");
                        String answer1_3 = sc.nextLine();
                        if (answer1_3.equalsIgnoreCase("крапива")) {
                            System.out.println("Верно!\nА чего звонил то? Ладно, я ушел, сорян, дел по горло. Пока!");
                        } else {
                            System.out.println("Неверно! Начни заново");
                            return;
                        }
                    } else {
                        System.out.println("Неверно! Начни заново");
                        return;
                    }
                } else {
                    System.out.println("Неверно! Начни заново");
                    return;
                }
                return;
            }
            case "2": {
                System.out.println("Введите номер телефона в формате '0-000-000-00-00");
                for (int i = 1; i <= 9; i++) {
                    String answer2_1 = sc.nextLine();
                    if (answer2_1.length() == 15) {
                        System.out.println("Введите имя контакта (ограничение - 30 символов)");
                        String answer2_2 = sc.nextLine();
                        if (answer2_2.length() <= 30) {
                            System.out.println("Продолжить? 'да/нет'");
                            String answer2_3 = sc.nextLine();
                            switch (answer2_3.toLowerCase()) {
                                case "да": {
                                    System.out.println("Этот в списке! Кто следующий?");
                                    String contactList1 = contactList + i + ". | " + answer2_1 + " | "+ answer2_2;
                                    System.out.println(contactList1);
                                    return;
                                }
                                case "нет": {
                                    System.out.println("Пока!");
                                    break;
                                }
                                default: {
                                    System.out.println("только 'да' или 'нет', без других вариантов");
                                    return;
                                }
                            }
                        } else {
                            System.out.println("Короче!");
                            return;
                        }
                    } else {
                        System.out.println("Ну что сложного то, правло есть правило, здесь номера так записываются. Пробуй заново.");
                        return;
                    }
                }
                return;
            }
            case "3": {
                System.out.println("Нечего настраивать! Пользуйся тем, что дают.");
                break;
            }
            case "4": {
                System.out.println("Пока!");
                break;
            }
            default: {
                System.out.println("Введите пожалуйста значения от 1 до 4");
                break;
            }
        }


    }
}
