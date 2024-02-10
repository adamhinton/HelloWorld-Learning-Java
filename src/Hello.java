public class Hello {
    public static void main(String[] args) {
        double myFirstValue = 20.00;
        double mySecondValue = 80.00;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100;

        double myRemainder = myValuesTotal % 40.00;

        boolean isNoRemainder = myRemainder == 0.00;

        System.out.println(isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }
        }
    }
