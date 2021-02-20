import java.util.ArrayList;

public class Question {

    public static void main(String[] args) {

        ArrayList<Integer> res= new ArrayList();

        for(int i=2;i<100;i++){
            if(isPrime(i)){
                boolean check=true;
                ArrayList<Integer> digits= new ArrayList<>();
                for(int j=i;j>0;j/=10){
                    digits.add(j%10);
                }
                for(int k:digits){
                    if(!isPrime(k)){
                        check=false;
                    }
                }
                if(check)
                res.add(i);
            }
        }

        for(int i : res){
            System.out.println(i);
        }

    }

    public static boolean isPrime(int n){

        boolean check= true;

        if(n==1){
            return false;
        }

        for(int i=2;i<n;i++){
            if(n%i==0){
                check = false;
            }
        }
        return check;
    }


}
