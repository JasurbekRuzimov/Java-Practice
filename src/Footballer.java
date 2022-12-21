import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// FOOTBALL PLAYER (name, age, who plays, number of goals) number of goals > 50
public class Footballer {
    public Footballer(String name, int age, String club, int goals) {
    }

    public static void main(String[] args) {
        Footballer[] footballers = new Footballer[5];
        footballers[0] = new Footballer("Ronaldo", 36, "Juventus", 51);
        footballers[1] = new Footballer("Messi", 34, "Barcelona", 60);
        footballers[2] = new Footballer("Neymar", 29, "PSG", 40);
        footballers[3] = new Footballer("Mbappe", 22, "PSG", 30);
        footballers[4] = new Footballer("Salah", 29, "Liverpool", 50);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Gollar sonini kiriting: ");
        int a = scanner.nextInt();
        try {
            FileWriter myWriter = new FileWriter("futbolchi.txt");
            for (Footballer footballer : footballers) {

                    myWriter.write(footballer.toString() + "");
                    myWriter.close();
                    System.out.println("Faylga muvaffaqiyatli yozildi!");
                }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean getGoals() {
        return false;
    }

}
