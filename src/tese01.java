public class tese01 {
    public static void main(String[] args) {
        lx l=new lx("物联网专业");
        user u=new user(1000102111);
        user u1=new user("124552144");
        System.out.println("密码："+u1.getParsword());
        System.out.println("学号:"+u.getStuId());
        System.out.println("专业："+l.getMajor());

    }
}
