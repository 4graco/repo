package com.topcoder.round604;

public class FoxAndWord {

    public int howManyPairs(String[] words) {
        int count = 0;
        for (int i=0; i<words.length-1; i++) {
            String word = words[i];
            String doubleWord = word+word;
            for(int j=i+1; j<words.length; j++){
                String nextWord = words[j];
                if(!word.equals(nextWord)&& word.length()==nextWord.length()
                        && doubleWord.contains(nextWord)&& !nextWord.isEmpty()){
                    count++;
                }
            }
            words[i]="";
        }
        return count;
    }
}
