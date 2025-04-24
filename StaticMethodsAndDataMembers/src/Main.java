class Student{
    String name;
    int age;
    static boolean studentAtSchool;
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

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student.studentAtSchool = true;
        Student s1 = new Student("Roli",27);
        Student s2 = new Student("John",21);
        System.out.println("Student "+s1.name+ " age "+s1.age+(Student.studentAtSchool?" is at School":" is not at School"));
        System.out.println("Student "+s2.name+" age "+s2.age+(Student.studentAtSchool?" is at School":" is not at School"));
    }
}
