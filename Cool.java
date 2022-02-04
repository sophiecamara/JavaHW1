// /Store a number in a variable called num and write an if statement: 
// If num is odd, display "Cool"
// If num is even and between 2-5, display "Not Cool"
// If num is even and between 6-20, display "Cool"
// If num is even and greater than 20, display "Not Cool

class Cool {
    public static void main(String[] args) {

        int num = 19;

        if (num % 2 != 0) {
            System.out.println("display cool");
        } else if (num % 2 == 0) {

            if (num > 1 && num <= 5) {
                System.out.println("display not cool");
            }
            if (num > 5 &&  num<=20){
                System.out.println("display cool");
            }
            if (num<20){
                System.out.println("display not cool");
        } else {
            System.out.println("display 0");
          
        }
    }
    }
}