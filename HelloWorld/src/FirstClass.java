public class FirstClass {
    public static void main(String[] args) {
        double var1=20.00;
        double var2=80.00;
        double total=(var1+var2)*100.00;
//        double remainder=total%40.00;
        boolean noRemainderHere = (total%40.00 ==0)?true:false;
        System.out.println(noRemainderHere);
        if(!noRemainderHere){
            System.out.println("Got some remainder. It's "+total%40.00);
        }
    }
}
