package exercices;

public class Multiplesof3and5 {

    public static void multiplesOf3or5(){
        int totalValue=0;
        for(int i=0;i<1000;i++){
            if(i%3==0){
                totalValue += i;
            }else if(i%5==0){
                totalValue +=i;
            }
        }
        System.out.println(totalValue);
    }


}
