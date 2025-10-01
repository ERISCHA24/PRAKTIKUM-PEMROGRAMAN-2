import java.util.Scanner;

public class PRAK102_2410817120022_ERISCHA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int angka = sc.nextInt();

        int count = 0;
        while (count < 11) {
            if (angka % 5 == 0) {
                System.out.print((angka / 5 - 1));
            } else {
                System.out.print(angka);
            }
            if (count < 10) System.out.print(", ");
            angka++;
            count++;
        }
    }
}
