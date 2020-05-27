public class Pliromi {
    
    private String kodikos_pliromis;
    private String id_rantevou;
    private String id_toketou;
    private double poso;
    
	Public Pliromi(String kodikos_pliromis, String id_rantevou, String id_toketou, double poso) {
		
		this.kodikos_pliromis = kodikos_pliromis;
		
		this.id_rantevou = id_rantevou;
		
		this.id_toketou = id_toketou;
		
		this.poso = poso;
		
    }
	
	 String get_kodikos_pliromis() 
	 {
		 return kodikos_pliromis;
		 
	 }
	 
	 String get_id_rantevou()
	 {
		 return id_rantevou;
		 
	 }
	 
	 String get_id_toketou()
	 {
		 return id_toketou;
		 
	 }
	 
	 Double get_poso()
	 {
		 return poso;
		 
	 }
}

   