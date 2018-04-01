
package polynomialadt;

public class LinkedList {
    Node first;
    Node last;
    public int size;
    //int size;
    
    public LinkedList(){
        first = null;
        last = null;
        size  = 0;
    }
    
    public void setPoly(double c, int e){
        Node ptr = new Node(c,e,null);
        if(first == null){
            first = new Node(c,e,first);
            last = first;
        }
        else{
        first = new Node(c,e,first);            
        }

        size++;
    }
    
    public void deletePoly(int pos){
        if(pos == 1){
            first = first.getNext();
            size--;
            return;
        }
        if(pos == size){
            Node s = first;
            Node t = first;
            while((s != last)&&(s.next!=null)){
                t = s;
                s = s.next;
            }
            last = t;
            last.next = null;
            size--;
            return;
        }
        Node ptr = first;
        pos -= 1;
        for(int i = 1; i < size; i++){
            if(i == pos){
                ptr.setNext(ptr.next.next);
                break;
            }
            ptr = ptr.next;
        }
        
    }
    
    public void print(){
        Node current = null;
        current = first;
        if(current != null){
            String deci2 = String.format("%.2f",current.coef);
            if(current.coef != 0){
            System.out.print("("+deci2+"x"+"^"+current.exp+")");
            }
            while(current.next != null){
                current = current.next;
                deci2 = String.format("%.2f",current.coef);
                if(current.coef != 0){
                System.out.print(" + ("+deci2+"x"+ "^"+current.exp+")");
                }
            }
            System.out.println();
        }
    }
//    public int geySize(){
//        return size;
//    }
//    public boolean isEmpty(){
//        return size == 0;
//    }
 
}
