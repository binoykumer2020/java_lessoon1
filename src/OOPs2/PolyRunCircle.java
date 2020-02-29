package OOPs2;

public class PolyRunCircle extends PolyRunGeomatry {


    double radius;

    PolyRunCircle (double radius){
        this.radius = radius;
    }

    @Override
    double area (){
        System.out.print(" Area of the circle : ");
        return (22/7 * radius*radius);
    }
}
