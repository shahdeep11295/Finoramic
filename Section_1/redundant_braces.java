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
import java.util.Stack; 
public class redundant_braces { 
    static boolean checkRedundant(String s) { 
        Stack<Character> st = new Stack<>(); 
        char[] str = s.toCharArray(); 
        for (char ch : str) { 
            if (ch == ')') { 
                char top = st.peek(); 
                st.pop(); 
                boolean flag = true; 
                while (top != '(') { 
                    if (top == '+' || top == '-' || top == '*' || top == '/') { 
                        flag = false; 
                    } 
                    top = st.peek();
                    st.pop(); 
                } 
                if (flag == true) { 
                    return true; 
                } 
            } else { 
                st.push(ch);  
            }			
        } 
        return false; 
    } 
    
    static void findRedundant(String str) { 
        boolean ans = checkRedundant(str); 
        if (ans == true) { 
            System.out.println("has redundant braces so answer will be 1 (Yes)"); 
        } else { 
            System.out.println("doesn't have have any redundant braces so answer will be 0 (No)"); 
        } 
    } 
    
    public static void main(String[] args) { 
        String str = "((a + b))"; 
        System.out.print(str + " ");
        findRedundant(str); 
        
        
        str = "(a + (a + b))"; 
        System.out.print(str + " ");
        findRedundant(str); 
    } 
} 
