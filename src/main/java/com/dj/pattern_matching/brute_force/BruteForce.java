package com.dj.pattern_matching.brute_force;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * 蛮力算法检查数据串从0到n-m的每个位置，不管模式是否出现在那里。每次比较过后，将模式串向右移动一个位置。<br/>
 * 时间复杂度为O(mn)，空间复杂度为O(m+n)，比较字符数的期望为2n。<br/>
 *
 * Created by dj on 15-1-16.
 */
public class BruteForce
{
    /**
     * 字符串匹配蛮力算法
     * @param source 待匹配的数据串
     * @param pattern 模式串
     * @param locations <p>模式串{@code pattern}在数据串{@code source}中出现的位置</p>
     * @param fromIndex <p>多次调用此函数时，位置从{@code fromIndex}开始累计</p>
     * @return <p>如果存在，则返回{@code true}，否则返回{@code false}</p>
     */
    public static boolean bruteForce(String source, String pattern, LinkedList<Integer> locations, int fromIndex)
    {
        int sourceLength = source.length();
        int patternLength = pattern.length();

        int patternIndex,sourceIndex;
        boolean flag = false;

        for(sourceIndex = 0; sourceIndex <= sourceLength - patternLength; ++sourceIndex)//这里sourceIndex可以等于sourceLength - patternLength
        {
            for(patternIndex = 0; patternIndex < patternLength && source.charAt(sourceIndex+patternIndex) == pattern.charAt(patternIndex); ++patternIndex);

            if(patternIndex >= patternLength)//匹配成功
            {
                flag = true;

                locations.add(fromIndex + sourceIndex);
            }
        }

        return flag;
    }

    /**
     * <p>字符串匹配蛮力算法（调用{@link #bruteForce(String, String, java.util.LinkedList, int)}）</p>
     * @param source 待匹配的数据串
     * @param pattern 模式串
     * @param locations <p>模式串{@code pattern}在数据串{@code source}中出现的位置</p>
     * @return <p>如果存在，则返回{@code true}，否则返回{@code false}</p>
     */
    public static boolean bruteForce(String source, String pattern, LinkedList<Integer> locations)
    {
        return bruteForce(source,pattern,locations,0);
    }

    public static void bruteForceInFile(String filename, String pattern, LinkedList<Integer> locations)
    {

        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            String line = null;
            int fromIndex = 0;
            while((line = br.readLine()) != null)
            {
                bruteForce(line,pattern,locations,fromIndex);
                fromIndex += line.length() + 2;
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
