Public class Arxeio_Dieythinti {

   private String kodikos_kataxorisis;
   
   private String path_arxeiou;
   
   private int date;
   
   private int hour;
   
   Public Arxeio_Dieythinti (String kodikos_kataxorisis, String path_arxeiou, int date, int hour) {
   
         this.kodikos_kataxorisis = kodikos_kataxorisis;
		 
		 this.path_arxeiou = path_arxeiou;
		 
		 this.date = date;
		 
		 this.hour = hour;
		 
	}
	
	    String get_kodikos_kataxorisis() 
		{
		   return kodikos_kataxorisis; 
		   
		}
		
		String get_path_arxeiou()
		{
		   return path_arxeiou;
		   
		}
		
		int get_date()
		{
		   return date;
		   
		}
		
		int get_hour()
		{
		   return hour;
		   
		}
		 