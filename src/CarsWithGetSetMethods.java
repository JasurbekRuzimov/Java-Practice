import java.util.Scanner;

public class CarsWithGetSetMethods {
    public static void main(String[] args) {
        Car car = new Car();
        car.setType("Yengil avtomobil");
        car.setModel("Chevrolet");
        car.setSpeed(300);
        car.setName("Nexia 2");

        System.out.println(car.getType());
        System.out.println(car.getModel());
        System.out.println(car.getSpeed());
        System.out.println(car.getName());
    }

    public static class Car {
        private String type;
        private String model;
        private int speed;
        private String name;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
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
}
