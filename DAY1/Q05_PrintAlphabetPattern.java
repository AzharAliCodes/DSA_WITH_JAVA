// This program prints an alphabet pattern where each line starts from a specific letter
// and contains consecutive letters from the alphabet. The first line starts with 'A',
// the second with 'B', and so on.
public class Q05_PrintAlphabetPattern {
    public static void main(String[] args) {
       char n='A'; 
        for (int i = 0; i < 4; i++) {               //add new line
            for (int j = 0; j < i+1; j++){          //print a character
            System.out.print(n);
            n++;                                    //incress the character from A to B so on
    }
    System.out.println("");
}
}
}
