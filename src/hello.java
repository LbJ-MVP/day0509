public class hello {
    public static void main(String[] args){
        System.out.println("hello,xingxing!");
        biao99();
    }
    public static void j01(){
        //商要是小数，除数、被除数中必须有一个是小数类型
        int a = 1;
        int b = 2;
        double c = a/b ;// c= 0.0
        double d = a/(double)b;// d=0.5
        System.out.println("c = "+c);
//        System.out.print(c);
        System.out.println("d = "+d);
    }
    public static void biao99(){
        //打印99乘法表
        for(int i = 1; i <10 ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
