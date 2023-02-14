package transport;

public class DriverCategoryB extends Driver {
    public DriverCategoryB(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    public DriverCategoryB(String name) {
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
