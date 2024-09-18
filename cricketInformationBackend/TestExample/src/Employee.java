public class Employee {
    Double salary;
    String Name;
    int Departmentid;


    public Employee(Double salary, String name, int Departmentid) {
        this.salary = salary;
        Name = name;
        this.Departmentid = Departmentid;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Departmentid;
    }

    public void setId(int Departmentid) {
        this.Departmentid = Departmentid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", Name='" + Name + '\'' +
                ", id=" + Departmentid +
                '}';
    }
}
