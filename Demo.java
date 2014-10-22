import java.util.Scanner;

public class Demo
{
	public static void main(String [] args)
	{
		int height;
		int wid;
		Scanner kb = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		System.out.print("Enter height and width of rectangle: ");
		height =kb.nextInt();
		wid = kb.nextInt();
		
		rec.setHeight(height);
		rec.setWidth(wid);
		System.out.println(rec);
		
	
	}
}