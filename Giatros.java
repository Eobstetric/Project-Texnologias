package source_code;

import java.util.ArrayList;

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
    
}

