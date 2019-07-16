package DIP;

public class MainClass {
    /*
Принцип інве́рсії зале́жностей (англ. Dependency Inversion Principle, DIP) — один з п'яти SOLID-принципів об'єктно-орієнтованого проектування програм,суть якого полягає у розриві зв'язності між програмними модулями вищого та нижчого рівнів за допомогою спільних абстракцій.
Принцип формулюється наступним чином:
Модулі вищого рівня не повинні залежати від модулів нижчого рівня. Обидва типи модулів повинні залежати від абстракцій.
Абстракції не повинні залежати від деталей реалізації. Деталі реалізації повинні залежати від абстракцій.
    *
    * */
    public  static void main(String[] args) {}
}
interface DAO{
    void execute();
}
class DataAccess implements DAO {
    @Override
    public void execute() {
        System.out.println("Execute");
    }
}
class Client {
    DAO dataAccess = new DataAccess();
    void doJob(){
        dataAccess.execute();
    }
}
