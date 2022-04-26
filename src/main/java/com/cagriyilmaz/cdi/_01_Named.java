package com.cagriyilmaz.cdi;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

//Yapı bileşeniimizi oluşrururuz
//Datalarımızını bir yerden kullanmak için


//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


//cdi ==> bean
@Named(value = "namedtuto")
@ApplicationScoped // server kapatılana kadar çalışır

public class _01_Named {
    private Long namedId;
    private String namedData="Merhabalar Named Cdi Bean";
}
