package com.my.project;

/**
 * -XX:-DoEscapeAnalysis -XX:-EliminateAllocations -XX:-UseTLAB -XX:+PrintGC
 * 关闭逃逸分析/关闭标量替换/关闭线程本地缓存/打印GC信息
 * 
 * 1.配置以上JVM参数后达到的效果：不做栈上分配、不做线程本地缓存分配、直接分配到eden区
 * 2.依次开启以下选项可以看到程序运行时间上的优化：
 *   开启线程本地缓存分配：-XX:+UseTLAB
 *   开启栈上分配：-XX:+DoEscapeAnalysis -XX:+EliminateAllocations
 * 
 * @author yang
 *
 */
public class Test1 {

	class User {
		int id;
		String name;

		User(int id, String name) {
			this.id = id;
			this.name = name;
		}
	}

	void alloc(int i) {
		new User(i, "name" + i);
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		long s1 = System.currentTimeMillis();
		for(int i=0; i<10000000; i++) t.alloc(i);
		long s2 = System.currentTimeMillis();
		System.out.println(s2 - s1);
	}

}
