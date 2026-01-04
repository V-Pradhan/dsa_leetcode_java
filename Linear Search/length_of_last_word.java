public class length_of_last_word{

public static int wordlength(String s){
 int length = 0;
 int i = s.length()-1;

 while (i>=0 && s.charAt(i)== ' ') {
    i--;
 }
 while(i>=0 && s.charAt(i) != ' '){
    length++;
    i--;
 }
 return length;
}
public static void main(String[] args) {
    System.out.println(wordlength("Hello java"));
}
}