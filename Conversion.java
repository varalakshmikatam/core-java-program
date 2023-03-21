class Conversion
{
public static void main(String[]args)
{
String s="sathya";
char ch[]=new char[s.length()];
for(int i=0;i<s.length();i++)
{
 ch[i]=s.charAt(i);
}
for(char e:ch)
{
System.out.println(e);
}
}
}


