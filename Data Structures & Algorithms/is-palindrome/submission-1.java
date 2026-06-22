class Solution {
    public boolean isPalindrome(String s) {
        /*
        brute force approach 
        first need to take stringbuilder 
        Stringbuilder cleaned = new StringBuilder();
        for(char c : s.tocharArray()){
            if(Character.isLetterOrDigit(c)){
            cleaned.append(Character.toLowerCase(c));
            }
            String original = cleaned.toString();
            String reversed = cleaned.reverse().toString();
            return original.equals(reversed);
        }
        */
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
