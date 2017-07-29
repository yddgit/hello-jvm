package com.my.project;

/**
 * -XX:-DoEscapeAnalysis -XX:-EliminateAllocations -XX:-UseTLAB -XX:+PrintGCDetails
 * 关闭逃逸分析/关闭标量替换/关闭线程本地缓存/打印GC详细信息
 * 
 * 查看GC详细信息：
 * 若打开线程本地缓存（-XX:+UseTLAB），则eden区占用会变大
 * 因为线程本地缓存实际也是分配到eden区
 * 
 * @author yang
 *
 */
public class Test2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte[] b = new byte[1024];
	}

}
