package tj.piven.university.model;

import tj.piven.university.service.CommonActions;
import tj.piven.university.service.StudentActions;

public class Student implements StudentActions, CommonActions {
    private int age = 21;
    private String name = "Иванов";
    University university;
    Teacher teacher;


    @Override
     public void study() {
        System.out.println("Студент " + name + " учится в " + university.title + " y учителя " + teacher.surname);
    }

    @Override
    public void makeSport() {
        beHealthy();
        System.out.println("Студент " + name + " занимается спортом");
    }

    private void beHealthy () {
        System.out.println("Студент " + name + " здоров");
    }

    @Override
    public void haveFun() {
        makeFriends();
        System.out.println("Студент " + name + " развлекается");
    }
    private void makeFriends () {
        System.out.println("Студент " + name + " заводит друзей");
    }


    @Override
    public void writeThesis() {
        System.out.println("Студент " + name + " пишет научную работу");
    }

    @Override
    public void attendLibrary() {
        System.out.println("Студент " + name + " посещает библиотеку");
    }

    @Override
    public void haveLunch() {
        System.out.println("Студент " + name + " обедает");
    }
}
