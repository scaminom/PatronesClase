package JoseCamino.Singletone;

public class Main {
    public static void main(String[] args) {
        Student studentA = Student.getSingletonInstance("Daniel", "Osorio", "Facultad de ingeineria");
        System.out.println(studentA.toString());

        try {
            var studentB = (Student) studentA.clone();
            System.out.println(studentB.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
