import java.util.Scanner;

public class PRAK101_2410817120022_ERISCHA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempat = sc.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = sc.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = sc.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = sc.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggi = sc.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double berat = sc.nextDouble();

        String[] namaBulan = {
                "", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        System.out.println("\nNama Lengkap " + nama + ", Lahir di " + tempat + " pada Tanggal " + tanggal + " " + namaBulan[bulan] + " " + tahun);
        System.out.println("Tinggi Badan " + tinggi + " cm dan Berat Badan " + berat + " kilogram");
    }
}
