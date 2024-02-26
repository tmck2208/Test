import java.util.*;
public class MasterList {
    private static ArrayList<PopcornOrder> orders;
    public MasterList(){
        orders = new ArrayList<PopcornOrder>();
    }
    public void addOrder(PopcornOrder o){
        orders.add(o);
    }
    public String toString(){
        String i = "";
        for(int x = 0; x<orders.size(); x++){
            String g = (orders.get(x)).getVariety();
            int h = (orders.get(x)).getNumOrdered();
            i += g + ", " + h + "\n" ;
        }
        return i;
    }
    public int getTotalOrders(){
        int i = 0;
        for(int x = 0; x < orders.size(); x++){
            int y = (orders.get(x)).getNumOrdered();
            i+=y;
        }
        return i;
    }
    public int removeVariety(String variety){
        int i = 0;
        for(int x = orders.size()-1; x>= 0; x--){
            String orderV = (orders.get(x)).getVariety();
            if(orderV.equals(variety)){
                i+=(orders.get(x)).getNumOrdered();
                orders.remove(x);
            }
        }
        return i;
    }
}
