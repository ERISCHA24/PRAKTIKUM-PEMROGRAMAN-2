import java.util.Scanner;

public class ConsoleInputHandler implements InputHandler {
    protected Scanner scanner;

    public ConsoleInputHandler() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String readLine() {
        return scanner.nextLine();
    }

    @Override
    public int readInt() {
            int value = scanner.nextInt();
            scanner.nextLine(); // consume newline
            return value;
    }

    @Override
    public void close() {
        scanner.close();
    }
}