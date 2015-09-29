# CS201_RecursiveQueue

by Alex Olson, Spring 2015

In this assignment I implemented a queue of strings recursively. Specifically I created a class called RQueue<E> that impelemented the interface QueueInt<E>. The idea is that a queue can be thought of as a data structure containing a front, a back, and a queue within. For example, if my queue contained the Strings "first", "second", and "third" (offered in that order), I can think of that as a queue whose front is "first", whose rear is "third", and whose inside is another queue containing all of the inside values (which, in this case, is just "second"). In order to create a complete implementation, I needed to consider the special cases regarding when the queue is empty, has one item, and so on.
