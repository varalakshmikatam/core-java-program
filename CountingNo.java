class CountingNo
{

public static void main(String[]args)
{
String s="abcdABCDabcd";
for(int i=0;i<=s.length()-1;i++)
{
int count=1;
char ch=s.charAt(i);
for( int j=i+1;j<=s.length()-1;j++)
{

char ch1=s.charAt(j);

if(ch==ch1)
{
count=count+1;
} 
}
System.out.println(ch+" "+count);
}
}
}