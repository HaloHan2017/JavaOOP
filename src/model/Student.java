package model;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author TYS
 * @date 2020/6/27 15:00
 */
public class Student {
    private String name;
    private Integer age;
    private String gender;
    private String idNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public Student(String name, Integer age, String gender, String idNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNo = idNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", idNo='" + idNo + '\'' +
                '}';
    }
}
