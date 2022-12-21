import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        File myObj = null;
        try {
            myObj = new File("futbolchi.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                System.out.println("Fayldagi ma'lumotlar: " + data);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Xatolik yuz berdi. File topilmadi.");
            e.printStackTrace();
        }
        System.out.println(myObj.getAbsolutePath());
        System.out.println(myObj.getName());
        System.out.println(myObj.length());

    }
}
