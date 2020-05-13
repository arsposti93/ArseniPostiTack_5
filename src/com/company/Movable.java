package com.company;

public interface Movable {

 void move ();

 void stop () ;

default int getPrice () {return 0;}
default Object showShortInfo () {return "";}

}
