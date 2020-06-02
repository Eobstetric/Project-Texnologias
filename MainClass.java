
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source_code;

import java.util.*;



public class MainClass {
    
    public static ArrayList<Asthenis> asth_list = new ArrayList<Asthenis>();
    
    public static ArrayList<Giatros> giatr_list = new ArrayList<Giatros>();
    
    public static ArrayList<Rantevou> rant_list = new ArrayList<Rantevou>();
    
    public static ArrayList<Toketos> toketos_list = new ArrayList<Toketos>();
    
    public static ArrayList<Dieuthintis> dieu_list = new ArrayList<Dieuthintis>();
    
    public static ArrayList<Ypallilos> ipal_list = new ArrayList<Ypallilos>();
    
    public static ArrayList<Vathmologia> vathm_list = new ArrayList<Vathmologia>();

    public static ArrayList<Pliromi> pliromi_list = new ArrayList<Pliromi>();

    public static ArrayList<Message> mes_list = new ArrayList<Message>();
    
    public static ArrayList<Istoriko> istoriko_list = new ArrayList<Istoriko>();

    public static ArrayList<Arxeio> arxeio_list = new ArrayList<Arxeio>();
    
    public static ArrayList<Aitisi> aitisi_list = new ArrayList<Aitisi>();
    
    public static void main(String[] args)

            
    {
        
        Asthenis as1 = new Asthenis("stavros","1234", 12345678,"stavros@gmail.com","A","B", "C/documents/downloads");
        asth_list.add(as1);
    }
    
    public static Asthenis get_asthenis_amka(int amka)
            
    {
        
        Asthenis asthenis = null;
        
        for(Asthenis a: MainClass.asth_list)
            
        {
            
            if(a.get_amka()==amka)
                
            {
                
                asthenis = a;
                
                break;
            
        }
        
        
    }
                return asthenis;

    }   
    
    
    
    
    
    
    
    
    public static Asthenis get_asthenis(String username)
            
    {
        
        Asthenis asthenis = null;
        
        for(Asthenis a: MainClass.asth_list)
            
        {
            
            if(a.get_username().equals(username))
                
            {
                
                asthenis = a;
                
                break;
            
        }
        
        
    }
                return asthenis;

    }           
   
    
     public static Giatros get_giatros(String username)
            
    {
        
        Giatros giatros = null;
        
        for(Giatros a: MainClass.giatr_list)
            
        {
            
            if(a.get_username().equals(username))
                
            {
                
                giatros = a;
                
                break;
            
        }
        
        
    }
                return giatros;

    } 
    
 public static Ypallilos get_ypallilos(String username)
            
    {
        
        Ypallilos ypallilos = null;
        
        for(Ypallilos a: MainClass.ipal_list)
            
        {
            
            if(a.get_username().equals(username))
                
            {
                
                ypallilos = a;
                
                break;
            
        }
        
        
    }
                return ypallilos;

    }    
    
    
   public static Dieuthintis get_dieuthintis(String username)
            
    {
        
        Dieuthintis dieuthintis = null;
        
        for(Dieuthintis a: MainClass.dieu_list)
            
        {
            
            if(a.get_username().equals(username))
                
            {
                
               dieuthintis = a;
                
                break;
            
        }
        
        
    }
                return dieuthintis;

    }   
    
    
    
    
}
