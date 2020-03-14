/**
 * Shape_class
 */
public class Shape_class {
    private static int count = 0;
    public Shape_class(int r){
        double pi = 3.14; 
        
        System.out.println("Circle's perimeter :"+(2*r*pi));
        System.out.println("Circle's area :"+(r*r*pi));
        count++;
    }
    
    public Shape_class(int x, int y){
        System.out.println("Square's perimeter :"+((x*2)+(y*2)));
        System.out.println("Square's area :"+(x*y));
        count++;
    }
    public Shape_class(int x, int y, double angle){
        System.out.println("Square's perimeter :"+(x*y*(Math.sin(angle))));
        System.out.println("Square's area :"+((x*y*(Math.cos(angle)))/2));
        count++;
    }
    public static int getCount(){
        return count;
    }
    
}