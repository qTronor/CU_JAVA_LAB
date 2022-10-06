package ProjectBasedOnJava.EX1_1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_1 {
     public static List<Employer> employers = new ArrayList();
    public static void main(String[] args) {
        employers.add(new Employer(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000));
        employers.add(new Employer(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000));



        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        getInfo(id);
    }
    public static void getInfo(int id){
        for(int i = 0; i < employers.size(); i++){
            if(employers.get(i).getId() == id){
                Employer emp = employers.get(i);
                String Designation = "";
                int DA = 0;
                switch (emp.getDesigCode()){
                    case 'e':
                        Designation = "Engineer";
                        DA = 20000;
                        break;
                    case 'c':
                        Designation = "Consultant";
                        DA = 32000;
                        break;
                    case 'k':
                        Designation = "Clerk";
                        DA = 12000;
                        break;
                    case 'r':
                        Designation = "Receptionist";
                        DA = 15000;
                        break;
                    case 'm':
                        Designation = "Manager";
                        DA = 40000;
                        break;
                }

                int salary = emp.getBasic() + emp.getHra() + emp.getIt() + DA;
                System.out.println("EmpNo.  Emp Name Department Designation Salary\n\n" +
                        + emp.getId() + "    " + emp.getName() + "   " + emp.getDept() + "        " + Designation + "    " + salary);
                break;
            }
            else if(i == employers.size()-1)
                System.out.println("There is no employee with empid: "  + id);
        }
    }
}
