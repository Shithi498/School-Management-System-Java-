package Payment_System;

import java.util.Scanner;

public class AmountForCourses extends Payment {

    Scanner input = new Scanner(System.in);
    public int tk;
    double Tamount;

    public void Amount() {

        System.out.println("                 Name of all Depertments: ");

        System.out.println(" --------------------------------------------------------");
        System.out.println("| 1.Computer Science & Engineering                        |");
        System.out.println("| 2.Electrical Electronic Engineering                     |");
        System.out.println("| 3.Architechure                                          |");
        System.out.println("| 4.Software Engineering                                  |");
        System.out.println("| 5.Multimedia &  Creative Technology                     |");
        System.out.println("| 6.Civil Engineering                                     |");
        System.out.println("| 7.Mechanical Engineering                                |");
        System.out.println(" ---------------------------------------------------------");
        System.out.println("");
        System.out.println("Select 1/2/3/4/5/6/7");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Depertment: Computer Science & Engineering");
                tk = 5500;
                System.out.println("Per credit fee : " + tk + "tk");
                FullPayment();

                Tamount = total * tk;
                System.out.println("Fullamount: " + Tamount + " tk");

                break;
            case 2:
                System.out.println("Depertment: Electrical Electronic Engineering");
                tk = 5500;
                System.out.println("Per credit fee: " + tk + " tk");
                FullPayment();
                Tamount = total * tk;
                System.out.println("Fullamount: " + Tamount + " tk");

            case 3:
                System.out.println("Depertment: Architechure");
                tk = 4000;
                System.out.println("Per credit fee: " + tk + " tk");
                FullPayment();
                Tamount = total * tk;
                System.out.println("Fullamount: " + Tamount + " tk");
                break;
            case 4:
                System.out.println("Depertment: Software Engineering");
                tk = 5500;
                System.out.println("Per credit fee: " + tk + " tk");
                FullPayment();

                Tamount = total * tk;
                System.out.println("Fullamount: " + Tamount + " tk");
                break;
            case 5:
                System.out.println("Depertment: Multimedia &  Creative Technology");
                tk = 5500;
                System.out.println("Per credit fee: " + 1200000 + " tk");
                FullPayment();
                System.out.println("Fullamount: " + Tamount + " tk");
                break;
            case 6:
                System.out.println("Depertment: Civil Engineering");
                tk = 5500;
                System.out.println("Per credit fee: " + tk + " tk");
                FullPayment();
                Tamount = total * tk;
                System.out.println("Fullamount: " + Tamount + " tk");
                break;
            case 7:
                System.out.println("Depertment: Mechanical Engineering");
                tk = 5500;
                System.out.println("Per credit fee: " + tk + " tk");
                FullPayment();
                System.out.println("Fullamount: " + Tamount + " tk");
                Tamount = total * tk;
        }
    }

}
