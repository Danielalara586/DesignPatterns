import AbstractFactory.AppleStore;
import AbstractFactory.IComputer;
import AbstractFactory.ITablet;
import AbstractFactory.SamsungStore;
import Adapter.Adapter;
import Adapter.ISQLConnection;
import Adapter.MySQLConnection;
import Adapter.MongoDBConnection;
import Builder.User;
import ChainOfResponsibility.*;
import Command.*;
import Composite.Menu;
import Decorator.*;
import Facade.Facade;
import FactoryMethod.FMPizza;
import FactoryMethod.FMPizzeria;
import Flyweight.Cloud;
import Flyweight.CloudFactory;
import Flyweight.CloudType;
import Iterator.*;
import Mediator.ChatRoom;
import Mediator.MedUser;
import Memento.MemUser;
import Observer.ObsUser;
import Observer.Product;
import Prototype.Enemy;
import Proxy.*;
import SimpleFactory.SFPizza;
import SimpleFactory.SFPizzeria;
import Singleton.DBConnection;
import State.Car;
import TemplateMethod.Admin;
import TemplateMethod.Manager;
import TemplateMethod.TempUser;
import Visitor.Apple;
import Visitor.CommonDiscount;
import Visitor.IVisitor;
import Visitor.WashingMachine;

public class DesignPatterns {
    /*
    * Design patterns -> Are solutions for a problematic
    * that occurs frequently. Comes with a description on
    * how to solve the problem with best code practices.
    *
    * There are 3 main groups:
    * creational, structural and behavior patterns.
    */

    /*CREATIONAL PATTERNS
    * Abstract factory: Gives an interface to create object
    * families without specifying a concrete class.
    *
    * Factory method: Defines an interface to create an object,
    * but lets the subclass decide which class to instantiate.
    *
    * Builder: Divides a complex object construction
    *
    * Prototype: Specifies which type of object to create using
    * a prototype instance and creates new objects based on the
    * prototype.
    *
    * Singleton: Assures that a class can only be instanced
    * once, and it also has an access point to it.
    * */

    /* STRUCTURAL PATTERNS
    * Adapter: Turns a class interface into the interface the
    * client expects.
    *
    * Bridge: Allows to decouple an abstraction from its implementation,
    * so that both can be modified independently without the need to alter the other.
    *
    * Composite: Helps to build complex objects from simpler ones and
    * similar between them, this is made thanks to a recursive composition
    * and a tree form structure.
    *
    * Decorator: Adds additional responsibilities to an object in a dynamic form.
    *
    * Facade: Allows to use complex modules in an easier and cheaper form.
    *
    * Flyweight: Allows to delete or reduce redundancy when working with
    * a lot of objects.
    *
    * Proxy: Allows to control direct access to different module areas.
    */

    /* BEHAVIOR PATTERNS
     * Chain of responsibility: Avoids coupling the sender of a request
     * to the receptor allowing more than an object the possibility to
     * attend the request. Receivers are chained and the request passes
     * through the chain until it is processed by some object.
     *
     * Command: Allows to apply for an object's operation without
     * knowing the content of the operation and facilitates the
     * methods' parameterization.
     *
     * Interpreter: Given a language, it defines a grammatical representation
     * with its interpreter to make sense in the sentences.
     *
     * Iterator: Defines an interface that declares all the needed methods
     * to access sequentially into a collection group of objects.
     *
     * Mediator: Defines an encapsulated set of interactive objects
     * as one object.
     *
     * Memento: Allows to store an object's status (or a complete system)
     * in a given moment in such a way that it can me restore in that point
     * in an easy way. It keeps store in a time instance in an independent
     * class without interfering with the encapsulation.
     *
     * Observer: Defines a one too many type of dependency, notifying
     * if an object's status has change to   all dependencies.
     *
     * State: Is used when an object's behavior changes depending on
     * its state.
     *
     * Template Method: Defines the program's algorithm in a method,
     * this is called template method which differs some steps to the
     * subclasses.
     *
     * Visitor: Represents an operation that is done over the elements
     * that conform an object's structure.
     */

