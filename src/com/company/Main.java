package com.company;
import java.util.Scanner;


public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String choise = "";
        for (; ;) {
        System.out.print("Вы хотите добавить или найти контакт? Введите 1 - добавить, 2 - найти, 3 - выход из программы ");
        choise = in.nextLine();
            switch (choise) {
                case "1":
                    System.out.print("Введите имя ");
                    String name = in.nextLine();
                    System.out.print("Введите номер ");
                    String phone = in.nextLine();
                    Person person = new Person(name, phone);
                    System.out.print("Контакт добавлен" + "\n");
                    break;
                case "2":
                    System.out.print("Пожалуйста введите способ поиска контакта: 1 - для поиска по имени, 2 - по номеру телефона ");
                    String  searchType = in.nextLine();

                    System.out.print("Введите ключевое поле поиска: ");
                    String  searchString = in.nextLine();

                    Person.findPerson(searchType,searchString);
                    break;
                case "3":
                    return;
            }
        }

    }
}