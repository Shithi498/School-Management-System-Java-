package Faculty_Student;

import java.util.Scanner;

public final class MidFinal implements Mid, Final {

    static Scanner input = new Scanner(System.in);
    public float converter;
    public static double M;

    @Override
    public void Midterm() {
        System.out.println(" Mid Term marks: \n");
        System.out.println("Attendance marks(Out of 10):");
        int Ma = input.nextInt();
        System.out.println("Performance marks (Out of 10):");
        int Mp = input.nextInt();
        System.out.println("First Quiz mark (Out of 20) :");
        int mq1 = input.nextInt();
        System.out.println("Second quiz mark (Out of 20) :");
        int mq2 = input.nextInt();
        System.out.println("Marks of written exam (Out of 40) :");
        int Mwe = input.nextInt();
        converter = 40 / 100F;
        M = converter * (Ma + Mp + mq1 + mq2 + Mwe);
        System.out.println("Mark of midterm: " + M);

    }
    public static double F;

    @Override
    public void Final() {
        System.out.println("Final Term marks:\n");
        System.out.println("Attendance marks(Out of 10):");
        int Fa = input.nextInt();
        System.out.println("Performance marks (Out of 10):");
        int Fp = input.nextInt();
        System.out.println("First Quiz mark (Out of 20) :");
        int fq1 = input.nextInt();
        System.out.println("Second quiz mark (Out of 20) :");
        int fq2 = input.nextInt();
        System.out.println("Marks of written exam (Out of 40) :");
        int Fwe = input.nextInt();
        converter = 60 / 100F;
        F = converter * (Fa + Fp + fq1 + fq2 + Fwe) + M;
        System.out.println("Marks of final: " + F);

    }

   
}
