import java.util.Scanner;

public class PRAK104_2410817120022_ERISCHA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] abu = new String[3];
        String[] bagas = new String[3];

        System.out.println("Masukkan tangan Abu (3 kali, dipisah spasi): ");
        for (int i = 0; i < 3; i++) {
            abu[i] = sc.next();
        }

        System.out.println("Masukkan tangan Bagas (3 kali, dipisah spasi): ");
        for (int i = 0; i < 3; i++) {
            bagas[i] = sc.next();
        }

        int scoreAbu = 0, scoreBagas = 0;

        for (int i = 0; i < 3; i++) {
            if (abu[i].equals(bagas[i])) {
                continue;
            } else if ((abu[i].equals("B") && bagas[i].equals("G")) ||
                    (abu[i].equals("G") && bagas[i].equals("K")) ||
                    (abu[i].equals("K") && bagas[i].equals("B"))) {
                scoreAbu++;
            } else {
                scoreBagas++;
            }
        }

        if (scoreAbu > scoreBagas) {
            System.out.println("Abu");
        } else if (scoreBagas > scoreAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}
