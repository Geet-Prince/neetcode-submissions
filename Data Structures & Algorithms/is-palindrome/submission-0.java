class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        Stack<Character>asd=new Stack<>();
        int n=s.length();
        for(int i=0;i<n/2;i++){
                asd.push(s.charAt(i));
        }
        int start=n/2;
        if(n%2==1){
                start++;
        }
        for(int i=start;i<n;i++){
                if(asd.pop()!=s.charAt(i)){
                        return false;
                }
        }
        return true;

    }
}
