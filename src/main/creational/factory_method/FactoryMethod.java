package creational.factory_method;

abstract class Computer {
    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    public String toString() {
        return String.format("RAM=%s, HDD=%s, CPU=%s", this.getRAM(), this.getHDD(), this.getCPU());
    }
}

class PC extends Computer {
    private final String ram;
    private final String hdd;
    private final String cpu;

    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}

class Server extends Computer {
    private final String ram;
    private final String hdd;
    private final String cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}

class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }

        return new PC(ram, hdd, cpu);
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
