package chapter8;

 class Dispatch {
     public static void main(String[] args) {
         A2 a = new A2();
         B2 b = new B2();
         C2 c = new C2();

         A2 r;

         r = a;
         r.callme();

         r = b;
         r.callme();

         r = c;
         c.callme();

     }
}
