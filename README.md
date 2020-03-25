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
	
> # SPRING MVC FORMS

>> ###### Reservation is used for Creating the *SPRING MVC FORM*
   
  **MODEL** [*com.niit.tlc.springmvc.model*]
   
   
    public class Reservation {
	private String firstName;
	private String lastName;
	private String gender;
	private String[] food;
	private String cityForm;
	private String cityTo;
       
  **Controller** [*com.niit.tlc.springmvc.controller*]
	    
	   @Controller
		public class ReservationController {


		@RequestMapping(value="/bookingForm")
		public String reservationForm(ModelMap model) {
			Reservation res=new Reservation();
			model.addAttribute("reservationForm", res);
			return "Reservationformview";//reservation Page
		}
		@RequestMapping("/submitForm")
		public String submitForm(@ModelAttribute("reservationForm") Reservation res1)		{
			System.out.println("\n"+res1.getFirstName()+"\n");
			return "confirmationForm";
		}
	}
 
  **VIEWS** 
    
      **Reservationformview.jsp** is used for Reserve the food 
    
       **ConfirmationForm.jsp** is used for display the Reserved Food



> # HTML FORM WITH CONTROLLER 

>> **HTML FROM** 
       
	1. Signup.jsp
   
   
>> **Controller** 
     
    @RequestMapping("/signIn")
	public String showSignUp() {
		return "signUp";
	}

	@RequestMapping("/checklogin")
	public String authenticate(HttpServletRequest req, ModelMap model) {
		
			if (req.getParameter("uname").equalsIgnoreCase("Deepanshu") && req.getParameter("psw").equals("deep")) {
				model.addAttribute("message", "SucessFully Login");
				return "success";
			}
			else
			{

				model.addAttribute("message", "entered Data is Incorrect");
				return "errorPage";
			}
		
	}
	
	
	
>> **VIEWS** [webapp/WEB-INF/views]

    1 sucess.jsp
    2. errorPage.jsp
     

