import java.util.Scanner;

public class Circle extends AbstractShape {
    //Data fields
    private double radius;

    //Methods
    public double computeArea(){
        return Math.PI*radius*radius;
    }

    public double computePerimeter(){
        return Math.PI*2*radius;
    }
    public void readShapeData(){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius=keyboard.nextDouble();

    }
    public String toString(){
        return "Circle";
    }

}
