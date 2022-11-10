package pt.uma.tpsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Menu+++
        //imprimir el menu de la clase Menu
        System.out.println("--------------------------------------------------");
        System.out.println("Menu de juego");
        System.out.println("--------------------------------------------------");
        System.out.println("Imprimir todas las opciones");
        for (Menu option : Menu.values()) {
            System.out.println(option);
        }
        //Menu---

        System.out.println("--------------------------------------------------");

        //Options+++
        //imprimir todas las opciones
        System.out.println("Imprimir todas las respuestas a cada opcion");
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
        System.out.println("Clase Rational");
        System.out.println("--------------------------------------------------");

        //creando las variables de tipo Rational
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(1,4);
        Rational r3 = new Rational(4,2);
        Rational r4 = new Rational(5,100);

        List<Rational> rationals = new ArrayList<Rational>();
        rationals.add(r1);
        rationals.add(r2);
        rationals.add(r3);
        rationals.add(r4);

        //confirmar si r1 es equivalente a r2
        System.out.println("r1 es equivalente a r2?");
        System.out.println("Equals? : "+r1.equals(r2));
        System.out.println("");

        //imprimir sin orden
        System.out.println("Imprimir sin orden");
        for (Rational element : rationals){
            System.out.println(element.toString());
        }
        System.out.println("");

        //imprimir en orden
        System.out.println("Imprimir con orden");
        Collections.sort(rationals);
        for (Rational element : rationals){
            System.out.println(element.toString());
        }
        System.out.println("");

        System.out.println("--------------------------------------------------");
        System.out.println("Clase Students");
        System.out.println("--------------------------------------------------");

        //creando las variables de tipo Student
        List<Student> students= new ArrayList<>();
        students.add(new Student(1,"Ana"));
        students.add(new Student(5,"Jose"));
        students.add(new Student(4,"Andres"));
        students.add(new Student(1,"Maria"));

        //imprimir todos
        System.out.println("sin orden");
        for (Student student:students) {
            System.out.println(student.toString());
        }
        System.out.println("");

        //por numero y alfabetico
        System.out.println("ordenado por orden numerico y alfabetico");
        //forma 1
        System.out.println("ordenado por numero forma 1");
        Collections.sort(students);
        for (Student student:students) {
            System.out.println(student.toString());
        }
        System.out.println("");

        //forma 2
        System.out.println("ordenado por nome forma 2");
        Collections.sort(students, new StudentComparatorByNumber());
        for (Student student:students) {
            System.out.println(student.toString());
        }
        System.out.println("");

        //imprimir por orden puramente alfabetico
        System.out.println("Imprimir por orden puramente alfabetico");
        Collections.sort(students, new StudentComparatorByName());
        for (Student student:students) {
            System.out.println(student.toString());
        }
        System.out.println("");


        //crear mas estudiantes
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,new Student(20,"Laura"));
        studentMap.put(2,new Student(22,"Sofi"));
        studentMap.put(3,new Student(19,"Sebas"));
        studentMap.put(4,new Student(21,"Elio"));


        //imprimir solo las llaves de los estudiantes
        System.out.println("Mapa de estudiantes, imprimir solo las llaves:");
        //forma 1 array
        System.out.println("forma 1 array:");
        System.out.println(studentMap.keySet());
        //forma 2 1X1
        System.out.println("forma 2 1X1:");
        for (Integer key : studentMap.keySet())
            System.out.println(key);
        System.out.println("");

        //imprimir las llaves y los estudiantes
        System.out.println("Mapa de estudiantes, imprimir las llaves y valores:");
        //forma 1 en array
        System.out.println("forma 1 en array:");
        System.out.println(studentMap.entrySet());
        //forma 2 1X1
        System.out.println("forma 2 1X1:");
        for (Integer key : studentMap.keySet())
            System.out.println(key +" : " + studentMap.get(key));
        System.out.println("");

        //saber si "sebas" esta en la lista
        System.out.println("'Sebas' esta en el mapa?:");
        String nameToSearch="Sebas";
        for (Student student : studentMap.values()){
            if (student.getName().equals(nameToSearch))
                System.out.println("True");
        }
        System.out.println("");



        System.out.println("--------------------------------------------------");
        System.out.println("Clase Courses");
        System.out.println("--------------------------------------------------");
        //imprimir todas las disciplinas

        Map<Integer, Course> courseMap = new HashMap<>();
        courseMap.put(1,new Course(2,"Ad",6,2021));
        courseMap.put(2,new Course(1,"Sor",7,2013));
        courseMap.put(3,new Course(5,"Ip",4,2012));
        courseMap.put(4,new Course(4,"R",2,2021));


        //verificar si una disciplina existe
        System.out.println("Verificar disciplina: ");
        String courseToSearch="Sor";
        for (Course key : courseMap.values())
            if (key.getName().equals(courseToSearch))
                System.out.println("True");
        System.out.println("");

        //imprimir todos los cursos
        System.out.println("cursos: ");
        for (Course key : courseMap.values())
            System.out.println(key);
        System.out.println("");

        //imprimir solo las llaves
        System.out.println("llaves de cursos: ");
        System.out.println(courseMap.keySet());
        System.out.println("");

        //imprimir llaves y cursos
        System.out.println("llaves de cursos y cursos: ");
        for (Integer key : courseMap.keySet())
            System.out.println(key +" : " + courseMap.get(key));
        System.out.println("");

        //saber si c5 ya existe
        System.out.println("confirmar si C5 ya existe en Course:");
        Course c5 = new Course(1,"Sor",7,2013);
        for (Integer key : courseMap.keySet()) {
            if (courseMap.get(key).equals(c5))
                System.out.println("Igual");
        }
        System.out.println("");


        //pasar para un nuevo mapa con keyset
        System.out.println("pasar para un nuevo mapa con keyset:");
        Map<Integer, ArrayList> courseAnoMap = new HashMap<>();

        for (Integer key:courseMap.keySet()){
            if (courseAnoMap.containsKey(courseMap.get(key).getAno())==false){
                //cria a lista para a chave
                ArrayList<Course>courseList=new ArrayList<>();
                courseList.add(courseMap.get(key));
                courseAnoMap.put(courseMap.get(key).getAno(),courseList);
            }
            else{
                //edita a lista para a chave
                ArrayList courseList = courseAnoMap.get(courseMap.get(key).getAno());
                courseList.add(courseMap.get(key));
                courseAnoMap.put(courseMap.get(key).getAno(),courseList);
            }
        }
        for (Integer key : courseAnoMap.keySet()) {
            System.out.println(key + ": " + courseAnoMap.get(key).toString());
        }
        System.out.println("");

        //pasar para un nuevo mapa con values
        System.out.println("pasar para un nuevo mapa con values:");
        Map<Integer, ArrayList> courseAnoMap2 = new HashMap<>();

        for (Course course:courseMap.values()){
            if (courseAnoMap2.containsKey(course.getAno())==false){
                //cria a lista para a chave
                ArrayList<Course>courseList=new ArrayList<>();
                courseList.add(course);
                courseAnoMap2.put(course.getAno(),courseList);
            }
            else{
                //edita a lista para a chave
                ArrayList courseList = courseAnoMap2.get(course.getAno());
                courseList.add(course);
                courseAnoMap2.put(course.getAno(),courseList);
            }
        }
        for (Integer key : courseAnoMap2.keySet()) {
            System.out.println(key + ": " + courseAnoMap2.get(key).toString());
        }

        //Test--
    }
}