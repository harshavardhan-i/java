* Abstract classes allow us to design general functionality of the class and methods without defining it
* A class that has abstract methods must be declared abstract as well
* Classes extending abstarct class must implement every abstract method, exception being when the extending class is abstract itself
* Abstract classes cannot be instantiated(since there is no method definition) 
* 'abstract' is a modifier
* Abstract methods has no implementation
* Abstract methods cannot have private, static and final as modifiers as doing so will restrict them from being overridden.
* Main rule: a class may become concrete (non-abstract), as long as all abstract methods in its hierarchy have a corresponding concrete implementation.