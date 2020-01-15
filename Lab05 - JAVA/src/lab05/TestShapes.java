package lab05;
import java.util.Scanner;
import java.util.Random;
public class TestShapes {

    public static void main(String[] args) {
      
        Circle myCircle = new Circle();
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter your circle radius: ");
        myCircle.radius = userIn.nextDouble();
        
        Rectangle myRect = new Rectangle();
        Random rand = new Random();
        
        myRect.height = rand.nextInt(10);
        myRect.width = rand.nextInt(10);
        System.out.println(myRect.height +"\t"+myRect.width);
        System.out.printf("Circle Cirumferenece: %.2f%s",myCircle.computeCircumference(),"cm");
        System.out.printf("\nCircle Area: %.2f%s", myCircle.computeArea(),"sqcm\t");
        System.out.printf("\nRectangle Perimeter: %.2f%s",myRect.computePerimeter(),"cm");
        System.out.printf("\nRectangle Area: %.2f%s", myRect.computeArea(),"sqcm\n");
        
        if (myCircle.computeCircumference()> myRect.computePerimeter()){
            System.out.println("\nCircumference is greater than perimeter");
        }else{
            System.out.println("\nPerimeter is greater than circumference");
        }
        if (myCircle.computeArea()> myRect.computeArea()){
            System.out.println("\nCircle area is greater than rectangle area");
        }else{
            System.out.println("\nRectangle area is greater than circle area");
        }  
        
        System.out.println("Enter new radius: ");
        myCircle.radius = userIn.nextDouble();
        if (myCircle.computeArea()> myRect.computeArea()){
            System.out.println("\nCircle area is greater than rectangle area");
        }else{
            System.out.println("\nRectangle area is greater than circle area");
        }  
    }
    
}
