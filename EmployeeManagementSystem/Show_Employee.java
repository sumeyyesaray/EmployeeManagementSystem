import java.io.File;
import java.util.Scanner;

public class Show_Employee {
    public void viewFile(String s) throws Exception{
        File file = new File("file" + s + ".txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
    }
}
