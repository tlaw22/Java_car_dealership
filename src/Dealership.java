public class Dealership {
    String name;
    String address;
    double cashOnHand;
    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance){
        Customer cust1 = new Customer();
        cust1.setName("Tim");
        cust1.setCashOnHand(12000);
        cust1.setAddress("123 Evermore Ave");
        cust1.purchaseCar("Mazaratti", emp, finance);
    }
}
