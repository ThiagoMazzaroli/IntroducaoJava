package LaçoDeRepetição;

public class Main {
    public static void main(String[] args) {


        int i = 1;

        for(i = 1; i < 10; i++){
            System.out.println("foi");
        }
        while( i < 10){
            System.out.println("foi");
            i++;
        }
        do{
            System.out.println("foi");
            i++;
        }while( i < 10);
    }
}
