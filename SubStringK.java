class SubStringK
{
public static void main(String[]args)
{
String s="abc";
int k=2;
String c="";
int len=s.length();
for(int i=0;i<len;i++)
{
c=c+s.substring(i,i+1);
}
if((c.length())==k)
{
System.out.println(c);
}
}
}