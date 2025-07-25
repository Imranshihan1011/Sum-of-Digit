
package sum.of.digit;

/**
 *
 * @author Imran Shihan
 */
public class SumOfDigit {
public static int sumDigit(int num){
    int sum = 0;
    while( num > 0){
        sum += num % 10;
        num /= 10;
    }
    return sum;
}
    public static void main(String[] args) {
   int number = 1234;
   int result = sumDigit(number);
        System.out.println("Sum of digits: "+result);
    }
    
}
