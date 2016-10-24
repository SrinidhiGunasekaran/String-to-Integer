import java.io.*;
class IntegerConversion
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
String s;
int n;
s=in.readLine();
n=Integer.parseInt(s);
System.out.println(n);
}
catch(Exception e)
{
}
}
}
