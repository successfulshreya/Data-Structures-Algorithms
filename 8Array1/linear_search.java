
public class linear_search {

    public static boolean LinearSearch(String items[], String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {//.equals() method is used to compare the content of two strings. It returns true if the strings are equal, and false otherwise.
                System.out.println("Item found: " + "" + "at" + i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] items = {"samosa", "kachori", "veg biryani", "patties"};
        String item = "samosa";
        boolean found = LinearSearch(items, item);

    }
}
