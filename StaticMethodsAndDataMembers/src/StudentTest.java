//********IMPORTANT NOTES***********************
//OBJECTIVES    > Create a class Student with members name, age, a boolean studentAtSchool.
//              > Ensure that the boolean studentAtSchool belongs to the class.
//              > These data members must not be accessed directly, only through getters.
//              > Display if all students are at school or not.
//
//TAKEAWAYS     > Non-static methods can access static variables.
//              > Static variables are shared by all instances.
//              > Static methods cannot access non-static variables.
//              > Non-static variables belong to each unique object.


class Student{
    private String name;
    private int age;
    private static boolean studentAtSchool;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    Student(){}

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    //These (setters) member functions are meant for instantiated objs
    //static variables do not need setters
    //*********************GETTERS**********************************************
    public static boolean isStudentAtSchool() {
        return studentAtSchool;
    }
    public static void setStudentAtSchool(boolean studentAtSchool) {
        Student.studentAtSchool = studentAtSchool;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public static void printIsStudentAtSchool() {//method belongs to a class
        System.out.println("All students are"+(studentAtSchool?" at School":" not at School"));
    }
}

public class StudentTest{
    public static void main(String[] args) {
        Student.setStudentAtSchool(false);
        Student s1 = new Student("Roli",27);
        Student s2 = new Student("John",21);
        System.out.println("Student "+s1.getName()+ " age "+s1.getAge()+(Student.isStudentAtSchool()?" is at School":" is not at School"));
        System.out.println("Student "+s2.getName()+" age "+s2.getAge()+(Student.isStudentAtSchool()?" is at School":" is not at School"));
        Student.printIsStudentAtSchool();
    }
}
