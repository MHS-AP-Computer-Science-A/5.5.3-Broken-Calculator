public class Calculator {

    private int total;
    private int value;

    //Post: Instance variables total and value are set to startingValue and 0 respectively
    public Calculator(int startingValue){
        int total = startingValue;
        value = 0;
    }

    //Post: value parameter is added to the total intstance variable
    public int add(int value){
        int total = total + value;
        return total;
    }

    //Post: value is added to the total instance variable
    public int add(){
        int total += value;
        return total;
    }

    //Post: total instance variable is multiplied by value
    public int multiple(int value){
        int total *= value;
        return total;
    }

    //Post: Sets the value instance variable
    public void setValue(int value){
        value = value;
    }

    //Post: Gets the value instance variable
    public int getValue(){
        return value;
    }

}
