Dependency Inversion Principle
------------------------------- 

- High level policy not depends on low level details.
- Depends upon abstraction / interface rather then concrete classes.
- Cause : Class is depends on concrete classes not on interface or abstraction.
- Underline mechanism for other principle.
- E.g. Credit card swaping machine. You're not aware about provider company object and series.
  Machine contain interface of amount processing. Based on input it initialize relevant object and call the method of that provided company's method.
- Limitation :
  Main class linked with child class.
  Based on input it check if else statement and call object of that class & perform action.
  - In case of new class added if statement add which make code polluted.
  - Be monolithic not modular.
  - If new function added you have to change actual class and retest all the classes and application.

- Wrong : 
  - High level policy (SQLDB2Gateway object) depends on low level details(updateDB method).
  - Depends on concrete classes instead of abstraction / interface.
  - If emailGateway or database need change. In such way whole configuration change because it's tightly couple and test well.
  - Add new requirement conditions.
  - Tightly coupled
- 
   
