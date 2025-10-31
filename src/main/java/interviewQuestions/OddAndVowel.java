package interviewQuestions;

public class OddAndVowel {
    public boolean hasVowel(String str){
        boolean hasVowel = false;

        for(int i =0; i<str.length(); i++){
            char letter = str.toLowerCase().charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                hasVowel = true;
                break;
            }
        }
        return hasVowel;
    }

    public int solutionsFound(String[] strList){
        int solutionNum = 0;
        for(int i = 0; i< strList.length; i++){
            if(hasVowel(strList[i]) && strList[i].length() % 2 == 1){
                solutionNum++;
            }
        }
        return solutionNum;
    }
}
