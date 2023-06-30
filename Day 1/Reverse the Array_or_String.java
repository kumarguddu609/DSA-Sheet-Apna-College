//Reverse String
//Problem Link:"https://leetcode.com/problems/reverse-string/"

////Time Complexity --O(n)
//Space Complexity --O(1)
class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while(start<=end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}
