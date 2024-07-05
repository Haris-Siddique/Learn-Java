package OOP.InnerClass;

public class TestClass {

    private int age;
   

    private class InnerClass{
        private String name;

        public InnerClass(String name){
            this.name=name;
        }

        private void Printage(){
            System.out.println(age);
        }
    }

}
