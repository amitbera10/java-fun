package design.partten;


public class FactoryParttenMain {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getInstance(ComputerType.PC, 4, 128, "Windows");
        Computer server = ComputerFactory.getInstance(ComputerType.SERVER, 8, 128, "LINUX");
        System.out.println("PC::: " + pc);
        System.out.println("Server::: " + server);
    }
}

class ComputerFactory {
    public static Computer getInstance(ComputerType computerType, int ram, int storage, String operatingSystem) {
        Computer computer = null;
        switch (computerType) {
            case PC:
                computer = new PC(ram, storage, operatingSystem);
                break;
            case SERVER:
                computer = new Server(ram, storage, operatingSystem);
        }
        return computer;
    }
}

interface Computer {
    int getRam();

    int getStorage();

    String getOperatingSystem();
}

class PC implements Computer {
    int ram;
    int storage;
    String operatingSystem;

    public PC(int ram, int storage, String operatingSystem) {
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public int getRam() {
        return ram;
    }

    @Override
    public int getStorage() {
        return storage;
    }

    @Override
    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public String toString() {
        return "PC{" +
                "ram=" + ram +
                ", storage=" + storage +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}

class Server implements Computer {
    int ram;
    int storage;
    String operatingSystem;

    public Server(int ram, int storage, String operatingSystem) {
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public int getRam() {
        return ram;
    }

    @Override
    public int getStorage() {
        return storage;
    }

    @Override
    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public String toString() {
        return "Server{" +
                "ram=" + ram +
                ", storage=" + storage +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}

enum ComputerType {
    PC,
    SERVER
}


