import transport.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Задание 1
//В приложении для автогонок создайте список всех участвующих автомобилей.
// В гонках участвуют объекты всех классов: «Легковые автомобили», «Грузовые автомобили» и «Автобусы».
//Каждый автомобиль проходит техобслуживание. Список механиков должен присутствовать в конструкторе автомобиля.
//Создайте новый класс «механик» с параметрами: имя и фамилия; компания, в которой он работает.
//Класс «механик» должен иметь набор методов: «провести техобслуживание»,«починить машину».
//Один механик может работать с несколькими машинами.
//Каждый метод нужно создать и вывести по нему информацию в консоль.
//Создайте в классе Transport список механиков.
//Напишите программу, с помощью которой можно узнать: как зовут водителя авто; какие механики есть у автомобиля.
public class Main {
        public static void main(String[] args) throws TransportTypeException {

                Mechanics mechanic1 = new Mechanics("Винтик", "Hamann");
                Mechanics mechanic2 = new Mechanics("Шпунтик", "Brabus");
                Mechanics mechanic3 = new Mechanics("Гайка", "General Motors");

                List <Mechanics> mechanicsList = new ArrayList<>();
                mechanicsList.add(mechanic1);
                mechanicsList.add(mechanic2);
                mechanicsList.add(mechanic3);

                DriverCategoryB driverB = new DriverCategoryB("Mickey Mouse", true, 5);
                DriverCategoryC driverC = new DriverCategoryC("Donald Fauntleroy Duck", true, 10);
                DriverCategoryD driverD = new DriverCategoryD("Pluto", true, 1);


                Car car1 = new Car("ВАЗ", "2101", 1.6, driverB, BodyCar.SEDAN, mechanicsList);
                Car car2 = new Car("ВАЗ", "2102", 1.6, driverB, BodyCar.HATCHBACK, mechanicsList);
                Car car3 = new Car("ВАЗ", "2103", 1.6, driverB, BodyCar.SEDAN, mechanicsList);
                Car car4 = new Car("ВАЗ", "2104", 1.6, driverB, BodyCar.HATCHBACK, mechanicsList);

                Bus bus1 = new Bus("ПАЗ", "3201", 4.0, driverD, Capacity.SMALL, mechanicsList);
                Bus bus2 = new Bus("ПАЗ", "3202", 4.0, driverD, Capacity.SMALL, mechanicsList);
                Bus bus3 = new Bus("ПАЗ", "3203", 4.0, driverD, Capacity.MEDIUM, mechanicsList);
                Bus bus4 = new Bus("ПАЗ", "3204", 4.0, driverD, Capacity.MEDIUM, mechanicsList);

                Lorry lorry1 = new Lorry("КамАЗ", "4308", 5.9, driverC, LoadCapacity.N2, mechanicsList);
                Lorry lorry2 = new Lorry("КамАЗ", "4310", 5.9, driverC, LoadCapacity.N2, mechanicsList);
                Lorry lorry3 = new Lorry("КамАЗ", "4325", 5.9, driverC, LoadCapacity.N2, mechanicsList);
                Lorry lorry4 = new Lorry("КамАЗ", "4350", 5.9, driverC, LoadCapacity.N2, mechanicsList);

                List<Transport> list = new ArrayList<>();
                List.of(car1, car2, car3, car4,bus1, bus2, bus3, bus4, lorry1, lorry2, lorry3, lorry4);




//
//                System.out.println(car1);
//                System.out.println(bus1);
//                System.out.println(lorry1);
//                car1.printType();
//
//                System.out.println(car1.passDiagnostic());
//                System.out.println(lorry2.passDiagnostic());
//
//                try {bus3.passDiagnostic();
//                } catch (TransportTypeException e) {
//                        System.out.println(e.getMessage());
//                }
//                }
//
//                car1.start();
//                car1.finish();
//
//                System.out.println(" ");
//
//                car4.pitStop();
//                car2.maxSpeed();
//                car3.bestTime();
//
//                System.out.println(" ");
//
//                bus1.pitStop();
//                bus2.bestTime();
//                bus3.maxSpeed();
//
//                System.out.println(" ");
//
//                lorry4.pitStop();
//                lorry2.bestTime();
//                lorry1.maxSpeed();
//                System.out.println(" ");
//
//                System.out.println("Водитель " + driverB.getName() + " управляет транспортом " + car1.getBrand() + " " + car1.getModel() + " и будет участвовать в заезде");


//        Car lada = new Car("Lada", "Granta", 1.7, 200,"yellow", 2015, "Russia", "MT", "sedan", "A111AA", 5, false);
//        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, 260,"black", 2020, "Germany", "AT", "sedan", "B222BB", 4, true);
//        Car bmw = new Car("BMW", "Z8", 3.0, 250, "black", 2021, "Germany", "MT", "roadster", "C333CC", 2, true);
//        Car kia = new Car("Kia", "Sportage IV", 2.4, 220, "red", 2018, "South Korea", "AT", "SUV", "E444EE", 5, false);
//        Car hyundai = new Car("Hyundai", "Avante", 1.6, 230, "orange", 2016, "South Korea", "MTA", "sedan", "H555HH", 5, true);
//        System.out.println(lada);
//        System.out.println(audi);
//        System.out.println(bmw);
//        System.out.println(kia);
//        System.out.println(hyundai);
//
//        hyundai.changeTiresToSeason(2);
//        System.out.println(hyundai);
//
//                System.out.println(" ");
//
//        Bus liaz = new Bus("ЛИАЗ", "5256", 2000, "Россия", "белый", 110);
//        Bus paz = new Bus("ПАЗ", "3205", 2005, "Россия", "голубой", 90);
//        Bus nefaz = new Bus ("НефАЗ", "5299", 2010, "Россия", "желтый", 70);
//                System.out.println(liaz);
//                System.out.println(paz);
//                System.out.println(nefaz);
        }
}


