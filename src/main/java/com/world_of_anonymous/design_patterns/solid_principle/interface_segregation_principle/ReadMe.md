Interface Segregation Principle
--------------------------------

- First principle which applied on interface instead of class.
- Many client base interface instead of one common interface.
- Don't force client to implement those method of interface which he doesn't needed.
- If there is one common interface and it modify the classes which implemented those class.
  have to change. 
- In such case we have to recompile them also. So separation them in interfaces.
- E.g. Hotel menu differentiate in various parts. 
  So if some addition taken place no need to change whole menu just need to change those portion or page.
- E.g. Payment Class is created earlier when just online payment exists. 
  Relevant interface and classes are there.
  But now client need Cash payment functionality. Existed interface contain payment value and save credit card methods.
  In our case this interface getting violated because no credit card info is there. 
- Exception : wrong
  In Payment there is not credit card details still method load. And if anyone try to access it gets an error.
