package task1;

public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("Rasmus", 23);
        Car c1 = new Car("Fiat", "500", 2009, "Microcar");
        Car c2 = new Car("Lamborghini", "Hurricane", 2014, "Supercar");
        c1.setDriver(d1);
        c2.setDriver(d1);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(d1.toString());


    }
}
