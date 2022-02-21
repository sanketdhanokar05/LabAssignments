import java.util.*;
class ArrayListOps {
public static ArrayList<Integer> makeArrayListInt(int n) {
int array[]=new int[n];
for (int i = 0; i < n; i++) {
array[i]=0;
}
ArrayList<Integer>list=new ArrayList<>();
for(Integer integer:array) {
list.add(integer);
} return list;
}
public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
for(int k=0,j=list.size()-1;k<j;k++){
list.add(k,list.remove(j));
} return list;
}
public static ArrayList<Integer>changeList(ArrayList<Integer> list,int m,int n) {
int index=list.indexOf(m);
list.set(index,n);
return list;
}
}
public class Source{
public static void main(String[] args) {
ArrayListOps.makeArrayListInt(4);
ArrayList<Integer>list=new ArrayList<Integer>(Arrays.asList(10,25,33,28,10,12));
ArrayListOps.reverseList(list);
ArrayListOps.changeList(list,100,10);
}
}