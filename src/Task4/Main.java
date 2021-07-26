package Task4;

import com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your nickname: ");
        String username;
        Scanner console = new Scanner(System.in);
        username = console.nextLine();
        username.toLowerCase(Locale.ROOT);
        Strategy[] strategy = new Strategy[] {new Default(), new English(), new Russian()};
        strategy[checkLanguage(username)].output(username);




    }



    public static int checkLanguage(String username){
        int i = 0;
        int rus = 0;
        int eng = 0;
        String regex;
        regex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher a = pattern.matcher(username);
        System.out.println(a.find());

        for (i=0;i<username.length();i++)
        {
            if (Character.UnicodeBlock.of(username.charAt(i)).equals(Character.UnicodeBlock.CYRILLIC)) {
                rus+=1;
            }
//            if () {
//                eng-=1;
//            }
        }
        if(rus > 0){
            return 2;
        }
        if(eng < 0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
