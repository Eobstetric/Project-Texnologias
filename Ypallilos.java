package source_code;

import java.util.Random;

public class Ypallilos {

    private  String username;
    private  String password;
    private  int at;
    private  String email;
    private  String name;
    private  String surname;
    
   public Ypallilos(String username, String password, int at, String email, String name, String surname)
   
   {
    this.username = username;
    
    this.password = password;
    
    this.at = at;
    
    this.email = email;
    
    this.name = name;
    
    this.surname = surname;
       
   }
   
   String get_username()     
   {
	   return username;   
   }
   
   String get_password()
   {
	   return password;   
   }
   
   int get_at()
   {
	   return at;
   }
   
   String get_email()
   {
       return email;
   }
   
   String get_name()
   {
       return name;
   }
   
   String get_surname()
   {
       return surname;
   }

   void accept_astenis_request(Aitisi a)
           
   {
       
      a.set_state("accepted");
      
      
      Asthenis asth1 = new Asthenis(a.get_username(),a.get_password(),a.get_amka(),a.get_email(),a.get_name(),a.get_surname(),a.get_path_photo());
   
      MainClass.asth_list.add(asth1);
   
   }
   
   Rantevou get_rantevou_by_id(int id)
           
   {
       Rantevou rant = null;
       
       
       for(Rantevou r: MainClass.rant_list )
           
       {
           
           if(r.get_kodikos()==id)
               
           {
               
               rant=r;
               
               break;
           }
       }
       return rant;
   }
   
   Toketos get_toketos_by_id(int id)
           
   {
       Toketos tok = null;
       
       
       for(Toketos r: MainClass.toketos_list )
           
       {
           
           if(r.get_id_toketou()==id)
               
           {
               
               tok=r;
               
               break;
           }
       }
       return tok;
   }
   
   void confirm_pliromi(Rantevou r, double poso)
           
   {
       Random rand = new Random();
      
      int k = rand.nextInt(1000);
       
      
       
       Pliromi p = new Pliromi(k,r.get_kodikos(),poso);
       
       MainClass.pliromi_list.add(p);
   }
           
   
   void confirm_pliromi(Toketos t, double poso)
           
   {
       Random rand = new Random();
      
      int k = rand.nextInt(1000);
       
      
       
       Pliromi p = new Pliromi(k,t.get_id_toketou(),poso);
       
       MainClass.pliromi_list.add(p);
   }
   
   
   
}
