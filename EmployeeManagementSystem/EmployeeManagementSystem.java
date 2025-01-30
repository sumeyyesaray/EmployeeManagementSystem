import java.io.IOException;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static  void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Show_Employee epv =new Show_Employee();

        int i = 0;

        Main obj1 = new Main();
        obj1.menu();

        while (i < 6){
            System.out.print("\n Please enter choice : ");
            i = Integer.parseInt(scan.nextLine());

            switch (i){
                case 1: {
                    Add_Employee emp = new Add_Employee();
                    emp.createFile();

                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 2: {
                    System.out.print("\n Please enter Employee's ID : ");
                    String s = scan.nextLine();
                    try{
                        epv.viewFile(s);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    System.out.print("\n Please Enter to Continue ...");
                    scan.nextLine();
                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 3:{
                    System.out.print("\n Please Enter Employee's ID : ");
                    String s = scan.nextLine();
                    Remove_Employee emp = new Remove_Employee();
                    emp.removeFile(s);

                    System.out.println("\n Please enter to Continue ... ");
                    scan.nextLine();
                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 4: {
                    System.out.print("\n Please enter Employee's ID : ");
                    String I = scan.nextLine();
                    try{
                        epv.viewFile(I);
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    Update_Employee epu = new Update_Employee();
                    System.out.print("\n Please enter the detail you want to Update .");
                    System.out.print("\nFor Example :\n");
                    System.out.println("If you want to Change the Name, then Enter Current Name and Press Enter. Then write the new Name then Press Enter. It will Update the Name.\n");
                    String s=scan.nextLine();
                    System.out.print("Please Enter the Updated Info :");
                    String n=scan.nextLine();

                    try{
                        epu.updateFile(I,s,n);

                        System.out.print("\nPress Enter to Continue...");
                        scan.nextLine();
                        System.out.print("\033[H\033[2J");
                        obj1.menu();
                        break;
                    }
                    catch (IOException e){
                        System.out.println(e);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                case 5: {
                    Exit obj = new Exit();
                    obj.out();
                }
            }
        }
    }
}
