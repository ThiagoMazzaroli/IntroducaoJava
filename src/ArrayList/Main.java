package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> idades = new ArrayList<>();
        //adiciona  um valor ao ArrayList
        idades.add(25);
        idades.add(30);
        idades.add(45);
        //pega o index 1
        idades.get(1);
        //remove o index 0
        idades.remove(0);
        //pega o tamanho do ArrayList
        idades.size();

        System.out.println(idades.get(1));

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Thiago");
        nomes.add("Carine");

        System.out.println(nomes.size());
 }
}