public class Student {
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = 10*id;
        this.name=name;
    }

    private void printHello(){
        System.out.println("Hello!");
    }
}
