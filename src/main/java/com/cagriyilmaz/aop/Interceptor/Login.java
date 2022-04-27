package com.cagriyilmaz.aop.Interceptor;

@InterceptopYolKesici
public class Login {

    public String isLogingMethod(String data){
        return "isLogin" + data;
    }
}
