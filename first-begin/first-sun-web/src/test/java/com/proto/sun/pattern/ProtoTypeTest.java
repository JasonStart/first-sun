package com.proto.sun.pattern;


import com.proto.sun.prototype.Author;
import com.proto.sun.prototype.Book;
import com.proto.sun.prototype.DeepBook;
import org.junit.Test;

import java.io.IOException;

/*
原型模式(Prototype  Pattern)：使用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。原型模式是一种对象创建型模式。
 */
public class ProtoTypeTest {

    @Test
    public void shallowCopyTest() throws CloneNotSupportedException {

        Book shallow = new Book();

        shallow.setTitle("想飞的嘟嘟");
        shallow.setPageNum(200);

        Author author = new Author();
        author.setAge(50);
        author.setName("Jason");

        shallow.setAuthor(author);

        Book cloneBook = (Book) shallow.clone();

        System.out.println(shallow == cloneBook);
        System.out.println(shallow.getAuthor() == cloneBook.getAuthor());
        System.out.println(shallow.getTitle() == cloneBook.getTitle());
        System.out.println(shallow.getPageNum() == cloneBook.getPageNum());
        /*
        由输出的结果我们发现：虽然复制出来的对象重新在堆上开辟了内存空间，但是，对象中各属性确保持相等。
        对于基本数据类型很好理解，但对于引用数据类型来说，则意味着此引用类型的属性所指向的对象本身是相同的， 并没有重新开辟内存空间存储。
        换句话说，引用类型的属性所指向的对象并没有复制。由此，我们将其称之为浅复制
         */

    }


    @Test
    public void CopyTest() throws CloneNotSupportedException {

        DeepBook deepBook = new DeepBook();

        deepBook.setTitle("想飞的嘟嘟");
        deepBook.setPageNum(200);

        Author author = new Author();
        author.setAge(50);
        author.setName("Jason");
        deepBook.setAuthor(author);

        DeepBook cloneBook = null;
        try {

            cloneBook = (DeepBook) deepBook.deepClone();
            System.out.println(deepBook == cloneBook);
            System.out.println(deepBook.getAuthor() == cloneBook.getAuthor());
            System.out.println(deepBook.getTitle() == cloneBook.getTitle());
            System.out.println(deepBook.getPageNum() == cloneBook.getPageNum());

            /*
            从输出结果中可以看出，深复制不仅在堆内存上开辟了空间以存储复制出的对象，
            甚至连对象中的引用类型的属性所指向的对象也得以复制，重新开辟了堆空间存储。
            */
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
