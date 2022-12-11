import com.sun.jdi.Value;

public class Main {
   public static  void main (String[] args) {
       creatObject("Mercedec");
       creatObject("Tractor");
       creatObject("Limousine");
       creatObject("Limousine");


       }



       private static Car creatObject (String ModelName) {
           switch (ModelName) {
               case "Tractor":
                   Tractor tractor = new Tractor(2000, "BigBos", "Boss");
                   tractor.print();
                   break;

               case "Limousine":
                   Limousine limousine = new Limousine(2005, "Siri",7);
                   limousine.print();
                   break;

               case "Mercedec":
                   Mercedec mercedec = new Mercedec(2012, "Pico", 2.44);
                   mercedec.print();
                   break;

           }
                   return null;
           }
   }














//        a) Доделать все пункты практического задания из презентации.
//        b) Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
//        c) Создать Интерфейс Printable с методом void print();
//        d) Реализовать интерфейс Printable классами 2й, 3й и 4й, переопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.
//        e) В классе Main создать возвращаемый метод createObject
//        (String className), который умеет создавать объекты класса
//        2й, 3й и 4й и после создания и задания свойств объекту метод
//
//        возвращает ссылку на объект (пульт). Можно использовать
//        switch для того чтоб определить какого типа нужно создать
//        экземпляр объекта. Например если в параметре передается “
//        2й” метод должен создать объект именно этого типа.
//        f) В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createOcject, и распечатать по ним информацию методом print();