package ISP;

public class MainClass {
    //Принцип розділення інтерфейсу (англ. Interface Segregation Principle, ISP)
    //  клієнти не повинені залежити від методів які вони реалізовують
    public  static void main(String[] args){

        IWorker iWorker = new Cook();
        iWorker.work();
        iWorker.eat();
        //IWorker worker = new

    }
}
interface Worker{
    void work();
}
interface Eater{
    void eat();
        }
interface IWorker extends Worker, Eater{

}
class Cook implements IWorker{

    public Cook() {
    }

    @Override
    public void work() {
        System.out.println("WORK");
    }

    @Override
    public void eat() {
        System.out.println("EAT");
    }
}

