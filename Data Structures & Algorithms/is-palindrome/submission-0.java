class Solution {
    public boolean isPalindrome(String s) {
      int start = 0;
      int end = s.length()-1;
      while(start<end){
        while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
            start++;
        }
        while(start < end && !Character.isLetterOrDigit(s.charAt(end))){
            end--;
        }
       char t = Character.toLowerCase(s.charAt(start));
       char e = Character.toLowerCase(s.charAt(end));
      if(t != e){
        return false;
      }
      start++;
      end--;
      }
      return true;
    }
}
