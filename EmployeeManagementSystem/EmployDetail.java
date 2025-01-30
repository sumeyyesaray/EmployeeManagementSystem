import java.util.Scanner;

public class EmployDetail {
    String name;
    String father_name;
    String email;
    String position;
    String employ_id;
    String employ_salary;
    String employ_contact;

    public void getInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Employee's name --------: ");
        name=scan.nextLine();
        System.out.print("Enter Employee's Father name -: ");
        father_name=scan.nextLine();
        System.out.print("Enter Employee's ID ----------: ");
        employ_id=scan.nextLine();
        System.out.print("Enter Employee's Email ID ----: ");
        email=scan.nextLine();
        System.out.print("Enter Employee's Position ----: ");
        position=scan.nextLine();
        System.out.print("Enter Employee contact Info --: ");
        employ_contact=scan.nextLine();
        System.out.print("Enter Employee's Salary ------: ");
        employ_salary=scan.nextLine();
    }
}
