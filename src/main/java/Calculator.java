public class Calculator {

    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double Add(){
        double result = num1+num2;
        return result;
    }

    public double Subtract(){
        double result = num1 - num2;
        return result;
    }

    public double Multiply(){
        double result = num1 * num2;
        return result;
    }

    public double Divide(){
        double result = num1/num2;
        return result;
    }
}
