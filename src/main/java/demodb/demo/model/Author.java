package demodb.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateofbirth;
    private String interested;


    @Enumerated(EnumType.STRING)
    private Gender gender;


     public Author(String name,LocalDate localDate,String interested,Gender gender){
         this.name=name;
         this.dateofbirth=localDate;
         this.interested=interested;
         this.gender=gender;
     }


     public Author(){

     }




}