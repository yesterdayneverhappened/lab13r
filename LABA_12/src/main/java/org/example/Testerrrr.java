package org.example;


public class Testerrrr {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;



    // Работяги
    public Testerrrr(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Testerrrr(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 11.0);
    }

    public Testerrrr(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate");
    }

    // Перегруженные работяги
    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Опыт работы: " + experienceInYears);
        System.out.println("Знание английского: " + englishLevel);
        System.out.println("Зарплата: " + salary);
    }

    public void printInfo(String AddInf) {
        System.out.println("Доп инфа: " + AddInf);
        printInfo();
    }

    public void printInfo(boolean gender) {
        String g;
        if(gender)
        { g = "женщина";}
        else{g="мужчина";}
        System.out.println("Гендер: " + g);
        printInfo();
    }

    public static void staticMethod() {
        System.out.println("Обычный сатик.");
    }
}