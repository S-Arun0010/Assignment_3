package studentassignment;
import java.util.Scanner;
import java.util.logging.Logger;
public class Student {
    String name;
    char gradelevel;
    double gp;
    static Logger l= Logger.getLogger("com.api.jar");
    Student(String n, char g, double gpa) {
        name = n;
        gradelevel = g;
        gp = gpa;
    }
    public void updategpa(double gpa) {
        gp = gpa;
    	
    }
    public String details() {
        return (name + " has a " + Double.toString(gp) + " GPA");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
        Student student = new Student("Arun", 'A', 8.73);
        l.info("Enter the GPA :");
        double gpa = sc.nextDouble();
        student.updategpa(gpa);
        String s = student.details();
        l.info(s);
        }
        catch(NumberFormatException e)
        {
           l.info("Number format Exception found");	
        }
        catch(Exception e)
        {
        	l.info("Another Exception has accured");
        }
    }
}
