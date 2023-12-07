package Faculty_Student;

public class Display extends Student {

    public static void showAllFaculty() {
        System.out.println("              Show all faculties\n");

        for (int i = 0; i < num1; i++) {
            System.out.println("Faculty name: " + fa[i]);
            System.out.println("Course faculty :" + cf[i]);

            System.out.println("Email: " + el[i]);
            System.out.println("");
        }
        System.out.println("\n");

    }

    public static void showAllStu() {
        System.out.println("              Show all students\n");

        for (int i = 0; i < num1; i++) {
            System.out.println("Student name: " + stuName[i]);
            System.out.println("Student id: " + id[i]);
            System.out.println("");

        }

    }

}
