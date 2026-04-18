class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int maxLen =0;
        Map<Character,Integer> map = new HashMap<>();
        for(int right =0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char leftch = s.charAt(left);
                map.put(leftch,map.get(leftch)-1);
                if(map.get(leftch)==0){
                    map.remove(leftch);
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
