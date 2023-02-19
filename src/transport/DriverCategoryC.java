package transport;

public class DriverCategoryC extends Driver {
    public DriverCategoryC(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    public DriverCategoryC(String name) {
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
