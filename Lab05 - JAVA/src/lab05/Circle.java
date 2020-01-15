
package lab05;

public class Circle {
    
    double radius;
    
    public Circle(){
        
    }
    public Circle(double rad){
        this.radius = rad;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea(){
        return radius * radius * Math.PI;
    }
    public double computeCircumference(){
        return Math.PI * radius * 2;
    }
}
