package week13;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

//equals 메서드는 객체의 속성값을 비교하는게 아니라 동일한 객체인지 비교하기 때문에 다르다는 결과가 나옴
//obj3를 ob1과 같은 객체라고 지정했기 때문에 같다는 결과가 나옴

public class Week13Main {

	public static void main(String[] args) {
		
		/*
		equals 메서드 실험
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		if(obj1.equals(obj2))
			System.out.println("같음");
		else
			System.out.println("다름");
		*/
		
		/*
		clone 메서드 실험
		Rectangle obj1 = new Rectangle(10,20);
		Rectangle obj2 = (Rectangle)obj1.clone();
		System.out.println("obj1: " + obj1 + "width: " + obj1.width + " height: " + obj1.height);
		System.out.println("obj2: " + obj2 + "width: " + obj2.width + " height: " + obj2.height);
		*/
		
		/*
		 getClass 메서드 실험
        Rectangle obj = new Rectangle(10, 20);
        Class cls = obj.getClass();
        String name = cls.getName();
        System.out.println("클래스 이름: " + name);
        
        Class superCls = cls.getSuperclass();
        String superName = superCls.getName();
        System.out.println("슈퍼클래스 이름: " + superName);
        
        Field field[] = cls.getDeclaredFields();      
        System.out.println("필드: ");
        for (int cnt = 0; cnt < field.length; cnt++)
            System.out.println("   " + field[cnt]);
        
        Method method[] = cls.getDeclaredMethods();
        System.out.println("메소드: ");
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
		//해쉬 테이블 실험
        HashMap<String, Integer> obj1 = new HashMap<String, Integer>();
        //키와 값으로 지정할 수 있는건 레퍼런스타입. char, int 넣으면 오류
        HashMap<String, Integer> obj2 = new HashMap<String, Integer>();
        
        obj1.put("해리", new Integer(95)); 
        obj2.put("헤르미온느", new Integer(100));
        
        System.out.println(obj1.get("해리"));
        System.out.println(obj2.get("헤르미온느"));
        System.out.println(obj1.hashCode()); //hashCode 메서드는 최상위 object클래스안에 정의
        */
		
		HashMap<Name, Integer> obj1 = new HashMap<Name, Integer>(); //따로 생성한 클래스 Name을 키로 사용
		HashMap<Name, Integer> obj2 = new HashMap<Name, Integer>();
		
        obj1.put(new Name("해리", "포터"), new Integer(95));
        obj2.put(new Name("고양이", "야옹"), new Integer(100));
        Integer num = obj1.get(new Name("고양이", "야옹"));
        System.out.println(num);
        
        //결과값 null, 직접 만든 클래스를 키로 사용하면 해쉬코드를 제대로 생성할수 없음. 해쉬코드를 오버라이딩 해야함
        
    	}
	}
