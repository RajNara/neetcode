class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                // addition
                int result = stack.pop() + stack.pop();
                stack.push(result);
            } else if (token.equals("-")) {
                // subtraction
                int firstNumber = stack.pop();
                int secondNumber = stack.pop();
                stack.push(secondNumber - firstNumber);
            } else if (token.equals("*")) {
                int result = stack.pop() * stack.pop();
                stack.push(result);
            } else if (token.equals("/")) {
                int firstNumber = stack.pop();
                int secondNumber = stack.pop();
                stack.push(secondNumber / firstNumber);
            } else {
                // integers
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }
}
