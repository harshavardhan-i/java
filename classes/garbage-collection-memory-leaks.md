### Memory Leaks
 * When method is excuted and done frame pops off the stack/falls out of scope and what remains is objects within the heap. 
 * There's no way of accessing objects of the popped off frame
 * This causes waste of space aka **memory leak**
 * Java Runtime Environment handles memory, it looks for dereferenced objcets and removes it from the heap

 ### Garbage collection
 * The process of removing dereferenced objects within heap
 * System.gc() - It hits the garbage collector, it might and might not run 
 * We can dereference explicitly by assigning null to the variable