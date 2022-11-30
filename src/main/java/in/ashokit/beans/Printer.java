package in.ashokit.beans;
import org.springframework.stereotype.Component;
@Component
public class Printer
{
	Printer()
	{
		System.out.println("Creating Printer Object");
	}
	
	public void print()
	{
		System.out.println("Printing the document");
	}

}
