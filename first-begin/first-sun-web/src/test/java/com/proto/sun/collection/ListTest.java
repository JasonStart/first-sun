package com.proto.sun.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    /**
     * 从成员变量，我们可以得知
     *
     * Object[] elementData：数据结构---数组
     * 两个默认空数组，仅在构造方法中使用，不关心
     * DEFAULT_CAPACITY： 数组初始容量为10
     * size：当前元素个数
     * MAX_ARRAY_SIZE：数组最大容量
     */
    @Test
    public void ArrayListTest () {

        // new ArrayList 默认为空数组 private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
        List<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0;i<11;i++ ){
            // 第一次add 时 构建 DEFAULT_CAPACITY： 数组初始容量为10
            arrayList.add(i);
            // 当size + 1 > 数组容量（elementData.lengt）时，进行扩容
            // int newCapacity = oldCapacity + (oldCapacity >> 1); 扩容1.5倍
            // elementData = Arrays.copyOf(elementData, newCapacity);  重新创建了一个 1.5 倍容量的数组，并将旧数组复制到新数组，赋值给elementData
        }
        /*
         *给定下标，增加数据
         *  调用 rangeCheckForAdd 检查下标是否越界
         *                      源数组    源数组中的起始位置             要复制的数组元素的数量
         *  System.arraycopy(elementData, index, elementData, index + 1,size - index);
         *                                          目标数组    目标数据中的起始位置
         *  将 index 后元素分别往后移动一位
        */

        arrayList.add(5,666);
    }


    /**
     * LinkedList 继承自 AbstractSequentialList。
     *
     * AbstractSequentialList 又继承自AbstractList，并且基于 iterator 实现了默认增删改查操作。
     *
     * 再回过头来看 LinkedList，LinkedList 还实现了Deque（双向队列）接口，双向队列后面我们会单独去学习，这里不再做过多的赘述。
     *
     * 再来看看成员变量~~
     *
     * size 链表元素个数
     * first 第一个元素
     * last 最后一个元素
     */
    @Test
    public void LinkedListTest () {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

         linkedList.add(1);
         linkedList.addFirst(2);
         linkedList.addLast(3);

         linkedList.push(3);

    }
}
