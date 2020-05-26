public class Giatros {
    
    private String name;
    private String surname;
    private String username;
    private String password;
    private String email;
    private String at;
    private String path_photo;
    private double rate_average;
    
    
  public Giatros(String name, String surname, String username, String password, String email, String at, String path_photo)
          
          
  {
      
  this.name = name; 
  
  this.surname = surname;
  
  this.password = password;
  
  this.email = email;
  
  this.at = at;
  
  this.path_photo = path_photo;
      
      
  }
  
  String get_name()
          
  {
      
   return name;   
  }
  
  String get_surname()
          
  {
   return surname;   
      
  }
  
  String get_password()
          
  {
   return password;   
  }
  
  
    
String get_email()

{

return email;
}

String get_path_photo()
        
{
    
 return path_photo;   
    
}
}

