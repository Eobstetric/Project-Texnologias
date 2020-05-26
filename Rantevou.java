public class Rantevou {
    
    private String kodikos;
    
    private int amka_asth;
    
    private String at_giatrou;
    
    private String date;
    
    int hour;
    
    String sxolia;
    
    public Rantevou(String kodikos, int amka_asth, String at_giatrou, String date, int hour, String sxolia)
            
    {
    	
     this.kodikos = kodikos;   
     
     this.amka_asth = amka_asth;
     
     this.at_giatrou = at_giatrou;
     
     this.date = date;
     
     this.hour = hour;
     
     this.sxolia = sxolia;
     
    } 
    
    String get_kodikos()
            
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


}


