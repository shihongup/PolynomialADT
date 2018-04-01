
package polynomialadt;

public class Node {
    double coef;
    int exp;
    Node next;
    
    public Node(){
        next = null;
        coef = 0;
        exp = 0;
        
    }
    
    public Node(double c, int e, Node n){
        coef = c;
        exp = e;
        next = n;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node n){
        next = n;
    }
    
//    public void setData(int c,int e){
//        coef = c;
//        exp = e;
//    }
//    
//    public void setNext(Node n){
//        next = n;
//    }
//    
//    public Node getNext(){
//        return next;
//    }
//    
//    public int getData(){
//        return data;
//    }
}
