class Amstrong
{
public static void main(String[]args)
{
int count=0;
int sum=0;
int n=123;
while(n<=0)
{
int a=n%10;
if(a>0)
{
count=count+1;
}

int b=count*a;
sum=sum+b;
}
System.out.println("Hello");

System.out.println("sum is :"+sum);

}
}