class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int totalSum=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int peekEle=stack.pop();
                int second=stack.peek();
                int sum=peekEle+second;
                stack.push(peekEle);
                stack.push(sum);
            }else if(operations[i].equals("D")){
                int doubledValue=stack.peek()*2;
                stack.push(doubledValue);
            }else if(operations[i].equals("C")){
                stack.pop();
            }else{
                int val=Integer.parseInt(operations[i]);
                stack.push(val);
            }
        }
        for(int i:stack){
            totalSum+=i;
        }
        return totalSum;
    }
}