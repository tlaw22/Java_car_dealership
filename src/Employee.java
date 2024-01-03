public class Employee {
    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {


            if(finance == true){
                double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
                runCreditHistory(cust, loanAmount);
            } else if (vehicle.getPrice() <= cust.getCashOnHand()){
                    System.out.println("Customer paid in cash.");
                    processTransaction(cust, vehicle);

            } else {
                System.out.println("Customer will need more money to purchase vehicle");
            }
    }
    public void runCreditHistory(Customer cust, double loanAmount){
        System.out.println("Running credit check for customer...");
        System.out.println("The customer has been approved!");
    }
    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("This customer has purchased the " + vehicle + "for the price: " + vehicle.getPrice());
    }

}
