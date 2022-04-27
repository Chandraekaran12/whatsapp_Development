package java_practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


public class Collection_Ex {
public void meth1() 
{
ArrayList<String>aList =new ArrayList<String>();
aList.add("bmw");
aList.add("phorchie");
aList.add("lambo");
aList.add("ferrari");
aList.add("benz");
aList.add("Honda");
aList.add("ferrari");

HashSet<String>st=new LinkedHashSet <String>();
st.addAll(aList);
System.out.println("Hashset method ----------"+st);

LinkedList<String> anotherlist=new LinkedList<String>();

anotherlist.addAll(aList);

System.out.println("-------------- forEach ------------");
for(String str : anotherlist) {
System.out.println(str);
aList.add("tata");

}

System.out.println("-----------forloop-----------------------------");
for(int i=0; i<aList.size();i++) {
	System.out.println(aList.get(i));
}

System.out.println("------------ By Iterator ----------------------------");

ListIterator<String>itr=anotherlist.listIterator();

while(itr.hasNext()) {System.out.println(itr.next());}

System.out.println("----------By list iterator----------------------------");

while(itr.hasPrevious()) {
	System.out.println(itr.previous());}

    
}

public static void main(String[] args) {
Collection_Ex ob1= new Collection_Ex();
	ob1.treeset();
	
	
}


void lhset() {
	Set<String>linkedhashset=new LinkedHashSet<String>();
	linkedhashset.add("a");
	linkedhashset.add("b");
	linkedhashset.add("c");
	linkedhashset.add("d");
	linkedhashset.add("b");	
	linkedhashset.add("a");
System.out.println("Linked Hashset -------"+linkedhashset);

}
void hashset() {
	Set st=new HashSet();
	st.add(1);
	st.add(2);
	st.add(3);
	st.add(4);
	st.add(2);
	st.add(1);
	st.add(3);
	st.remove(4);
System.out.println("Normal Hashset------------------"+st);
	
}
void treeset() {
	TreeSet<Integer> trst=new TreeSet<Integer>();
	trst.add(5);
	trst.add(5);
	trst.add(4);
	trst.add(8);
	trst.add(9);
	trst.add(5);
	trst.add(7);
	trst.descendingSet();

	System.out.println("TreeSet---------------- "+ trst);
	System.out.println();
}
}
