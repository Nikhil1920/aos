# Implementation of dining philosopher in java
## Given problem statement
Five silent philosophers sit at a table around a bowl of spaghetti. A 
fork is placed between each pair of adjacent philosophers. (An 
alternative problem formulation uses rice and chopsticks instead of 
spaghetti and forks.)

Each philosopher must alternately think and eat. However, a philosopher 
can only eat spaghetti when he has both left and right forks. Each fork 
can be held by only one philosopher and so a philosopher can use the fork 
only if it's not being used by another philosopher. After he finishes
eating, he needs to put down both forks so they become available to 
others. A philosopher can grab the fork on his right or the one on his 
left as they become available, but can't start eating before getting both 
of them.

Eating is not limited by the amount of spaghetti left: assume an infinite 
supply. The problem is how to design a discipline of behavior (a 
concurrent algorithm) such that each philosopher won't starve; i.e., can 
forever continue to alternate between eating and thinking assuming that 
any philosopher cannot know when others may want to eat or think.

## Documentation
Class: Dine - it has a main method.\
Class: Philosopher - represent the philosopher, it contains the two 
objects to represent the chopisticks.

Methods\
eat - called when enter for eating.\
think - called when enter for thinking.\
run - overriden method for Thread class.

Class: Chopstick - represent if chopistick is available.\
Methods\
take - called when before occupied.\
release - called when philosopher starts thinking.\
Both methods are the synchronized method.

## To compile and run the program
javac Dine.java compiles the program\
java Dine runs the program.
```cmd
javac Dine.java
java Dine
```
