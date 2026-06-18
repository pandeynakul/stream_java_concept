package com.hm;

/* Created by Ankul Deshpande on 17-06-2026 09:57 */

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//Input: s = "cccaaa"
//Output: "aaaccc"
//Explanation: Both 'c' and 'a' appear three times, so both "cccaaa"
// and "aaaccc" are valid answers.
//Note that "cacaca" is incorrect, as the same characters must be together.
public class FreqSort451 {

    public static void main(String[] args) {
        String s = "tree";
        String freqCharSort = frequencySort(s);
        System.out.println(freqCharSort);
    }

    static class Element implements Comparable<Element> {
        Character ch;
        Integer freq;

        public Element(Character ch, Integer freq) {
            this.ch = ch;
            this.freq = freq;
        }

        public int compareTo(Element that) {
            return that.freq - this.freq;
        }
    }

    private static String frequencySort(String s) {

        //count the frequency!
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);

            } else {
                map.put(ch, map.getOrDefault(ch, 1));
            }

        }
        System.out.println(map);
        //define the priority queue to get the element on the
        //priority queue
        PriorityQueue<Element> pq = new PriorityQueue();
        //convert map into the pq
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            //pass it to the Element
            Element element = new Element(entry.getKey(), entry.getValue());
            pq.add(element);
        }

        StringBuilder sb = new StringBuilder();
        while (pq.size() > 0) {
            //poll the element from pq
            Element element = pq.poll();
            //iterate the  the freq and append
            while (element.freq > 0) {
                sb.append(element.ch);
                element.freq--;
            }

        }


        return sb.toString();
    }
}
