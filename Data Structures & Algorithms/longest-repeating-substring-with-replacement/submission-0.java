class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[256];
        int left =0;
        int maxLen =0;
        int maxFreq =0;
        for(int right =0;right<s.length();right++){
            char ch = s.charAt(right);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq,freq[ch - 'A']);
            int len = right-left+1;
            if(len - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
        
    }
}
