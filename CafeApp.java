public class CafeApp {
    public static void main (String[] args) {
        
        Barista barista = new Barista ("MJP");
        MenuItem menuItem = new MenuItem ("Caramel Macchiato");
        Cafe cafe = new Cafe ("Dash Five Cafe", menuItem);
        
        System.out.println(
                barista.identify() + "\n" +
                menuItem.identify() + "\n" +
                cafe.identify() + "\n\n" +
                cafe.operateCafe(barista)
        );
        public String identify() {
        return "I am the CafeApp class. I manage baristas and menu items.";
    }
}
