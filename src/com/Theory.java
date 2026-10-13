package com;

public class Theory {
	
	
	/*
	  
	  Constructor chaining
	  1) one constructor calling another constructor
	  2) It can be achieved only in case of constructor overloading
	  3) Chaining cab be done in two ways
	     1) Constructor chaining in same class can be achieved using this calling statement ie is this()
         2) in another class can be done using super calling statement ie is super() 
            and IS-A relationship
      4) this() and super() always be the first executable line within the constructor,  
         and it means we should write it in first line within the constructor    
         
      Note  
      1) Recursive chaining is not possible, if there are n constructors then we can have 
         maximum of n-1 calling statements
      2) super() is used to invoke or call constructor of another class
      
      super() happen in 2 ways
      
      1) implicitly -
         when we create an object of a class and if that class has a super class and if that super 
         class has non parameterized constructor, then the subclass constructor will invoke 
         the super class constructor implicitly
         
      2) Explicitly - 
         when we create an object of a class and if that class has a super class and if that super  
         class has parameterized constructor, then the sub class constructor should invoke  
         the super class constructor explicitly. if we not explicitly invoke the constructor 
         then we get compile time error.
      
         	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */

}
