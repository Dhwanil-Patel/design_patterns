**_Creational Design Pattern_**
---------------------------------
    
  - Creational Design Pattern used to create variable in verity of phases.
    
    **Singleton Design Pattern :**
    - When you wants to create just single instance of object in whole JDK.
    - Private object, Private Constructor, Serializable Interface, SerializableVersionUID, Extra class with single object of main class, 
      Access object using getInstance(), readResolve()
    
    **Prototype Design Pattern :**
    - Complex object creation process like create object using server data or some database is time consuming and costly.
      Suppose various user call for same data then this process becoming repetitive, lengthy and unnecessary.    
      So in such situation we use Prototype Pattern which works on fundamental of cloning.
      
    **Factory Design Pattern :**
    - Interface contain common method which implemented by various class.
    - Main factory method contain all the objects of all those classes, It return relevant object based on some condition match.
    - Main method call this factory method
    - If object creation code is spread in the whole application, and if you need to change the process of object creation then you need to go in each 
      and every place to make necessary changes. After finishing this article, while writing your application, consider using the Java factory pattern.
    - loose coupling between classes which is the most important principle. 
    
    **Builder Design Pattern :**
    - Builder pattern aims to “Separate the construction of a complex object from its representation 
      so that the same construction process can create different representations.
    - The builder pattern is a design pattern that allows for the step-by-step creation of complex objects using the correct sequence of actions. 
      The construction is controlled by a director object that only needs to know the type of object it is to create.
    - Conclusion : Bind immutable object in single phase is difficult so instead of create whole object in single glance. Create it based on data avability.
      In short, Instead of define various constructor, Use builder class which create immutable object based on inputted variable. No need for saprate constructor
      and require all data.
    - Major Example : String builder's append() method
    
    **Advance Factory Design Pattern :**
    - Abstract factory pattern is yet another creational design pattern and is considered as another layer of abstraction over factory pattern.
    - In other word, It's kind of Nested Factory method.
    - CarFactory call locationBaseCarFactory and that class deal with actual process.

  - The only big difference between this builder pattern and abstract factory pattern is that, builder provides you more control over the object creation process 
    and that’s it.
         
