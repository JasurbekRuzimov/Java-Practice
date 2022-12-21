import java.io.FileWriter;
import java.io.IOException;

public class WritingPlayerInformationtotheFile {

    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("New file.txt");
            myWriter.write("Dasturlash");
            myWriter.close();
            System.out.println("Faylga muvaffaqiyatli yozildi");
        } catch (IOException e) {
            System.out.println("Xatolik yuz berdi.");
            e.printStackTrace();
        }
    }
}
