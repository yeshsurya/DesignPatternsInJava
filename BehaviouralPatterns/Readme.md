<h1>Memento Design Pattern</h1>
<p>There are three entities involved, a.Originator b. Memento c. Caretaker
Originator is the application in context for which we take a snapshot. The snapshot taken on Originator is called “memento”. All these operations taken on “Originator” like taking snapshot, storing it and restoring snapshot on to the originator is done by an entity called “Caretaker”.
</p>
</br>
<h1>Observer Design Pattern
</h1>
<p>The client class will have the list of objects which will have to be notified on an event. Publisher will call the methods which are registered on occurrence of an event. 
</p>
</br>
<h1>Strategy Design Pattern</h1>
<p>In computer programming, the strategy pattern (also known as the policy pattern) is a software design pattern that enables an algorithm’s behavior to be selected at runtime. 
The strategy pattern defines a family of algorithms, encapsulates each algorithm, and makes the algorithms interchangeable within that family.
</p>
</br>
<h1>Template Method Design Pattern</h1>
<p>There will be abstract class which will be inherited by many other classes. The concrete objects of this classes will be used/consumed. The method called template will be defined in base class itself but it’ll internally call other abstract methods which are in the same base class itself. The child classes which inherit will give their own definition of the abstract methods.Here we see polymorphism within a particular template of a method. </p>
</br>
<h1>Balking Design Pattern</h1>
<p>The balking pattern is a software design pattern that only executes an action on an object when the object is in a particular state. For example, if an object reads ZIP files and a calling method invokes a get method on the object when the ZIP file is not open, the object would "balk" at the request. </p>
</br>
<h1>State Design Pattern</h1> 
<p>The state pattern in Java is a behavioural software design pattern that allows an object to alter its behaviour when its internal state changes. The state design pattern is generally used in cases where an object depends on its state and its behavior must be changed during run time depending on its internal state.</p>
