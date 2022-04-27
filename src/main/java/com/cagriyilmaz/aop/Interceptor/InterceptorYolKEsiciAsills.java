package com.cagriyilmaz.aop.Interceptor;


import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptopYolKesici
public class InterceptorYolKEsiciAsills {
    @AroundInvoke public  Object loglama(InvocationContext context){
        System.out.println("İlk Hali"+context.getMethod().getName());

        //Kullanıcı giriş yapmış mı ?
        boolean isLogin = false; // yol kesici olacak olan değişkenimiz.
        Object iscontinue = null; // eğer yol kesilmezse devam edecek.

        if (isLogin){
            //Önce sisteme giriş yapsın
            System.out.println("!!! Önce sisteme giriş yap");
            return null;
        }else {
            try {
                iscontinue = context.proceed(); // Devam etmesini sağladı.
                System.out.println("Sonraki hali" + iscontinue);
            }catch (Exception e){
                e.printStackTrace();
            }
            return iscontinue;
        }
    }
}
