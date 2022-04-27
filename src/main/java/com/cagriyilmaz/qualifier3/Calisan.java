package com.cagriyilmaz.qualifier3;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Calisan {
//
//    //Default'da çalışır
//    @Inject
//    private PatronInterface patronInterface;


    //İstediğim seçeneği seçiyorum qualifieMultiple' nin sounda
    @QualifierMultiple2(EFazlaSecenekler.BIRINCI)
    @Inject
    private PatronInterface patronInterface;



    public Calisan(){
       //patronInterface = new Patron();
   }

   public String getData(String data){
       return patronInterface.surum(data);
   }

}
