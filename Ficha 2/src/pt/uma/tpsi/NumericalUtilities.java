package pt.uma.tpsi;

public class NumericalUtilities {

     static float powerOf(int base, int exp){
        float res=base;
        for (int i = 0; i < exp-1; i++) {
            res*=base;
        }
        return res;
    }

     static float sumOfNaturalNumbersUpTo(int top){
        float res=0;
        for (int i = 0; i <= top; i++) {
            res+=i;
        }
        return res;
    }

     static float sumOfNaturalNumbersBetween(int min,int max){
        float res=0;
        for (int i = min; i <= max; i++) {
            res+=i;
        }
        return res;
    }
     static float sumOfEvenNumbersBetween(int min,int max){
        if (min%2!=0)
            min++;
        if (max%2!=0)
            max--;
        float res=0;
        for (int i = min; i <= max; i+=2) {
            res+=i;
        }
        return res;
    }

}
