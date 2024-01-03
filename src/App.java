public class App {
    public static void main(String[] args) throws Exception {
        Customer cust1 = new Customer();
        Vehicle vehicle = new Vehicle();
        cust1.setName("Tim");
        cust1.setCashOnHand(12000);
        cust1.setAddress("123 Evermore Ave");
        cust1.purchaseCar("Mazaratti", emp, finance);   
        cust1.toString();     
    }
}
