public class EvenDigitInArray {
    public static void main(String[] args) {
        int[] arr = {12,345,29,6,7896};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digit(num);
        return numberOfDigits%2==0;
    }
    static int digit(int num){
        int count = 0;
        while(num>0){
            count ++;
            num =num/10;
        }
        return count;
    }
}
