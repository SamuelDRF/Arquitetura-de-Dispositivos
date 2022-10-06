package pt.uma.tpsi;

public class NumericalUtilities {
    public static void main(String[] args) {
        System.out.println(powerOf(4,2));
        System.out.println(sumOfNaturalNumbersUpTo(4));
        System.out.println(sumOfNaturalNumbersBetween(2,4));
        System.out.println(sumOfEvenNumbersBetween(1,6));
        int[]val=numbersOfDivisors(4);
        System.out.println(val[0]);

    }

    private static float powerOf(int base, int exp){
        float res=base;
        for (int i = 0; i < exp-1; i++) {
            res*=base;
        }
        return res;
    }

    private static float sumOfNaturalNumbersUpTo(int top){
        float res=0;
        for (int i = 0; i <= top; i++) {
            res+=i;
        }
        return res;
    }

    private static float sumOfNaturalNumbersBetween(int min,int max){
        float res=0;
        for (int i = min; i <= max; i++) {
            res+=i;
        }
        return res;
    }
    private static float sumOfEvenNumbersBetween(int min,int max){
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
    private static int[] numbersOfDivisors(int num){
        int[] res={0,0,0};
        int cont=0;
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                res[cont] = i;
                cont++;
            }
        }
        return res;
    }
}
