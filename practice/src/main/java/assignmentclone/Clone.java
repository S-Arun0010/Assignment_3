package assignmentclone;
import java.util.*;
import java.util.logging.Logger;
public class Clone implements Cloneable {
	private String x;
	private String y;
    public Clone(String x1,String y1)
    {
    	x=x1;
    	y=y1;
    }
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clone other = (Clone) obj;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}

	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
public static void main(String[] args)throws CloneNotSupportedException 
 {   
	
	 Scanner sc = new Scanner(System.in);
	 Logger l= Logger.getLogger("com.api.jar");
	 l.info("Enter the values of point :");
	 String x=sc.nextLine();
	 String y= sc.nextLine();
	 Clone p = new Clone(x,y);
	 l.info("Enter the values of point :");
	 String a=sc.nextLine();
	 String b= sc.nextLine();
	 Clone q = new Clone(a,b);
	 if(p.equals(q))
		 {
		 l.info("Both points are equal");
		 }
	 else
	 {
		 l.info("Both points are not equal");
	 }
	 Clone r = (Clone)p.clone();
	 l.info("Values of Cloned Objects: " + (r.x) +" " + (r.y));
 }
}