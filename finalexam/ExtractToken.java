package finalexam;

import java.util.LinkedList;
import java.util.StringTokenizer;

public class ExtractToken {
	
	public static void main(String args[]){
		
		StringBuffer sb = new StringBuffer();
		sb.ensureCapacity(10);
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("����� �̼���");
		list.add("�̼��� �����");
		list.add("�豸 �������");
		list.add("������� �豸");
		list.add("������ �������� ");
		list.add("�������� ������");
		list.add("�ֿ� ���߱�");
		list.add("���߱� ��������");
		list.add("������ �ڹٱ���");
		list.add("�ڹٱ��� �ֿ�");
		
		StringTokenizer stok = new StringTokenizer(null, null);
		String str = stok.nextToken();
		System.out.println(str);
	}

}
