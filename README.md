# SpringWebMVC
Web application using Spring MVC



> ## WEB-INF
>> ### *web.xml* 
       is the website descripter in which adding the spring-servlet.xml
 
>> ### *spring-servlet.xml*
   is the configuration file for the Spring Framework in which we define 
    * the View Controller here
    * what kind of extenstion used in view state
   
>> ### *view Folder*
      view is the One Part of the Model **View** Controller
   
   
   
   
> ## com.niit.techno.springmvc.controller
		this package is used for the Model View **Controller**


>> ### HomeController 
     is the class who control the Home Access 
     
      import org.springframework.stereotype.Controller
> #### Annotations

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
     	