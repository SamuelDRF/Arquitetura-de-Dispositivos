package pt.uma.tpsi;

public class Main {
    public static void main(String[] args) {
        helloWorld();
        System.out.println(perimeter(4,2));
        System.out.println(volume(5,3,2));
        System.out.println(temp(55));
        System.out.println(time(0,1,0));
    }

    private static void helloWorld(){
        System.out.println("Hello World!");
    }

    private static float perimeter(int base, int height){
        return 2*(base+height);
    }

    private static float volume(int base, int height,int width){
        return base*height*width;
    }

    private static float temp(int Farenheit){
        return (Farenheit-32)*5/9;
    }

    private static float time(int hour,int min, int sec){
        min+=hour*60;
        sec+=min*60;
        return sec;
    }
}