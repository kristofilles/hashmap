package com.codecool.hashmap;

import java.util.LinkedList;
import java.util.List;

public class HashMap<K, V> {

    private int bucketSize = 16;

    private LinkedList<KeyValue<K,V>>[] elements;

    public HashMap() {
        elements = new LinkedList[bucketSize];
    }

    public void add(K key, V value) {
        int position = getHash(key);
        if (elements[position]!=null) {
            throw new Error("key already exist.");
        } else {
            LinkedList<KeyValue<K, V>> list = new LinkedList<>();
            elements[position] = list;
            System.out.println(list.size());
            KeyValue<K, V> kv = new KeyValue<>(key, value);
            System.out.println("key" + kv.getKey() + "value" + kv.getValue());
            list.add(kv);
        }
    }




    public int getHash(K key) {
        return key.hashCode() % bucketSize;
    }

    public int getBucketSize() {
        return bucketSize;
    }
}
