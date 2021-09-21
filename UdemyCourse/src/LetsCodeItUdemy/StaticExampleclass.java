package LetsCodeItUdemy;

public class StaticExampleclass {
static int rollnumber = 10;
static String name = "Ganesh";
static String PhonenUmber;
int marsheetnum;
String address = "Kalamboli";
private static int instance =0;

StaticExampleclass(String name)
{
this.name = name;

}

public static int getinstance()
{
	instance++;
	return instance;
}
}
