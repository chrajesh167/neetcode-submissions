class Solution {
    public int characterReplacement(String s, int k) {
        int freq [] = new int[26];
        int left = 0;
        int maxLen = 0;
        int maxFreq =0;
        for(int right=0;right<s.length();right++){
            char rightch = s.charAt(right);
            freq[rightch - 'A']++;
            maxFreq = Math.max(maxFreq,freq[rightch - 'A']);
            int len  = right-left+1;
            if(len - maxFreq >k){
                char leftch = s.charAt(left);
                freq[leftch - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen,right-left +1);
        }
        return maxLen;    
    }
}
