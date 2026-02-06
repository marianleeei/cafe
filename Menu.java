public class Menu {
    private String itemName;
    
    public Menu (String itemName) {
        this.itemName = itemName;
    }
public String getItemDetails() {
        return "Menu item available: " + itemName;
    }
    
    public String identify() {
        return "I am the MenuItem class. I store information about food or drinks in the cafe.";
    }
}