import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Employee {
String name;
int salary;
public Employee(String name,int salary) {
    super();
this.name = name;
this.salary = salary ;
}
public String getName() {
return name ;
}
public void setName(String name) {
this.name= name ;
}
public int getSalary() {
return salary ;
}
public void setSalary(int salary) {
this.salary = salary ;
}
@Override
public String toString() {
StringBuilder sb = new StringBuilder("<");
sb.append("name: ");
sb.append(name);
sb.append(" salary: ");
sb.append("" + salary+">");
return sb.toString();
}
}
class EmployeeInfo{
enum SortMethod {BYNAME,BYSALARY};
public List<Employee> sort(List<Employee> emps,final SortMethod method){
Comparator<Employee> comparator;
if(method == SortMethod.BYNAME) {
comparator = Comparator.comparing(Employee::getName);
// System.out.println(comparator);
}
else {
comparator = Comparator.comparing(Employee::getSalary);
//System.out.println(comparator);
}
return emps.stream().sorted(comparator).collect(Collectors.toList());
}
public boolean isCharacterPresentInAllNames(Collection<Employee> entities,String character){
// int count=0;
long cnt = entities.stream().filter(x -> x.name.startsWith(character)).count();
if(cnt==1 )
return true;
else
return false;
}
public static void main(String[] args) {
// TODO Auto-generated method stub
List<Employee> emps = new ArrayList<>();
emps.add(new Employee("Mickey", 100000));
emps.add(new Employee("Timmy", 50000));
emps.add(new Employee("Annny", 40000));
EmployeeInfo EI = new EmployeeInfo();
EI.sort(emps,EmployeeInfo.SortMethod.BYSALARY);
boolean result = EI.isCharacterPresentInAllNames(emps, "K");
System.out.println(emps);
if(result == true)
System.out.println("true");
else
System.out.println("false");

}
}