package java_practice;

import java.util.Date;

import org.codehaus.groovy.ast.stmt.LoopingStatement;

public class datafunction_Ex {
public static void main(String[] args) {
	Date date=new Date();
	
	long millis=System.currentTimeMillis();
	System.out.println(millis);
java.sql.Date date1=new java.sql.Date(millis);
System.out.println(date1);
}
}
