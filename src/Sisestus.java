import java.util.Scanner;

public class Sisestus {

    public static void tehe() {

        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine()); //3
        double x2 = Double.parseDouble(scan.nextLine()); //-1
        double x3 = Double.parseDouble(scan.nextLine()); //16
        double x4 = Double.parseDouble(scan.nextLine()); //9
        double x5 = Double.parseDouble(scan.nextLine()); //-2
        double x6 = Double.parseDouble(scan.nextLine()); //0.25
        double x7 = Double.parseDouble(scan.nextLine()); // 37
        double x8 = Double.parseDouble(scan.nextLine()); //300
        double x9 = Double.parseDouble(scan.nextLine()); //0.0925
        double x10 = Double.parseDouble(scan.nextLine()); //12.5
        double x11 = Double.parseDouble(scan.nextLine()); //0.64

        try {
            if (!(x4 == 0 || x6 == 0 || x7 == 0 || x8 == 0 || x9 == 0)) {
                double y1 = (Math.pow(x1, x2) - Math.sqrt(x3 / x4));
                double y2 = Math.pow(y1, x5) / x6;
                double y3 = y2 / ((x7 / x8) / x9);
                double y4 = y3 + (x10 * x11);
                System.out.println(y4);
            } else {throw new ArithmeticException();}
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Antud sisendite puhul tulemus puudub.");
        }
    }


    public static void main(String[] args) {
        tehe();
    }

}
