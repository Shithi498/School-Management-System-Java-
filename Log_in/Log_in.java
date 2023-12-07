package Log_in;

import java.util.Scanner;

public final class Log_in {

  static Scanner input = new Scanner(System.in);
  private static int facultyId;
  private static String fpass;
  private static int stuId;
  private static String Spass;

    public final int getFacultyId() {
        return facultyId;
    }

    public static void setFacultyId(int facultyId) {
        Log_in.facultyId = facultyId;
        facultyId = input.nextInt();
    }

    public String getFpass() {
        return fpass;
    }

    public static void setFpass(String fpass) {
        Log_in.fpass = fpass;
        fpass = input.next();
    }

    public int getStuId() {
        return stuId;
    }

    public static void setStuId(int stuId) {
        Log_in.stuId = stuId;
        stuId = input.nextInt();
    }

    public String getSpass() {
        return Spass;
    }

    public static void setSpass(String Spass) {
        Log_in.Spass = Spass;
        Spass = input.next();
    }

}
