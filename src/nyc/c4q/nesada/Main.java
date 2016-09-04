package nyc.c4q.nesada;

public class Main {

    public static void main(String[] args) {

        Student objS1 = new Student();

        objS1.setFirstN("Nesada");
        objS1.setLastN("Koca");
        objS1.setidN(1234);
        objS1.setFavFood("Pizza");

        Student objS2 = new Student();

        objS2.setFirstN("Artan");
        objS2.setLastN("Elezaj");
        objS2.setidN(1111);
        objS2.setFavFood("Pizza");

       System.out.print( objS1.checkSameFavoriteFood(objS1.getFavFood("S1"), objS2.getFavFood("S2")));


    }
}
