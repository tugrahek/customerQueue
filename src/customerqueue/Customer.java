/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customerqueue;

/**
 *
 * @author Kutay
 */
public class Customer {
    
    private int ID;
    private String name;
    
    public Customer() {
        this.ID = 0;
        this.name =null;
    }

    public Customer(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    public Customer(Customer other) {
        this.ID = other.ID;
        this.name = other.name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" + "ID=" + ID + ", name=" + name + '}';
    }
    
    
}
