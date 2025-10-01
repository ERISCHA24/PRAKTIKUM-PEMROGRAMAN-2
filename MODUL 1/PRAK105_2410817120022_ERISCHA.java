import java.util.Scanner;

public class PRAK105_2410817120022_ERISCHA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PHI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double r = sc.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double t = sc.nextDouble();

        double volume = PHI * r * r * t;

        System.out.println("Volume tabung dengan jari-jari " + r + " cm dan tinggi " + t + " cm adalah " + volume + " m3");
    }
}
