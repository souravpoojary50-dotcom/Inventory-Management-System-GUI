import java.util.ArrayList;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
        JFrame frame =new JFrame("Inventory Management System");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JTextField idField=new JTextField(10);
        JTextField nameField=new JTextField(10);
        JTextField qtyField=new JTextField(10);
        JButton addBtn=new JButton("Add Item");
        JButton viewBtn=new JButton("View Items");
        JButton deleteBtn=new JButton("Delete Item");

        JTextArea display=new JTextArea(10,30);
        frame.add(new JLabel("Item ID"));
        frame.add(idField);
        frame.add(new JLabel("Itme Name"));
        frame.add(nameField);
        frame.add(new JLabel("Quantity"));
        frame.add(qtyField);
        frame.add(addBtn);
    }

    
}
