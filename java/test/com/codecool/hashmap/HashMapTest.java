package com.codecool.hashmap;

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

}