package creational.abstract_factory_method;

public class WinOSButton implements IButton {
    @Override
    public void paint() {
        System.out.println("You have created WinOSButton.");
    }
}
