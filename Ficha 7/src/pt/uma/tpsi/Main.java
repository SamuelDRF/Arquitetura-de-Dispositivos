package pt.uma.tpsi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        //Test---
    }
}