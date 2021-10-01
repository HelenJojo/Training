package Training;

public class Employee {

    String firstname;
    String lastname;
    double salary;


    public Employee(String firstname, String lastname, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0.0)
            this.salary = salary;
    }



}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1=new Employee("Alex","D",45);
        Employee emp2= new Employee("Sanya","A",34);
        System.out.println(emp1.getSalary()*12);

        System.out.println(emp2.getSalary()*12);

        System.out.println("After Raise");

        emp1.setSalary(emp1.getSalary()*1.10);
        emp2.setSalary(emp2.getSalary()*1.10);

        System.out.println(emp1.getSalary()*12);
        System.out.println(emp2.getSalary()*12);
    }
}
