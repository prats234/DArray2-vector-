import java.util.ArrayList;
import java.util.Vector;

public class array2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("grapes");
        fruits.add("jackfruit");
        fruits.add("papaya");
        fruits.add("guava");
        fruits.add("pineapple");

        int Listsize = fruits.size();
        String place = fruits.get(3);

        fruits.set(2, "black grapes");
        System.out.println(Listsize);
    }
    {
    Vector<String> seasons = new Vector<String>();
     seasons.add("summer");
     seasons.add("winter");
     seasons.add("rainy");

     int listsize = seasons.size();
     String place = seasons.get(3);

     System.out.println(seasons);
}
}
