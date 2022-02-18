package com.cetc28.pojo;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @Auther: WSC
 * @version: 1.0
 */
public class Person implements Serializable {
    private String pname;
    private String page;
    private String gender;
    private String[] hobby;
    private String birthdate;

    public Person() {
    }

    public Person(String pname, String page, String gender, String[] hobby, String birthdate) {
        this.pname = pname;
        this.page = page;
        this.gender = gender;
        this.hobby = hobby;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", page='" + page + '\'' +
                ", gender='" + gender + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
