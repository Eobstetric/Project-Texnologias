public class Toketos {

          private final String id_toketou;
	  private final int amka_astheni;
	  private final String at_giatrou;
	  private final String date;
	  private final int hour;
	  private final String aithousa;
	  private final String sxolia;
	  
	  
	  
	  public Toketos(String id_toketou, int amka_astheni, String at_giatrou, String date, int hour, String aithousa, String sxolia)

	  {
	      this.id_toketou = id_toketou;
		  this.amka_astheni = amka_astheni;
		  this.at_giatrou = at_giatrou;
	      this.date = date;
		  this.hour = hour;
	      this.aithousa = aithousa;    
	      this.sxolia = sxolia;
	  
	  
	  }

	  public String get_id_toketou()
	  {
	  
	    return id_toketou;
	  }
	  
	  
	  public int get_amka_astheni()
	  {
	  
	    return amka_astheni;
	  }
	  
	  
	  public String get_at_giatrou()
	  {
	  
	   return at_giatrou;
	  }
	  
	  public String get_date()
	  {
	  
	   return date;
	  }
	  
	  public int get_hour()
	  {
	  
	   return hour;
	  }
	  
	  public String get_aithousa()
	  {
	  
	   return aithousa;
	  }
	  
	  public String get_sxolia()
	  {
	  
	  return sxolia;
	  }
	  
	}