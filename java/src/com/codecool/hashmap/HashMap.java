package com.codecool.hashmap;

import java.util.LinkedList;

public class HashMap<K, V> {

    private int bucketSize = 16;

    private LinkedList<KeyValue<K, V>>[] elements;

    public HashMap() {
        elements = new LinkedList[bucketSize];
    }

    public void add(K key, V value) {
        int position = getHash(key);
        if (elements[position] != null) {
            throw new Error("key already exist.");
        } else {
            LinkedList<KeyValue<K, V>> list = new LinkedList<>();
            elements[position] = list;
            KeyValue<K, V> kv = new KeyValue<>(key, value);
            list.add(kv);
        }
    }

    public V getValue(K key) {
        int position = getHash(key);
        if (elements[position] == null) {
            throw new Error("this key isn't exist.");
        } else {
            LinkedList list = elements[position];
            KeyValue kv = (KeyValue)list.get(0);
            return (V)kv.getValue();
        }
    }

    public void remove(K key) {
        int position = getHash(key);
        System.out.println(elements[position].getFirst().getValue());
        if (elements[position] == null) {
            throw new Error("There is no such key in the hashmap.");
        } else {
            elements[position] = null;
        }
    }

    public void clearAll() {
        for (LinkedList<KeyValue<K, V>> list : elements) {
            list = new LinkedList<>();
        }
    }

    public int getHash(K key) {
        return key.hashCode() % bucketSize;
    }

    public int getBucketSize() {
        return bucketSize;
    }
}
