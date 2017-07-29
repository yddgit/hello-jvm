package com.my.project;

import java.util.ArrayList;
import java.util.List;

/**
 * 内存溢出OutOfMemory
 * -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=C:\tmp\jvm.dump -XX:+PrintGCDetails
 * -Xms10M -Xmx10M
 * 
 * -Xms堆内存起始大小
 * -Xmx堆内存最大可用
 * 一般起始值小于最大值，调优时一般起始值接近或等于最大值
 * 
 * 内存文件的查看工具VisualVM：https://visualvm.github.io/
 * 
 * @author yang
 *
 */
public class Test4 {

	public static void main(String[] args) {
		List<Object> lists = new ArrayList<>();
		for(int i=0; i<100000000; i++) {
			lists.add(new byte[1024*1024]);//1M
		}
	}

}
