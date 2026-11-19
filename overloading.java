class Addition{
    void sum(){
        System.out.println("Addition ");
    }
    void sum(int a,int b){
        System.out.println("Addition "+(a+b));
    }
    static void sum(int a,int b,int c){
        System.out.println("Addition "+(a+b+c));
    }
}


public class overloading {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.sum();
        obj.sum(2,3);
        obj.sum(2,3,5);

    }
}
