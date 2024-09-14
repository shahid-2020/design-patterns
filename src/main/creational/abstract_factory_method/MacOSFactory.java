package creational.abstract_factory_method;

public class MacOSFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
