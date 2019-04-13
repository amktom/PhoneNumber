package com.company;
import java.util.Scanner;


public class Main {
    private static Scanner in = new Scanner(System.in);
    final static String add_ = "1";
    final static String find_ = "2";
    final static String exit_ = "3";

    public static void main(String[] args) {
        String choise = "";
        while (true) {
        System.out.print("Вы хотите добавить или найти контакт? Введите 1 - добавить, 2 - найти, 3 - выход из программы ");
        choise = in.nextLine();

        switch (choise) {

                case add_:
                    System.out.print("Введите имя ");
                    String name = in.nextLine();

                    System.out.print("Введите номер ");
                    String phone = in.nextLine();

                    Person person = new Person(name, phone);
                    Person.addPerson(person);
                    break;
                case find_:
                    System.out.print("Пожалуйста введите способ поиска контакта: 1 - для поиска по имени, 2 - по номеру телефона ");
                    String  searchType = in.nextLine();

                    System.out.print("Введите ключевое поле поиска: ");
                    String  searchString = in.nextLine();

                    Person.findPerson(searchType,searchString);
                    break;
                case exit_:
                    return;
            }
        }

    }
}