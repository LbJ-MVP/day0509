public class Student {
    String name;//定义成员变量，通过.访问
    //先 成员变量初始化（可赋值），再执行构造方法
    Student(){//定义了构造方法后，原有的默认构造（内容为空），在反编译文件（字节码.class文件转换为代码）中就没有了
        name = "初始名字";
    }
    Student(String str){
        name = str;
    }
    Student(String name,String name2){//名称冲突，java优先选择形参定义的变量，而不是成员变量
        //当名称冲突时，即形参name与成员变量name相同，通过this指代当前创建的对象，this.name就是成员变量
        this.name=name;//this只能用于指代当前对象的内容，只有属于对象拥有的部分才能使用this，
                       // ——>只能在类的成员方法中使用this，不能唉static静态方法中使用this
        System.out.println("姓名:"+this.name);
        this.name=name2;
        System.out.println("爱称:"+this.name);
    }

}
