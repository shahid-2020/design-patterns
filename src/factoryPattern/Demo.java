package factoryPattern;

public class Demo {
    public static void main(String[] args){
        Computer pc = ComputerFactory.getComputer("pc", "2gb", "500gb", "2.4GHz");
        System.out.println("Factory PC Config::"+pc);
    }
}
