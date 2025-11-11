public class Application {
    private InputHandler input;
    private OutputHandler output;
    private PageManager pageManager;
    private boolean running;

    public Application() {
        this.input = new ConsoleInputHandler();
        this.output = new ConsoleOutputHandler();
        this.pageManager = new PageManager(input, output);
        this.running = true;
    }

    public void run() {
        showWelcomeMessage();

        while (running) {
            MainMenuPage mainMenu = (MainMenuPage) pageManager.createMainMenu();
            mainMenu.display();
            mainMenu.handleInput();

            if (mainMenu.shouldExit()) {
                running = false;
                showExitMessage();
                break;
            }

            String selectedMenu = mainMenu.getSelectedMenu();
            Page selectedPage = pageManager.createPage(selectedMenu);

            if (selectedPage != null) {
                navigateToPage(selectedPage);
            }
        }

        cleanup();
    }

    private void navigateToPage(Page page) {
        while (!page.shouldExit()) {
            page.display();
            page.handleInput();
        }
    }

    private void showWelcomeMessage() {
        output.clear();
        output.println("=".repeat(50));
        output.println("   Selamat Datang di Matematika Menyenangkan");
        output.println("=".repeat(50));
        output.print("Tekan Enter untuk melanjutkan...");
        input.readLine();
    }

    private void showExitMessage() {
        output.clear();
        output.println("=".repeat(50));
        output.println("      Terima kasih telah menggunakan aplikasi!");
        output.println("=".repeat(50));
    }

    private void cleanup() {
        input.close();
    }
}