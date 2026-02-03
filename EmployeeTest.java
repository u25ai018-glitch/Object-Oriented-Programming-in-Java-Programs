class Employee{
  private  String name;
  private  String last_name;
  private  double monthly_salary;


    Employee(String name, String last_name, double monthly_salary){
        this.name =name;
        this.last_name=last_name;
        if (monthly_salary>0){
            this.monthly_salary=monthly_salary;
        }
    }

    void setname(String name){
        this.name=name;
    }
    void setlast_name(String last_name){
        this.last_name=last_name;
    }
    void setmonthly_salary(double monthly_salary){
         if (monthly_salary>0){
            this.monthly_salary=monthly_salary;
        }

    }

    String getname(){
        return name;
    }
    String getlast_name(){
        return last_name;
    }
    double getmonthly_salary(){
        return monthly_salary;
    }
    double getyearlysalary(){
        return (monthly_salary*12);
    }
    void givehike(double percentage){
        monthly_salary=monthly_salary+(monthly_salary*percentage/100);
    }
}
public class EmployeeTest {
    public static void main (String args[]){
        Employee e1=new Employee("jai", "lal", 40000);
        Employee e2=new Employee("tarun","kumar",30000 );

        System.out.println("before 10% hike:");
        System.out.println("name:"+e1.getname()+e1.getlast_name());
        System.out.println("yearly salary:"+e1.getyearlysalary());
        System.out.println("name:"+e2.getname()+e2.getlast_name());
        System.out.println("yearly salary:"+e2.getyearlysalary());
       
        e1.givehike(10);
        e2.givehike(10);

         
        System.out.println("after 10% hike");

        System.out.println("before 10% hike:");
        System.out.println("name:"+e1.getname()+e1.getlast_name());
        System.out.println("yearly salary:"+e1.getyearlysalary());
        System.out.println("name:"+e2.getname()+e2.getlast_name());
        System.out.println("yearly salary:"+e2.getyearlysalary());
       



    }
    
}
