public class Ypallilos {

    private final String username;
    private final String password;
    private final int at;
    private final String email;
    private final String name;
    private final String surname;
    
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
