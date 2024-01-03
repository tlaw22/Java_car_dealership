public class Dealership {
public static void main(String[] args) {
    Customer cust1 = new Customer();
    Vehicle vehicle = new Vehicle();
    cust1.setName("Tim");
    cust1.setCashOnHand(12000);
    cust1.setAddress("123 Evermore Ave");
    cust1.purchaseCar("Mazaratti");
    cust1.toString();
}
}
