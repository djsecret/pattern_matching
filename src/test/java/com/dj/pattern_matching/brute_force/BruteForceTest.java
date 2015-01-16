package com.dj.pattern_matching.brute_force;

import org.junit.Test;

import java.util.LinkedList;

public class BruteForceTest
{
    @Test
    public void testBruteForce() throws Exception
    {
        String source = "abcdabcdabdd";
        String pattern = "d";
        LinkedList<Integer> locations = new LinkedList<Integer>();
        BruteForce.bruteForce(source, pattern,locations);

        int i = 0;
        while(i != -1 && i <= source.length() - pattern.length())
        {
            i = source.indexOf(pattern,i);
            System.out.println(i);
            i++;
        }

        if(locations.size() > 0)
        {
            for(Integer integer : locations)
            {
                System.out.println(integer);
            }
        }
        else
        {
            System.out.println("pattern not found");
        }
    }
}