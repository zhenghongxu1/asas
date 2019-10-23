package text;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class text {
	public void Method_2(String str) {
		// 原始输入
		System.out.println("原始的字符串：" + str);
		// 将输入转为字符串数组
		String[] array = str.split("");
		// 将数组转为TreeSet
		Set set = new LinkedHashSet(Arrays.asList(array));
		Iterator iterator = set.iterator();
		// 遍历TreeSet并输出
		System.out.print("去重的字符串：");
		while (iterator.hasNext()) {
		String result = (String) iterator.next();
		System.out.print(result);
		}
		System.out.println();
		}
	
	public static void main(String[] args) {
		text text = new text();
		text.Method_2("aaaaa4545asas");
	}
}
