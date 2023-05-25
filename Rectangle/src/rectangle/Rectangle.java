package rectangle;

import java.util.Scanner;

public class Rectangle {

    private float a;  //field
    private float b;  //field

    Rectangle() {  //constructor
        a = 1;
        b = 1;
    }

    Rectangle(float a, float b) {  //constructor
        this.a = a;
        this.b = b;
    }

    float countArea() {  //method
        return a * b;
    }

    float countPerimeter() {  //method
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        Scanner myin = new Scanner(System.in); //creating an object for reading from keyboard
        System.out.print("Enter the height a= ");
        float a = myin.nextFloat();
        System.out.print("Enter the width b= ");
        float b = myin.nextFloat();
        if (a <= 0 || b <= 0) {
            System.out.println("a and b have to be positive!!!");
        } else {
            Rectangle rec = new Rectangle(a, b);  // we declare and instantiate an object
            System.out.println("The area of the rectangle equals " + rec.countArea());
            System.out.println("The perimeter of the rectangle equals " + rec.countPerimeter());
        }
        new Me(); //anonymous object of the class Me
    }

}
