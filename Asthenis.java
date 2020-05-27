public class Asthenis {
    
    private final String username;
    private final String password;
    private final int amka;
    private final String email;
    private final String name;
    private final String surname;
    private final String path_photo;
    
    public Asthenis(String username, String password, int amka, String email, String name, String surname, String path_photo)
    
    {
        
        this.username = username;
        
        this.password = password;
        
        this.amka = amka;
        
        this.email = email;
        
        this.name = name;
        
        this.surname =surname;
        
        this.path_photo = path_photo;
        
    }

    public String get_username()
    {
    	return username;   
    }

    public String get_password()
    {
    
    	return password;   
    }

    public int get_amka()
    {
    
    	return amka;   
    }

    public String get_name()        
    {
    
    	return name;   
    }


    public String get_email()
    {

    	return email;
    }

    public String get_surname()
    {
  
    	return surname;   
    }

    public String get_path_photo()    
    {
    
    	return path_photo;   
    }
}

