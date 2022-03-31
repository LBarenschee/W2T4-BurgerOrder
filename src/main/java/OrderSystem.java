import java.util.HashMap;

public class OrderSystem {

    private HashMap<Integer, Menu> menuMap;

    public OrderSystem(HashMap<Integer, Menu> menuMap) {
        this.menuMap = menuMap;
    }

    public void addMenu(Menu newMenu){
        menuMap.put(newMenu.getId(), newMenu);
    }

    //public void getOrderById
}
