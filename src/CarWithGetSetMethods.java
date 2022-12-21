public class CarWithGetSetMethods {
    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.setType("Yaxta");
        ship.setModel("Fusion");
        ship.setSpeed(300);
        ship.setName("Dilbar");
        System.out.println(ship.getType());
        System.out.println(ship.getModel());
        System.out.println(ship.getSpeed());
        System.out.println(ship.getName());
    }

    public static class Ship {
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
