import java.util.*;
interface A
{
public default int findKey()
{
for(int i=0;i<arr.length;i++)
{
key=30;
temp=arr[i];
if(key==temp)
return 0;
else
return -1;
}
}
}
class B implements A
{
public static void main(String[]args)
{
B b=new B();
int arr[]={10,20,30,40,50};
 int a=b.findKay();
System.out.println(a);
}
}