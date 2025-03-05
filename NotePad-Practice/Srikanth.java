public class Srikanth{

private double BankBal;

void setBankBal(double a){

this.BankBal = a;
}
double getBankBal(){
return this.BankBal;
}

public static void main(String[] args){

Srikanth srikanth = new Srikanth();

srikanth.setBankBal(50000.00);

System.out.println(srikanth.getBankBal());

}
}