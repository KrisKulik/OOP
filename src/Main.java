import transport.Bus;
import transport.Car;
public class Main {
        public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7, 200,"yellow", 2015, "Russia", "MT", "sedan", "A111AA", 5, false);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, 260,"black", 2020, "Germany", "AT", "sedan", "B222BB", 4, true);
        Car bmw = new Car("BMW", "Z8", 3.0, 250, "black", 2021, "Germany", "MT", "roadster", "C333CC", 2, true);
        Car kia = new Car("Kia", "Sportage IV", 2.4, 220, "red", 2018, "South Korea", "AT", "SUV", "E444EE", 5, false);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, 230, "orange", 2016, "South Korea", "MTA", "sedan", "H555HH", 5, true);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        hyundai.changeTiresToSeason(2);
        System.out.println(hyundai);

                System.out.println(" ");

        Bus liaz = new Bus("ЛИАЗ", "5256", 2000, "Россия", "белый", 110);
        Bus paz = new Bus("ПАЗ", "3205", 2005, "Россия", "голубой", 90);
        Bus nefaz = new Bus ("НефАЗ", "5299", 2010, "Россия", "желтый", 70);
                System.out.println(liaz);
                System.out.println(paz);
                System.out.println(nefaz);
    }
}

