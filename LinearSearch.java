import java.util.Scanner;
class LinearSearch{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of records");
int n= sc.nextInt();
int []arr=new int[n];
System.out.println("Enter the "+n+" values");
for (int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
System.out.println("Enter the number that you have to search");
int number=sc.nextInt();
LinearSearch.search(arr,number);
}
static void search(int []arr ,int number){
int count=0;
for (int i=0; i<arr.length;i++){
if (number==arr[i]){
}
}
}
}