public class CnstOvrLdng{

CnstOvrLdng(int a, int b){
int sum=a+b;
System.out.println("Sum of two numbers : "+sum);
}

CnstOvrLdng(int a, int b, int c){
int sum=a+b+c;
 System.out.println("Sum of three numbers : " +sum);
}

CnstOvrLdng(int a, int b, int c, int d){
int sum=a+b+c+d;
 System.out.println("Sum of four numbers : "+sum);
}

public static void main(String[] args){

new CnstOvrLdng(1,2);
new CnstOvrLdng(3,4,5);
new CnstOvrLdng(6,7,8,9);

}
}