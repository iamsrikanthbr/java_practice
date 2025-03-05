public class EmpDetails{

String name ;
double empSal;

void m1( String a , double b){

this.name = a;
this.empSal = b;
System.out.println(this.name);
System.out.println(this.empSal);
}

public static void main(String[] args){
 
EmpDetails empDetails = new EmpDetails();

empDetails.m1(" Srikanth ",50000);
}
}