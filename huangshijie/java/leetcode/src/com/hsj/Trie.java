package com.hsj;

import java.util.TreeMap;

/**
 * 第十一天——前缀树
 * @author 黄仕杰
 * @date 2019/07/09
 */
public class Trie {
    private class Node{
        private boolean isWord;
        private TreeMap<Character,Node> next;

        public Node(boolean isWord) {
            next = new TreeMap<>();
            this.isWord = isWord;
        }
        public Node(){
            this(false);
        }
    }

    private Node root;
    /**
     * 初始化数据结构
     * */
    public Trie() {
        root = new Node();
    }


    /**
     * 向前缀树中添加单词
     * @param word 添加的单词
     */
    public void insert(String word) {
        Node cre = root;
        for (int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if (cre.next.get(c)==null){
                cre.next.put(c, new Node());
            }
            cre = cre.next.get(c);
        }
        if(!cre.isWord){
            cre.isWord = true;
        }
    }


    /**
     * 查询前缀树中是否有查询的单词
     * @param word 查询的单词
     * @return 如果有返回true如果没有返回false
     */
    public boolean search(String word) {
        Node cre = root;
        for (int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if (cre.next.get(c)!=null) {
                cre = cre.next.get(c);
            }else {
                return false;
            }
        }
        return cre.isWord;
    }

    /**
     * 查询前缀树中是否以prefix前缀开头
     * @param prefix 前缀
     * @return @return 如果有返回true如果没有返回false
     */
    public boolean startsWith(String prefix) {
        Node cre = root;
        for (int i=0;i<prefix.length();i++){
            char c = prefix.charAt(i);
            if (cre.next.get(c)==null) {
                return false;
            }
            cre = cre.next.get(c);
        }
        return true;
    }
}
