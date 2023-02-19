package transport;

import java.time.LocalDate;

public class Car extends Transport<DriverCategoryB> {
    public Car(String brand, String model, double engineVolume, DriverCategoryB driver) {
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
//    private double engineVolume;
//    private String transmission;
//    private final String carBody;
//    private String registrationNumber;
//    private final int seats;
//    private boolean isSummerTires;
//    public Car(String brand, String model, double engineVolume, int maxSpeed, String color, int year, String country, String transmission, String carBody, String registrationNumber, int seats, boolean isSummerTires) {
//        super(brand, model, year, country, color, maxSpeed);
//        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
//        this.transmission = (transmission == null || transmission.isEmpty() ? "default" : transmission);
//        this.carBody = (carBody == null || carBody.isEmpty() ? "default" : carBody);
//        this.registrationNumber = (registrationNumber == null || registrationNumber.isEmpty() ? "default" : registrationNumber);
//        this.seats = ((seats <= 0) ? 5 : seats);
//        this.isSummerTires = isSummerTires;
//
//    }
//
//    public void changeTiresToSeason(int month) {
//        if (month >= 4 && month < 11) {
//            isSummerTires = true;
//        }
//        if ((month >= 1 && month < 4) || (month >= 11 && month <= 12)) {
//            isSummerTires = false;
//        }
//
//    }
//
//    public class Key {
//        private boolean remoteEngineStart;
//        private boolean keylessEntry;
//
//        public Key (boolean remoteEngineStart, boolean keylessEntry) {
//            this.remoteEngineStart = true;
//            this.keylessEntry = true;
//        }
//    }
//
//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public String getCarBody() {
//        return carBody;
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//     public int getSeats() {
//        return seats;
//    }
//
//
//    public boolean isSummerTires() {
//        return isSummerTires;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() +
//                "Объем двигателя: " + engineVolume + "; " +
//                "Коробка передач: " + transmission + "; " +
//                "Тип кузова: " + carBody + "; " +
//                "Регистрационный номер: " + registrationNumber + "; " +
//                "Количество мест: " + seats + "; " +
//                (isSummerTires ? "Летняя" : "Зимняя") + " резина";
//    }
}
