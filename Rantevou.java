package source_code;


public class Rantevou {

private int kodikos;
    
    private int amka_asth;
    
    private String at_giatrou;
    
    private String date;
    
    int hour;
    
    String sxolia;
    
    public Rantevou(int kodikos, int amka_asth, String at_giatrou, String date, int hour, String sxolia)
            
    {
    	
     this.kodikos = kodikos;   
     
     this.amka_asth = amka_asth;
     
     this.at_giatrou = at_giatrou;
     
     this.date = date;
     
     this.hour = hour;
     
     this.sxolia = sxolia;
     
    } 
    
    int get_kodikos()         
    {
    	
    return kodikos;
    }
   
    int get_amka_asth()
    {
        
     return amka_asth;   
    }
    
    String get_at_giatrou()
    {
    	
     return at_giatrou;   
    }
    
    String get_date()        
    {
    	
     return date;   
    }
   
    int get_hour()
    {
    	return hour;
    }
    
    String get_sxolia()

    {
    	return sxolia;
    }
    
    void set_date(String date)
            
            
    {
        
        this.date = date;
    }
    
    void  set_hour(int hour)
            
    {
     this.hour = hour;   
    }
    
    void add_sxolio(String s)
            
    {
      sxolia = sxolia + '\n';
      
      sxolia = sxolia + s;
    }


}