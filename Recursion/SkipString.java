public class SkipString {
    public static void main(String[] args) {
        String str = "xyzabcd14apple56mopms1234";
        System.out.print(check(str));
    }
    static String check(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return check(s.substring(5));
        }
        return s.charAt(0) + check(s.substring(1));


    }
}
