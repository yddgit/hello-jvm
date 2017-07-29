package com.my.project;

/**
 * 使用Runtime类“大致”计算内存情况
 * 
 * @author yang
 *
 */
public class Test3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		printMemoryInfo();
		byte[] b = new byte[1024*1024];
		printMemoryInfo();
	}

	static void printMemoryInfo() {
		System.out.println("total: " + Runtime.getRuntime().totalMemory());
		System.out.println("free : " + Runtime.getRuntime().freeMemory());
		System.out.println("used : " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
		System.out.println("==================");
	}
}
