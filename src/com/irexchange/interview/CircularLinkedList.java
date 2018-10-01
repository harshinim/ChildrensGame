package com.irexchange.interview;

public class CircularLinkedList {

	protected Child start;
	protected Child end;
	protected int size;
	
	public CircularLinkedList() {
		start = null;
		end = null;
		size = 0;
	}
	
	public int getSize(){
        return size;
    }
	
	public Child getStart() {
		return start;
	}

	public Child getEnd() {
		return end;
	}

	public void insertNextChild(Child next) {
		if(start == null) {
			start = next;
			start.setLink(next);
			end = start;
			
		}else {
			end.setLink(next);
			end = next;
			next.setLink(start);
			
		}
		size++;
	}
	
	public void deleteChildAtPosition(int pos) {
		if (size == 1 && pos == 1)
        {
            start = null;
            end = null;
            size = 0;
            return ;
        }        
        if (pos == 1) 
        {
            start = start.getLink();
            end.setLink(start);
            size--; 
            return ;
        }
        if (pos == size) 
        {
            Child s = start;
            Child prev = start;
            while (s != end)
            {
                prev = s;
                s = s.getLink();
            }
            end = prev;
            end.setLink(start);
            size --;
            return;
        }
        
		Child next = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Child tmp = next.getLink();
                tmp = tmp.getLink();
                next.setLink(tmp);
                break;
            }
            next = next.getLink();
        }
        size-- ;
	}
	
	public void display()
    {
        System.out.print("Children in a circle of game = ");
        Child next = start;
    
        System.out.print(start.getId()+ "->");
        next = start.getLink();
        while (next.getLink() != start) 
        {
            System.out.print(next.getId()+ "->");
            next = next.getLink();
        }
        System.out.print(next.getId()+ "->");
        next = next.getLink();
        System.out.print(next.getId()+ "\n");
    }

	public void resetStartAndEnd(int pos) {
		Child next = start;
        pos = pos - 1 ;
		for (int i = 1; i <= size - 1; i++) 
        {
            if (i == pos) 
            {
            //	System.out.println(next.getId());
                end = next;
                start = next.getLink();
                break;
            }
            next = next.getLink();
        }
		
	}
	
}
