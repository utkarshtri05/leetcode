class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        HashSet<Character> set=new HashSet<>();
        int Maxlength=0;
        while(right<s.length()){
            char c=s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            Maxlength=Math.max(Maxlength,right-left+1);
            right++;

        }
        return Maxlength;
    }
}