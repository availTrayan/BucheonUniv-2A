package week13;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

//equals �޼���� ��ü�� �Ӽ����� ���ϴ°� �ƴ϶� ������ ��ü���� ���ϱ� ������ �ٸ��ٴ� ����� ����
//obj3�� ob1�� ���� ��ü��� �����߱� ������ ���ٴ� ����� ����

public class Week13Main {

	public static void main(String[] args) {
		
		/*
		equals �޼��� ����
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		if(obj1.equals(obj2))
			System.out.println("����");
		else
			System.out.println("�ٸ�");
		*/
		
		/*
		clone �޼��� ����
		Rectangle obj1 = new Rectangle(10,20);
		Rectangle obj2 = (Rectangle)obj1.clone();
		System.out.println("obj1: " + obj1 + "width: " + obj1.width + " height: " + obj1.height);
		System.out.println("obj2: " + obj2 + "width: " + obj2.width + " height: " + obj2.height);
		*/
		
		/*
		 getClass �޼��� ����
        Rectangle obj = new Rectangle(10, 20);
        Class cls = obj.getClass();
        String name = cls.getName();
        System.out.println("Ŭ���� �̸�: " + name);
        
        Class superCls = cls.getSuperclass();
        String superName = superCls.getName();
        System.out.println("����Ŭ���� �̸�: " + superName);
        
        Field field[] = cls.getDeclaredFields();      
        System.out.println("�ʵ�: ");
        for (int cnt = 0; cnt < field.length; cnt++)
            System.out.println("   " + field[cnt]);
        
        Method method[] = cls.getDeclaredMethods();
        System.out.println("�޼ҵ�: ");
        for (int cnt = 0; cnt < method.length; cnt++)
            System.out.println("   " + method[cnt]);
        */
        
		/*
        int total = 0;
    	for(int cnt = 0; cnt < args.length; cnt++){
    		Integer obj = new Integer(args[cnt]);
    		total += obj.intValue();
    	}
    	System.out.println(total);
    	*/
		
		/*
		Integer i = new Integer(30);
		Integer j = Integer.valueOf("50");
		System.out.println(i.intValue() + j.intValue());
		*/
		
		/*
		DataStructEx ds = new DataStructEx();
		//ds.arrayListTest();
		ds.linkedKistTest();
		*/
		
		/*
		//�ؽ� ���̺� ����
        HashMap<String, Integer> obj1 = new HashMap<String, Integer>();
        //Ű�� ������ ������ �� �ִ°� ���۷���Ÿ��. char, int ������ ����
        HashMap<String, Integer> obj2 = new HashMap<String, Integer>();
        
        obj1.put("�ظ�", new Integer(95)); 
        obj2.put("�츣�̿´�", new Integer(100));
        
        System.out.println(obj1.get("�ظ�"));
        System.out.println(obj2.get("�츣�̿´�"));
        System.out.println(obj1.hashCode()); //hashCode �޼���� �ֻ��� objectŬ�����ȿ� ����
        */
		
		HashMap<Name, Integer> obj1 = new HashMap<Name, Integer>(); //���� ������ Ŭ���� Name�� Ű�� ���
		HashMap<Name, Integer> obj2 = new HashMap<Name, Integer>();
		
        obj1.put(new Name("�ظ�", "����"), new Integer(95));
        obj2.put(new Name("�����", "�߿�"), new Integer(100));
        Integer num = obj1.get(new Name("�����", "�߿�"));
        System.out.println(num);
        
        //����� null, ���� ���� Ŭ������ Ű�� ����ϸ� �ؽ��ڵ带 ����� �����Ҽ� ����. �ؽ��ڵ带 �������̵� �ؾ���
        
    	}
	}
