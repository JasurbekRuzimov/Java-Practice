public class RhombusAndSquareAndRightTrianglePerimeterandArea {
    public static void main(String[] args) {


        //   Ромб  Квадрат  Тўғри бурчакли учбурчак

        Rhombus rhombus = new Rhombus();
        rhombus.setSide(7);
        rhombus.setHeight(5);
        System.out.println("Romb Perimetri = " + rhombus.getSide());
        System.out.println("Romb Yuzasi = " + rhombus.getHeight() + "\n");

        Square square = new Square();
        square.setSide(12);
        System.out.println("Kvadrat Perimetri = " + square.getSide());
        System.out.println("Kvadrat Yuzasi = " + square.getPerimeter() + "\n");

        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setSide(3);
        rightTriangle.setSide2(4);
        System.out.println("Uchburchak Perimetri = " + rightTriangle.getSide());
        System.out.println("Ucburchak Yuzasi = " + rightTriangle.getSide2() + "\n");


    }

    public static class Rhombus {
        private int side;
        private int height;

        public int getSide() {
            return side * 4;
        }

        public void setSide(int side) {
            this.side = side;
        }

        public int getHeight() {
            return height * side;
        }

        public void setHeight(int height) {
            this.height = height;
        }

    }

    public static class Square {
        private int side;

        public int getSide() {
            return side * 4;
        }

        public void setSide(int side) {
            this.side = side;
        }

        public int getPerimeter() {
            return side * side;
        }

        public void setPerimeter(int side) {
            this.side = side;
        }

    }

    public static class RightTriangle {
        private int side;
        private int side2;

        public double getSide() {
            return side + side2 + Math.sqrt(side * side + side2 * side2);
        }

        public void setSide(int side) {
            this.side = side;
        }

        public int getSide2() {
            return side2 * side / 2;
        }

        public void setSide2(int side2) {
            this.side2 = side2;
        }

    }
}
