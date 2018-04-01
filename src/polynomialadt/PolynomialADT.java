
package polynomialadt;
/**
 * Author: SHIFENG YUAN
 * GWID G32115270
 * 
*  I have defined the two polynomial as
* P1(x) = 3x^2+5x+5x^3
* P2(x) = 4x^2+5x+3x^5+5x^4
* 
* The result of P1(x)+P2(x) is supposed to be
* 5x^4 + 3x^5 + 9x^3 + 10x^1 + 3x^2
* 
* The result of P1(x)*P2(x) is supposed to be
* 15x^8 + 25x^2 + 45x^4 + 50x^6 + 34x^7 + 15x^3 + 37x^5
* 
* The result of P1(x)-P2(x) is supposed to be
* -3.0x^5 -5.0x^4 + 3.0x^2 + 1.0x^3
* 
* The result of P1(x)/P2(x) is supposed to be
* 1.0x^2 + 1.67x^-4 + 2.25x^0 + 3.52x^-2 + 2.00x^-3 + 0.60x^1 + 1.75x^-1
**/
public class PolynomialADT {

    public static void main(String[] args) {
        /**
         * *define the two polynomials as
        * P1(x) = 3x^2+5x+5x^3
        * P2(x) = 4x^2+5x+3x^5+5x^4
        **/
        LinkedList p1 = new LinkedList();
        p1.setPoly(3, 2);
        p1.setPoly(5,1);
        p1.setPoly(5,3);
        LinkedList p2 = new LinkedList();
        p2.setPoly(4, 3);
        p2.setPoly(5,1);
        p2.setPoly(3,5);
        p2.setPoly(5,4);
        
        //Add the results of add or multiply into p3
        Polynomial p3 = new Polynomial();
        p3.add(p1,p2);
        p3.multiply(p1,p2);
        p3.devide(p1,p2);
        p3.sub(p1,p2);

    }
    
}
