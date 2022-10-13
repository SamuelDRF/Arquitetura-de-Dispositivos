package pt.uma.tpsi;

public class CaesarCipherDecipherer {
    static String toString (char[] array){
        String text = "";
        for (int i = 0; i < array.length-1; i++)
            text+= array[i]+",";
        text+= array[array.length-1];
        return text;
    }
    static String cipher (String texto){
        String[] letras=texto.split("");
        char[] copy = new char[letras.length];


        for (int i = 0; i < letras.length; i++) {
            copy[i]=letras[i].charAt(0);
            copy[i]++;copy[i]++;
        }
        System.out.println(toString(copy));
        return "texto";
    }
}
