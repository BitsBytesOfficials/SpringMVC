# SpringWebMVC
Web application using Spring MVC



> ## WEB-INF
>> ### web.xml 
       is the website descripter in which adding the spring-servlet.xml
 
>> ### spring-servlet.xml
   is the configuration file for the Spring Framework in which we define 
    * the View Controller here
    * what kind of extenstion used in view state
   
>> ### view Folder
   view is the One Part of the Model **View** Controller
   
   
   
   
> ## com.niit.techno.springmvc.controller
this package is used for the Model View **Controller**


>> ### HomeController 
     is the class who control the Home Access 
     
      import org.springframework.stereotype.Controller
> ## Annotations

>> Controller  
        Make the Controller Class
        
     			@Controller     
     		   class HomeController
    			 {
    			 	//method showHome(ModelMap)
     				DATAMEMBERS and MEMBER FUNCTION
     			}
     			
>> RequestMapping
  
   			is putting on the Methods with method invoke
     	
     	
     	@RequestMapping(value ="/MappingName",method=RequestMethod.Get/POST)	
     	public String showHome(ModelMap model)
     	{
     	
     			return "home";// it's finding the home.jsp in view folder
     		}
     		
>> Adding The Model Value
        Adding the Model Attribute
        
        @RequestMapping(value ="/MappingName",method=RequestMethod.Get/POST)	
     	public String showHome(ModelMap model)
     	{
     		model.addAttribute("user","Value");
     			return "home";// it's finding the home.jsp in view folder
     		}
     	
# 25/03/2020

## SalesDemo is the practice Asssigment given by Sir for Practice Purpose

## SpringMVC
###  Spring MVC Forms [ com.niit.tlc.springmvc.model]
 
> Employee model is created
 
> ### com.niit.tlc.springmvc.controller

>> EmployeeController added  
  

	@Controller
	public class EmployeeController {   
	@RequestMapping(value="employeeForm",method=RequestMethod.GET)
	 public String register(Model model) {
		Employee theEmp=new Employee();
		model.addAttribute("employee",theEmp);
		 return "registerEmployee";
	 }
	
	@RequestMapping(value="/addEmployee",method=RequestMethod.POST)
	public String submit(@ModelAttribute("employee")Employee employee,ModelMap model) {
		model.addAttribute("name", employee.getName());
		model.addAttribute("contactNumber", employee.getContactNumber());
		model.addAttribute("id", employee.getId());
		
		return "viewEmployee";
	}
	}

