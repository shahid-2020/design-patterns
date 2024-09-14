package creational.abstract_factory_method;

public class Application {
    private static  void start(IGUIFactory factory) {
        var button = factory.createButton();
        var checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }
    public static void main(String[] args) {
        var currentOS = System.getProperty("os.name");

        if(currentOS.equalsIgnoreCase("mac")) {
            start(new MacOSFactory());
        }else {
            start(new WinOSFactory());
        }
    }
}
