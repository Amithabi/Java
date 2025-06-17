public class Nonstaticrec
{
    public String fun(int n)
    { if(n==11)
    {
    return"Bhagya";
    }
    System.out.println(n);
    String s=fun(n+1);
    System.out.println(n);
    return s;
    }
	public static void main(String[] args) {
	    Main m=new Main();
	   System.out.println(m.fun(1));
	}
}
