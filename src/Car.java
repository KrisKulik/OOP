public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

//    Дополните созданные ранее конструкторы проверками://
//    Если передана пустая строка или null в поля модель, марка машины и страна сборки, то значение по умолчанию — default.
//    Если переданный объем двигателя ≤=0, то значение по умолчанию — 1,5 л.
//    Если передана пустая строка или null, то цвет кузова по умолчанию — белый.
//    Если год производства ≤0, то значение по умолчанию — 2000.
//    В случае если какая-либо информация не указана по объекту, программа должна выводить в консоль информацию о каждом автомобиле
//    и все указанные выше характеристики, подставляя вместо отсутствующей информации значение по умолчанию.
    public Car (String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty() ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null || color.isEmpty() ? "White" : color);
        this.year = (year < 0 ? 2000 : year);
        this.country = (country == null || country.isEmpty() ? "default" : country);

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

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }

}
