/**
 * Created by CostaHu on 2016/4/14.
 */
public class StringDemo {
    public static void main(String[] args) {
        /*
        The String class represents character strings.
        All string literals in Java programs, such as "abc", are implemented as instances of this class.
        */
        String s2 = "Hello Costa!";
        String s1 = new String("Hello Costa!");
        String s3 = "Hello Costa!";

        System.out.println("s1==s2 is "+s1==s2);
        System.out.println("s1==s3 is "+s1==s3);
        System.out.println("s2==s3 is "+s2==s3);

        String str1 = "abc";
        char[] data = {'a','b','c'};
        String str2 = new String(data);

        System.out.println("str1 == str2 is "+str1 == str2);
        //This method will return an integer
        System.out.println(s1.compareTo(str1));

        /*
        Use the first one rather than the second one because
        it may change the semantics
        */
        String str3 = "Hello";
        String str4 ="Hello Costa";
        System.out.println("Hello Costa!".startsWith(str3));
        System.out.println(str4.startsWith("Hello"));
        /* another method called endsWith() is just like this */

        //Show usage of method equals()
        System.out.println("Is Hello equals to str3? "+"Hello".equals(str3));

        /* Other methods like equals() is listed here : equalsIgnoreCase()  CompareTo()
        compareToIgnore() regionMatches() */

        //Show the usage of regionMatches()
        String str5 = "Welcome to tutorials";
        String str6 = new String("tutorials");
        String str7 = "TUTORIALS";

        System.out.println("Return Value: " + str5.regionMatches(11,str6,0,9));
        System.out.println("Return Value: "+ str6.regionMatches(true,0,str7,0,9));

        //Show the usage of String.split();
        //Splits this string around matches of the given regular expression.
        String[] str8 = "Java#HTML#Perl".split("#",0);
        for(int i=0;i<str8.length;i++){
            System.out.println(str8[i]);
        }

        //Show usages of some regular expressions
        String str9 ="a+b$#c";
        System.out.println(str9.replaceAll("[$+#]","NNN"));
        String[] str10 = "Java,C?C#,C++".split("[.,;:?]");
        for(int i = 0;i<str10.length;i++){
            System.out.println(str10[i]);
        }

        //Show convert between string and char array
        String str11 = new String(new char[]{'J','a','v','a'});
        System.out.println(str11);
        String str12 = String.valueOf(new char[]{'J','a','v','a'});
        System.out.println(str12);

        //Show conversion from string to char array
        char[] str13 = "Java".toCharArray();
        for(int i= 0;i<str13.length;i++){
            System.out.println(str13[i]);
        }
    }
}
