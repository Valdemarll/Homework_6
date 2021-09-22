package Task4;

public class Calculator {
    private int num1;
    private int num2;

    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public class Add implements Action{
        @Override
        public int act(){
            return num1 + num2;
        }
    }

    public class Sub implements Action{
        @Override
        public int act(){
            return num1 - num2;
        }
    }

    public class Multiply implements Action{
        @Override
        public int act(){
            return num1 * num2;
        }
    }

    public class Div implements Action{
        @Override
        public int act(){
            return num1 / num2;
        }
    }
}
