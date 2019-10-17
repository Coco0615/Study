package com.pc.test;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * 除boolean外 其他其中数据类型可以通过**Buffer中的静态方法allocate()获取非直接缓冲区
 *                                                      将缓冲区建立在JVM内存中
 *        allocateDirect()获取直接缓冲区，将缓冲区建立在内存中
 *
 * put 向缓冲区添加数据
 * get 从缓冲区获取数据
 *
 * 0 < mark < position < limit < capacity
 */
public class TestBuffer {
    @Test
    public  void test3(){
        //获取直接缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(128);
        //判断该缓冲区是否为直接缓冲区
        System.out.println("byteBuffer.isDirect() = " + byteBuffer.isDirect());
    }
    @Test
    public void test2(){
        String s = "asdfg";

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        byteBuffer.put(s.getBytes());
        byteBuffer.flip();
        byte[] bytes = new byte[byteBuffer.limit()];
        System.out.println("byteBuffer = " + byteBuffer.position());
        byteBuffer.get(bytes,0,2);
        System.out.println("byteBuffer = " + byteBuffer.position());
        //mark: 标记  表示记录当前position的位置，可以通过reset()回复到标记的位置
        byteBuffer.mark();
        byteBuffer.get(bytes,2,2);
        System.out.println("byteBuffer = " + byteBuffer.position());
        //回到标记的位置
        byteBuffer.reset();
        System.out.println("byteBuffer = " + byteBuffer.position());
        //查看还有多少可操作的数据
        byteBuffer.get(bytes,2,3);
        System.out.println("byteBuffer = " + byteBuffer.remaining());
    }
    @Test
    public void test1(){
        //获取缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        //位置，标识缓冲区正在操作数据的位置
        System.out.println("byteBuffer.position() = " + byteBuffer.position());
        //界限，表示缓冲区可以操作数据的大小 （limit后的数据不能进行读写）
        System.out.println("byteBuffer.limit() = " + byteBuffer.limit());
        //容量，表示缓冲区最大数据容量，一旦指定无法更改
        System.out.println("byteBuffer.capacity() = " + byteBuffer.capacity());

        
        String s = "qwertyt";

        //往缓冲区添加数据
        byteBuffer.put(s.getBytes());
        System.out.println("---------------put()--------------------");
        System.out.println("byteBuffer.position() = " + byteBuffer.position());
        System.out.println("byteBuffer.limit() = " + byteBuffer.limit());
        System.out.println("byteBuffer.capacity() = " + byteBuffer.capacity());

        //从读数据切换到写数据
        byteBuffer.flip();
        System.out.println("---------------flip()--------------------");
        System.out.println("byteBuffer.position() = " + byteBuffer.position());
        System.out.println("byteBuffer.limit() = " + byteBuffer.limit());
        System.out.println("byteBuffer.capacity() = " + byteBuffer.capacity());

        //从缓冲区取数据
        byte[] bytes = new byte[byteBuffer.limit()];
        //把数据放到bytes数组中
        byteBuffer.get(bytes);
        System.out.println(new String(bytes,0,bytes.length));
        System.out.println("---------------get()--------------------");
        System.out.println("byteBuffer.position() = " + byteBuffer.position());
        System.out.println("byteBuffer.limit() = " + byteBuffer.limit());
        System.out.println("byteBuffer.capacity() = " + byteBuffer.capacity());

        //可重复读
        byteBuffer.rewind();
        System.out.println("---------------rewind()--------------------");
        System.out.println("byteBuffer.position() = " + byteBuffer.position());
        System.out.println("byteBuffer.limit() = " + byteBuffer.limit());
        System.out.println("byteBuffer.capacity() = " + byteBuffer.capacity());

        //清空  数据依然存在 只是指针初始化了，数据被遗忘了
        byteBuffer.clear();
        System.out.println("---------------clear()--------------------");
        System.out.println("byteBuffer.position() = " + byteBuffer.position());
        System.out.println("byteBuffer.limit() = " + byteBuffer.limit());
        System.out.println("byteBuffer.capacity() = " + byteBuffer.capacity());


    }

}
