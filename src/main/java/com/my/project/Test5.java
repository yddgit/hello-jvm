package com.my.project;

/**
 * 线程栈的大小：-Xss128k
 * 
 * -Xss值越小，线程并发数量越大
 * -Xss值越大，线程递归深度越大
 * 
 * @author yang
 *
 */
public class Test5 {

	static int count = 0;

	static void r() {
		count++;
		r();
	}

	public static void main(String[] args) {
		try {
			r();
		} catch(Throwable t) {
			System.out.println(count);
			t.printStackTrace(); //StackOverflow
		}
	}

}
