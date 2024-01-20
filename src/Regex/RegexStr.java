package Regex;

public class RegexStr {
    public static void main(String[] args) {

        String s = "dfofgmsdogmsdfmMfedjMdfij";

        String ss = s.replaceAll("M.+M", "");

        System.out.println(ss);
    }
}
