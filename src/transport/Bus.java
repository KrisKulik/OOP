package transport;
//А для автобусов добавьте классификацию с помощью перечислений по типу вместимости:
//особо малая (до 10 мест);
//малая (до 25);
//средняя (25–50);
//большая (50–80);
//особо большая (80–120 мест).

import java.util.Collection;
import java.util.List;

public class Bus extends Transport<DriverCategoryD>{

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, DriverCategoryD driver, Capacity capacity, List <Mechanics> mechanicsList) {
        super(brand, model, engineVolume, driver, mechanicsList);
        this.capacity = capacity;

    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean passDiagnostic() throws TransportTypeException {
        throw new TransportTypeException("Автобусы диагностику проходить не должны");
    }

    @Override
    public void printType() {
        if (getCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getCapacity());
        }
    }


    @Override
    public String toString() {
        return super.toString() + "; " + capacity;
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
        return Type.BUS;
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


