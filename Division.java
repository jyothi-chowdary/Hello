public class Division{
 	float a,b;
	Division(float n1,float n2){
		a=n1;
		b=n2;
}
 float getDivision(){
 	return a/b;
}
public static void main(String[]args){
Division d1=new Division(3,30);
 float result=d1.getDivision();
System.out.println("reminder:"+result);
}
}

	