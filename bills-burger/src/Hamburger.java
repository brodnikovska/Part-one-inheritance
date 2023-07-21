public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println("Basic hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
    }

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Added " + name + " for an extra " + price);
        this.price += price;
    }

    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Added " + name + " for an extra " + price);
        this.price += price;
    }

    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Added " + name + " for an extra " + price);
        this.price += price;
    }

    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Added " + name + " for an extra " + price);
        this.price += price;
    }

    public double itemizeHamburger() {
        return this.price;
    }


}
