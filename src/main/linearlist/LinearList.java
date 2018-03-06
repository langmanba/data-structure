package main.linearlist;

import java.util.Arrays;

/**
 * 线性表的顺序表示和实现
 */
public class LinearList {

    private static int[] array;

    public LinearList() {
        this.array = new int[15];
    }

    public LinearList(int len) {
        this.array = new int[len];
    }

    /**
     * 在线性表的第i - 1 个数据元素和第 i 个数据元素之间插入一个新数据元素，使线性表的长度增加一个元素空间。
     */
    public int[] add(int[] array, int index, int addNum) {
        int maxlen = array.length;
        int[] temp = new int[maxlen + 1];
        for (int i = 0; i <= maxlen; i++) {
            if (i < index) {
                temp[i] = array[i];
                continue;
            }
            if (i == index) {
                temp[i] = addNum;
                continue;
            }
            temp[i] = array[i - 1];
        }
        System.out.println(Arrays.toString(temp));
        return temp;
    }

    public int delete(int[] array, int index) {
        for (int i = 0; i < array.length; i++) {

        }
        return 0;
    }

    public static void main(String[] args) {
        LinearList list = new LinearList();
        int[] a = {1, 2, 6, 5, 4, 3};
        a = list.add(a, 6, 8);
        System.out.println(Arrays.toString(a));
    }
}


