package transport;

public class DriverCategoryD extends Driver {
    public DriverCategoryD(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    public DriverCategoryD(String name) {
        super(name);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void finish() {
        super.finish();
    }

    @Override
    public void refuel() {
        super.refuel();
    }
}
