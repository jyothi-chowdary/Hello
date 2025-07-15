public class Product{
	int num1;
        int num2;
	Product(int a,int b){
		num1=a;
		num2=b;		 
}
	int getProduct(){
		return num1*num2;
}
public static void main(String[]args){
 Product p1=new Product(50,20);
System.out.println(p1.getProduct());
}
}