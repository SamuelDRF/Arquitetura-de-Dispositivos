package pt.uma.tpsi;

public class CharacterDrawingUtilities {
    static String drawElement (char character){
        System.out.print(character+" ");
        return null;
    }

    static String drawNewLine (){
        System.out.println();
        return null;
    }
    static String drawHorizontalSegmentWith (char character){
        for (int i = 0; i < 50; i++)
            drawElement(character);
        return null;
    }

    static String drawFilledRectangleWith (int height, int large){
        char matriz[][] = new char[height][large];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < large; j++) {
                matriz[i][j]='+';
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        return null;
    }

    static String drawEmptyRectangleWith (int height, int large){
        char matriz[][] = new char[height][large];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < large; j++) {
                matriz[0][j]='+';
                matriz[height-1][j]='+';
                matriz[i][0]='+';
                matriz[i][large-1]='+';
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        return null;
    }
}
