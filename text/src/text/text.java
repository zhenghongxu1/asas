package text;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class text {
	public void Method_2(String str) {
		// ԭʼ����
		System.out.println("ԭʼ���ַ�����" + str);
		// ������תΪ�ַ�������
		String[] array = str.split("");
		// ������תΪTreeSet
		Set set = new LinkedHashSet(Arrays.asList(array));
		Iterator iterator = set.iterator();
		// ����TreeSet�����
		System.out.print("ȥ�ص��ַ�����");
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
