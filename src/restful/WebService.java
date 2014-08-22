package restful;



import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;




import employee_stuff.Employee;

@Path("/hello")
public class WebService 
{

	@GET
	@Path("/print/{msg}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMsg(@PathParam("msg") String message)
	{
		return "Hello from a RESTful Web service:" + message;
	}
	
	@GET
	@Path("/emp")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee testEmployee()
	{
		Employee e = new Employee(1, 15000f, "Bob Testworthy");
		return e;
	}
	
	@GET
	@Path("/empslist")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> testEmployeeList()
	{	
		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(1, 15000f, "Bob Test Worthy"));
		e.add(new Employee(2, 25000f, "Mary Murky"));
		e.add(new Employee(3, 35000f, "Leslie Crinkle"));
		return e;
	
	}
	


}
