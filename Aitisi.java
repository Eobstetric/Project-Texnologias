public class Aitisi {

    private int kodikos;
    private String username;
    private String password;
    private int amka;
    private String email;
    private String name;
    private String surname;
    private String path_photo;
    private String state;
    
    public Aitisi(int kodikos, String username, String password, int amka, String email, String name, String surname, String path_photo, String state)
    
    {   
    	this.kodikos = kodikos;
    	
        this.username = username;
        
        this.password = password;
        
        this.amka = amka;
        
        this.email = email;
        
        this.name = name;
        
        this.surname = surname;
        
        this.path_photo = path_photo;
        
        this.state = state;
   }

    public int get_kodikos()
    {
    	return kodikos;
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
    
    public String get_email()
    {
    	return email;
    }
    
    public String get_name()
    {
    	return name;
    }
    
    public String get_surname()
    {
    	return surname;
    }
    
    public String get_path_photo()
    {
    	return path_photo;
    }
    
    public String get_state()
    {
    	return state;
    }
    
    public void set_state(String s)
            
    {
        state = s;
    }
}