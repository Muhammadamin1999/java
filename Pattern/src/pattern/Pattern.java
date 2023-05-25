package pattern;

public class Pattern {
private char z1, z2;  //fields
private int n;  //field

Pattern(){  //constructor
    z1='?';
    z2='?';
    n=1;
}

Pattern( char zn1, char zn2, int p){  //constructor
  z1=zn1;
  z2=zn2;
  n=p;
}
 
  void giveDescr(){  //method
    System.out.println("Paterrn description: " + n +" x ("+z1+","+z2+")");
}
 void print(){  //method
          if (n>0){
    for (int i=1; i<=n; i++){
          System.out.print(z1 +""+ z2);
          }
          System.out.println("");
          }
          else {
              System.out.println("WRONG NUMBER!!");
          }
    }   
 void changeData(char zn1, char zn2, int p){  //method
    z1=zn1;
    z2=zn2;
    n=p;
}
    

  public static void main(String[] args) {
    Pattern p1= new Pattern();
    Pattern p2= new Pattern('o', '$', 5);
    p1.giveDescr();
    p1.print();
    p2.giveDescr();
    p2.print();
    p1.changeData('-', '+', 7);
   // p1.giveDescr();
    p1.print();
    }
    
}
