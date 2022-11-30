package in.ashokit.beans;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class PaySlipGenerator 
{
	private Printer printer;

	private PaySlipGenerator(Printer printer) 
	{
		this.printer = printer;
		System.out.println("Creating PaySlipGenerator Object");
	}


	
	
	public void gererateReport()
	{
		printer.print();
	}
	

}
