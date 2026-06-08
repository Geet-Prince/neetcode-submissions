class Solution {
    public boolean isValid(String s) {
        Stack<Character>asd=new Stack<>();
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='['){
                        asd.push(']');
                }
                else if(s.charAt(i)=='{'){
                        asd.push('}');
                }
                else if(s.charAt(i)=='('){
                        asd.push(')');
                }
                else{
                        if(asd.isEmpty()||asd.pop()!=s.charAt(i)){
                                return false;
                        }
                }
        }
        return asd.isEmpty();
    }
}
