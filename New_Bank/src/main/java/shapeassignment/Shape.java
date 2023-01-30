package shapeassignment;
import java.util.Scanner;
import java.util.logging.Logger;
public class Shape {
    int rectangale;
    int triangle;
    int circle;
    int length;
    int width;
    int radius;
    int a;
    int b;
    int c;
    static Logger l= Logger.getLogger("com.api.jar");
    public Shape(int r) {
        radius = r;
    }
    public Shape(int l, int w) {
        length = l;
        width = w; 
    }
    public Shape(int s1, int s2, int s3) {
    	try
    	{
    	a = s1;
        b = s2;
        c = s3;
    	}
    	catch(IllegalArgumentException e)
        {
     	   l.info(" argument  is not accurately fit to the given relation or condition");
        }
    }
    double perimeter(int r) {
        return (2 * 3.14 * r);
    }
    double perimeter(int l, int w) {
        return 2 * ((double)l + w);
    }
    double perimeter(int a, int b, int c) {
        return (a + b + c);
    }
    double area(int r) {
        return (3.14 * r * r);
    }
    double area(int l, int w) {
        return (double)l * b;
    }
    double area(int a, int b, int c) {
        double s = (double) (a + b + c) / 2;
        return (Math.sqrt(s * (s - a) * (s - c) * (s - b)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        l.info("Enter the Shape:");
        String name = sc.nextLine();
        try {
        switch (name) {
            case "circle":
            	l.info("Enter the radius :");
                int radius = sc.nextInt();
                Shape circle = new Shape(radius);
                l.info("Perimeter of Circle :" + circle.perimeter(radius));
                l.info("Area of Circle :" + circle.area(radius));
                break;
            case "rectangle":
            	l.info("Enter the length and width :");
                int length = sc.nextInt();
                int width = sc.nextInt();
                Shape rectangle = new Shape(length, width);
                l.info("Perimeter of rectangle :" + rectangle.perimeter(length, width));
                l.info("Area of rectangle :" + rectangle.area(length, width));
                break;
            case "triangle":
            	l.info("Enter the three sides of the traiangle:");
                int s1 = sc.nextInt();
                int s2 = sc.nextInt();
                int base = sc.nextInt();
                Shape triangle = new Shape(s1, s2, base);
                double per = triangle.perimeter(s1, s2, base);
                l.info("Perimeter of Triangle : " + per);
                l.info("Area of Triangle :" + triangle.area(s1, s2, base));
                break;
            default:
            	l.info("Enter the valid shape :");
        }
        }
        catch(Exception e)
        {
        	l.info("Exception found");
        }
    }
}
