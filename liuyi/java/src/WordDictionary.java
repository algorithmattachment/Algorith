import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class WordDictionary {

    public static void main(String[] args){

        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("at");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("adds");
        if (wordDictionary.search("add."))
            System.out.println("aaaaa");
        else System.out.println("bbbbb");
    }
    private Map<Integer,String[]> mWord = null;
    /** Initialize your data structure here. */
    public WordDictionary() {
        mWord = new HashMap<>();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        Integer lenWord = word.length();
        if (mWord.containsKey(lenWord)){
            String[] temStr = new String[mWord.get(lenWord).length+1];
            String[] baseStr = mWord.get(lenWord);
            for (int i = 0; i <baseStr.length ; i++) {
                temStr[i] =baseStr[i];
            }
            temStr[temStr.length-1] = word;
            mWord.put(lenWord,temStr);
        }else{
            mWord.put(lenWord,new String[]{word});
        }
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        char[] compareChar = word.toCharArray();
        ArrayList<Integer> flatArr=new ArrayList();
        if (!mWord.containsKey(compareChar.length))
            return false;
        else if (mWord.containsValue(word))
            return true;
        else{
            String[] temStrs = mWord.get(word.length());
            for (String str:temStrs){
                int flag = 0;
                char[] baseChar = str.toCharArray();
                for (int i = 0; i < compareChar.length; i++) {
                    if (compareChar[i] == '.'){
                        flag++;
                    }
                    else if (compareChar[i]==baseChar[i]){
                        flag++;
                    }
                    else
                        flag = 0;
                }
                if (flag == baseChar.length)
                    flatArr.add(1);
                else
                    flatArr.add(0);
            }
        }
        for (int e:flatArr){
            if (e == 1)
                return true;
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */