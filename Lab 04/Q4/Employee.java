package Q4;

public class Employee {
    private int id ;
    private String name;
    private double basicsalary;
    private int taxdeduction;
    private float bonus;
    private double netsalary;
    Employee(){
        this.id=0;
        this.name="Unknown";
        this.basicsalary=0.0;
        this.bonus=0.0f;
        this.taxdeduction=0;
        this.netsalary=0.0;
    }
    Employee(int id ,String name ,double salary,float bonus,int tax,double netsalary ){
        this.id=id;
        this.name=name;
        this.basicsalary=salary;
        this.bonus=bonus;
        this.taxdeduction=tax;
        this.netsalary=netsalary;
     }
    void Display(){
        System.out.println("Id ="+this.id);
        System.out.println("Name ="+this.name);
        System.out.println("Basic Salary ="+this.basicsalary);
        System.out.println("Tax Deduction ="+this.taxdeduction+"%");
        System.out.println("Bonus ="+this.bonus);
        System.out.println("Net Salary ="+this.netsalary);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Employee Record Delected: "+this.id+" idq Memoery for bonus released");
    }
}
