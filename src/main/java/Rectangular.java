public class Rectangular {
    
    double side1;
    double side2;

    Rectangular(){
        side1 = 1;
        side2 = 1;
    }
    Rectangular(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    double getArea(){

        return this.side1 * this.side2;
    }
    double getPerimeter(){
        return 2*(this.side1+this.side2);
    }
    boolean isSquare(){
        return this.side1 == this.side2;
    }
    
}
