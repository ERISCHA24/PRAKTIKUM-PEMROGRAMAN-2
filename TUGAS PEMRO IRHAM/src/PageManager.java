import java.util.ArrayList;
import java.util.List;

public class PageManager {
    private InputHandler input;
    private OutputHandler output;
    private List<UserData> dataStore;

    public PageManager(InputHandler input, OutputHandler output) {
        this.input = input;
        this.output = output;
        this.dataStore = new ArrayList<>();
    }

    public Page createPage(String pageId) {
        switch (pageId) {
            case "1":
                return new LoginPage(input, output, dataStore);
            case "2":
                return new HistoryLoginPage(input, output, dataStore);
            case "3":
                return new CalculatorPage(input, output);
            default:
                return null;
        }
    }

    public Page createMainMenu() {
        return new MainMenuPage(input, output);
    }
}
