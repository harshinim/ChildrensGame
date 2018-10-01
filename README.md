# ChildrensGame
This is a game with following rules

            * n children stand around a circle. 
            * Starting with a given child and working clockwise, each child gets a 
             sequential number, which we will refer to as it’s id. 
            * Then starting with the first child, they count out from 1 until k. The 
             k’th child is now out and leaves the circle. The count starts again 
             with the child immediately next to the eliminated one.
            * Children are so removed from the circle one by one. The winner is the 
             child left standing last.
             
             
Implementation 
--------------
CicularLinkedList has been used to implement this game. With CircularLinkedList it becomes easy to remove the kth child and also to be able to reset the starting position for the game to continue. 
