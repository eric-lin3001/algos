package thinkingInJava.demos.keywords;

public class KeywordThis {
    KeywordThis incre(){
        return this;
    }

    public static void main(String[] args) {
        KeywordThis keywordThis = new KeywordThis();
        System.out.println(keywordThis.incre());
    }
}
