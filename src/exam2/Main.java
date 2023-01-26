package exam2;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(2011, 25000, "Merc");
        Car car1 = new Car(2018, 23000, "Audi");
        Car car2 = new Car(2019, 25600, "BMW");
        Car car3 = new Car(2020, 36000, "Toyota");
        Car car4 = new Car(2016, 30000, "Jaguar");
        Car car5 = new Car(2020, 21000, "Nissan");
        Car car6 = new Car(2022, 56000, "BMW");
        Car[] cars = {car, car1, car2, car3, car4, car5, car6};
        System.out.println(countByYearAndPrice(cars));
        Car[] oldCars = searchOldCars(cars);
        for (int i = 0; i < oldCars.length; i++) {
            System.out.println(oldCars[i].getModel());
        }


    }

    public static int countByYearAndPrice(Car[] cars) {
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYear() > 2018 && cars[i].getPrice() > 25000) {
                count++;
            }
        }
        return count;
    }
    public static Car[]  searchOldCars(Car[] cars){
        int count = 0;
        for (int i = 0; i <cars.length ; i++) {
            if (cars[i].getYear()<2015){
                count++;
            }
        }
        Car[] cars1=new Car[count];
        for (int i = 0; i <cars.length ; i++) {
            if (cars[i].getYear()<2015){
            for (int j = 0; j <cars1.length ; j++) {
                cars1[j]=cars[i];
            }
            }
        }

        return cars1;
    }
}
