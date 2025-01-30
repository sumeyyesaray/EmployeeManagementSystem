import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Add_Employee {
    public void createFile(){
        Scanner scan = new Scanner(System.in);

        EmployDetail emp = new EmployDetail();
        emp.getInfo();
        try{
            File f1 = new File("file"+ emp.employ_id + ".txt" );
            if (f1.createNewFile()) {
                FileWriter mywritter = new FileWriter("file" + emp.employ_id + ".txt");
                mywritter.write("Employee ID :" + emp.employ_id + "\n" + "Employee Name     :" + emp.name + "\n" +
                        "Father's Name     :" + emp.father_name + "\n" + "Employee Contact  :" + emp.employ_contact + "\n" +
                        "Email Information :" + emp.email + "\n" + "Employee position :" + emp.position + "\n" +
                        "Employee Salary   :" + emp.employ_salary);
                mywritter.close();
                System.out.println("\nEmployee has been Added :)\n");

                System.out.print("\nPress Enter to Continue...");
                scan.nextLine();
            }else{
                System.out.println("\nEmployee already exists :(");
                System.out.print("\nPress Enter to Continue...");
                scan.nextLine();
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
