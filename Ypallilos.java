public class Ypallilos {

    private  String username;
    private  String password;
    private  int at;
    private  String email;
    private  String name;
    private  String surname;
    
   public Ypallilos(String username, String password, int at, String email, String name, String surname)
   
   {
    this.username = username;
    
    this.password = password;
    
    this.at = at;
    
    this.email = email;
    
    this.name = name;
    
    this.surname = surname;
       
   }
   
   String get_username()     
   {
	   return username;   
   }
   
   String get_password()
   {
	   return password;   
   }
   
   int get_at()
   {
	   return at;
   }
   
   String get_email()
   {
       return email;
   }
   
   String get_name()
   {
       return name;
   }
   
   String get_surname()
   {
       return surname;
   }

}
