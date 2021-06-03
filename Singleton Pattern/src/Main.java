public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s);
        System.out.println(s.getName());
        s.setName("Aman");
        System.out.println(s.getName());
//        Confirming if other instaces are same 
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
    }
}
