public class Rrrun {
    public static void main(String[] arg){
//        run_student();
        string_build();

    }

    public static void run_student(){
        Student student1 = new Student();//实例化
        System.out.println(student1.name);
        Student student2 = new Student("李星冶");
        System.out.println(student2.name);

        Student student3 = new Student("李星冶","星星");
    }
    public static void string_build(){
//        StringBuilder s = new StringBuilder("初始");//StringBuilder类可以存储变长字符串
//        s.append("加一个");
//        System.out.println(s);//初始加一个
//        System.out.println(s.toString());//初始加一个
//        StringBuilder s1 = new StringBuilder("00");
//        s1.append("11");
//        System.out.println(s1);//0011
//        System.out.println(s1.toString());//0011，println会自动调用toString()，所以Unnecessary 'toString()' call

        String str3 = new StringBuilder("java").toString();
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);//true
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);//false

    }
}
