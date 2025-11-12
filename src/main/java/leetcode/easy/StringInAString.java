package leetcode.easy;
/*
    leetcode problem
    Find the index of the First Occurrence in a string
 */
public class StringInAString {
    public int findOccurrenseOfString(String haystack, String needle){
        return haystack.indexOf(needle);
    }

    public int findNeedle(String haystack, String needle){
        for(int i=0, j=needle.length(); j < haystack.length() ; j++){
            if(haystack.substring(i, j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
