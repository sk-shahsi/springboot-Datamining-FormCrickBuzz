import java.util.Arrays;
import java.util.OptionalInt;

public class Test4 {

    public static void main(String[] args) {
        String s="aashish";
        String s1=s.substring(1,3);
        String ss= s.substring(s.length()-1);
        System.out.println(s1);
        System.out.println(ss);
        String a= "aashish";
        char[] ch=a.toCharArray();
        String sss="";

        for (int i=ch.length-1;i>=0;i--){
             sss=sss+a.charAt(i);

        }
        System.out.println(sss);


        int [] arr={1,2,5,86,7,9,2,56,0};
      Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        String string="aashs";
        char[] ch1=string.toCharArray();
        String newString="";

        for (int i=ch1.length-1;i<=0;i--){
            newString=newString+string.charAt(i);
            System.out.println(newString);
            if (string==newString){
                System.out.println("yes palindrom");
            }else {
                System.out.println("not pallindrom");
            }

        }

    }

}
