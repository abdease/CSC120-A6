import java.util.Hashtable;
/*
 * class library extends building
 */
public class Library extends Building {

    private Hashtable<String, Boolean> collection;
/*
 * constructor for name, address, nFloors
 * adds new Hashtable
 */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<>();
      System.out.println("You have built a library: 📖");
    }
/*
 * adding title to collection with Hastable .put
 * @param title
 */
    public void addTitle(String title) {
      collection.put(title, true);
    }
/*
 * removing title from collection with .remove
 * @param title
 */
    public String removeTitle(String title) {
      Boolean removed = collection.remove(title);
      return removed != null ? title : null;
    }
/*
 * checking out a title from collection with containsKey
 * @param title
 */
    public void checkOut(String title) {
      if (collection.containsKey(title)) {
        collection.put(title, false);
      } else {
        System.out.println("Book not found in the collection.");
      }
    }
/*
 * returning title to collection with containsKey
 * @param title
 */
    public void returnBook(String title) {
      if (collection.containsKey(title)) {
        collection.put(title, true);
      } else {
        System.out.println("Book not found in collection.");
      }
    }
/*
 * checking collection for certain title with containsKey
 * @param title
 */
    public boolean containsTitle(String title) {
      return collection.containsKey(title);
    }

    public void printCollection() {
      System.out.println("Library Collection:");
      for (String title : collection.keySet()) {
        System.out.println(title + " - " + (collection.get(title) ? "Available" : "Checked Out"));
      }
    }

  
    public static void main(String[] args) {
      Library myLibrary = new Library("Dease Library", "121 Lemontree Lane", 4);
      myLibrary.addTitle("If You Give a Mouse a Cookie");
      myLibrary.printCollection();
    }
  
  }