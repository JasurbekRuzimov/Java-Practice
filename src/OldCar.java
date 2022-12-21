public class OldCar {


    protected String nomi="Mustang";
    protected String narxi;

    public static void main(String[] args) {
        OldCar oldCar = new OldCar();
        oldCar.narx();
        oldCar.model();
        System.out.println(oldCar.narx() + " " + oldCar.model());
        System.out.println(oldCar.nomi + " " + oldCar.narxi + " " + oldCar.tezliki);
    }
    int tezliki;

    protected int narx() {

        return tezliki * 100;
    }
    protected int model() {
        return tezliki + 10;
    }
}
