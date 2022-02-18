package com.cetc28.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: WSC
 * @version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person implements Serializable {
    private String pname;
    private String page;
    private String gender;
    private String[] hobby;
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;
}
