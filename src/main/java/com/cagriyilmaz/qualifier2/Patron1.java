package com.cagriyilmaz.qualifier2;



import javax.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {

    //@Alternative
    @Override
    public String surum(String data) {
        return "default data: " + data;
    }
}
