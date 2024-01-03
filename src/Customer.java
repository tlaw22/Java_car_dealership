public class Customer {
    private String name;
    private String address;
    private double cashOnHand;

    public void purchaseCar(){
        
    }
    
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return double return the cashOnHand
     */
    public double getCashOnHand() {
        return cashOnHand;
    }

    /**
     * @param cashOnHand the cashOnHand to set
     */
    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

}

