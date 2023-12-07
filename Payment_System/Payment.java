package Payment_System;

import java.util.Scanner;

public class Payment {

    final double Tk = 1;
    double total;
    Scanner input = new Scanner(System.in);

    void FullPayment() {
        System.out.println("Minimum Credit: 12 & Maximun Credit: 18 ");

        System.out.println("How many credit have you taken in this semester ? ");
        double course = input.nextDouble();
         
        if (course == 12) {
            total = Tk * 12;
        } else if (course == 13) {
            total = Tk * 13;
        } else if (course == 14) {
            total = Tk * 14;
        } else if (course == 15) {
            total = Tk * 15;
        } else if (course == 16) {
            total = Tk * 16;
        } else if (course == 17) {
            total = Tk * 17;
        } else if (course == 18) {

            total = Tk * 18;
               }
       }
}
          
          
          
     


