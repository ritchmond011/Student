public class Student {
    
    private String name;
    private int age;

    public Student() {
        name = "No name yet.";
        age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student student = new Student("Ivan", 21);
    }
}