package exam;

public class Main {

    public static void main(String[] args) {
	// write your code here
    String s =stringParserAscII("abcxyz",3);
    System.out.print(s);
    }



    public static String stringParserAscII(String s,int distance){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char tmp =(char)(s.charAt(i)+distance);
            if (tmp>'z'){
                char t=(char)('a'+tmp-'z');
                stringBuilder.append(t);
            }else {
                stringBuilder.append(tmp);
            }

        }
        return stringBuilder.toString();
    }
}
