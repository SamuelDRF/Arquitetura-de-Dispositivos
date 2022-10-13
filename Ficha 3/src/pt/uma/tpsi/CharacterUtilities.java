package pt.uma.tpsi;

public class CharacterUtilities {

    static String toString (char[] array){
        String text = "";
        for (int i = 0; i < array.length-1; i++)
            text+= array[i]+",";
        text+= array[array.length-1];
        return text;
    }
    static char lowerLetterSuccessorOf (char letter){
        if (letter<'a'||letter>'z')
            return 'X';
        if (letter=='z')
            letter='a'-1;
        letter++;
        return letter;
    }
    static char lowerLetterPredecessorOf (char letter){
        if (letter<'a'||letter>'z')
            return 'X';
        if (letter=='a')
            letter='z'+1;
        letter--;
        return letter;
    }
    static char lowerLetterSuccessorStepsOf (char letter,int val){
        letter+=val;
        return letter;
    }
    static char lowerLetterPredecessorStepsOf (char letter,int val){
        letter-=val;
        return letter;
    }
    static int occurrencesOfCharacterIn (char[] letter,char val){
        int cont=0;
        for (int i = 0; i < letter.length; i++)
            if (letter[i]==val)
                cont++;
        return cont;
    }
    static char[] replaceCharacterIn (char[] letter,char substitui,char val){
        for (int i = 0; i < letter.length; i++)
            if (letter[i]==substitui)
                letter[i]=val;
        System.out.print(toString(letter)+" /// ");
        return letter;
    }
    static char[] concatenationOf (char[] array,char[] altarray){
        char[] concatenate = new char[array.length+altarray.length];
        int cont=0;
        for (int i = 0; i < array.length; i++) {
            concatenate[i] = array[i];
            cont=i;
        }
        for (int j = 0; j < altarray.length; j++)
            concatenate[j+cont+1]=altarray[j];
        System.out.print(toString(concatenate)+" /// ");
        return concatenate;
    }
    static char[] copyOfPartOf (char[] array,int start,int finish) {
        char[] copy = new char[finish-start+1];
        for (int i = start; i <= finish; i++) {
            copy[i-start] = array[i];
        }
        System.out.print(toString(copy)+" /// ");
        return copy;
    }
}
