package source_code;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Asthenis {
    
    private  String username;
    private  String password;
    private  int amka;
    private  String email;
    private  String name;
    private  String surname;
    private  String path_photo;
    
    public Asthenis(String username, String password, int amka, String email, String name, String surname, String path_photo)
    
    {
        
        this.username = username;
        
        this.password = password;
        
        this.amka = amka;
        
        this.email = email;
        
        this.name = name;
        
        this.surname =surname;
        
        this.path_photo = path_photo;
        
    }

    public String get_username()
    {
    	return username;   
    }

    public String get_password()
    {
    
    	return password;   
    }

    public int get_amka()
    {
    
    	return amka;   
    }

    public String get_name()        
    {
    
    	return name;   
    }


    public String get_email()
    {

    	return email;
    }

    public String get_surname()
    {
  
    	return surname;   
    }

    public String get_path_photo()    
    {
    
    	return path_photo;   
    }
    
    
  public void create_rantevou(String at, String date, int hour)
          
          
  {
      Random rand = new Random();
      
      int k = rand.nextInt(1000);
      
      Rantevou rant = new Rantevou(k,this.amka,at,date,hour,"");
      
      MainClass.rant_list.add(rant);
      
  }
  
  public Rantevou get_rantevou(Rantevou r)
          
  {
      Rantevou temp=null;
      
      for(Rantevou rant: MainClass.rant_list)
          
          
      {
          if(rant.get_kodikos()==r.get_kodikos())
              
          {
              temp = rant;
          }
      }
      
      return temp;
      
  }     
          
  public void modify_rantevou(Rantevou r, String date, int hour)
          
  {
      
      for(Rantevou rant: MainClass.rant_list)
          
          
      {
          if(rant.get_kodikos()==r.get_kodikos())
              
          {
             rant.set_date(date);
             rant.set_hour(hour);
          }
      }
      
  }
          
  public void rate_rantevou(Rantevou r, int vathmos)
          
  {
 
      Vathmologia v1 = new Vathmologia(r.get_kodikos(),vathmos);
      
      MainClass.vathm_list.add(v1);
      
  }
  
  public ArrayList<Giatros> get_giatroi()
          
  {
      
    return MainClass.giatr_list;

      
      
  }

  public Giatros select_giatros(int index)
          
          
  {
      
    return MainClass.giatr_list.get(index);
      
  }
  
  public int select_hour(int hour)
          
  {
      return hour;
      
  }
  
  public String select_date(String date)
          
  {
      
      return date;
  }
  
  public void add_comment(Rantevou r, String s)
          
  {
      for(Rantevou rant: MainClass.rant_list)
          
      {
          
          if(rant.get_kodikos()==r.get_kodikos())
              
              
          {
              rant.add_sxolio(s);
              
          }
      }
      
  }
  
  public String get_sxolia_rantevou(Rantevou r)
          
  {
      
  
  return r.get_sxolia();
      
  }
  
 ArrayList<Istoriko> get_history_list()
         
 {
    ArrayList<Istoriko> temp = new ArrayList<Istoriko>();
    
    
    for(Istoriko ist: MainClass.istoriko_list)
        
    {
        if(ist.get_amka()==this.amka)
            
        {
            temp.add(ist);        }
    }
    
  
    return temp;
 } 
 
 Istoriko get_history(int index)
         
 {
     return get_history_list().get(index);
 }
 
 ArrayList<Istoriko> filter_history(String date_from, String date_to) throws ParseException

         
 {
     Date date_fr =new SimpleDateFormat("dd/MM/yyyy").parse(date_from);
     
     Date date_t = new SimpleDateFormat("dd/MM/yyyy").parse(date_to);
     
     
     ArrayList<Istoriko> temp = this.get_history_list();
     
     String s;
     
     Date d;
     
     ArrayList<Istoriko> filtered = new ArrayList<Istoriko>();
     
     for(Istoriko i: temp)
         
     {
         s = i.get_date_katagrafis();
         d =new  SimpleDateFormat("dd/MM/yyyy").parse(s);
         
         if(d.after(date_fr)&&d.before(date_t))
             
         {
          filtered.add(i);
         }
     }
     return filtered;
     }
     
void save_history() throws IOException
        
{
    
ArrayList<Istoriko> temp = get_history_list();

File input = new File("istoriko.txt");

FileWriter fw = new FileWriter(input);


for(Istoriko i:temp)
    
{
    
    fw.write(i.get_amka());
    fw.write(i.get_date_katagrafis());
    fw.write(i.get_hour_katagrafis());
    fw.write(i.get_energeia());
    fw.write(i.get_sxolia());



    
}
    
}

Istoriko get_next_action(int current_thesi)
        
{
 
    return get_history_list().get(current_thesi+1);
    
} 
        


Giatros get_doctor_info(Giatros g)

{
    
    Giatros giat= null;

    for(Giatros temp: MainClass.giatr_list)
        
    {
    
        if(temp.get_at().equals(g.get_at()))
        
        {
            giat = temp;
        }
    }
    
  return giat;
}
 
 void send_message(Giatros g, String periexomeno, String thema)
         
 {
     
     Random rand = new Random();
      
      int k = rand.nextInt(1000);
      
      
      LocalDate date = java.time.LocalDate.now();
      
      LocalTime time = java.time.LocalTime.now();
     
   Message m = new Message(k,date.toString(),time.toString(),thema,periexomeno,this.username,g.get_username());
   
   MainClass.mes_list.add(m);
 }
 
 //ArrayList<Giatros> order_by_rate()
         
 //{
     
   //return get_giatroi().sort

    
     
 //}


 ArrayList<Rantevou> get_rantevou()
        
{

    ArrayList<Rantevou> temp = new ArrayList<Rantevou>();
    
    
    for(Rantevou r : MainClass.rant_list)
        
    {
        
     if(r.get_amka_asth()==this.amka)
         
     {
      temp.add(r);
     }
        
    }
    return temp;
    }
    
 
 
}