**_Creational Design Pattern_**
    
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
      
    
**_Behavioural Design Pattern_**

