package transport;

public class Lorry extends Transport<DriverCategoryC> {
    public Lorry(String brand, String model, double engineVolume, DriverCategoryC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void finish() {
        System.out.println(getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " остановился на пит-стоп");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время - " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость - " + getBrand() + " " + getModel());
    }
}
