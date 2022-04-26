package com.cagriyilmaz.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;



@Named(value = "producestuto")
@ApplicationScoped
public class _02_Produces {

    @Produces //Üretimi sağlar.
    public List<String> getList(){
        List<String> liste = new ArrayList<>();
        liste.add("HTML5");
        liste.add("CSS");
        liste.add("Javascript");
        liste.add("React");
        liste.add("Angular");
        return liste;
    }
}
