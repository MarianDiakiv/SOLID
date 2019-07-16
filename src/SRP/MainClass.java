package SRP;
/*
* Принцип єдиного обов'язку (англ. Single Responsibility Principle, SRP)
* */
public class MainClass {
    public static void main(String[] args){

    }
}
interface Employee{
    int getsalary();
}
class Cook implements Employee{
    @Override
    public int getsalary() {
        return 0;
    }
    void cook(){}
}
class Janitor implements Employee{
    @Override
    public int getsalary() {
        return 0;
    }
    void cleanFloor(){

    }
    class EmployeeFacade{
        Cook cook = new Cook();
        Janitor janitor = new Janitor();
        void cooks(){
            cook.cook();
        }
        void clean(){
            janitor.cleanFloor();
        }
    }
}
