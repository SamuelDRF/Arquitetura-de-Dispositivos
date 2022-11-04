package pt.uma.tpsi;

import java.util.Objects;

public class Student implements Comparable<Student>{

    //atributos
    private int number;
    private String name;

    //constructor
    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }
    public Student(String name) {
        this.number = 0;
        this.name = name;
    }
    public Student() {
        this.number = 0;
        this.name = "";
    }

    //getter and setter
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //equals y hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number == student.number && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student o) {
        int result = number - o.getNumber();
        if (result!=0)
            return result;
        return name.compareTo(o.getName());
    }



}
