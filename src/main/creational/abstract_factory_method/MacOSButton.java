package creational.abstract_factory_method;

public class MacOSButton implements IButton {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
