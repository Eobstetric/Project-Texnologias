package source_code;

public class Pliromi {
	
    private  int kodikos_pliromis;
    private  int id_energeias;
    private  double poso;
    
    public Pliromi(int kodikos_pliromis,int id_energeias, double poso)
    {
    	this.kodikos_pliromis = kodikos_pliromis;
    	    	
    	this.id_energeias = id_energeias;
    	
    	this.poso = poso;
    }
    
    public int get_kodikos_pliromis()
    {
    	return kodikos_pliromis;
    }
    
    public int get_id_energeias()
    {
    	return id_energeias;
    }
    
       
    public double get_poso()
    {
    	return poso;
    }
    
    
}
