package com.codecool.hashmap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashMapTest {


    @Test
    void getHashTest() {
        HashMap<Integer, Integer> hm = new HashMap<>();
        assertTrue(hm.getHash(342525)<=hm.getBucketSize());
    }

    @Test
    void addThrowErrorTest() {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.add(4, 5);
        assertThrows(Error.class, ()->hm.add(4,5));
    }


    @Test
    void getValueThrowError() {
        HashMap<Integer, Integer> hm = new HashMap<>();
        assertThrows(Error.class, ()->hm.getValue(4));
    }

    @Test
    void getValueTest() {
        HashMap<String, String> hm = new HashMap<>();
        hm.add("key", "value");
        assertEquals("value", hm.getValue("key"));
    }

    @Test
    void removeThrowError() {
        HashMap<Integer, Integer> hm = new HashMap<>();
        assertThrows(Error.class, ()->hm.remove(4));
    }

    @Test
    void removeTest() {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.add(4, 5);
        hm.remove(4);
        assertThrows(Error.class, ()->hm.getValue(4));
    }

    @Test
    void clearAllTest() {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.add("asd", 5);
        hm.add("qwe", 5);
        hm.add("íyx", 5);
        hm.clearAll();
        assertThrows(Error.class, ()->hm.remove("asd"));

    }

}