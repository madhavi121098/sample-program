class Watch
{
public void defineWatch()
{
int size=41;
String m1="glass";
String color="blue";
System.out.println(size+"mm"+"\n"+m1+"\n"+color+"\n");
}
public void smartWatch()
{
final String a1="FEATURE",m1="1.listen to music",m2="2.games",m3="3.phone calls",m4="4.message",m5="5.heart rate sensor";
System.out.println(a1+"\n"+m1+"\n"+m2+"\n"+m3+"\n"+m4+"\n"+m5+"\n");
}
public void benefits()
{
String b1="BENEFITS",n1="*.confidence",n2="*.style",n3="*.time is important";
System.out.println(b1+"\n"+n1+"\n"+n2+"\n"+n3+"\n");
}
public void display(int x)
{
if(x<12)
{
System.out.println("the time is"+ x +"AM");
}
else
{
System.out.println("the time is "+ x +"PM");
}
try
{
Thread.sleep(4000);
}
catch(Exception e){
}
}
}
