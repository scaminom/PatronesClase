package JoseCamino.Singletone;

public class Student implements Cloneable {
    private String name;
    private String lastName;
    private String faculty;
    private static Student student;

    private Student(String name, String lastName, String faculty) {
        this.name = name;
        this.lastName = lastName;
        this.faculty = faculty;
    }

    public static Student getSingletonInstance(String name, String lastName, String faculty) {
        if (student == null) {
            student = new Student(name, lastName, faculty);
        } else {
            System.err.println("The object is already created!");
        }
        return student;
    }

//    @Override
//    public String toString() {
//        return "Student [name=" + name + ", lastName=" + lastName + ", faculty=" + faculty + "]";
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}