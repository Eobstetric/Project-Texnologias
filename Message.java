public class Message {

    private String id;
    private String date;
    private int hour;
    private String thema;
    private String periexomeno;
    private String username_sender;
    private String username_receiver;
    
    public Message(String id, String date, int hour, String thema, String periexomeno, String username_sender, String username_receiver)
    {
    	this.id = id;
    	
    	this.date = date;
    	
    	this.hour = hour;
    	
    	this.thema = thema;
    	
    	this.periexomeno = periexomeno;
    	
    	this.username_sender = username_sender;
    	
    	this.username_receiver = username_receiver;
    }
    
    public String get_id()
    {
    	return id;
    }
    
    public String get_date()
    {
    	return date;
    }
    
    public int get_hour()
    {
    	return hour;
    }
    
    public String get_thema()
    {
    	return thema;
    }
    
    public String get_periexomeno()
    {
    	return periexomeno;
    }
    
    public String get_username_sender()
    {
    	return username_sender;
    }
    
    public String get_username_receiver()
    {
    	return username_receiver;
    }
    
}
