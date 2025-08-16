class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> thestack=new Stack<>();
        int op1;
        int op2;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                op2=thestack.pop();
                op1=thestack.pop();
                thestack.push(op1+op2);
            }
            else if(tokens[i].equals("-")){
                op2=thestack.pop();
                op1=thestack.pop();
                thestack.push(op1-op2);
            }
            else if(tokens[i].equals("*")){
                op2=thestack.pop();
                op1=thestack.pop();
                thestack.push(op1*op2);
            }else if(tokens[i].equals("/")){
                op2=thestack.pop();
                op1=thestack.pop();
                thestack.push(op1/op2);
            }else{
                thestack.push(Integer.parseInt(tokens[i]));
            }
        }
        return (thestack.peek());
    }
}
