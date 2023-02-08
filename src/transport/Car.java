package transport;

import java.time.LocalDate;

// Нужно добавить классу Car следующие свойства:
//        «Коробка передач»,
//        «Тип кузова»,
//        «Регистрационный номер»,
//        «Количество мест»,
//        признак «Летняя» или «Зимняя резина».
// При этом следующие поля изменяться не могут:
//        «Марка»,
//        «Модель»,
//        «Год производства»,
//        «Страна сборки»,
//        «Тип кузова»,
//        «Количество мест».
public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmission;
    private final String carBody;
    private String registrationNumber;
    private final int seats;
    private boolean isSummerTires;
    // Пропишите проверку данных для новых полей класса, а также значения по умолчанию,
// если параметры пустые, равны null или имеют некорректное значение.
    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String carBody, String registrationNumber, int seats, boolean isSummerTires) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty() ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null || color.isEmpty() ? "White" : color);
        this.year = (year < 0 ? 2000 : year);
        this.country = (country == null || country.isEmpty() ? "default" : country);
        this.transmission = (transmission == null || transmission.isEmpty() ? "default" : transmission);
        this.carBody = (carBody == null || carBody.isEmpty() ? "default" : carBody);
        this.registrationNumber = (registrationNumber == null || registrationNumber.isEmpty() ? "default" : registrationNumber);
        this.seats = ((seats <= 0) ? 5 : seats);
        this.isSummerTires = isSummerTires;
    }

    //    Добавьте функциональность: метод «сменить шины на сезонные».
    public void changeTiresToSeason(int month) {
        if (month >= 4 && month < 11) {
            isSummerTires = true;
        }
        if ((month >= 1 && month < 4) || (month >= 11 && month <= 12)) {
            isSummerTires = false;
        }

    }
//    В классе Car создайте вложенный класс «Ключ» (Key) с параметрами:
//            «Удаленный запуск двигателя»,
//            «Бесключевой доступ».
//    Оба параметра могут быть boolean.
//    Данные параметры неизменяемые.
//    Добавьте ко всем новым полям проверку данных: параметры не должны быть пустыми,
//    не должны быть равны null и должны содержать корректные данные.
    public class Key {
        private boolean remoteEngineStart;
        private boolean keylessEntry;

        public Key (boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = true;
            this.keylessEntry = true;
        }
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

    public String getTransmission() {
        return transmission;
    }

    public String getCarBody() {
        return carBody;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

     public int getSeats() {
        return seats;
    }


    public boolean isSummerTires() {
        return isSummerTires;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + "; " +
                "Модель: " + model + "; " +
                "Объем двигателя: " + engineVolume + "; " +
                "Цвет: " + color + "; " +
                "Год производства: " + year + "; " +
                "Страна сборки: " + country + "; " +
                "Коробка передач: " + transmission + "; " +
                "Тип кузова: " + carBody + "; " +
                "Регистрационный номер: " + registrationNumber + "; " +
                "Количество мест: " + seats + "; " +
                (isSummerTires ? "Летняя" : "Зимняя") + " резина";
    }
}
