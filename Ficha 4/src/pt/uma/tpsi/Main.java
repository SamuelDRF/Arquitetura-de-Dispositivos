package pt.uma.tpsi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [][] array={
                {1,0,0,0},
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1}
        };
        int [][] arrayarray={
                {1,0,6,7},
                {0,8,8,0},
                {0,0,4,3},
                {3,0,0,2}
        };
        MatrixUtilities.show(array);System.out.println(" - show");
        System.out.println(MatrixUtilities.isMatrix(array)+" - isMatrix");
        System.out.println(MatrixUtilities.isIdentity(array)+" - isIdentity");
        System.out.println(MatrixUtilities.multiplyBy(array,5)+" - multiplyBy");
        System.out.println(MatrixUtilities.areCompatibleForSum(array,arrayarray)+" - areCompatibleForSum");
        System.out.println(MatrixUtilities.sumOf(array,arrayarray)+" - sumOf");

        System.out.println("-------------------------------------");

        System.out.println(CharacterDrawingUtilities.drawElement('a')+" - drawElement");
        System.out.println(CharacterDrawingUtilities.drawNewLine()+" - drawNewLine");
        System.out.println(CharacterDrawingUtilities.drawHorizontalSegmentWith('a')+" - drawHorizontalSegmentWith");
        System.out.println(CharacterDrawingUtilities.drawFilledRectangleWith(3,5)+" - drawFilledRectangleWith");
        System.out.println(CharacterDrawingUtilities.drawEmptyRectangleWith(3,5)+" - drawEmptyRectangleWith");
    }

}