package task3;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        Customer customer = new Customer("Rasmus", "Jensen", "Blaffen");
        Customer customer1 = new Customer("Peter", "Jensen", "Hagen");
        Customer customer2 = new Customer("Karl", "Jensen", "Golliwag");
        Customer customer3 = new Customer("Gustav", "Jensen", "Numse");
        Customer customer4 = new Customer("Thomas", "Jensen", "Twimber");
        Customer customer5 = new Customer("Salar", "Salim", "Pede B");

        customers.add(customer);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        printCustomers(customers);

    }
    public static void printCustomers(ArrayList<Customer> customers){
        for (Customer customer: customers) {
            System.out.println(customer);
        }
    }
}