**_Structural Design Pattern_**
---------------------------------
    
  - Structural Design Pattern used to 
    
    **Adepter Design Pattern :**
    - Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together. 
      The object, that joins these unrelated interfaces, is called an Adapter.
      
    **Bridge Design Pattern :** (?)
    - Decouple an abstraction from its implementation so that the two can vary independently.
    - Bridge design pattern is used to decouple a class into two parts – abstraction and it’s implementation – 
      so that both can evolve in future without affecting each other. It increases the loose coupling between class abstraction and it’s implementation.
    - You get this decoupling by adding one more redirection between methods calls from abstraction to implementation.
    - Bridge is a synonym for the “handle/body” idiom. This is a design mechanism that encapsulates an implementation class inside of an interface class. 
      The former is the body, and the latter is the handle. The handle is viewed by the user as the actual class, but the work is done in the body.
    - In other words, Separate definition and implementation by interface. In such cases instead of direct communication. Encapsulate object of one class in 
      Other class's implementation portion with help of their interface instead of implementation. Like nested Abstraction and Encapsulation.
    - Without,
      Shape
      |_Rectangle
        |_BlueRectangle
        |_RedRectangle
      |_Circle
        |_BlueRectangle
        |_RedRectangle
        
    - With,
      Shape
      |_Rectangle(Color)
      |_Circle(Color)
      
      Color
      |_Blue
      |_Red
      
    **Composite Design Pattern :**
    - Composite design pattern compose objects into tree structures to represent whole-part hierarchies. 
      Composite lets clients treat individual objects and compositions of objects uniformly.
    - hierarchical structure and needs generic functionality, aggregate data across a hierarchy,  treat composite and individual objects uniformly.
    - Iterator, Visitor and Flyweight Design Pattern also be a part with Composite Design Pattern.
    
    - In other words, This pattern used when your data is tree like formation. node which contain objects and parent node which contain child then this method used.
      Parent method is component which contain list of child and other operation related to that. Where as Child or leaf node contain only data.
    - Component                         <---|              <---|
                                            ^                  ^
      |_CompositeAccount     -------------->|              <---|
                                                               ^
      |_AccountStatement     --------------------------------->|
    
    **Decorator Design Pattern :**
    - Decorator design pattern is used to add additional features or behaviors to a particular instance of a class, while not modifying the other instances of same class. 
    - Decorators provide a flexible alternative to sub-classing for extending functionality. Please note that the description above implies that decorating an object changes 
      its behavior but not its interface.
    -   
    
    **Facade Design Pattern :**
    - Facade design pattern provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
    - The facade pattern is appropriate when we have a complex system that we want to expose to clients in a simplified way.
    - Facade also decouples the code that uses the system from the details of the subsystems, making it easier to modify the system later.
    - Example, PC startup : After press button you doesn't have idea how hardware and software configure and load OS.
               DB connection : You just place connection.create() but don't have idea how they connect what driver required pool size and etc param.
    
    **Flyweight Design Pattern :**
        - flyweight design pattern enables use sharing of objects to support large numbers of fine-grained objects efficiently. 
          A flyweight is a shared object that can be used in multiple contexts simultaneously. The flyweight acts as an independent object in each context.
        - When we need a large number of similar objects that are unique in terms of only a few parameters and most of the stuffs are common in general.
        - Intrinsic Attribute : Fixed or common value containing variable for all
          Extrinsic Attribute : Changeable or Dynamic value containing variable
        - Example : Real world : Pen, Common image used in verity of place with different size.
                    Program Oriented : java.lang.String
                        
        - FlywayFactory  --------------------------------
                                                        |
                                             ---------------------------
                                                    FlyWeight
                                             ---------------------------
                                                    Intrinsic
                                                Operation(Extrinsic)
                                             ---------------------------
                                                        |                        
          Client         --------------------------------

    **Proxy Design Pattern :**
        - A proxy object provide a surrogate or placeholder for another object to control access to it. 
          A proxy is basically a substitute for an intended object which we create due to many reasons e.g. security reasons or cost associated with creating fully initialized original object.
        - A proxy object hides the original object and control access to it. We can use proxy when we may want to use a class that can perform as an interface to something else.
        - Usage : In hibernate Lazy loading, Place additional security around actual object, Network security
        - Type : Remote Proxy, Virtual Proxy, Protection Proxy, Smart Proxy
        - Decorators focus on adding responsibilities, but proxies focus on controlling the access to an object.    
    
**_Behavioural Design Pattern_**
---------------------------------
    
  - Design patterns that identify common communication patterns between objects. 

    **Visitor Design Pattern :**
    - A proxy object provide a surrogate or placeholder for another object to control access to it. 
    - Design patterns that identify common communication patterns between objects.
    
    **Observer Design Pattern :**
    - Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. 
      It is also referred to as the publish-subscribe pattern.
    - Objects're loosely coupled.
    - Real world examples : Social Media (Get notification / unsubscribe), Application update notification, Mouse / Keyboard event base notification
    
    **State Design Pattern :**
    - A State allows an object to alter its behavior when its internal state changes.
    - The state pattern solves problems where an object should change its behavior when its internal state changes. 
      Also, adding new states should not affect the behavior of existing states.
    - Separate concrete class per possible state of an object. 
    - Each concrete state object will have logic to accept or reject a state transition request based on it’s present state and context information passed to it as method arguments.
    - Real world examples : TV - On / Off buttons, Machine process, Thread state
    - The strategy pattern provides a better alternative to subclassing, while in state pattern – behavior is encapsulated in separate classes.
      Yet both promote the composition and the delegation over inheritance. 
      
    **Strategy Design Pattern :**
    - Strategy pattern enables a client code to choose from a family of related but different algorithms and gives it a simple way to choose any of the algorithm in runtime 
      depending on the client context.
    - The important point is that these implementations are interchangeable – based on task a implementation may be picked without disturbing the application workflow.
    - This pattern is based on Open/closed principle. We don’t need to modify the context [closed for modification], but can choose and add any implementation [open for extension].
    - In Strategy pattern, we first create an abstraction of algorithm. This is an interface having the abstract operation. 
      Then we create implementations of this abstraction and these are called strategies.
      A client will always call the abstraction, and will pass a context object. This context object will decide which strategy to use.
