package module_info;

public class Arxeio {

	private String kodikos_kataxorisis;
	private String path_arxeio;
	private String date_created;
	private String hour_created;
	
	public Arxeio(String kodikos_kataxorisis, String path_arxeio, String date_created, String hour_created)
	{
		this.kodikos_kataxorisis = kodikos_kataxorisis;
		
		this.path_arxeio = path_arxeio;
		
		this.date_created = date_created;
		
		this.hour_created = hour_created;
	}
	
	 public String get_kodikos_kataxorisis()
	 {
		 return kodikos_kataxorisis;
	 }

	 public String get_path_arxeio()
	 {
		 return path_arxeio;
	 }
	 
	 public String get_date_created()
	 {
		 return date_created;
	 }
	 
	 public String get_hour_created()
	 {
		 return hour_created;
	 }
	 
}
