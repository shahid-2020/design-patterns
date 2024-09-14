package creational.abstract_factory_method;

public interface IGUIFactory {
    IButton createButton();
    ICheckbox createCheckbox();
}
