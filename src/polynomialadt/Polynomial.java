
package polynomialadt;

public class Polynomial {
    //Add p1(x) and p2(x)
    public static void add(LinkedList list1,LinkedList list2){
//        System.out.print("list1");
//        list1.print();
//        System.out.print("list2");
//        list2.print();        
        LinkedList addList =  new LinkedList();
        LinkedList finalAddList = new LinkedList();
        
        Node temp1 = list1.first;
        Node remTemp1 = temp1;
        Node temp2 = list2.first;
        Node remTemp2 = temp2;
        while(temp1!=null){
            addList.setPoly(temp1.coef, temp1.exp);
            while(temp2!=null){
                addList.setPoly(temp2.coef, temp2.exp);
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        //Make the elements which has the same exponent to one element
        Node afterMult = addList.first;
        Node remAfterMult = addList.first;
 //       multList.print();
        while(remAfterMult != null){
        double coefResult = remAfterMult.coef;
        int expResult = remAfterMult.exp;
        int pos = 2;
        if (afterMult != null){
            while(afterMult.next != null){
                //multList.print();
                //System.out.println(coefResult);
                if(afterMult.next.exp == remAfterMult.exp){
                    coefResult += afterMult.next.coef;
                    addList.deletePoly(pos); 
                    afterMult = addList.first;
                    //System.out.println("coef "+afterMult.coef+" exp "+afterMult.exp);
                    //System.out.println(coefResult);
                    pos-=2;
                }
                else{
                    pos++;
                if(afterMult.next != null){
                afterMult = afterMult.next;
                }
                                    
                }

            }
        }
            
//            if((multList.last.exp == expResult)&&(multList.last != remAfterMult)){
//                coefResult+= multList.last.coef;
//                multList.deletePoly(multList.size);
//            }
            
            addList.deletePoly(1);
            finalAddList.setPoly(coefResult, expResult);
            
            remAfterMult = remAfterMult.next;
            afterMult = remAfterMult;
                }
        System.out.println("This is the result of p1(x) + p2(x):");
        finalAddList.print();
    }
    //Multiply p1(x) and p2(x)
    public static void multiply(LinkedList list1,LinkedList list2){
//        System.out.print("list1");
//        list1.print();
//        System.out.print("list2");
//        list2.print();        
        LinkedList multList =  new LinkedList();
        LinkedList finalList = new LinkedList();
        
        Node temp1 = list1.first;
        Node remTemp1 = temp1;
        Node temp2 = list2.first;
        Node remTemp2 = temp2;
        while(temp1 != null){
            while(temp2 != null){
                multList.setPoly((temp1.coef * temp2.coef), (temp1.exp + temp2.exp));
                temp2 = temp2.next;
            }
            temp2 = remTemp2;
            temp1 = temp1.next;
        }
        //Make the elements which has the same exponent to one element
        Node afterMult = multList.first;
        Node remAfterMult = multList.first;
 //       multList.print();
        while(remAfterMult != null){
        double coefResult = remAfterMult.coef;
        int expResult = remAfterMult.exp;
        int pos = 2;
        if (afterMult != null){
            while(afterMult.next != null){
                //multList.print();
                //System.out.println(coefResult);
                if(afterMult.next.exp == remAfterMult.exp){
                    coefResult += afterMult.next.coef;
                    multList.deletePoly(pos); 
                    afterMult = multList.first;
                    //System.out.println("coef "+afterMult.coef+" exp "+afterMult.exp);
                    //System.out.println(coefResult);
                    pos=2;
                }
                else{
                    pos++;
                if(afterMult.next != null){
                afterMult = afterMult.next;
                }
                                    
                }

            }
        }           
//            if((multList.last.exp == expResult)&&(multList.last != remAfterMult)){
//                coefResult+= multList.last.coef;
//                multList.deletePoly(multList.size);
//            }            
            multList.deletePoly(1);
            finalList.setPoly(coefResult, expResult);
            
            remAfterMult = remAfterMult.next;
            afterMult = remAfterMult;
//            multList.print();
//            finalList.print();
            
        }
//        multList.print();
        System.out.println("The result of p1(x) * p2(x):");
        finalList.print();
//        multList.deletePoly(4);
//        multList.print();
    }
    
    public static void sub(LinkedList list1,LinkedList list2){
//        System.out.print("list1");
//        list1.print();
//        System.out.print("list2");
//        list2.print();        
        LinkedList subList =  new LinkedList();
        LinkedList finalSubList = new LinkedList();
//        System.out.println("list1:");
//        list1.print();
//        System.out.println("list2:");
//        list2.print();
        Node temp1 = list1.first;
        Node remTemp1 = temp1;
        Node temp2 = list2.first;
        Node remTemp2 = temp2;
        double coefResult = 0;
        while(temp1!=null){
//            System.out.println("Tmep1while1:"+temp1.coef+"x"+"^"+temp1.exp);
            coefResult = temp1.coef;
            int pos = 1;
            int equal = 0;
            while(temp2!=null){
                if(temp2.exp == temp1.exp){
//                    System.out.println("Tmep1while2:"+temp1.coef+"x"+"^"+temp1.exp);
                    
                    coefResult = coefResult - temp2.coef;
//                    System.out.println("pos" + pos);
                    list2.deletePoly(pos);
//                    System.out.println("list2after:");
  //                  list2.print();
                    temp2 = list2.first;//准备更新temp2
 //                 System.out.println("temp2ref" + temp2.coef+"x"+"^"+temp2.exp);
                    pos--;
                    equal++;
                }
                else{
                    pos++;
                }
                    temp2 = temp2.next;                                    
            }
            if(equal == 0){
                subList.setPoly(temp1.coef, temp1.exp);
            }
            else{
                subList.setPoly(coefResult, temp1.exp);
            }
            temp2 = list2.first;
            temp1 = temp1.next;
        }
            Node list2left = list2.first;
            while(list2left != null){
                subList.setPoly(0-list2left.coef,list2left.exp);
                list2left = list2left.next;
            }        
        System.out.println("This is the result of p1(x) - p2(x);");
        subList.print();
    }

    public static void devide(LinkedList list1,LinkedList list2){
        LinkedList devList =  new LinkedList();
        LinkedList finaDevlList = new LinkedList();
//        System.out.print("list1");
//        list1.print();
//        System.out.print("list2");
//        list2.print();
        Node temp1 = list1.first;
        Node remTemp1 = temp1;
        Node temp2 = list2.first;
        Node remTemp2 = temp2;
        while(temp1 != null){
            while(temp2 != null){

                devList.setPoly((temp1.coef / temp2.coef), (temp1.exp - temp2.exp));
                temp2 = temp2.next;
            }
            temp2 = remTemp2;
            temp1 = temp1.next;
        }
        //System.out.print("MUL");
        //devList.print();
        //Make the elements which has the same exponent to one element
        Node afterDev = devList.first;
        Node remAfterDev = devList.first;
 //       multList.print();
        while(remAfterDev != null){
        double coefResult = remAfterDev.coef;
        int expResult = remAfterDev.exp;
        int pos = 2;
        if (afterDev != null){
            while(afterDev.next != null){
                //devList.print();
                //System.out.println(coefResult);
                if(afterDev.next.exp == remAfterDev.exp){
                    coefResult += afterDev.next.coef;
                    devList.deletePoly(pos); 
                    afterDev = devList.first;
                    //System.out.println("coef "+afterMult.coef+" exp "+afterMult.exp);
                    //System.out.println(coefResult);
                    pos=2;
                }
                else{
                    pos++;
                if(afterDev.next != null){
                afterDev = afterDev.next;
                }
                                    
                }

            }
        }           
//            if((multList.last.exp == expResult)&&(multList.last != remAfterMult)){
//                coefResult+= multList.last.coef;
//                multList.deletePoly(multList.size);
//            }            
            devList.deletePoly(1);
            finaDevlList.setPoly(coefResult, expResult);
            
            remAfterDev = remAfterDev.next;
            afterDev = remAfterDev;
//            multList.print();
//            finalList.print();
            
        }
//        multList.print();
        System.out.println("The result of p1(x) / p2(x):");
        finaDevlList.print();
//        multList.deletePoly(4);
    }
}
