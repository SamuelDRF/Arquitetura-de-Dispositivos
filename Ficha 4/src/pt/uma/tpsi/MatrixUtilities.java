package pt.uma.tpsi;

public class MatrixUtilities {
    static String show (int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        return null;
    }
    static String isMatrix (int[][] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i].length!=array[0].length){
                return "NÃO é uma matriz,";
            }
        }
        return "o array multi-dimensional é uma matriz";
    }

    //Samu tiene isIdentity mucho mejor echa
    static String isIdentity (int[][] array){
        String matriz=MatrixUtilities.isMatrix(array);
        if (matriz=="o array multi-dimensional é uma matriz"){
            int cont=0;
            for (int i = 0; i < array.length; i++) {
                if (array[i][cont]==1){
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j]!=0 && j!=cont){
                            return "NÃO é uma matriz identidade";
                        }
                    }
                    cont++;
                }
                else {
                    return "NÃO é uma matriz identidade";
                }
            }
        }
        else
            return "NÃO é uma matriz";
        return "matriz identidade";
    }

    static String multiplyBy (int[][] array,int constante){
        int matriz[][] = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                matriz[i][j]=array[i][j]*constante;
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        return null;
    }
    static String areCompatibleForSum (int[][] array,int[][] arrayarray){
        if (array.length!=arrayarray.length)
            return "Não Compativeis";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length!=arrayarray[i].length)
                return "Não Compativeis";
        }
        return "Compativeis";
    }
    static String sumOf (int[][] array,int[][] arrayarray){
        if(areCompatibleForSum(array,arrayarray)=="Compativeis"){
            int matriz[][] = new int[array.length][array[0].length];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    matriz[i][j]=array[i][j]+arrayarray[i][j];
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println();
            }
        }
        return null;
    }
}
