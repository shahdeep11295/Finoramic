/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package javaapplication10;

/**
 *
 * @author apple
 */
import java.util.*;
public class anagrams{
    public static ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
           ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        HashMap<String, ArrayList<Integer>> hashmap = new HashMap<String, ArrayList<Integer>>();
        
        for(int i = 0; i < a.size(); i++){
            char[] c = a.get(i).toCharArray();
            Arrays.sort(c);
            String t = String.valueOf(c);
            if(hashmap.get(t) == null){
                ArrayList<Integer> l = new ArrayList<Integer>();
                l.add(i+1);
                hashmap.put(t, l);
            }
            else
                hashmap.get(t).add(i + 1);
        }
        for(ArrayList<Integer> l : hashmap.values()){
                result.add(l);
        }
        
        return result;
 }
    public static void main(String[] args){
        List<String> a = new ArrayList<String>();
        a.add("cat");
        a.add("dog");
        a.add("god");
        a.add("atc");
        ArrayList<ArrayList<Integer>> result = anagrams(a);
        for(int i = 0; i < result.size(); i++){
            System.out.print("[");
            for(int j : result.get(i))
                System.out.print((j) + " ");
            System.out.println("]");
        }
    }
}