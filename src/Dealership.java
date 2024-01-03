public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tim", "123 PaddyWack ln", 55000);
        Vehicle vehicle = new Vehicle("Ford", "F-250", 55000);
        Vehicle car = new Vehicle("BMW", "M2", 35000);
        Vehicle car2 = new Vehicle("BMW", "M2", 35000);
        Employee emp = new Employee();
        cust1.purchaseCar(vehicle, emp, false);
        cust1.toString();
        boolean value = car.equals(car2);
        System.out.println(value);
    }
}
