package module_info;

public class Pliromi {
	
    private  String kodikos_pliromis;
    private  String id_rantevou;
    private  String id_toketou;
    private  double poso;
    
    public Pliromi(String kodikos_pliromis, String id_rantevou, String id_toketou, double poso)
    {
    	this.kodikos_pliromis = kodikos_pliromis;
    	
    	this.id_rantevou = id_rantevou;
    	
    	this.id_toketou = id_toketou;
    	
    	this.poso = poso;
    }
    
    public String get_kodikos_pliromis()
    {
    	return kodikos_pliromis;
    }
    
    public String get_id_rantevou()
    {
    	return id_rantevou;
    }
    
    public String get_id_toketou()
    {
    	return id_toketou;
    }
    
    public double get_poso()
    {
    	return poso;
    }
    
    
}
