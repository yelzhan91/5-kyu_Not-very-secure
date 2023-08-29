public class CODEWARS {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        boolean res = false;
        res = alphaNumeric(s);
        System.out.println(res);//true
        s = "";
        res = alphaNumeric(s);
        System.out.println(res);//false
        s = "with space";
        res = alphaNumeric(s);
        System.out.println(res);//false
        s = "with_underscore";
        res = alphaNumeric(s);
        System.out.println(res);//false
        s = "punctuation.";
        res = alphaNumeric(s);
        System.out.println(res);//false
        s = "naïve";
        res = alphaNumeric(s);
        System.out.println(res);//false
        s = "1 strangedigit";
        res = alphaNumeric(s);
        System.out.println(res);//false
        s = "emoji\uD83D\uDE0A";
        res = alphaNumeric(s);
        System.out.println(res);//false
    }
    public static boolean alphaNumeric(String s) {
        return s.matches("\\p{Alnum}+");
    }
}