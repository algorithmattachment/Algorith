package com.hsj;

import com.tool.timer.Timer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordDictionaryTest {
    private WordDictionary wordDictionary;
    private Timer timer;
    @Before
    public void setUp() {
        wordDictionary = new WordDictionary();
        timer = new Timer();
        timer.startTime();
    }

    @Test
    public void test_addWord() {
        wordDictionary.addWord("hello");
        wordDictionary.addWord("java");
        wordDictionary.addWord("world");
    }

    @Test
    public void test_search() {
        wordDictionary.addWord("hello");
        wordDictionary.addWord("java");
        wordDictionary.addWord("world");
        System.out.println(wordDictionary.search("hsj"));
        System.out.println(wordDictionary.search("hello"));
    }

    @After
    public void after() {
        System.out.println(timer.getTime(1));
    }
}