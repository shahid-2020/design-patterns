package creational.abstract_factory_method;

public class MacOSCheckbox implements ICheckbox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