     /*
      * SOLID Principles (For OOP)
      * S - Single Responsibility: A class should have
      * one and only one reason to change, meaning that
      * a class should only have one job.
      * O - Open/Closed: Objects or entities should be
      * open for extension, but close for modification.
      * L - Liskov Substitution: Let q(x) be a property
      * provable about objects of x type T. Then q(y)
      * should be provable for objects y of type S where
      * S is a subtype of T.
      * I - Interface Segregation: A client should never be
      * forced to implement an interface or depend on a
      * method that they don't use.
      * D - Dependency Inversion: Entities must depend on
      * abstraction not on concretion. It states that the
      * high level module most not depend on the low level
      * module, but they should depend on abstractions.
      *
      * Cohesion: Measurement of how much
      * a unit has a relation with itself.
      * Fat interface: where an interface has
      * more that it should.
     */

    public static void main(String[] args) {
        // Simple Factory Example
        SFPizzeria pizzeria = new SFPizzeria();
        SFPizza peperoni = pizzeria.createSmallPizza();
//        System.out.println(peperoni);

        // Factory Method Example
        FMPizzeria myPizzeria = new FMPizzeria();

        FMPizza peperoniPizza = myPizzeria.createPizza("Peperoni");
        FMPizza cheesePizza = myPizzeria.createPizza("Cheese");
        FMPizza stuffedCrustPizza = myPizzeria.createPizza("Peperoni Stuffed Crust");

//        System.out.println(peperoniPizza);
//        System.out.println(cheesePizza);
//        System.out.println(stuffedCrustPizza);

        // Abstract Factory Example
        SamsungStore samsung = new SamsungStore();
        AppleStore apple = new AppleStore();

        IComputer mac = apple.createComputer();
        ITablet ipad = apple.createTablet();

        IComputer qx = samsung.createComputer();
        ITablet s3 = samsung.createTablet();

        // Singleton
        DBConnection connection = DBConnection.getConnection();
        DBConnection connection2 = DBConnection.getConnection();
        DBConnection connection3 = DBConnection.getConnection();

        connection.host = "localhost";

//        System.out.println(connection.host);
//        System.out.println(connection2.host);
//        System.out.println(connection3.host);


        // Concurrent Singleton
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                DBConnection dbConnection = DBConnection.getConnection();
                System.out.println(dbConnection.hashCode());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                DBConnection dbConnection = DBConnection.getConnection();
                System.out.println(dbConnection.hashCode());
            }
        });

//        thread1.start();
//        thread2.start();

        // Builder Example
        User cody = User.Make("Cody", "Facilito")
                .setContactMedia(true)
                .setPhone("445564345")
                .setAddress("Mexico")
                .setEmail("info@codigofacilito.com")
                .setPaymentMethod("paypal")
                .setToken("@12345")
                .Build();

//        System.out.println(cody);

        // Prototype example

        // Build with a constructor
        Enemy baseEnemy = new Enemy("enemy.png", 0, 50, 2);
        Enemy enemy01 = new Enemy(baseEnemy);
        Enemy enemy02 = new Enemy(baseEnemy);
        Enemy enemy03 = new Enemy(baseEnemy);

        enemy01.setX(50);
        enemy02.setX(100);
        enemy03.setX(150);


        // Build with instance method "clone"
        Enemy baseEnemy02 =  new Enemy("enemy2.png", 0, 100, 2);
        Enemy enemy04 = baseEnemy02.clone();
        Enemy enemy05 = baseEnemy02.clone();
        Enemy enemy06 = baseEnemy02.clone();

        enemy04.setX(50);
        enemy05.setX(100);
        enemy06.setX(150);

//        System.out.println(enemy04);

        // Adapter example
        ISQLConnection dbConnection = new Adapter(new MongoDBConnection());
//        dbConnection.connection();

        String result = dbConnection.runQuery();
