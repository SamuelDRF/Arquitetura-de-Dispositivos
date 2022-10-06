package pt.uma.tpsi;

public class ArrayUtilities {
    static String toString (int[] array){
        String text = "";
        for (int i = 0; i < array.length-1; i++)
            text+= array[i]+",";
        text+= array[array.length-1];
        return text;
    }
    static int maximumOf (int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i]>max)
                max=array[i];
        return max;
    }
    static int minimumOf (int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i]<min)
                min=array[i];
        return min;
    }
    static int[] copyOf (int[] array){
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i]=array[i];
        }
        return copy;
        /*
        De esta forma va a imprimir el codigo del espacio de memoria en el que esta, si quisiera imprimir el array
        cambio de "int[]" a "String" y en el return pasa de "copy" a "toString(copy)"
        abajo hay un ejemplo funcional de esto
         */
    }

    static boolean contains (int[] array,int number){
        for (int i = 0; i < array.length; i++)
            if (array[i]==number)
                return true;
        return false;
    }

    static boolean containsDuplicates (int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i!=j){
                    if (array[i]==array[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static int indexOf (int[] array,int number){

        for (int i = 0; i < array.length; i++)
            if (array[i]==number)
                return i;
        return -1;
    }
    static String add (int[] array,int number){
        int[] copy = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            copy[i]=array[i];
        }
        copy[array.length]=number;
        return toString(copy);
    }
    static String remove (int[] array,int number){
        int[] copy = new int[array.length];
        int a=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==number)
                a++;
            copy[i-a]=array[i];
        }
        return toString(copy);
    }
}
