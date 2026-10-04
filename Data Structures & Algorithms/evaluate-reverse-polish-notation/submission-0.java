class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> operandsSet = Set.of("+", "-", "*", "/");
        for(String s : tokens) {
            if(operandsSet.contains(s)) {
                int a = stack.pop();
                int b = stack.pop();
                int c = compute(b, a, s);
                stack.push(c);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }
    public int compute(int a, int b, String operand) {
        switch(operand) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }
        return 0;
    }
}
