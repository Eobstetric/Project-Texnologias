package source_code;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import source_code.MainClass;

public class Dieuthintis {
    
    private final String username;
    private final String password;
    
    public Dieuthintis(String username, String password)
            
    {
    	
        this.username = username;
        
        this.password = password;
        
    }
    
    String get_username()
            
    {
        
     return username;   
    }
    
    String get_password()
            
    {
     return password;   
    }
    

String view_financial_stats()

{
   String str="";
   
   double sum_rantevou = 0;
   
   double sum_toketoi = 0;
   
   
   for(Rantevou r:MainClass.rant_list)
       
   {

     for(Pliromi p:MainClass.pliromi_list)
         
     {
         
         if(p.get_id_energeias()==r.get_kodikos())
             
         {
             sum_rantevou = sum_rantevou + p.get_poso();
             
         }
     }
       
   }
   
for(Toketos t:MainClass.toketos_list)
       
   {

     for(Pliromi p:MainClass.pliromi_list)
         
     {
         
         if(p.get_id_energeias()==t.get_id_toketou())
             
         {
             sum_toketoi = sum_toketoi + p.get_poso();
             
         }
     }
       
   }   
   
double total_sum = sum_rantevou + sum_toketoi;

str = total_sum + " " + sum_rantevou + " " + sum_toketoi;
return str;
}

void save_financial_stats() throws IOException
        
{
    
    File input = new File("statistika.txt");

FileWriter fw = new FileWriter(input);



String s = view_financial_stats();

fw.write(s);

    
    
}

String filter_stats(int year, int month, int day) throws ParseException

{

String str="";
   
   double sum_rantevou = 0;
   
   double sum_toketoi = 0;
   Date d;
   
   int xronia, minas,imera;
   
   for(Rantevou r:MainClass.rant_list)
       
   {
       
  d =new  SimpleDateFormat("dd/MM/yyyy").parse(r.get_date());
    
   xronia = d.getYear();
   minas = d.getMonth();
   imera = d.getDay();
       

     for(Pliromi p:MainClass.pliromi_list)
         
     {
         
         if(p.get_id_energeias()==r.get_kodikos()&&xronia==year && minas==month && imera==day )
             
         {
             sum_rantevou = sum_rantevou + p.get_poso();
             
         }
     }
       
   }
   
for(Toketos t:MainClass.toketos_list)
       
   {
       
   d =new  SimpleDateFormat("dd/MM/yyyy").parse(t.get_date());
    
   xronia = d.getYear();
   minas = d.getMonth();
   imera = d.getDay();
     for(Pliromi p:MainClass.pliromi_list)
         
     {
         
         if(p.get_id_energeias()==t.get_id_toketou()&&xronia==year && minas==month && imera==day)
             
         {
             sum_toketoi = sum_toketoi + p.get_poso();
             
         }
     }
       
   }   
   
double total_sum = sum_rantevou + sum_toketoi;

str = total_sum + " " + sum_rantevou + " " + sum_toketoi;
return str;

    
}

String view_giatroi_stats()
        
{
    String str = "";
    
    double sum_rantevou = 0;
    
    double sum_toketoi =0;
    
    double total_sum=0;
    
    for(Giatros  g: MainClass.giatr_list)
        
    {
        
        for(Rantevou r: MainClass.rant_list)
            
        {
            for(Pliromi p: MainClass.pliromi_list)
                
            {
                
        if(g.get_at().equals(r.get_at_giatrou())&&r.get_kodikos()==p.get_id_energeias())
            
        {
            sum_rantevou = sum_rantevou + p.get_poso();
        }
            }
        }
        
      str = str + " "+sum_rantevou;  
      
      for(Toketos t: MainClass.toketos_list)
            
        {
            for(Pliromi p: MainClass.pliromi_list)
                
            {
                
        if(g.get_at().equals(t.get_at_giatrou())&&t.get_id_toketou()==p.get_id_energeias())
            
        {
            sum_toketoi = sum_toketoi + p.get_poso();
        }
            }
        }
      
      str = str + " "+sum_toketoi;
      
      double total = sum_rantevou + sum_toketoi;
      
      str = str + " "+total;
      
      str = str + " "+g.get_at();
      
      str = str + " "+g.get_username();
      
      str = str + " "+g.get_rate_average();
      
      str = str + '\n';
      
    }
    
    return str;
}   


void save_giatroi_stats() throws IOException
        
        
{
   File input = new File("statistika_giatrwn.txt");

FileWriter fw = new FileWriter(input);



String s =view_giatroi_stats() ;

fw.write(s);
    
    
}      
        
        
}