public class finalize {

    public static void main(String[] args) {
        int say = 10;
        say=15;

        final int say2 =30;
       // say2 = 35;


    }

}

class MyClass{
    public void see(){
        System.out.println("goster");
    }
}
class MyChild extends MyClass{
    @Override
    public void see() {
        super.see();
    }
}
