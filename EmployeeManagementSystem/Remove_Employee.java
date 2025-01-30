import java.io.File;

public class Remove_Employee {
    public void removeFile(String ID){
        File file = new File("file" + ID + ".txt");
        if (file.exists()){
            if (file.delete()){
                System.out.println("\n Employee has been removed Successfully.");
            }
        }else{
            System.out.println("\n Employee does not exist !");
        }
    }
}
