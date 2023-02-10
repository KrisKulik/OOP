package transport;

public class Transport {
   private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty() ? "default" : model);
        this.year = (year < 0 ? 2000 : year);
        this.country = country;
        this.color = (color == null || color.isEmpty() ? "White" : color);
        this.maxSpeed = (maxSpeed <= 0 ? 111 : maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "default";
        }
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return  "Марка: " + brand + "; " +
                "Модель: " + model + "; " +
                "Год производства: " + year + "; " +
                "Страна сборки: " + country + "; " +
                "Цвет: " + color + "; " +
                "Максимальная скорость передвижения: " + maxSpeed + "; ";
    }
}
