import java.util.ArrayList;
/*
 * house class that extends building 
 */
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;
/*
 * constructor with name, address, number of floors, and boolean for having a dining room
 */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }
/*
 * boolean for having dining room
 * @return hasDiningRoom
 */
  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }
/*
 * int number of residents
 * @return nResidents
 */
  public int nResidents() {
    return residents.size();
  }
/*
 * moveIn method
 * adds residents by name
 */
  public void moveIn(String name) {
    residents.add(name);
  }
/*
 * method to move out of house
 * removes resident from house by name
 */
  public String moveOut(String name) {
    boolean removed = residents.remove(name);
    if (removed) {
      return name;
    } else {
      return null;
    }
  }
/*
 * boolean to check residents
 */
  public boolean isResident(String person) {
    return residents.contains(person);
  }

  public static void main(String[] args) {
    House myHouse = new House("Abby's House", "123 Peachtree Avenue", 2, true);
    myHouse.moveIn("Abby");
  }

}