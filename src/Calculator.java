public class Calculator {

    private int total;
    private int value;

    public Calculator(int startingValue){
        int total = startingValue;
        value = 0;
    }

    public int add(int value){
        int total = total + value;
        return total;
    }

    /**
    * Adds the instance variable value to the total
    */
    public int add(){
        int total += value;
        return total;
    }

    public int multiple(int value){
        int total *= value;
        return total;
    }

    public void setValue(int value){
        value = value;
    }

    public int getValue(){
        return value;
    }

}