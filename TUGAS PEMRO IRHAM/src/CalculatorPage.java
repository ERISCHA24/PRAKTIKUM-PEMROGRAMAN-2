public class CalculatorPage extends BasePage {
    private double result;

    public CalculatorPage(InputHandler input, OutputHandler output) {
        super(input, output);
    }

    @Override
    protected void displayHeader() {
        output.println("=".repeat(50));
        output.println("            KALKULATOR SEDERHANA");
        output.println("=".repeat(50));
    }

    @Override
    protected void displayContent() {
        output.println("Operasi yang tersedia:");
        output.println("1. Penjumlahan (+)");
        output.println("2. Pengurangan (-)");
        output.println("3. Perkalian (*)");
        output.println("4. Pembagian (/)");
        output.println("0. Kembali ke menu");
    }

    @Override
    public void handleInput() {
        output.print("Pilih operasi: ");
        String choice = input.readLine();

        if ("0".equals(choice)) {
            exit = true;
            return;
        }

        output.print("Masukkan angka pertama: ");
        String num1Str = input.readLine();

        output.print("Masukkan angka kedua: ");
        String num2Str = input.readLine();

        try {
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);

            switch (choice) {
                case "1":
                    result = num1 + num2;
                    output.println("\nHasil: " + num1 + " + " + num2 + " = " + result);
                    break;
                case "2":
                    result = num1 - num2;
                    output.println("\nHasil: " + num1 + " - " + num2 + " = " + result);
                    break;
                case "3":
                    result = num1 * num2;
                    output.println("\nHasil: " + num1 + " * " + num2 + " = " + result);
                    break;
                case "4":
                    if (num2 != 0) {
                        result = num1 / num2;
                        output.println("\nHasil: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        output.println("\nError: Pembagian dengan nol!");
                    }
                    break;
                default:
                    output.println("\nPilihan tidak valid!");
            }
        } catch (NumberFormatException e) {
            output.println("\nError: Input harus berupa angka!");
        }

        output.print("\nTekan Enter untuk melanjutkan...");
        input.readLine();
    }
}