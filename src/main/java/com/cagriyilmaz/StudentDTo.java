package com.cagriyilmaz;
import lombok.*;


//DTO = Data Transfer Object
//Objeler arasında veri taşıma işlemi için kullanılır


//@Getter @Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTo {

    private Long studentId;
    private String studentName;
    private String studentSurname;
}
