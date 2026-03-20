import java.util.ArrayList;

import javax.swing.JFrame;

class Item{
    int id;
    String name;
    int quantity;
    
    Item(int id,String name,int quantity){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
    }
    public String toString(){
        return id + " - " + name + " (Qty: " + quantity + ")";
    }
}

public class InventoryManagementSystem {
    static ArrayList<Item> inventory=new ArrayList<>();
    public static void main(String[] args){
        JFrame frame =new JFrame();
    }

    
}
