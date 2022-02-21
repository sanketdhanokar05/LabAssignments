import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Candidate{
private String name;
private int id;
private int age;
private String gender;
private String department;
private int yearOfJoining;
private double salary;
public Candidate(int id, String name, int age, String gender, String department, int
yearOfJoining, double salary) {
super();
this.name = name;
this.id = id;
this.age = age;
this.gender = gender;
this.department = department;
this.yearOfJoining = yearOfJoining;
this.salary = salary;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public String getDepartment() {
return department;
}
public void setDepartment(String department) {
this.department = department;
}
public int getYearOfJoining() {
return yearOfJoining;
}
public void setYearOfJoining(int yearOfJoining) {
this.yearOfJoining = yearOfJoining;
}
public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}
@Override
public String toString() {
return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender +
", department="
+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
}
}
class Implementation{
public static Map<String,Long> getCount(List<Candidate>list){
Map<String,Long>count=new HashMap<>();
long female=list.stream().filter((gender)->gender.getGender().contains("Female")).count();
long male=list.stream().filter((gender)->gender.getGender().contains("Male")).count();
if(female>0)
count.put("Female",female);
if(male>0)
count.put("Male",male);
return count;
}
public static Map<String, Double>getAverageAge(List<Candidate>list){
Map<String,Double>average=new HashMap<>();
OptionalDouble averagefemale=list.stream().filter((gender)->gender.getGender().contains("Female")).mapToDouble((age)->
age.getAge()).average();
OptionalDouble 
averagemale=list.stream().filter((gender)->gender.getGender().contains("Male")).mapToDouble((age)->
age.getAge()).average();
if(averagefemale.isPresent())
average.put("Female",averagefemale.getAsDouble());
if(averagemale.isPresent())
average.put("Male",averagemale.getAsDouble());
return average;
}
public static Map<String,Long>countCandidatesDepartmentWise(List<Candidate>list){
long productdevelop=list.stream().filter((product)->product.getDepartment().contains("Product Development")).count();
long s_m=list.stream().filter((sm)->sm.getDepartment().contains("Sales And Marketing")).count();
long s_t=list.stream().filter((st)->st.getDepartment().contains("Security And Transport")).count();
long hr=list.stream().filter((st)->st.getDepartment().contains("HR")).count();
long infra=list.stream().filter((infras)->infras.getDepartment().contains("Infrastructure")).count();
long a_f=list.stream().filter((af)->af.getDepartment().contains("Account And Finance")).count();
Map<String,Long>count=new HashMap<>();
if(productdevelop>0)
count.put("Product Development",productdevelop);
if(s_m>0)
count.put("Sales And Marketing",s_m);
if(s_t>0)
count.put("Security And Transport",s_m);
if(hr>0)
count.put("HR",hr);
if(infra>0)
count.put("Infrastructure",infra);
if(a_f>0)
count.put("Account And Finance",a_f);
return count;
}
public static Optional<Candidate> getYoungestCandidateDetails(List<Candidate>list){
Optional<Candidate>candidate=list.stream().filter((male)->
male.getGender().contains("Female")).filter((department)->department.getDepartment().contains(
  "Product Development")).min((p1,p2)->p1.getAge()-p2.getAge());
if(candidate.isPresent()) {
candidate.get();
}
Optional<Candidate>candidate1=list.stream().filter((male)->
male.getGender().contains("Male")).filter((department)->department.getDepartment().contains("Product Development")).min((p1,p2)->p1.getAge()-p2.getAge());
if(candidate1.isPresent()) {
candidate1.get();
} return candidate1;
}
}
public class Source {
public static void main(String args[] ) throws Exception {
List<Candidate>list=new ArrayList<>();
/*list.add(new Candidate(111,"Damon Salvatore",23,"Male","Product Development",2009,70000));
list.add(new Candidate(222,"Elena Gilbert",25,"Female","Product Development",2012,50000));
list.add(new Candidate(333,"Stefan Salvatore",30,"Male","Product Development",2009,60000));
list.add(new Candidate(444,"Carolyn Forbes",26,"Female","Product Development",2010,65000));
*/
list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));


Implementation.getCount(list);
Implementation.getAverageAge(list);
Implementation.countCandidatesDepartmentWise(list);
Implementation.getYoungestCandidateDetails(list);
}
}