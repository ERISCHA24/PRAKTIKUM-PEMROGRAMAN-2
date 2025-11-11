import java.util.List;

public class LoginPage extends BasePage {
    private UserData userData;
    private List<UserData> dataStore;

    public LoginPage(InputHandler input, OutputHandler output, List<UserData> dataStore) {
        super(input, output);
        this.dataStore = dataStore;
    }

    @Override
    protected void displayHeader() {
        output.println("=".repeat(50));
        output.println("                FORM INPUT DATA");
        output.println("=".repeat(50));
    }

    @Override
    protected void displayContent() {
        output.println("             Masukkan Data Pengguna");
    }

    @Override
    public void handleInput() {
        output.print("Nama: ");
        String name = input.readLine();

        output.print("NIM: ");
        String NIM = input.readLine();

        output.print("Umur:");
        int age = input.readInt();

        output.print("Email: ");
        String email = input.readLine();

        userData = new UserData(name, NIM, age, email);
        dataStore.add(userData);

        output.println("\n✓ Data berhasil disimpan!");
        output.print("\nTekan Enter untuk kembali ke menu...");
        input.readLine();
        exit = true;
    }
}