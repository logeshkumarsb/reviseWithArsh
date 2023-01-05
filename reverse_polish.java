/*
    arsh challenge
    1) reverse polish notation
    
*/
class Solution {
    public boolean isOperator(String st){
        if(st.equals("+")||st.equals("-")||st.equals("*")||st.equals("/")){
            return true;
        }
        return false;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String i:tokens){
            if(isOperator(i)){
                int num1=st.pop();
                int num2=st.pop();
                if(i.equals("+")){
                    st.push(num1+num2);
                }else if(i.equals("-")){
                    st.push(num2-num1);
                }
                else if(i.equals("*")){
                    st.push(num2*num1);
                }else if(i.equals("/")){
                    st.push(num2/num1);
                }
            }else{
                st.push(Integer.parseInt(i));
            }
        }
        if(!st.isEmpty()){
            return st.pop();
        }else{
            return -1;
        }
    }
}
