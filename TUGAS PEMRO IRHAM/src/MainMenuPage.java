import java.util.ArrayList;

public class MainMenuPage extends BasePage {
    private ArrayList<MenuItem> menuItems;
    private String selectedMenu;

    public MainMenuPage(InputHandler input, OutputHandler output) {
        super(input, output);
        initializeMenu();
    }

    private void initializeMenu() {
        menuItems = new java.util.ArrayList<>();
        menuItems.add(new MenuItem("1", "Login", "Masuk akun"));
        menuItems.add(new MenuItem("2", "History Login", "Riwayat Data Pengguna"));
        menuItems.add(new MenuItem("3", "Calculator", "Kalkulator sederhana"));
        menuItems.add(new MenuItem("0", "Exit", "Keluar dari aplikasi"));
    }

    @Override
    protected void displayHeader() {
        output.println("=".repeat(50));
        output.println("                  MAIN MENU");
        output.println("=".repeat(50));
    }

    @Override
    protected void displayContent() {
        output.println("Pilih Menu:");
        for (MenuItem item : menuItems) {
            output.println(item.getId() + ". " + item.getTitle() + " - " + item.getDescription());
        }
    }

    @Override
    public void handleInput() {
        output.print("Masukkan pilihan: ");
        selectedMenu = input.readLine();

        if ("0".equals(selectedMenu)) {
            exit = true;
        }
    }

    public String getSelectedMenu() {
        return selectedMenu;
    }
}