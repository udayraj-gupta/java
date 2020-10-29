package com.java.basics.interview;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* https://www.youtube.com/watch?v=nVH5hyVSXa8&pbjreload=101 */

class WordLadderSolution {
	
	
	public static void main(String[] args) {
		WordLadderSolution path = new WordLadderSolution();
		String beginWord = "hit";
		String endWord = "cog";
//		List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
		List<String> wordList = Stream.of("hot","dot","dog","lot","log","cog").collect(Collectors.toList());
		System.out.println(""+path.ladderLength(beginWord, endWord, wordList));
	}
	
	
	   public int ladderLength(String beginWord, String endWord, List<String> wordList) {
	        if (!wordList.contains(endWord)) return 0;	//If end word doesn't contain in the list return 0
	        HashMap<String, Boolean> Vmap = new HashMap<String, Boolean>();	//Visited Map initially False
	        for(int i = 0; i <wordList.size(); i++)
	        	Vmap.put(wordList.get(i), false);
	       
	        Queue<String> queue = new LinkedList<String>();	//Queue to store the path to reach end word
	        int length = 1;
	        queue.add(beginWord);
	        Vmap.put(beginWord, true);	//1st word added in queue & made it true
	        while (!queue.isEmpty()) {
	            for (int i = 0; i < queue.size(); i++) {
	                String word = queue.poll();
	                if (word.equals(endWord)) 
	                     return length;
	                wordMatch(word, Vmap, queue);
	            }
	            length++;
	        }
	        return 0;
	    }
	    

	    
	    public void wordMatch(String w, HashMap<String, Boolean> Vmap, Queue<String> queue) {
	        for (int i = 0; i < w.length(); i++) {
	            char[] word = w.toCharArray();	System.out.println(i+" Iteration - word : "+w);
	            for (int j = 'a'; j <= 'z'; j++) {
	                char c = (char)  j;	//Incrementing Char value by 1
	                word[i] = c;
	                String s = String.valueOf(word);	//Form the modified word
	                if (Vmap.containsKey(s) && Vmap.get(s) == false) {
	                    queue.add(s);
	                    Vmap.put(s, true);
	                }
	            }
	        }
	    }
	}
