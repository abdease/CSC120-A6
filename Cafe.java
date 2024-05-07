
/* 
 * cafe class extends building
 */
public class Cafe extends Building {

    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    /*
     * constructor with name, address, nFloors, coffee amt, sugar amt, cream amt, and number of cups
     */
    public Cafe(String name, String address, int nFloors, int coffeeOunces, int sugarPackets, int creams, int cups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = coffeeOunces;
        this.nSugarPackets = sugarPackets;
        this.nCreams = creams;
        this.nCups = cups;
        System.out.println("You have built a cafe: ☕");
    }
/*
 * method to sell coffee, decreasing inventory
 */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (this.nCoffeeOunces >= size && this.nSugarPackets >= nSugarPackets && this.nCreams >= nCreams && this.nCups >=1) {
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
            System.out.println("Enjoy your cup of coffee!");
        } else {
            System.out.println("Sorry, we are out of coffee!");
            restock(90, 50, 75, 100);
        }
    }
/*
 * method to restock with initial amounts of coffee, sugar, cream, cups
 */
    public void restock(int coffeeOunces, int sugarPackets, int creams, int cups) {
        this.nCoffeeOunces = coffeeOunces;
        this.nSugarPackets = sugarPackets;
        this.nCreams = creams;
        this.nCups = cups;
        System.out.println("The inventory is restocked.");
    }

    
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Abby's Cafe", "86 Espresso Boulevard", 1, 90, 50, 75, 100);
        myCafe.sellCoffee(2, 1, 1);
    }
    
}
