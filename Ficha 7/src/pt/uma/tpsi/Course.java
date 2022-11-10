package pt.uma.tpsi;

import java.util.Objects;

public class Course {

    //atributos
    private int code;
    private String name;
    private int ects;
    private int ano;

    //constructores


    public Course(int code, String name, int ects, int ano) {
        this.code = code;
        this.name = name;
        this.ects = ects;
        this.ano = ano;
    }
    public Course() {
        this.code = 0;
        this.name = "";
        this.ects = 0;
        this.ano = 0;
    }

    //getters and setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //equals and hash code


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return code == course.code && ects == course.ects && ano == course.ano && Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, ects, ano);
    }

    //toString
    @Override
    public String toString() {
        return "Course{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", ects=" + ects +
                ", ano=" + ano +
                '}';
    }

}
