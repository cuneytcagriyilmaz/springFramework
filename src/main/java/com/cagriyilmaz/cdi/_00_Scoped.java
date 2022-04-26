package com.cagriyilmaz.cdi;
import javax.enterprise.context.*;
import javax.inject.Named;


//oluşturulan objenn yaşam süresini belirler
//performansını + ya da - yönde etkiler.




@Named
//@ApplicationScoped // Bütün uygulama boyunca Bütün kullanıcılar için çalışır. Server kapatılınca durur
//@RequestScoped // Bir istek boyunca yaşar. İstek gelir sonra cevap verir ve sonra ölür.
//@SessionScoped // bir kullanıcı için yaşar. Loj Out olunca kullanıcı öçlür.
//@Dependent // bukalemun. Bulunduğu yapı hangi Scope'da ise depended yapısı onu sağlar.
// başka class ApplicationScope içindeyse onun gibi davranır. Başka bişeyse onun gibi davranır.
//@ConversationScoped // belli istek boyunca yaşar. Ürünü sepete ekledikten sonra ödemesi yapılınca ürün sepetten düşer. Ölür.
//@SessionScoped // Bean yapısının 1 instance olmasını sağlar.
public class _00_Scoped {
}
