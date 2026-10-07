// class Main{
//     public static void main(String args[]){
//         int sum=0;
//         int evencount=0;
//         int oddcount=0;
//         int largest=0;
//         for(int i=0;i<21;i++){
//             System.out.println(i);
//             sum=sum+i;
//             if(i%2==0){
//                 System.out.println("even");
//                 evencount+=1;
//             }
//             else{
//                 System.out.println("odd");
//                 oddcount+=1;
//             }
//             if(i>largest){
//                 largest=i;
//             }
//             System.out.println(evencount);
//              System.out.println(oddcount);
//               System.out.println(largest);
//                System.out.println(sum);

//         }
//     }
// }
// class original{
//     public static void main(String args[]){
//         int sum=0;
//         for(int i=0;i<101;i++){
//             if(i%2==0){
//                sum=sum+i;
//             }
//           }
//           System.out.println(sum);
//     }

// }
// class correct{
//     public static void main(String args[]){
//         int count=0;
//         int n=50;
//         int i =1;
//         int sum=0;
//         while(i<=n){
//             if(i%3==0){
//             count++;
//             sum=sum+i;
//             }
//             i++;
//         }
//         System.out.println(count);
//          System.out.println(sum);
          
//     }
// }
// class reverse{
//     public static void main(String args[]){
//         int i=5837;
//         int real=0;
//         while(i>0){
//             int n=i%10;
//              real=real*10 + n;
//             i=i/10;
//         }
//         System.out.println(real);
//     }
// }
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number != 0) {
                count++;
                sum = sum + number;
            }

        } while (number != 0);

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);


        // Part 2

        int n = 583729;

        int digits = 0;
        int digitSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int largest = 0;
        int smallest = 9;

        while (n > 0) {

            int digit = n % 10;

            digits++;
            digitSum = digitSum + digit;

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (digit > largest) {
                largest = digit;
            }

            if (digit < smallest) {
                smallest = digit;
            }

            n = n / 10;
        }

        System.out.println("Digits: " + digits);
        System.out.println("Sum of digits: " + digitSum);
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
        System.out.println("Largest digit: " + largest);
        System.out.println("Smallest digit: " + smallest);

        input.close();
    }
}