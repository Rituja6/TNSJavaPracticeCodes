import com.rituja.assignment.employees.Manager;
import com.rituja.assignment.employees.Developer;
import com.rituja.assignment.utilities.EmployeeUtilities;
public class Driverclass {

	public static void main(String[] args) {
		Manager mg=new Manager("Alice",101,85000,"IT");
		Developer dv=new Developer("John",102,95000,"Java");
		
		EmployeeUtilities ed=new EmployeeUtilities();
		ed.printManagerDetails(mg);
		ed.printDeveloperDetails(dv);
	}

}
