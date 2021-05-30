Liskov Substitution Principle
------------------------------

- Subtypes must be substitutable for their base type.
- Parent class must be easily substitutable with their child class without blowing up the application.
- In simple word, 
  Parent class object able to replace with any of the child class.
  Parent class object initialize with all child class one by one, and common method has been call by by any of the child no one can generate the error. 
- E.g. Wrong - Liskov principle violation
  calculate salary thrown exception when commission salary object pass.
- E.g. Right - 
  Manage interface
  Link interface using extends based on required functionality.
  Implement relevant interface in defined classes.
