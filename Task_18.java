class Student{
    
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    void showResult() {
        System.out.println("Student Name: " + name + ", Marks: " + marks);
    }
}
class Task_18 {
    public static void main(String[] args) {
        Student student1 = new Student("Bhargo", 85.5);
        Student student2 = new Student("Yogeswari", 92.0);

        student1.showResult();
        student2.showResult();
    }
}