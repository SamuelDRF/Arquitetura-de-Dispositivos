package pt.uma.tpsi;

public class Main {
    public static void main(String[] args) {
        helloWorld();
        System.out.println(perimeter(4,2));
        System.out.println(volume(5,3,2));
        System.out.println(temp(55));
        System.out.println(time(0,1,0));
        int[] array = {1,2,3,4};
        System.out.println(maximo(array));
        System.out.println(minimo(array));
        System.out.println(media(array));


    }

    //6. Implemente o conhecido “Hello World”
    private static void helloWorld(){
        System.out.println("Hello World!");
    }

    //7. Implemente uma função que calcule o perímetro de um retângulo. As medidas dos lados deverão ser
    //passadas como argumentos da função.
    private static float perimeter(int base, int height){
        return 2*(base+height);
    }

    //8. Implemente uma função que calcule o volume de um paralelepípedo. O comprimento, altura e largura
    //deverão ser passados como argumentos da função.
    private static float volume(int base, int height,int width){
        return base*height*width;
    }

    //9. Implemente uma função que receba uma temperatura fornecida em graus Farenheit e a converta para o
    //seu equivalente em graus centígrados.
    private static float temp(int Farenheit){
        return (Farenheit-32)*5/9;
    }

    //10. Implemente uma função que transforme o valor correspondente a um intervalo temporal, expresso em
    //horas, minutos e segundos, no valor correspondente em segundos.
    private static float time(int hour,int min, int sec){
        min+=hour*60;
        sec+=min*60;
        return sec;
    }

    //11. Implemente várias funções para calcular o máximo, o mínimo e a média de uma sequência de números
    //positivos armazenados numa estrutura de dados como um array.
    private static float maximo(int[] max){
        int top=0;
        for (int i = 0; i < max.length; i++) {
            if (max[i]>top)
                top=max[i];
        }
        return top;
    }
    private static float minimo(int[] min){
        int low=min[0];
        for (int i = 0; i < min.length; i++) {
            if (min[i]<low)
                low=min[i];
        }
        return low;
    }
    private static double media(int[] vals){
        double suma=0;
        int cont=0;
        while (cont<vals.length){
            suma+=vals[cont];
            cont++;
        }
        double res=suma/cont;
        return res;
    }
}