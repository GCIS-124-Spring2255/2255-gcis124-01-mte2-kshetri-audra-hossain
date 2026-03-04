// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.LinkedList;
import java.util.Iterator;

// public class MyDeque {
public class MyDeque<E> implements Deque<E> {
    
    private final LinkedList<E> list;
    public MyDeque() {    list = new LinkedList<>();    }

    @Override
    public void enqueueFront(){
        //
    }
    @Override
    public void enqueueBack(){
    // ... for enqueueBack ...
    }
    @Override 
    public E dequeueFront(){
    // ... for dequeueFront ...
    }
    @Override
    public E dequeueBack(){
    // ... for dequeueBack ...
    }
    @Override
    public int size(){
    // ... for size ...
    }
    @Override
    public Iterator<E> iterator(){
    // ... for iterator ...
    }

    public static void main(String[] args) { 

        // ...
    }
}