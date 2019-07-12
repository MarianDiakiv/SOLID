package OCL;
// open closed principle
// відкритий закритий принцип
public class MainClass {
public  static void main(String[] args) {
    //System.out.println("Hello World!");
    //Toyota toyota = new Toyota();
    Celica toyota = new Celica();
    workinTaxi(toyota);
    Toyota2 toyota2 = new Toyota2();
    work(toyota2);
}
static void workinTaxi(Toyota toyota){
//    System.out.println(toyota.getPasangers());
//  зміна коду із вищого на нище оскільки змінились різновиди машин
    if (toyota instanceof Celica){ // перевірка на клас
        System.out.println(toyota.getPasanger());  // виклик одного методу
    }else {
        System.out.println(toyota.getPasangers()); // виклик методу із кількома пасажирами
    }
    // даний спосіб не правильний оскільки траба редагувати код
}
static  void work(Car  car){
    car.workInTaxi();
}
}
class Toyota{
    String getPasangers(){
        return "get many pasangers";
    }String getPasanger(){
        return "get one";
    }
}
class Celica extends Toyota{

}
// потрбно створити різновид машини яка може мати лише 1 пасажира
// створюємо інтерф car


interface  Car {
    void workInTaxi();
}
class Toyota2 implements Car{

    void getPasangets(){
        System.out.println("get many");
    }

    @Override
    public void workInTaxi() {
        getPasangets();
    }
}
class Calica2 extends Toyota2{

     void getPasanger(){
         System.out.println("get one");
     }
    @Override
    public void workInTaxi(){
        getPasanger();
    }
}
