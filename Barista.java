public class Barista {
    private String baristaName;
    
    public Barista (String baristaName) {
        this.baristaName = baristaName;
    }
    
    public String prepareDrink() {
        return baristaName + " is preparing a coffee order.";
    }
    
    public String identify() {
        return "I am the Barista class.  I represent a cafe staff member who prepares drinks.";
    }
}
