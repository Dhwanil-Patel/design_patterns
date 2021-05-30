Single Responsibility Principle
--------------------------------

- Each class have single responsibility.
- If One class perform many operation then each have related to that class origin.
- Means that it not contain class functionality which relate with other class.
- If you have that kind of functionality then place it in another class and call it in yours.

- In wrong folder everything place in single class named FileOperations But in right they placed in saperate class.
  So, Whenever change required no need to change whole class or relavant flow.
  You just have to change in main class or add another supportive method. (Two override method one accept string another is path object)  
