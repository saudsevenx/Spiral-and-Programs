class Fibo{
    public static void main(String[] args){

        fiboLoop();
    
    }

    private static void fiboLoop(){
        int firstNum = 0;
        int secondNum = 1;
        int n = 10;
        int ans ;


        System.out.println(firstNum);
        System.out.println(secondNum);


        for(int i = firstNum; i <= n; i++){

            ans = firstNum + secondNum;
            System.out.println(ans);
            firstNum = secondNum;
            secondNum = ans;

        }

    }
}