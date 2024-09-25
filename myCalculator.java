public class myCalculator{
    public long power(int n,int p)throws Exception{
     if(n<0 || p<0){
        throw new Exception("n or p should not be negative");
     }
    else if(n==0 && p==0){
        throw new Exception("n and p should not be zero");
    }
    else{
        return (long)Math.pow(n, p);
    }
    }
    public static void main(String[] args) {
    myCalculator calc =  new myCalculator();
        try{
            System.out.println(calc.power(5, 2));
            System.out.println(calc.power(-5, 2));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}