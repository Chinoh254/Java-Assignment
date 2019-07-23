import java.util.ArrayList;

public class Employees {
    public static void main(String[] args) {
        ArrayList<EmployeesConstructors> details;
        details = new ArrayList<>();

        EmployeesConstructors emp0 = new EmployeesConstructors("King Wanyama ","wanyamasinior@email.com ","12345 ","20K ","3 Months");
        EmployeesConstructors emp1 = new EmployeesConstructors("Kevin Maonga","maongak@gmail.com","0715967430","60k", "2 Years");
        EmployeesConstructors emp2 = new EmployeesConstructors("Christine Waweru","xtinewa@gmail.com","0715967430","70k", "7 Years");
        EmployeesConstructors emp3 = new EmployeesConstructors("Bill Clinton","billclin@gmail.com","0715967430","80k", "3 Years");
        EmployeesConstructors emp4 = new EmployeesConstructors("Shay Wonder","shayw@gmail.com","0715967430","35k", "1 Years");
        EmployeesConstructors emp5 = new EmployeesConstructors("Chris Newton","chrisnewtk@gmail.com","0715967430","45k", "7 Years");
        EmployeesConstructors emp6 = new EmployeesConstructors("Fridha Adhiambo","fridadhi@gmail.com","0715967430","55k", "1 Years");
        EmployeesConstructors emp7 = new EmployeesConstructors("Skyler Bravo","skylbrov@gmail.com","0715967430","65k", "2 Years");
        EmployeesConstructors emp8 = new EmployeesConstructors("Brandon Thuo","brandytho@gmail.com","0715967430","75k", "3 Years");
        EmployeesConstructors emp9 = new EmployeesConstructors("Greg Carlos","gregclos@gmail.com","0715967430","80k", "9 Years");

        details.add(emp0);
        details.add(emp1);
        details.add(emp2);
        details.add(emp3);
        details.add(emp4);
        details.add(emp5);
        details.add(emp6);
        details.add(emp7);
        details.add(emp8);
        details.add(emp9);

        System.out.println(details.toString());
    }
}
