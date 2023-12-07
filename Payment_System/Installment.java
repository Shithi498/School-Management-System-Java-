package Payment_System;

import java.util.Scanner;

public class Installment extends AmountForCourses {

    Scanner input = new Scanner(System.in);

    public void installment() {

        int choice;
        System.out.println("You can pay full amount/You can pay by installment");
        System.out.println(" -----------------------------------------------");
        System.out.println("| 1.Fullamount                                   |");
        System.out.println("| 2.Intstallment                                 |");
        System.out.println(" -----------------------------------------------");
        System.out.println("Select 1/2");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                Amount();
                break;
            case 2:
                System.out.println("You can pay by 3 installment\n");
                System.out.println("1.First installment");
                System.out.println("2.Second installment");
                System.out.println("3.Third intallment\n");
                System.out.println("Select 1/2/3 ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:

                        System.out.println("First installment :");
                        System.out.println("You have to pay 33.33% of your full amount\n");
                        Amount();

                        double fInstallment = ((Tamount * 33.3333) / 100);

                        System.out.println("You have to pay: " + fInstallment + " tk");

                        break;

                    case 2:

                        System.out.println("Second installment :");
                        System.out.println("You have to pay 33.33% of your full amount\n");
                        Amount();
                        double sInstallment = ((Tamount * 33.3333) / 100);
                        System.out.println("You have to pay: " + sInstallment + " tk");
                        break;
                    case 3:
                        System.out.println("Third installment :");
                        System.out.println("You have to pay 33.33% of your full amount\n");
                        Amount();
                        double TInstallment = ((Tamount * 33.3333) / 100);
                        System.out.println("You have to pay: " + TInstallment + " tk");

                        break;

                }

        }

    }

   

}
