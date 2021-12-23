
package com.mycompany.dec_22_hashmap_test;

        
public class MyHashMapMain {
    /*
    Use Case 1: Find frequency of words in a sentence
    */
    public void findWordFrequency(String sentence){
        MyHashMap<String,Integer> myHashMap = new MyHashMap<>();
        String []words = sentence.toLowerCase().split(" ");
        
        for (String word: words){
            Integer value = myHashMap.get(word);
            if (value ==null){value = 1;}
            else{ value++;}
            myHashMap.add(word,value);
            }
            int frequency = myHashMap.get("do");
            System.out.println(myHashMap); 
        }
    public static void main(String [] args){
        MyHashMapMain mht = new MyHashMapMain();
        String sentence = "To Do or not to Do";
        mht.findWordFrequency(sentence);
        }
}
