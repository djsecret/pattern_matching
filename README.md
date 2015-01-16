A Suit For Pattern Matching Algorithms
===
1.Brute Force algorithm(蛮力算法)
---
### Main features：
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

[link to www.google.com](http://www.google.com)