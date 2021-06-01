import java.util.Scanner;
class Fibonacci{
public static void main(String []args){
	Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number of row");
int row = sc.nextInt();
int n = 20;
int a = 0;
int b = 1;
int c;
for (int i =1;i<=row;i++){
	
System.out.println(a+" ");
c=a+b;
a = b;
b = c;
}

}
}