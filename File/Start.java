package File;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import Faculty_Student.*;
import Payment_System.*;
import Log_in.*;

public class Start {

    static int a;

    static int num;
    int num1;
    static char ch;
    private static int facultyId;
    private static String Fpass;
    private static int stuId;
    private static String Spass;

    public static void main(String[] args) {

        File dir = new File("C:/Users/hp/Desktop/shithi");
        dir.mkdir();

        File file1 = new File("C:/Users/hp/Desktop/shithi/start.txt");

        do {
            a = 0;
            try {
                Scanner input = new Scanner(System.in);
                file1.createNewFile();
                Formatter formatter = new Formatter("C:/Users/hp/Desktop/shithi/start.txt");

                Student s = new Student();
                System.out.println("*****************Welcome*******************");

             
                System.out.println("1.Faculty ");
                System.out.println("2.Student ");
                System.out.println("*Select 1 if you are a faculty*");
                System.out.println("*Select 2 if you are a student*");
                num = input.nextInt();

                switch (num) {
                    case 1:
                        System.out.println(" ---------------------------------");
                        System.out.println("|           Log in                 |");
                        System.out.println(" ---------------------------------");
                        System.out.println("Id: ");
                         Log_in.setFacultyId(facultyId);

                        System.out.println("Password: ");

                        Log_in.setFpass(Fpass);
                        System.out.println("");
                        System.out.println("     *************Main Menu***************");
                        System.out.println(" ----------------------------------------------");
                        System.out.println("| 1. Add students                               |");
                        System.out.println("| 2. Give result                                |");
                        System.out.println("|   1.Mid                                       |");
                        System.out.println("|   2.Final                                     |");
                        System.out.println("| 3.Show all students                           |");
                        System.out.println(" ----------------------------------------------");
                        System.out.println("");
                        int b=1;
                        do{
                            System.out.println("Select 1/2/3 from *Main Menu* ");
                            num = input.nextInt();
                            switch (num) {
                                case 1:
                                 

                                    Student.insertStudent();
                                    System.out.println("");
                                    break;
                                case 3:

                                    Display.showAllStu();
                                    System.out.println("");
                                    break;
                                case 2:
                                    MidFinal m = new MidFinal();
                                    System.out.println("Select 1/2 from *Gaive result* of *Main Menu* ");
                                    num = input.nextInt();
                                    switch (num) {
                                        case 1:
                                            m.Midterm();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            m.Final();
                                            System.out.println("");
                                            break;

                                    }
                                    break;
                                    case 4:
                      
	
                             
	    
                            }

                        } while (b == 1);

                    case 2:
                        System.out.println(" ---------------------------------");
                        System.out.println("|           Log in                 |");
                        System.out.println(" ---------------------------------");

                        System.out.println("Id: ");
                        Log_in.setFacultyId(stuId);
                        System.out.println("Password: ");
                        Log_in.setFpass(Spass);
                        System.out.println("");
                        System.out.println("    **************Main Menu****************");
                        System.out.println(" ----------------------------------------------");
                        System.out.println("| 1.Add faculty                                 |");
                        System.out.println("| 2.Show all faculty                            |");
                        System.out.println("| 3.Payment                                     |");
                        System.out.println("| 4.Show result                                 |");
                        System.out.println("|   1.Mid                                       |");
                        System.out.println("|   2.Final                                     |");
                        System.out.println(" ----------------------------------------------");
                        System.out.println("");
                        int c=1;
                               do {
                            System.out.println("Select 1/2/3/4 from *Main Menu*");
                            num = input.nextInt();
                            switch (num) {
                                case 1:
                                    

                                    Student.insertFaculty();
                                    System.out.println("");
                                    break;
                                case 2:

                                    Display.showAllFaculty();
                                    System.out.println("");
                                    break;
                                case 3:
                                    Installment s1 = new Installment();
                                    s1.installment();
                                    System.out.println("");
                                    break;
                                case 4:
                                    System.out.println("Select 1/2 from *Show result* of *Main Menu*");
                                    num = input.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Result of Midterm: " + MidFinal.M);
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("Result of Finalterm: " + MidFinal.F);
                                            System.out.println("");
                                            break;
                                    }
                                    break;

                            }
                        }while(c==1);
                        break;
                }

                formatter.close();

            } catch (Exception e) {
                a = 1;
                System.out.println(e);
                System.out.println("");
                System.out.println("Try again");
                System.out.println("");
            }

        } while (a == 1);

    }

}
