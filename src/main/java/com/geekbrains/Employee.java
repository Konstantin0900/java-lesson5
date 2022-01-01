package com.geekbrains;

public class Employee {
    public String name;
    public String post;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("Имя: " + name + " | " + " Должность: " + post + " | " + " e-mail: " + email + " | " +
                " Тел.: " + phoneNumber + " | " + " ЗП: " + salary + " | " + " Возраст: " + age);

    }
}
class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Pavlov Pavel", "programmer1", "programmer1@mail.ru", "8999123", 400000, 45);
        employeeArray[1] = new Employee("Sergeev Sergey", "programmer2", "programmer2@mail.ru", "8999245", 100000, 44);
        employeeArray[2] = new Employee("Ivanov Ivan", "programmer3", "programmer3@mail.ru", "8999333", 120000, 35);
        employeeArray[3] = new Employee("Andreev Andrey", "programmer4", "programmer4@mail.ru", "8999852", 250000, 35);
        employeeArray[4] = new Employee("Petrov Petr", "programmer5", "programmer5@mail.ru", "8999654", 200000, 28);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}
