package gb.homeworks;


public class Employee {
    String name;
    String position;
    String email;
    int phoneNumber;
    int salary;
    int age;

    public Employee(String name, String position, String email, int phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }




   public String getInfo()
    {
        return "Employee: " + name+ "; Position: " + position + "; Email: " + email + "; Phone Number: " + phoneNumber+ "; Salary: " + salary + "; Age: " + age;
    }


    }

