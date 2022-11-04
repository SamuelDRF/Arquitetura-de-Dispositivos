package pt.uma.tpsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Menu+++
        for (Menu option : Menu.values()) {
            System.out.println(option);
        }
        //Menu---
        System.out.println("--------------------------------------------------");
        //Options+++
        for (Menu option : Menu.values()) {
            switch (option.name()){
                case "START":{
                    System.out.println("game is starting");
                    break;
                }
                case "SAVEGAME":{
                    System.out.println("game is saving");
                    break;
                }
                case "LOADGAME":{
                    System.out.println("game is loading");
                    break;
                }
                case "HIGHSCORES":{
                    System.out.println("Record: ");
                    break;
                }
                case "QUIT":{
                    System.out.println("Bye");
                    break;
                }
                default:{
                    System.out.println("Not Found");
                    break;
                }
            }
        }
        //Options---
        //Test+++
        System.out.println("--------------------------------------------------");
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(1,4);
        Rational r3 = new Rational(4,2);
        Rational r4 = new Rational(5,100);

        List<Rational> rationals = new ArrayList<Rational>();
        rationals.add(r1);
        rationals.add(r2);
        rationals.add(r3);
        rationals.add(r4);

        System.out.println("Equals? : "+r1.equals(r2));

        for (Rational element : rationals){
            System.out.println(element.toString());
        }

        Collections.sort(rationals);
        System.out.println("ordenado");

        for (Rational element : rationals){
            System.out.println(element.toString());
        }

        System.out.println("--------------------------------------------------");

        List<Student> students= new ArrayList<>();
        students.add(new Student(1,"Ana"));
        students.add(new Student(5,"Andres"));
        students.add(new Student(3,"Jose"));
        students.add(new Student(3,"Maria"));

        for (Student student:students) {
            System.out.println(student.toString());
        }

        Collections.sort(students);
        System.out.println("ordenado por orden alfabetico");

        for (Student student:students) {
            System.out.println(student.toString());
        }

        Collections.sort(students, new StudentComparatorByNumber());
        System.out.println("ordenado por numero forma 2");

        for (Student student:students) {
            System.out.println(student.toString());
        }

        Collections.sort(students, new StudentComparatorByName());
        System.out.println("ordenado por nome forma 2");

        for (Student student:students) {
            System.out.println(student.toString());
        }

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,new Student(20,"Laura"));
        studentMap.put(2,new Student(22,"Sofi"));
        studentMap.put(3,new Student(19,"Sebas"));
        studentMap.put(4,new Student(21,"Elio"));

        System.out.println("Map with students: Show Keys");
        System.out.println(studentMap.keySet());
        for (Integer key : studentMap.keySet())
            System.out.println(key);

        System.out.println("Map with students: Show Keys and values");
        System.out.println(studentMap.entrySet());
        for (Integer key : studentMap.keySet())
            System.out.println(key +" : " + studentMap.get(key));

        System.out.println("'Sebas' is in Map?");
        String nameToSearch="Sebas";
        for (Student student : studentMap.values()){
            if (student.getName().equals(nameToSearch))
                System.out.println("True");
        }
        //Test---
    }
}