A Suit For Pattern Matching Algorithms
===
1.Brute Force algorithm(蛮力算法)
---
### 1.1 Main features:
> * no pre-processing phase;<br/>
> 不需要预处理阶段
> * constant extra space needed;<br/>
> 需要常量级别的额外空间
> * comparisons can be done in any order;<br/>
> 比较可以按照任意顺序进行（从前到后或者从后到前）
> * searching phase in O(mn) complexity;<br/>
> 比较阶段的时间复杂度为O(mn)，m为模式串的长度，n为待匹配的数据串长度
> * 2n expected text characters comparisons.<br/>
> * 比较字符数的期望为2n<br/>

### 1.2 Description:
    The brute force algorithm consists in checking, at all positions in the text between 0 and n-m, whether an occurrence of the pattern starts there or not.<br/>
    Then, after each attempt, it shifts the pattern by exactly one position to the right.<br/>
    The brute force algorithm requires no pre-processing phase, and a constant extra space in addition to the pattern and the text. <br/>
    During the searching phase the text character comparisons can be done in any order. <br/>
    The time complexity of this searching phase is O(mn) (when searching for am-1b in an for instance). The expected number of text character comparisons is 2n.<br/>
蛮力算法检查数据串从0到n-m的每个位置，不管模式是否出现在那里。每次比较过后，将模式串向右移动一个位置。
时间复杂度为O(mn)，空间复杂度为O(m+n)，比较字符数的期望为2n。