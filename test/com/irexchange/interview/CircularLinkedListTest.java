package com.irexchange.interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircularLinkedListTest {

	@Test
	void testInsertNextItem() {
		CircularLinkedList linkedList = new CircularLinkedList();
		Child child1 = new Child(1,null);
		Child child2 = new Child(2,null);
		//for coverage
		child2.setId(2);
		
		
		linkedList.insertNextChild(child1);
		linkedList.insertNextChild(child2);
		assertEquals(child1,linkedList.getStart());
		assertEquals(child2,linkedList.getEnd());
		assertEquals(2,linkedList.getSize());
		assertEquals(2,linkedList.getEnd().getId());
		assertEquals(child2,linkedList.getStart().getLink());
		linkedList.display();
	}
	
	@Test
	void testDeleteAtPos() {
		CircularLinkedList linkedList = new CircularLinkedList();
		Child child1 = new Child(1,null);
		Child child2 = new Child(2,null);
		Child child3 = new Child(3,null);
		Child child4  = new Child(4,null);
	
		
		//delete at postion 1 when size is 1
		linkedList.insertNextChild(child1);
		linkedList.deleteChildAtPosition(1);
		assertEquals(0,linkedList.getSize());
		
		//delete at position 1 when size is > 1
		linkedList.insertNextChild(child1);
		linkedList.insertNextChild(child2);
		linkedList.deleteChildAtPosition(1);
		assertEquals(1,linkedList.getSize());
		assertEquals(child2,linkedList.getStart());
		
		linkedList = new CircularLinkedList();
		
		//position <> size
		linkedList.insertNextChild(child1);
		linkedList.insertNextChild(child2);
		linkedList.insertNextChild(child3);
		linkedList.insertNextChild(child4);
		linkedList.display();
		assertEquals(4,linkedList.getSize());
		linkedList.deleteChildAtPosition(3);
		assertEquals(3,linkedList.getSize());
		assertEquals(child1,linkedList.getStart());
		assertEquals(child2,linkedList.getStart().getLink());
		assertEquals(child4,linkedList.getEnd());
		assertEquals(child1,linkedList.getEnd().getLink());
		
		
		linkedList = new CircularLinkedList();
		
		//postion == size
		linkedList.insertNextChild(child1);
		linkedList.insertNextChild(child2);
		linkedList.insertNextChild(child3);
		assertEquals(3,linkedList.getSize());
		linkedList.deleteChildAtPosition(3);
		assertEquals(2,linkedList.getSize());
		assertEquals(child1,linkedList.getStart());
		assertEquals(child2,linkedList.getStart().getLink());
		assertEquals(child1,linkedList.getEnd().getLink());
		
		
	}
	
	@Test
	void testResetStartAndEnd() {
		CircularLinkedList linkedList = new CircularLinkedList();
		Child child1 = new Child(1,null);
		Child child2 = new Child(2,null);
		Child child3 = new Child(3,null);
		Child child4  = new Child(4,null);
		
		linkedList.insertNextChild(child1);
		linkedList.insertNextChild(child2);
		linkedList.insertNextChild(child3);
		linkedList.insertNextChild(child4);
		
		linkedList.resetStartAndEnd(3);
		assertEquals(child3,linkedList.getStart());
		assertEquals(child2,linkedList.getEnd());
	}

}
