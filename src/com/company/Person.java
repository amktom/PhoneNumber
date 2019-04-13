package com.company;
import java.util.Scanner;
import java.util.Vector;

public class Person {
    private static Scanner in = new Scanner(System.in);
    private String name;
    private String phone;
    private static Vector<Person> personList = new Vector<Person>();

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public static void addPerson(Person person) {
        personList.add(person);
        System.out.print("Контакт добавлен" + "\n");
    }

    public static void findPerson(String searchType, String searchString) {

        switch (searchType) {

            case "1":
                for (Person persons : personList) {
                    if (persons.name.equals(searchString)) {
                        System.out.println(persons.name + ' ' + persons.phone);
                    }
                }
                break;
            case "2":
                for (Person persons : personList) {
                    if (persons.phone.equals(searchString)) {
                        System.out.println(persons.name + ' ' + persons.phone);
                    }
                }
                break;
        }
    }

    public String getName() {
        return name;
    }

    String getPhone() {
        return phone;
    }

}