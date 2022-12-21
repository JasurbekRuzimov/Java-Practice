public class Cars {
    int speed;
    String name;

    public void ModernCar(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public static void main(String[] args) {
        Cars car = new Cars();
        car.setSpeed(300);
        car.setName("Nexia 2");
        car.ModernCar(300, "Nexia 2");
        System.out.println(car.getSpeed());
        System.out.println(car.getName());
    }

    public static class ModernCar {
        int speed;
        String name;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
