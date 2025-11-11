import java.util.List;

public class HistoryLoginPage extends BasePage {
    private List<UserData> dataStore;

    public HistoryLoginPage(InputHandler input, OutputHandler output, List<UserData> dataStore) {
        super(input, output);
        this.dataStore = dataStore;
    }

    @Override
    protected void displayHeader() {
        output.println("=".repeat(50));
        output.println("              DATA YANG TERSIMPAN");
        output.println("=".repeat(50));
    }

    @Override
    protected void displayContent() {
        if (dataStore.isEmpty()) {
            output.println("\nBelum ada data tersimpan.");
        } else {
            output.println("Total data: " + dataStore.size());
            for (int i = 0; i < dataStore.size(); i++) {
                output.println((i + 1) + ". " + dataStore.get(i).toString());
            }
        }
    }

    @Override
    public void handleInput() {
        output.print("\nTekan Enter untuk kembali ke menu...");
        input.readLine();
        exit = true;
    }
}