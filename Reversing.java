public class Reversing {
    public static void Reverse(int num)
    {
        if(num<10){
            System.out.println(num);
            return;
        }
        else{
            System.out.println(num%10);
            Reverse(num/10);
        }
    }
    public static void main(String[] args) {
        int num=1234;
        System.out.println("reverse of the number");
        Reverse(num);
    }
}
