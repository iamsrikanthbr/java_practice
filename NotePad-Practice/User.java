public class User{


String name;
int age;
String instName = "Surge";

public static void main(String[]  args){

User user1 = new User();

user1.name="Srikanth";
user1.age=26;
System.out.println(user1.name);
System.out.println(user1.age);
System.out.println(user1.instName );

System.out.println("====== The Details of Second Person=========");

User user2 = new User();

user2.name = "XYZ";
user2.age=2;
System.out.println(user2.name);
System.out.println(user2.age);
System.out.println(user2.instName );

}

}