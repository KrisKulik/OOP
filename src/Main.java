import transport.Car;
public class Main {
    /* Создайте объекты для следующих автомобилей:
    Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
    Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
    BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
    Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
    Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год. */
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia", "MT", "sedan", "A111AA", 5, false);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany", "AT", "sedan", "B222BB", 4, true);
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany", "MT", "roadster", "C333CC", 2, true);
        Car kia = new Car("Kia", "Sportage IV", 2.4, "red", 2018, "South Korea", "AT", "SUV", "E444EE", 5, false);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea", "MTA", "sedan", "H555HH", 5, true);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        hyundai.changeTiresToSeason(2);
        System.out.println(hyundai);
    }
}

