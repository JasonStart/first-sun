package com.proto.sun.collection;

import org.junit.Test;

import java.util.*;

public class CollectionTest {

    /**
     * collection
     *   ├List
     *   │├LinkedList
     *   │├ArrayList
     *   │└Vector
     *   │　└Stack
     *   └Set
     *   
     *   Map
     *   ├Hashtable
     *   ├HashMap
     *   └WeakHashMap
     * Arraylist和Vector是采用数组方式存储数据，此数组元素数大于实际存储的数据以便增加插入元素，都允许直接序号索引元素，
     * 但是插入数据要涉及到数组元素移动等内存操作，所以插入数据慢，查找有下标，所以查询数据快，Vector由于使用了synchronized方法-线程安全，
     * 所以性能上比ArrayList要差，LinkedList使用双向链表实现存储，按序号索引数据需要进行向前或向后遍历，但是插入数据时只需要记录本项前后项即可，插入数据较快。
     */
    @Test
    public void Test() {
        
        /**
         * 
         * List接口
                            　　List是有序的Collection，使用此接口能够精确的控制每个元素插入的位置。用户能够使用索引（元素在List中的位置，类似于数组下标）来访问List中的元素，这类似于Java的数组。
                                    和下面要提到的Set不同，List允许有相同的元素。
                            　　除了具有Collection接口必备的iterator()方法外，List还提供一个listIterator()方法，返回一个ListIterator接口，和标准的Iterator接口相比，
           ListIterator多了一些add()之类的方法，允许添加，删除，设定元素，还能向前或向后遍历。实现List接口的常用类有LinkedList，ArrayList，Vector和Stack。
                            
           ArrayList类
                            　　ArrayList实现了可变大小的数组。它允许所有元素，包括null。ArrayList没有同步。
           size，isEmpty，get，set方法运行时间为常数。但是add方法开销为分摊的常数，添加n个元素需要O(n)的时间。其他的方法运行时间为线性。
                            　　每个ArrayList实例都有一个容量（Capacity），即用于存储元素的数组的大小。这个容量可随着不断添加新元素而自动增加，但是增长算法并没有定义。当需要插入大量元素时，
                                   在插入前可以调用ensureCapacity方法来增加ArrayList的容量以提高插入效率。和LinkedList一样，ArrayList也是非同步的（unsynchronized）。
                            
           Vector类
                            　　Vector非常类似ArrayList，但是Vector是同步的。由Vector创建的Iterator，虽然和ArrayList创建的Iterator是同一接口，但是，因为Vector是同步的，
                                    当一个Iterator被创建而且正在被使用，另一个线程改变了Vector的状态（例如，添加或删除了一些元素），这时调用Iterator的方法时将抛出ConcurrentModificationException,
                                    因此必须捕获该异常。
                            
           Stack 类
                            　　Stack继承自Vector，实现一个后进先出的堆栈。Stack提供5个额外的方法使得Vector得以被当作堆栈使用。基本的push和pop方法，还有peek方法得到栈顶的元素，
           empty方法测试堆栈是否为空，search方法检测一个元素在堆栈中的位置。Stack刚创建后是空栈。
        
         * 
         */
        
        List<String> arrayList = new ArrayList<String>();

        
        Iterator<String> its = arrayList.listIterator();
        
        List<String> vector = new Vector<String>();
        
        Iterator<String> it = vector.iterator();
        
        while(it.hasNext()) {
            String str = it.next();
        }
        
        // Stack 类 test
        Stack<Integer> stack = new Stack<Integer>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        for(int i= 0; i<4;i++){
            System.out.println("---value: " +stack.pop());
        }
       
    }
    
}
