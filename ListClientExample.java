/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.LinkedList;
	import java.util.List;
	
	public class ListClientExample {
	@SuppressWarnings("rawtypes")
	private List list;
	
	@SuppressWarnings("rawtypes")
	public ListClientExample() {
	list = new LinkedList();
	}
	
	@SuppressWarnings("rawtypes")
	public List getList() {
	return list;
	}
	
	public static void main(String[] args) {
	ListClientExample lce = new ListClientExample();
	@SuppressWarnings("rawtypes")
	List list = lce.getList();
	System.out.println(list);
	}
}
