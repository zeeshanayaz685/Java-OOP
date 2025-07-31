package Q2;

public class Student {
    private int id;
    private String name ;
    private float cgpa;
    Student (){
        this.id=000;
        this.name= "Default Student";
        this.cgpa=0.0f;
    }
    Student(String name ,int id ,float cgpa){
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    }
    void display (){
        System.out.println("Id = "+this.id+"\n"+"Name = "+this.name+"\n"+"CGPA ="+this.cgpa+"\n");
    }
    protected void finalize() throws Throwable {
        System.out.println("Student Record deleted : "+this.id+" "+this.name);
    }
}
