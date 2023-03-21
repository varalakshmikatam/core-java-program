class CountingProgram
{
public static void main(String[]args)
{
String s="aabbbccddefff";
int arr[]=new int[256];
for(int i=0;i<s.length();i++)
{
char ch=s.charAt[i];
int ele=ch;
arr[ele]=arr[ele]+1;
}
for(int i=0;i<=s.length();i++)
{
if(arr[i]>0)
{
char ch1=(char)i;
System.out.println(ch1+"->"+arr[i]);
}
}
}
}