//        System.out.println(result);

        // Composite Example
        Menu menu = new Menu();
        Menu menu2 = new Menu();
        Menu menu3 = new Menu();
        Menu menu4 = new Menu();
        Menu menu5 = new Menu();

        menu.addMenu(menu2);
        menu.addMenu(menu3);

        menu3.addMenu(menu4);
        menu3.addMenu(menu5);
//
//        menu.open();
//        menu.close();

        // Decorator Example
        IDPizza pizzaPep = new ExtraCheese(new PeperoniPizza());
//        System.out.println(pizzaPep.description());
//        System.out.println(pizzaPep.price());
        IDPizza pizzaChes = new ExtraCheese(new StuffedCrust(new CheesePizza()));
//        System.out.println(pizzaChes.description());
//        System.out.println(pizzaChes.price());

        // Facade Example
        Facade computerFacade = new Facade();
//        computerFacade.turnOn();

        // Proxy Example (Virtual Proxy)
        ProxyUser proxyUser = new ProxyUser(5);
        IService service = new Proxy(proxyUser);
//        service.write();
//        service.read();
//        service.update();
//        service.delete();

        // Flyweight Example
        CloudFactory factory = new CloudFactory();

        for (int i = 0; i < 100; i++) {
            Cloud cloud = factory.getCloud(CloudType.Small);
        }

        for (int i = 0; i < 200; i++) {
            Cloud cloud = factory.getCloud(CloudType.Medium);
        }

        for (int i = 0; i < 300; i++) {
            Cloud cloud = factory.getCloud(CloudType.Big);
        }

//        System.out.println(factory.countClouds());

        // Chain of Responsibility Example
        Transaction transaction = new Transaction(100, 200, TransactionType.Refund);
        IManager deposit = new Deposit();
        IManager withdrawal = new Withdrawal();
        IManager refund = new Refund();

        deposit.nextManager(withdrawal);
        withdrawal.nextManager(refund);

//        deposit.executeTransaction(transaction);

        // Command Example
        IDevice tv = new TV();
        ICommand on = new OnDevice(tv);
        ICommand off = new OffDevice(tv);

//        on.operation();
//        off.operation();

        // Iterator Example
        TelephonicGuide guide = new TelephonicGuide();
        guide.add("123");
        guide.add("523");
        guide.add("612");
        guide.add("875");

        Iterator iterator = new IteratorGuide(guide);
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        // Mediator Example
        MedUser dani = new MedUser("Dani");
        MedUser ponce = new MedUser("Ponce");

        ChatRoom chatRoom = new ChatRoom();
        chatRoom.addParticipant(dani);
        chatRoom.addParticipant(ponce);

//        chatRoom.sendMessage(dani, ponce, "Love U! <3");
//        chatRoom.sendMessage(ponce, dani, "Love U 2! <3");

        // Memento Example
        MemUser user = new MemUser("Cody", 6);
        MemUser memento = user.getMemento();

        user.setName("new name");
        user.setAge(22);

//        System.out.println(user.getName());
//        System.out.println(user.getAge());

        user.restartMemento(memento);
//
//        System.out.println(user.getName());
//        System.out.println(user.getAge());

        // Observer Example
        Product avocado = new Product(10);
        ObsUser user1 = new ObsUser();
        ObsUser user2 = new ObsUser();

        avocado.addObserver(user1);
        avocado.addObserver(user2);

//        avocado.sales();

        // State Example
        Car car = new Car();
//        car.drive();
//        car.turnOff();
//        car.drive();
//        car.turnOn();
//        car.turnOn();
//        car.drive();
//        car.drive();
//        car.turnOff();

        // Template Method Example
        TempUser manager = new Manager();
        TempUser admin = new Admin();

        manager.auth();
//        ((Manager) manager).workMethod();

        admin.auth();
//        ((Admin) admin).workMethod();

        // Visitor Example
        Apple apple1 = new Apple();
        WashingMachine washingMachine = new WashingMachine();

        IVisitor discount = new CommonDiscount();

        System.out.println(apple1.applyDiscount(discount));

    }



}
