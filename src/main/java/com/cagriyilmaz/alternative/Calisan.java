package com.cagriyilmaz.alternative;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativedi")
@ApplicationScoped
public class Calisan {

    @Inject // bunu yapınca new yapmaya gerek yok  ==> patronInterface = new Patron();
    private PatronInterface patronInterface;


   public Calisan(){
       //patronInterface = new Patron();
   }

   public String getData(String data){
       return patronInterface.surum(data);
   }

}
