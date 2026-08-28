class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int retVal = 0;

        for (String operation : operations) {
            if (operation.equals("+")) {
                // addition
                int result = stack.peek() + stack.get(stack.size() - 2);
                stack.push(result);
            } else if (operation.equals("D")) {
                // double
                int result = 2 * stack.peek();
                stack.push(result);
            } else if (operation.equals("C")) {
                // cancel
                stack.pop();
            } else {
                // integers
                stack.push(Integer.parseInt(operation));
            }
        }

        while (!stack.isEmpty()) {
            retVal = retVal + stack.pop();
        }

        return retVal;
    }
}