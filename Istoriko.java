public class Istoriko {
	
	private  int amka;
	private  String energeia;
	private  String sxolia;
	private  String date_katagrafis;
	private  String hour_katagrafis;
	private  String id_energeias;
	
	public Istoriko(int amka, String energeia, String sxolia, String date_katagrafis, String hour_katagrafis, String id_energeias)
	{
		this.amka = amka;
		
		this.energeia = energeia;
		
		this.sxolia = sxolia;
		
		this.date_katagrafis = date_katagrafis;
		
		this.hour_katagrafis = hour_katagrafis;
		
		this.id_energeias = id_energeias;
	}

	public int get_amka()
	{
		return amka;
	}
	
	public String get_energeia()
	{
		return energeia;
	}
	
	public String get_sxolia()
	{
		return sxolia;
	}
	
	public String get_date_katagrafis()
	{
		return date_katagrafis;
	}
	
	public String get_hour_katagrafis()
	{
		return hour_katagrafis;
	}
	
	public String get_id_energeias()
	{
		return id_energeias;
	}
	
}
