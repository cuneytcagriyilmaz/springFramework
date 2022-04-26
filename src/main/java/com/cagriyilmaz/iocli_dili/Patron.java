package com.cagriyilmaz.iocli_dili;



//IOC2siz DI'sız olunca bütün yönetim patrondaydı ve şimdi biz bunu değiştiriyoruz
public class Patron implements PatronInterface {

    @Override
    public String surum(String data) {
        return "sürüm" + data;
    }
}
