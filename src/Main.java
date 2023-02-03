public class Main {
    /* Создайте объекты для следующих автомобилей:
    Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
    Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
    BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
    Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
    Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год. */
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
        Car kia = new Car("Kia", "Sportage IV", 2.4, "red", 2018, "South Korea");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");
        System.out.println(lada.getBrand() + " " + lada.getModel() + " " +  lada.getEngineVolume() + " " +  lada.getColor() + " " +  lada.getYear() + " " +  lada.getCountry());
        System.out.println(audi.getBrand() + " " + audi.getModel() + " " +  audi.getEngineVolume() + " " +  audi.getColor() + " " +  audi.getYear() + " " +  audi.getCountry());
        System.out.println(bmw.getBrand() + " " + bmw.getModel() + " " +  bmw.getEngineVolume() + " " +  bmw.getColor() + " " +  bmw.getYear() + " " +  bmw.getCountry());
        System.out.println(kia.getBrand() + " " + kia.getModel() + " " +  kia.getEngineVolume() + " " +  kia.getColor() + " " +  kia.getYear() + " " + kia.getCountry());
        System.out.println(hyundai.getBrand() + " " + hyundai.getModel() + " " +  hyundai.getEngineVolume() + " " +  hyundai.getColor() + " " +  hyundai.getYear() + " " +  hyundai.getCountry());
    }
}

