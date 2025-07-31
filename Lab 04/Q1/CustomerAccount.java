package Q1;

public class CustomerAccount {
    private long accno;
    private String name;
    private double balance;

    CustomerAccount(){
        this.name="default";
        this.accno=0000;
        this.balance=0.0;
    }
    CustomerAccount(String name ,long accno,double balance){
        this.name=name;
        this.accno=accno;
        this.balance=balance;
    }
    void Display(){
        System.out.println("Account Number = "+this.accno+"\n"+"Customer Name = "+this.name+"\n"+"Balance = "+this.balance+"\n");
    }


    protected void finalize() throws Throwable {
        System.out.println("Account "+this.accno+" is deleted");
    }
}
