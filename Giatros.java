package source_code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Giatros {
    
    private String name;
    private String surname;
    private String username;
    private String password;
    private String email;
    private String at;
    private String path_photo;
    private double rate_average;
    
    
    //disdiastatos pinakas gia tin diathesimotita tou trexontos mina
    
    //opou exei 1 simainei oti o giatros tin antistoixi ora kai mera einai diatesimos
    private int [][] diathesimotita= new int[3][4];
    
    
  public Giatros(String name, String surname, String username, String password, String email, String at, String path_photo)
          
          
  {
      
  this.name = name; 
  
  this.surname = surname;
  
  this.password = password;
  
  this.email = email;
  
  this.at = at;
  
  this.path_photo = path_photo;
  
  this.rate_average=0;
      
      
  }
  
  String get_name()
          
  {
      
   return name;   
  }
  
  String get_surname()
          
  {
   return surname;   
      
  }
  
  String get_password()
          
  {
   return password;   
  }
  
  
    
String get_email()

{

return email;
}

String get_path_photo()
        
{
    
 return path_photo;   
    
}

String get_username()
        
{
    
    return username;
}

String get_at()
          
  {
      
   return at;   
  }
double get_rate_average()
          
  {
      
   return rate_average;   
  }


ArrayList<Rantevou> get_rantevou()
        
{

    ArrayList<Rantevou> temp = new ArrayList<Rantevou>();
    
    
    for(Rantevou r : MainClass.rant_list)
        
    {
        
     if(r.get_at_giatrou().equals(this.at))
         
     {
      temp.add(r);
     }
        
    }
    return temp;
    }
    
    
    
    void insert_diathesimotita(int day, int hour)
            
    {
        diathesimotita[day-1][hour-1] = 1;
    }
    
    ArrayList<Toketos> get_toketoi()
            
            
    {
     ArrayList<Toketos> temp = new ArrayList<Toketos>();
    
    
    for(Toketos r : MainClass.toketos_list)
        
    {
        
     if(r.get_at_giatrou().equals(this.at))
         
     {
      temp.add(r);
     }
        
    }
    return temp;
    }   
        
    
    
void add_toketos(int amka, String date, int hour, String aithousa)


{
    Random rand = new Random();
      
      int k = rand.nextInt(1000);
    
Toketos tok = new Toketos(k,amka,this.get_at(),date,hour,aithousa,"");

MainClass.toketos_list.add(tok);

}

ArrayList<Message> get_messages()
        
{
  ArrayList<Message> temp = new ArrayList<Message>();

  for(Message m: MainClass.mes_list)
      
  {
   if(m.get_username_receiver().equals(this.username))
       
   {
    temp.add(m);
   }
      
  }
  
  return temp;
  }
  
 ArrayList<String> get_statistics()
         
 {
     
  int plithos_rantevou = 0;
  
  int plithos_toketwn = 0;
  
  
  for(Rantevou r:MainClass.rant_list)
      
  {
   if(r.get_at_giatrou().equals(this.at))
       
   {
    plithos_rantevou++;   
   }
  }
  
  
  for(Toketos r:MainClass.toketos_list)
      
  {
   if(r.get_at_giatrou().equals(this.at))
       
   {
    plithos_toketwn++;   
   }
  }
      
  ArrayList<Rantevou> rantevou_giatrou = get_rantevou();

  ArrayList<Toketos> toketoi_giatrou = get_toketoi();

  int sum_vathmoi_r=0;
  
  int sum_vathmoi_t = 0;
  
  for(Vathmologia v:MainClass.vathm_list)
      
  {
   
      for(Rantevou r: rantevou_giatrou)
          
      {
          if(v.get_id_rantevou()==r.get_kodikos())
          {
           sum_vathmoi_r+=v.get_vathmologia();
          }
      }
      
  }
  
  
  for(Vathmologia v:MainClass.vathm_list)
      
  {
   
      for(Toketos r:toketoi_giatrou)
          
      {
          if(v.get_id_rantevou()==r.get_id_toketou())
          {
           sum_vathmoi_t+=v.get_vathmologia();
          }
      }
      
  }
  
  float mo_rantevou = sum_vathmoi_r/rantevou_giatrou.size();
  
  float mo_toketwn = sum_vathmoi_t/toketoi_giatrou.size();
  
  
  ArrayList<String> str = new ArrayList<String>();
  
  str.add(String.valueOf(plithos_rantevou));
  str.add(String.valueOf(plithos_toketwn));
    str.add(String.valueOf(mo_rantevou));
   str.add(String.valueOf(mo_toketwn));
   
   
 return str;
 }      
         
 ArrayList<String> update_statistics(int year,int month, int day) throws ParseException
 {
     int plithos_rantevou = 0;
  
  int plithos_toketwn = 0;
  
  Date d;
  
  int xronia,minas,imera;
  
  for(Rantevou r:MainClass.rant_list)
      
  {
      
   d =new  SimpleDateFormat("dd/MM/yyyy").parse(r.get_date());
    
   xronia = d.getYear();
   minas = d.getMonth();
   imera = d.getDay();
      
   if(r.get_at_giatrou().equals(this.at)&& xronia==year && minas==month && imera==day)
       
   {
    plithos_rantevou++;   
   }
  }
  
  
  for(Toketos r:MainClass.toketos_list)
      
  {
       d =new  SimpleDateFormat("dd/MM/yyyy").parse(r.get_date());
    
   xronia = d.getYear();
   minas = d.getMonth();
   imera = d.getDay();
      
      
   if(r.get_at_giatrou().equals(this.at)&& xronia==year && minas==month && imera==day)
       
   {
    plithos_toketwn++;   
   }
  }
      
  ArrayList<Rantevou> rantevou_giatrou = get_rantevou();

  ArrayList<Toketos> toketoi_giatrou = get_toketoi();

  int sum_vathmoi_r=0;
  
  int sum_vathmoi_t = 0;
  
  for(Vathmologia v:MainClass.vathm_list)
      
  {

      for(Rantevou r: rantevou_giatrou)
          
      {
         d =new  SimpleDateFormat("dd/MM/yyyy").parse(r.get_date());

          xronia = d.getYear();
           minas = d.getMonth();
              imera = d.getDay();
          if(v.get_id_rantevou()==r.get_kodikos()&& xronia==year && minas==month && imera==day)
          {
           sum_vathmoi_r+=v.get_vathmologia();
          }
      }
      
  }
  
  
  for(Vathmologia v:MainClass.vathm_list)
      
  {
   
      
      for(Toketos r:toketoi_giatrou)
          
      {
          d =new  SimpleDateFormat("dd/MM/yyyy").parse(r.get_date());

          xronia = d.getYear();
           minas = d.getMonth();
              imera = d.getDay();
          if(v.get_id_rantevou()==r.get_id_toketou()&& xronia==year && minas==month && imera==day)
          {
           sum_vathmoi_t+=v.get_vathmologia();
          }
      }
      
  }
  
  float mo_rantevou = sum_vathmoi_r/rantevou_giatrou.size();
  
  float mo_toketwn = sum_vathmoi_t/toketoi_giatrou.size();
  
  
  ArrayList<String> str = new ArrayList<String>();
  
  str.add(String.valueOf(plithos_rantevou));
  str.add(String.valueOf(plithos_toketwn));
    str.add(String.valueOf(mo_rantevou));
   str.add(String.valueOf(mo_toketwn));
   
   
 return str;
 }    
 
 ArrayList<Asthenis> get_astheneis()
 
 {
     ArrayList<Asthenis> temp = new ArrayList<Asthenis>();
     
     
     for(Rantevou r:MainClass.rant_list)
     
     {
      if(r.get_at_giatrou()==at)
          
      {
       int amka = r.get_amka_asth();
       
       Asthenis a = MainClass.get_asthenis_amka(amka);
       
       temp.add(a);
      }
          
     }
     
     return temp;
     }  
         
     
 }        
         
         

