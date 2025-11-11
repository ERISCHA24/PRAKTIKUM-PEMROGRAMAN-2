abstract class BasePage implements Page {
    protected InputHandler input;
    protected OutputHandler output;
    protected boolean exit;

    public BasePage(InputHandler input, OutputHandler output) {
        this.input = input;
        this.output = output;
        this.exit = false;
    }

    @Override
    public void display() {
        output.clear();
        displayHeader();
        displayContent();
        displayFooter();
    }

    protected abstract void displayHeader();
    protected abstract void displayContent();

    protected void displayFooter() {
        output.println("=".repeat(50));
    }

    @Override
    public boolean shouldExit() {
        return exit;
    }
}