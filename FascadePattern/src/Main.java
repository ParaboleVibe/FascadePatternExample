public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(new Computer(), new Browser());
        facade.openBrowser();
        facade.turnComputerOff();
    }
}