package com.hsj;

import com.tool.timer.Timer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrieTest {
    private Trie trie;
    private Timer timer;
    @Before
    public void setUp() {
        trie = new Trie();
        timer = new Timer();
    }

    @Test
    public void test_insert() {
        trie.insert("hello");
        trie.insert("hsj");
        trie.insert("prefix");
        trie.insert("trie");
    }

    @Test
    public void test_search() {
        timer.startTime();
        test_insert();
        System.out.println(trie.search("hsj"));
        System.out.println(timer.getTime(1));
    }

    @Test
    public void test_startsWith() {
        timer.startTime();
        test_insert();
        System.out.println(trie.startsWith("h"));
        System.out.println(timer.getTime(1));
    }
}