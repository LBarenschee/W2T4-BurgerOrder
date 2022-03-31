import java.util.ArrayList;

public class Menu {
    int id;
    String name;
    double price;
    String mainDish;
    String sideDish;
    String beverage;



    public Menu(int id,String name, double price, String mainDish, String sideDish, String beverage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;


    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getMainDish() {
        return mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getBeverage() {
        return beverage;
    }



    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        if (Double.compare(menu.price, price) != 0) return false;
        if (name != null ? !name.equals(menu.name) : menu.name != null) return false;
        if (mainDish != null ? !mainDish.equals(menu.mainDish) : menu.mainDish != null) return false;
        if (sideDish != null ? !sideDish.equals(menu.sideDish) : menu.sideDish != null) return false;
        return beverage != null ? beverage.equals(menu.beverage) : menu.beverage == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (mainDish != null ? mainDish.hashCode() : 0);
        result = 31 * result + (sideDish != null ? sideDish.hashCode() : 0);
        result = 31 * result + (beverage != null ? beverage.hashCode() : 0);
        return result;
    }
}
