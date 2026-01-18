class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int [] lastseen = new int[128];

        for(int i =0; i<128; i++)lastseen[i] = -1;
        
        int maxlen =0;
        int left = 0;

        for(int right=0; right<n; right ++){
            char ch = s.charAt(right);

            if(lastseen[ch]>=left){
                left = lastseen[ch]+1;
            }
            lastseen[ch] =right;
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}