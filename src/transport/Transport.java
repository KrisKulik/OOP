package transport;

public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    //    private final int year;
//    private final String country;
//    private String color;
//    private int maxSpeed;
//
//    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
//        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
//        this.model = (model == null || model.isEmpty() ? "default" : model);
//        this.year = (year < 0 ? 2000 : year);
//        this.country = country;
//        this.color = (color == null || color.isEmpty() ? "White" : color);
//        this.maxSpeed = (maxSpeed <= 0 ? 111 : maxSpeed);
//    }
     public Transport(String brand, String model, double engineVolume, T driver) {
         this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
         this.model = (model == null || model.isEmpty() ? "default" : model);
         this.engineVolume = (engineVolume == 0 ? 1.0 : engineVolume);
         setDriver(driver);
     }

    public void start(){
}
    public void finish() {
}
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public T getDriver() {
        return driver;
    }
    public void setDriver(T driver) {
        this.driver = driver;
    }
    public abstract Type getType();

    public void printType() {
    }

    @Override
    public String toString() {
        return "Марка: " + brand + "; " +
                "Модель: " + model + "; " +
                "Объем двигателя: " + engineVolume + "; " +
                 driver;
    }

//
//    public int getYear() {
//        return year;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if (color == null || color.isEmpty()) {
//            color = "default";
//        }
//        this.color = color;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }
//
//    @Override
//    public String toString() {
//        return  "Марка: " + brand + "; " +
//                "Модель: " + model + "; " +
//                "Год производства: " + year + "; " +
//                "Страна сборки: " + country + "; " +
//                "Цвет: " + color + "; " +
//                "Максимальная скорость передвижения: " + maxSpeed + "; ";
//    }
}
