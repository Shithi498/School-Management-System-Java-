package Faculty_Student;

import java.util.Scanner;

public class Student {

    static Scanner input = new Scanner(System.in);
    static int num1;
    static String fa[];
    static String cf[];
    static String el[];
    static int a;

    public static void insertFaculty() {
        System.out.println("Number of faculties:");
        num1 = input.nextInt();
        fa = new String[num1];
        cf = new String[num1];
        el = new String[num1];
        System.out.println("                  Choose Faculties");
        for (int i = 0; i < num1; i++) {

            System.out.print("Faculty Name: ");
            fa[i] = input.next();

            System.out.print("Course : ");
            cf[i] = input.next();
            System.out.print("Email: ");
            el[i] = input.next();
            System.out.println("");
        }
        System.out.println("\n");

    }

    static String stuName[];

    static int id[];

    public static void insertStudent() {
        System.out.println("Number of students:");
        num1 = input.nextInt();

        stuName = new String[num1];
        id = new int[num1];
        System.out.println("              Insert Student: \n");

        for (int i = 0; i < num1; i++) {

            System.out.print("Student name: ");
            stuName[i] = input.next();

            System.out.print("Id: ");
            id[i] = input.nextInt();

        }

        System.out.println("\n");

    }

    

}
