public class Facade {
    Computer computer;
    Browser browser;

    public Facade(Computer computer, Browser browser) {
        this.computer = computer;
        this.browser = browser;
    }

    public void openBrowser() {
        System.out.println("opening browser for you:");
        computer.on();
        browser.open();
    }

    public void turnComputerOff() {
        System.out.println("closing computer for you:");
        browser.close();
        computer.off();
    }
}
