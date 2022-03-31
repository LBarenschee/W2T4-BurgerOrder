import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Menu ourMenu1 = new Menu(1,"Snacky Double", 15.00, "Burger with 2 patties, cheese, bacon, tomato, lettuce", "coleslaw", "straberry milkshake");
        Menu ourMenu2 = new Menu(2,"KingSize", 20.00, "couble bacon, triple patty, cheese sauce", "chili fries", "beer");

        HashMap<Integer, Menu> menumap = new HashMap<>();
        menumap.put(ourMenu1.getId(), ourMenu1);
        menumap.put(ourMenu2.getId(), ourMenu2);

        //Menu newMenu = new Menu(menumap);


        System.out.println(menumap.get(1));
    }
}
