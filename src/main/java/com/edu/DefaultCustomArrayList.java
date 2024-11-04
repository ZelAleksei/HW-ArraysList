package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

public class DefaultCustomArrayList<E> implements CustomArrayList<E> {

    private ArrayList<E> internalList;

    public DefaultCustomArrayList() {
        internalList = new ArrayList<>();
    }

    @Override
    public boolean add(E element) {
        return internalList.add(element);
    }

    @Override
    public boolean remove(E element) {
        return internalList.remove(element);
    }

    @Override
    public E get(int index) {
        return internalList.get(index);
    }

    @Override
    public int size() {
        return internalList.size();
    }

    @Override
    public boolean isEmpty() {
        return internalList.isEmpty();
    }

    @Override
    public void clear() {
        internalList.clear();
    }

    @Override
    public boolean contains(E element) {
        return internalList.contains(element);
    }

    @Override
    public Iterator<E> iterator() {
        return internalList.iterator();
    }
}