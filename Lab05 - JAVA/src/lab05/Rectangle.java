
package lab05;

public class Rectangle {
    
    double height;
    double width;
    
    public Rectangle(){
        this.height = 1;
        this.width = 1;
    }
    
    public Rectangle(double h, double w){
        this.height = h;
        this.width = w;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        if (h <= 0){
            this.height = 1;
        }else{
            this.height = h;
        }
        
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
         if (w <= 0){
            this.width = 1;
        }else{
            this.width = w;
        }
    }
    public double computeArea(){
        return height * width;
    }
    public double computePerimeter(){
        return 2* (height + width);
    }
    
}
