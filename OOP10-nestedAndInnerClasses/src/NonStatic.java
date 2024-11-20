public class NonStatic {
    private int a = 10;

    public class Inner{
        int a = 1;

        public void kos(){
            System.out.println(a);
            System.out.println(this.a);
        }
        public void kosIki(){
            System.out.println(a);
            System.out.println(this.a);
            Inner i = new Inner();
            System.out.println(i.a);
        }
    }
}
