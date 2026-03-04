mkdir Lab1 public class Lab1 {

    public static void main(String[] args) {

        // -----------------------------
        // 1. Робота з 10 цілими числами
        // -----------------------------

        int a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5;
        int a6 = 6, a7 = 7, a8 = 8, a9 = 9, a10 = 10;

        int sum = a1+a2+a3+a4+a5+a6+a7+a8+a9+a10;
        int sub = a1-a2-a3-a4-a5-a6-a7-a8-a9-a10;
        int mul = a1*a2*a3*a4*a5*a6*a7*a8*a9*a10;
        int div = a10/a1; // приклад ділення

        System.out.println("Сума = " + sum);
        System.out.println("Віднімання = " + sub);
        System.out.println("Множення = " + mul);
        System.out.println("Ділення = " + div);


        // -----------------------------
        // 2. Речення з 10 слів
        // -----------------------------

        String w1="Я";
        String w2="навчаюсь";
        String w3="в";
        String w4="університеті";
        String w5="та";
        String w6="вивчаю";
        String w7="мову";
        String w8="програмування";
        String w9="Java";
        String w10="сьогодні";

        System.out.println(w1+" "+w2+" "+w3+" "+w4+" "+w5+" "+
                           w6+" "+w7+" "+w8+" "+w9+" "+w10);


        // -----------------------------
        // 3. Клас User
        // -----------------------------

        User u1 = new User(1,20,"Іван","Петренко",70,1.75);
        User u2 = new User(2,21,"Олег","Іваненко",75,1.80);
        User u3 = new User(3,22,"Андрій","Коваль",68,1.72);
        User u4 = new User(4,23,"Максим","Шевченко",85,1.85);
        User u5 = new User(5,19,"Юрій","Бойко",60,1.68);
        User u6 = new User(6,24,"Петро","Сидоренко",90,1.90);
        User u7 = new User(7,20,"Микола","Левченко",73,1.78);
        User u8 = new User(8,21,"Василь","Мельник",77,1.82);
        User u9 = new User(9,22,"Дмитро","Кравець",69,1.74);
        User u10 = new User(10,23,"Роман","Гнатюк",80,1.88);

        int totalAge = u1.age+u2.age+u3.age+u4.age+u5.age+
                       u6.age+u7.age+u8.age+u9.age+u10.age;

        double totalWeight = u1.weight+u2.weight+u3.weight+u4.weight+u5.weight+
                             u6.weight+u7.weight+u8.weight+u9.weight+u10.weight;

        double totalHeight = u1.height+u2.height+u3.height+u4.height+u5.height+
                             u6.height+u7.height+u8.height+u9.height+u10.height;

        System.out.println("Сума віку = " + totalAge);
        System.out.println("Сума ваги = " + totalWeight);
        System.out.println("Сума зросту = " + totalHeight);


        // -----------------------------
        // 4. Клас Car
        // -----------------------------

        Car c1 = new Car(150,2.0,"BMW","Black",2020,"Petrol",200000,true);
        Car c2 = new Car(180,2.5,"Audi","White",2021,"Diesel",250000,false);
        Car c3 = new Car(120,1.6,"Toyota","Red",2019,"Petrol",180000,true);
        Car c4 = new Car(200,3.0,"Mercedes","Blue",2022,"Diesel",300000,true);
        Car c5 = new Car(110,1.4,"Ford","Gray",2018,"Petrol",150000,false);
        Car c6 = new Car(140,1.8,"Honda","Silver",2017,"Petrol",170000,true);
        Car c7 = new Car(160,2.2,"Mazda","Black",2020,"Diesel",220000,true);
        Car c8 = new Car(130,1.5,"Kia","Green",2019,"Petrol",160000,false);
        Car c9 = new Car(210,3.5,"Lexus","White",2023,"Hybrid",400000,true);
        Car c10 = new Car(100,1.2,"Skoda","Blue",2016,"Petrol",140000,false);

        double totalEngine = c1.engine+c2.engine+c3.engine+c4.engine+c5.engine+
                             c6.engine+c7.engine+c8.engine+c9.engine+c10.engine;

        int totalPower = c1.power+c2.power+c3.power+c4.power+c5.power+
                         c6.power+c7.power+c8.power+c9.power+c10.power;

        System.out.println("Сума об'єму двигунів = " + totalEngine);
        System.out.println("Сума потужностей = " + totalPower);


        // -----------------------------
        // 5. Реверс числа
        // -----------------------------

        int number = 412;
        int reversed = (number % 10) * 100 +
                       ((number / 10) % 10) * 10 +
                       (number / 100);

        System.out.println("Реверс числа 412 = " + reversed);
    }
}


// ===== Клас User =====

class User {
    int id;
    int age;
    String name;
    String surname;
    double weight;
    double height;

    public User(int id,int age,String name,String surname,double weight,double height){
        this.id=id;
        this.age=age;
        this.name=name;
        this.surname=surname;
        this.weight=weight;
        this.height=height;
    }
}


// ===== Клас Car =====

class Car {
    int power;
    double engine;
    String brand;
    String color;
    int year;
    String fuel;
    double price;
    boolean automatic;

    public Car(int power,double engine,String brand,String color,
               int year,String fuel,double price,boolean automatic){
        this.power=power;
        this.engine=engine;
        this.brand=brand;
        this.color=color;
        this.year=year;
        this.fuel=fuel;
        this.price=price;
        this.automatic=automatic;
    }
}