package Chapter05;

public class Exercise15 {
    public static void main(String[] args) {
        int charsPerLine = 10 ;
        char startChar = '!';
        char endChar = '~';

        int count = 0 ;
        for (char ch = startChar; ch <= endChar; ch++){
            System.out.print(ch + " ");
            count++;

            if (count == charsPerLine){
                System.out.println();
                count =0 ;
            }
        }
    }
}
