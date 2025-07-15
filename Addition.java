public class Addition{
int a;
int b;
Addition(int n1,int n2){
	a=n1;
	b=n2;

}
int getAddition(){
 return a+b;
}
public static void main(String[]args)
{
 Addition a1=new Addition(20,10);
int result=a1.getAddition();
System.out.println(result);
System.out.println(a1.getAddition());
}
}
