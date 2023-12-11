package linkedList_apply_project;

import java.util.Scanner;

public class ListNode {
	private Student student;
	public ListNode next;
	Scanner sc = new Scanner(System.in);
	
	public ListNode() {
		
	}
	
	public ListNode(String name, int score, ListNode link) {
		this.student = new Student(name, score);
		this.next = link;
	}
	
	
}
