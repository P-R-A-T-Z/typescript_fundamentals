public class Check {
    void m1(){
        System.out.println("in m1 Check");
    }
}
class checklist extends Check{
    void m1(){
        System.out.println("in m1 checklist");

    }
    checklist(Check check){
        if(check!=null){
            synchronized (Check.class){}
        }

    }
    public static void main(String args[]){
        Check a=new Check();
         checklist b=new checklist(new Check());
        Check c=new checklist(new Check());
        System.out.println(c);
        a.m1();
        b.m1();
        c.m1();
    }

}
