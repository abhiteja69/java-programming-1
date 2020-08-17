//Q.3: Write a program, creating an Employee class containing details of empId, empName,
//        empDesignation, empSalary and empLocation. Create necessary methods like getters, setters
 //       and toString. Create 10 instances of the same.
//        The problem is to generate stream of all the instances and do the following operations:
//        a. Print the name of all the employees.
//        b. Print all the salaries which are greater than 50,000/-
//        c. Print all the locations starting with the letter ‘M’
//        d. Print all the designations ending with ‘E’

import java.util.Arrays;
import java.util.List;

class employee1
{
    private int empId;
    private String empName;
    private String empDesignation;
    private long empSalary;
    private String empLocation;

    employee1(int empId, String empName,String empDesignation,long empSalary,String empLocation)
    {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }

    public int getEmpId()
    {
        return empId;
    }

    public void setEmpId(int empId)
    {
        this.empId = empId;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public String getEmpDesignation()
    {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation)
    {
        this.empDesignation = empDesignation;
    }

    public long getEmpSalary()
    {
        return empSalary;
    }

    public void setEmpSalary(long empSalary)
    {
        this.empSalary = empSalary;
    }

    public String getEmpLocation()
    {
        return empLocation;
    }

    public void setEmpLocation(String empLocation)
    {
        this.empLocation = empLocation;
    }
}

class EmployeeMain
{
    public static void main(String[] args)
    {
        List<employee1> list1 = Arrays.asList(
                new employee1(1,"Muni","DevOps",200000,"Mumbai"),
                new employee1(2,"Teja","Data Science",60000,"Tenali"),
                new employee1(3,"Sai","Data Analyst",35000,"Phagwara"),
                new employee1(4,"Balu","Software",50000,"Mysore"),
                new employee1(5,"Prasad","Electric Engineer",10000,"Madurai"),
                new employee1(6,"vinay","Electronic Engineer",75000,"Kurnool"),
                new employee1(7,"David","Agriculture",20000,"Guntur"),
                new employee1(8,"Manesh","DevOps",40000,"Delhi"),
                new employee1(9,"Akhil","Software",50000,"Vizag"),
                new employee1(10,"Varun","Civil Engineer",170000,"Kanchi")
        );
        //Print the name of all the employees
        list1.stream().forEach(v -> System.out.println(v.getEmpName()));
        //Print all the salaries which are greater than 50,000/-
        list1.stream().filter(v ->v.getEmpSalary() > 50000).forEach(v -> System.out.println(v.getEmpSalary()));
        //. Print all the locations starting with the letter ‘M’
        list1.stream().filter(v ->v.getEmpLocation().startsWith("M")).forEach(v-> System.out.println(v.getEmpLocation()));
        //Print all the designations ending with ‘E’
        list1.stream().filter(v->v.getEmpDesignation().endsWith("e")).forEach(v-> System.out.println(v.getEmpDesignation()));
    }
}

