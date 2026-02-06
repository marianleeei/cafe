public class Cafe {
    private String cafeName;
    private MenuItem menuItem;
    
    public Cafe (String cafeName, MenuItem menuItem) {
        this.cafeName = cafeName;
        this.menuItem = menuItem;
    }
    
    public String operateCafe (Barista barista) {
        return cafeName + " is now open. \n"
                + barista.prepareDrink() + "\n"
                + menuItem.getItemDetails();
    }
    
    public String identify() {
        return "I am the Cafe class. I manage baristas and menu items.";
    }
}