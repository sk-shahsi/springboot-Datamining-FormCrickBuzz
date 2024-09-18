import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String s1= new String ("Aashish");
        String s2=new String ("Aashish");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s4="Aashish";
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
        List<Employee> l1= new ArrayList<Employee>();
        l1.add(new Employee(50000.0,"Aashish",1));
        l1.add(new Employee(600000.0,"abhi",66));
        l1.add(new Employee(7000.0,"raj",88));
        l1.add(new Employee(50000.0,"ram",1));
        l1.add(new Employee(600000.0,"abhisheak",66));
        l1.add(new Employee(7000.0,"rajmohan",88));

        //find avrage salary from each department
        Map<Integer,Double> emp =

        l1.stream().collect(Collectors.groupingBy(Employee::getId,Collectors.averagingDouble(Employee::getSalary)));
        emp.entrySet().forEach(x->System.out.println(x.getKey()+ " "+x.getValue()));

        //find the employee details whose salary is less then 50000 and id is 4;

        l1.stream().filter(x->x.getSalary()<=50000 && x.getId()==88).forEach(x->System.out.println("output is"+x));

        //find total and hole salary of organization
        DoubleSummaryStatistics d=l1.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(d);
        System.out.println(d.getAverage());
        System.out.println(d.getSum());

        String s="aashish";
        char []ch=s.toCharArray();
            String rev =" ";
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
            rev =rev + s.charAt(i);

        }
        System.out.println(rev);

    }

}