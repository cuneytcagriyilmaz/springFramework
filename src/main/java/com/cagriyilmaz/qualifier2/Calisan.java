package com.cagriyilmaz.qualifier2;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {
//
//    //Default'da çalışır
//    @Inject
//    private PatronInterface patronInterface;

    @QualifierMultiple
    @Inject
    private PatronInterface patronInterface;



    public Calisan(){
       //patronInterface = new Patron();
   }

   public String getData(String data){
       return patronInterface.surum(data);
   }

}
