class newCar extends OldCar {
    public int narx() {
        return super.narx() * 250;
    }

    public int model() {
        return super.model() + 25;
    }

    public static void main(String[] args) {
        newCar newCar = new newCar();
        newCar.narx();
        newCar.model();
        System.out.println(newCar.narx() + " " + newCar.model());
        System.out.println(newCar.nomi + " " + newCar.narxi + " " + newCar.tezliki);
    }
}
