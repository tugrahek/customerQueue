
package customerqueue;

import java.util.LinkedList;


public class CustomerQueue {
    LinkedList<Customer> customerQueue;

    public CustomerQueue() {
        this.customerQueue = new LinkedList<>();
    }
    
    public void addCustomer(Customer customer){
        customerQueue.add(customer);
    }
    public Customer removeCustomer(){
        if(customerQueue.isEmpty()){
            return null;
        }
        return customerQueue.remove();
    }
    public Customer peekCustomer(){
        if(customerQueue.isEmpty()){
            return null;
        }
         return customerQueue.peek();
    }
    public void printElements(){
        for(Customer customer: customerQueue){
            System.out.println(customer);
        }
    }
    public int size(){
        return customerQueue.size();
    }
    
    public LinkedList<Customer> getQueueLinkedList(){
        return customerQueue;
    }
    
    
    
}
