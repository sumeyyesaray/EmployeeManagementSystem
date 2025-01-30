import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Update_Employee {
    public void updateFile (String s, String o, String n) throws Exception{
        File file = new File("file " + s + ".txt");
        Scanner scan = new Scanner(file);
        String fileContext = "";
        while (scan.hasNextLine()){
            fileContext = fileContext + "\n" + scan.nextLine();
        }
        FileWriter mywriter = new FileWriter("file " + s + ".txt");
        fileContext = fileContext.replaceAll(o,n);
        mywriter.write(fileContext);
        mywriter.close();
    }
}
