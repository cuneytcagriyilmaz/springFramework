package com.cagriyilmaz.cdi;


import com.cagriyilmaz.StudentDTo;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "newtuto")
@ApplicationScoped

public class _04_New implements Serializable {
    //Üretilen
    @Produces // bu studentDto ya bağlı çünkü onu üretti.
    public String uretilenData( @New StudentDTo studentDTo){
        //NEW yapısı OBje yapısında olan StudentDto yu gösterir.
    studentDTo = StudentDTo.builder().studentId(0L)
            .studentName("Student Adı").build();
        return studentDTo.getStudentName();
    }
    //Üretiiğimiz yapıyı tüketmek
    @Getter
    @Inject
    private String tuketilenData;
}
