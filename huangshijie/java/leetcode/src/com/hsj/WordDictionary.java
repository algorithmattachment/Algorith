package com.hsj;

import java.util.TreeMap;

/**
 * 第九天——添加与搜索单词，数据结构设计
 * @author 黄仕杰
 * @date 2019/07/07
 */
public class WordDictionary {
    private class Node {
        private boolean isWord;
        private TreeMap<Character, Node> next;

        public Node(boolean isWorld) {
            this.isWord = isWorld;
            next = new TreeMap<>();
        }
        public Node(){
            this(false);
        }
    }

    private Node root;
    /**
     * 初始化数据结构
     *
     * */
    public WordDictionary() {
        root = new Node();
    }


    /**
     * 添加一个单词到数据结构中
     * @param word
     */
    public void addWord(String word) {
        Node cre = root;
        for (int i=0;i<word.length();i++) {
            char c = word.charAt(i);
            if (cre.next.get(c)==null) {
                cre.next.put(c, new Node());
            }
            cre = cre.next.get(c);
        }
        cre.isWord = true;
    }


    /**
     * 如果单词在数据结构中，则返回。一个单词可以包含点字符'.'代表任何一个字母。
     * @param word 搜索的单词
     * @return 是否在数据结构中
     */
    public boolean search(String word) {
        return match(root,word,0);
    }

    private boolean match(Node node, String word, int index) {
        if (index == word.length()) {
            return node.isWord;
        }
        char c = word.charAt(index);
        char point = '.';
        if (c!=point){
            if(node.next.get(c)==null){
                return false;
            }else {
                return match(node.next.get(c), word, index + 1);
            }
        }else {
            for (Character character : node.next.keySet()) {
                if (match(node.next.get(character), word, index + 1)){
                    return true;
                }
            }
            return false;
        }

    }
}

