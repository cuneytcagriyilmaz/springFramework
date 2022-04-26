package com.cagriyilmaz.cdi;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named(value = "injecttuto")
@ApplicationScoped
public class _03_Inject {

    @Inject // Tüketen yapı.
    List<String> tuketen;

    //Sadece getir aldık.
    public List<String> getTuketen() {
        return tuketen;
    }
}
