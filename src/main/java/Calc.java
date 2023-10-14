public class Calc {
    public String sum(String a, String b) {
        String result = "";
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        result = Integer.toString(num1 + num2);
        return result;
    }
}
