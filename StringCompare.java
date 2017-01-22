//listing of outputs based on varaitions of in-built string matching methods
public class StringCompare
{
  public static void main(String[] args)
  {
    	String s1="hi";
    	String s2="hi";
        String s3= new String("hi");
    	String s4= new String("hi");
    
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));
    
    System.out.println(s3==s4);
    System.out.println(s3.equals(s4));
    
    
    System.out.println(s1==s3);
    System.out.println(s1.equals(s3));
    
    System.out.println("zzz");
    System.out.println(s1.toString()==s3.toString());
    System.out.println(s1.toString().equals(s3.toString()));
    
    System.out.println("yyy");
    System.out.println(String.valueOf(s1) == String.valueOf(s3));
    System.out.println(s1.toString() == s3.toString());
    System.out.println(String.valueOf(s1) == s3.toString());
    
    System.out.println(String.valueOf(s1).equals(String.valueOf(s3)));
    System.out.println(s1.toString().equals(s3.toString()));
    System.out.println(String.valueOf(s1).equals(s3.toString()));
    
    int a = 3;
    Integer b = new Integer(3);
    
    System.out.println(a==b);
    //System.out.println(a.equals(b));  //doesn't compile, inccorest syntax
    System.out.println(b.equals(a));
    
    Integer c = new Integer(3);
    System.out.println(b==c);
    System.out.println(b.equals(c));
    System.out.println(b.intValue() == c.intValue());
    //System.out.println(b.intValue().equals(c.intValue())); //doesn't compile, inccorest syntax
    System.out.println(b == c.intValue());
    System.out.println(b.equals(c.intValue()));

  }
}
