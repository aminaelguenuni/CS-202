import java.util.*;
public class Rectangle extends AbstractShape { // extends is used between classes, while the other is created between class and interface. 
    // data fields
    private double width;
    private double height;

    //methods
    //default constructor // because shapeName is protected.C
    
    public Rectangle(){
        width=0.0;
        height=0.0;
        ShapeName=toString();
    }
    public double computeArea(){
        return width*height;
    }

    public double computePerimeter(){
        return (width+height)*2;
    }
    public void readShapeData(){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the width: ");
        width=keyboard.nextDouble();
        System.out.println("Enter the height: ");
        height=keyboard.nextDouble();

    }
    public String toString(){
        return "Rectangle";
    }
}
