package creational.abstract_factory_method;

public class WinOSFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new WinOSButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WinOSCheckbox();
    }
}
