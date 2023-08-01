package tj.piven.university._main;

import tj.piven.university.model.Student;
import tj.piven.university.model.Teacher;

public class _Main {
    public static void main (String [] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.study();
        student.makeSport();
        student.haveFun();
        student.writeThesis();
        student.attendLibrary();
        student.haveLunch();

        teacher.teach();
        teacher.writeBooks();
        teacher.participateInMeetings();
        teacher.writeThesis();
        teacher.attendLibrary();
        teacher.haveLunch();






    }
}
