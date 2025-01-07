package M10.L10;
public class SomeClass

{

public static int calcMethod(int num)

{

if (num == 0)

{

return 10;

}

return num + calcMethod(num / 2);

}

public static void main(String[] args)
{
System.out.println(calcMethod(16));

}
}