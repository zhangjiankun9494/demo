package com.example.leetcode;

import java.util.Arrays;

/**
 * @author zjk
 * @DESCRIPTION
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-anagram
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2020-11-24 22:47
 */
public class no242 {

    /**
     * 利用排序，长度不一致直接return，提高效率
     */
    public static boolean isAnagram1(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        if(ss.length != tt.length){
            return false;
        }
        Arrays.sort(ss);
        Arrays.sort(tt);
        return String.valueOf(ss).equals(String.valueOf(tt));
    }

    /**
     * 标签：哈希映射
     * 首先判断两个字符串长度是否相等，不相等则直接返回 false
     * 若相等，则初始化 26 个字母哈希表，遍历字符串 s 和 t
     * s 负责在对应位置增加，t 负责在对应位置减少
     * 如果哈希表的值都为 0，则二者是字母异位词
     */
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
            alpha[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++)
            if (alpha[i] != 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("uuujjhh".charAt(6) - 'a');
        System.out.println('a' - 0);
        System.out.println(isAnagram1("dasfasfasfd","dasfasfafsd"));
    }


}
