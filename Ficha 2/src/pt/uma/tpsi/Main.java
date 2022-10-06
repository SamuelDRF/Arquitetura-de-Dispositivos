package pt.uma.tpsi;

public class Main {
    public static void main(String[] args) {
        //NumericalUtilities
        System.out.println("Hello world!");
        System.out.println(NumericalUtilities.powerOf(4,2)+" - powerOf");
        System.out.println(NumericalUtilities.sumOfNaturalNumbersUpTo(4)+" - sumOfNaturalNumbersUpTo");
        System.out.println(NumericalUtilities.sumOfNaturalNumbersBetween(2,4)+" - sumOfNaturalNumbersBetween");
        System.out.println(NumericalUtilities.sumOfEvenNumbersBetween(1,6)+" - sumOfEvenNumbersBetween");

        System.out.println("-----------------------------------------");

        //ArrayUtilities
        int[] array={3,6,2,3,5};
        System.out.println(ArrayUtilities.toString(array)+" - toString");
        System.out.println(ArrayUtilities.maximumOf(array)+" - maximumOf");
        System.out.println(ArrayUtilities.minimumOf(array)+" - minimumOf");
        System.out.println(ArrayUtilities.copyOf(array)+" - copyOf");
        System.out.println(ArrayUtilities.contains(array,9)+" - contains");
        System.out.println(ArrayUtilities.containsDuplicates(array)+" - containsDuplicates");
        System.out.println(ArrayUtilities.indexOf(array,2)+" - indexOf");
        System.out.println(ArrayUtilities.add(array,9)+" - add");
        System.out.println(ArrayUtilities.remove(array,2)+" - remove");
    }
}