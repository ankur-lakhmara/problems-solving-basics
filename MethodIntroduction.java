package Methods;

public class MethodIntroduction {
    public static void main(String[]args){
    int fristNumber = 35;
    int secondNumber = 25;
    int Result = findMax(fristNumber,secondNumber);//method calling by findMax 1st we write mathod name and after method name we write arguments
        int r = findMax(100,200);
        int a = findMax(500,300);
        System.out.println(Result+" is greater");
        System.out.println(a);
        System.out.println(r);

    }
    static int findMax(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
