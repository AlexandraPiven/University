package tj.piven.university.model;

import tj.piven.university.service.TeacherActions;
import tj.piven.university.service.CommonActions;


public class Teacher implements TeacherActions, CommonActions {

    public String surname = "Петров";
    Student student;
    University university;

    @Override
    public void teach() {
        System.out.println("Учитель " + surname + " преподает студенту " + " в университете ");
    }

    @Override
    public void writeBooks() {
        System.out.println("Учитель " + surname + " пишет книгу ");
    }

    @Override
    public void participateInMeetings() {
        System.out.println("Учитель " + surname + " участвует на собрании ");
    }


    @Override
    public void writeThesis() {
        System.out.println("Учитель " + surname + "пишет научную работу совместно со студентом ");
    }

    @Override
    public void attendLibrary() {
        System.out.println("Учитель " + surname + " посещает библиотеку");
    }

    @Override
    public void haveLunch() {
        System.out.println("Учитель " + surname + " обедает");
    }
}

