public class fibbo {
        public static int fibonacci_numbers(int n)
        {
            if(n == 0){
                return 0;
            }
            else if(n == 1){
                return 1;
            }
            else{
                return fibonacci_numbers(n-2) + fibonacci_numbers(n-1);
            }
        }
        public static void main (String[] args) {
            int n = 7;
            for(int i = 0; i < n; i++){
                if(n-1 == i)
                System.out.print(fibonacci_numbers(n)+ " ");
            }
        }
    }

