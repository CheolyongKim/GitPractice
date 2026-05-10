public class Student {
    private int id;
    private String name;

    public Student(){
        this(100, "John");
    }

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
}
