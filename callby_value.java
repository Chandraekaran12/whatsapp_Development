package java_practice;

public class callby_value {
//int num=50;
//
//void chage(int data) {
//	num = data+100;
//System.out.println(num);//223
//	
//}
//	public static void main(String[] args) {
//callby_value cbv=new callby_value();
//System.out.println(cbv.num);
//cbv.chage(123);
//System.out.println(cbv.num);
////System.out.println(num);
//	
	 static int data1=50; 
	  
	 void change(callby_value op){  
	 op.data1=op.data1+100;//changes will be in the local variable only  
	 System.out.println(data1);
	 }
	     
	 public static void main(String args[]){  
	   callby_value op=new callby_value();  
	  
	   System.out.println("before change "+op.data1);  
	   op.change(op);  
	   System.out.println("after change "+op.data1);  
	   System.out.println(op.data1);
	  


}

	
	
	
	
	
	
}
