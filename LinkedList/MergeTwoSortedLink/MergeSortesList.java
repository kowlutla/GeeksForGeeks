package MergeTwoSortedLink;

public class MergeSortesList {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		System.out.println("List1: ");
		list.traverse();
		System.out.println();
		LinkedList list2=new LinkedList();
		list2.sortOnInsert(45);
		list2.sortOnInsert(25);
		list2.sortOnInsert(35);
		list2.sortOnInsert(5);
		list2.sortOnInsert(15);
		list2.traverse();
		

	}

}
