package transport;

import java.util.List;

//Для грузовых автомобилей добавьте перечисления по типу грузоподъемности:
//N1 (с полной массой до 3,5 тонн);
//N2 (с полной массой свыше 3,5 до 12 тонн);
//N3 (с полной массой свыше 12 тонн).
public class Lorry extends Transport<DriverCategoryC> {
    private LoadCapacity loadCapacity;
    public Lorry(String brand, String model, double engineVolume, DriverCategoryC driver, LoadCapacity loadCapacity, List<Mechanics> mechanicsList) {
        super(brand, model, engineVolume, driver, mechanicsList);
        this.loadCapacity=loadCapacity;
    }
    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printType() {
        if (getLoadCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getLoadCapacity());
        }
    }


    @Override
    public boolean passDiagnostic() throws TransportTypeException {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + loadCapacity;
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
    public Type getType() {
        return Type.LORRY;
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
