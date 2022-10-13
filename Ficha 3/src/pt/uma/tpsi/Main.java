package pt.uma.tpsi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        char[] array={'3','b','9','w','b','+','a','z'};
        char[] altarray={'1','2','3','4','5'};
        System.out.println(CharacterUtilities.lowerLetterSuccessorOf('a')+" - lowerLetterSuccessorOf");
        System.out.println(CharacterUtilities.lowerLetterPredecessorOf('a')+" - lowerLetterSuccessorOf");
        System.out.println(CharacterUtilities.lowerLetterSuccessorStepsOf('a',4)+" - lowerLetterSuccessorStepsOf");
        System.out.println(CharacterUtilities.lowerLetterPredecessorStepsOf('a',4)+" - lowerLetterPredecessorStepsOf");
        System.out.println(CharacterUtilities.occurrencesOfCharacterIn(array,'b')+" - occurrencesOfCharacterIn");
        System.out.println(CharacterUtilities.replaceCharacterIn(array,'b','o')+" - replaceCharacterIn");
        System.out.println(CharacterUtilities.concatenationOf(array,altarray)+" - concatenationOf");
        System.out.println(CharacterUtilities.copyOfPartOf(array,1,4)+" - copyOfPartOf");

        System.out.println("-----------------------------------------");

        System.out.println(CaesarCipherDecipherer.cipher("Estos estúpidos, creen que no van a perder la vida")+" - copyOfPartOf");
    }
}