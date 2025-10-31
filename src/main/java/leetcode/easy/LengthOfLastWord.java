package leetcode.easy;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s){
        boolean lastWordFlag = false;
        int lastWordCount = 0;
        char[] chars =  s.toCharArray();
        for(int i = chars.length-1; i>0; i--){
            if(chars[i] != ' '){
                lastWordFlag = true;
                lastWordCount++;
            }
            if(lastWordFlag == true && chars[i] == ' '){
                return lastWordCount;
            }
        }
        return lastWordCount;
    }

    public int lenghtOfLastWordv2(String s){
        String[] wordArr = s.split(" ");
        for(int i=wordArr.length -1; i>0; i--){
            if(!wordArr[i].isEmpty()){
                return wordArr[i].length();
            }
        }
        return -1;
    }
}
