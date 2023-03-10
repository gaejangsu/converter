package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class A {
	String aa;
	public A(String aa) {
		this.aa = aa;
	}
}

public class HashSet1 {

	public static void main(String[] args) {

		HashSet set1 = new HashSet();
		Set set2 = new HashSet();
		
		A a1 = new A("c");
		
		set1.add(new A("a"));
		set1.add(new A("b"));
		set1.add(a1);
		set1.add(new A("d"));
		set1.add(new A("e"));
		
		System.out.println("size : " + set1.size());
		
		Iterator<A> iterator = set1.iterator(); // 객체 5개를 넣음 // iterator는 인터페이스라
		// iterator 메서드를 통해 인스턴스를 받아와야 한다. hashset은 iterator를 구현하는 자손.
		// hasNext() : 남아있는 객체가 있나 ? true, false
		// next() : 순회하면서 값 얻어오기
		System.out.print("set1 출력 : ");
		
		while(iterator.hasNext()) {
			A a2 = iterator.next();
			System.out.print(a2.aa + " ");
		}
		
		System.out.println();
		
		set1.remove(a1);
		System.out.print("set1 삭제 후 출력 : ");
		iteratorPrint(set1.iterator());
		
		System.out.println();
		set1.add(new A("e"));
		System.out.println("size : " + set1.size());
		System.out.print("set1에 e 입력 후 출력 : ");
		iteratorPrint(set1.iterator());
		System.out.println();
		
		set1.add(a1);
		System.out.println("size : " + set1.size());
		System.out.print(set1.iterator());
		System.out.println("size : " + set1.size());
		System.out.print("set1에 a1을 2번 입력 후 출력 : ");
		System.out.println();
		set1.add(a1);
		System.out.println("size : " + set1.size());
		
		
	}
	
	static void iteratorPrint(Iterator<A> i) {
		while(i.hasNext()) {
			A a2 = i.next();
			System.out.print(a2.aa + " ");
		}
		System.out.println();
	}

}