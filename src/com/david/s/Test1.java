package com.david.s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		char s = 'a';
//		System.out.println((int)s + "");
//		StringBuffer sb = new StringBuffer();
//		sb.append(s);
//		sb.delete(1, 2);
//		s.toCharArray();
		
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("12", "b");
//		map.put("3", "a");
//		map.put("2", "c");
//		Map<String, String> sortedMap = sortMapValue(map);
//		for(Map.Entry<String, String> entry:sortedMap.entrySet()){
//			System.out.println(entry.getKey() + " , " + entry.getValue());
//		}
		//排序
//		int[] b = {4,1,2,3};
//		int[] bubble = QuickSort.quickS(b, 0, b.length-1);
		//冒泡
//		int[] bubble = bubbleSort(b);
//		for (int i : bubble) {
//			System.out.print(i + ",");
//		}
		
//		int[] a = {2,3,4};
//		int[] c = concatArray(a, b);
//		for (int i = 0; i < c.length; i++) {
//			System.out.println(c[i]);
//		}
//		int[] d = quickSort(b, 0, b.length-1);
//		for (int i = 0; i < d.length; i++) {
//			System.out.println(d[i]);
//			
//		}
		
		//单链表反转		
//		Node h = createNode();
//		while(h != null){
//			System.out.print(h.getCount() + " ");
//			h = h.getNextNode();
//		}
//		System.out.println("");
//		
//		h = reverse(h);
//		while(h != null){
//			System.out.print(h.getCount() + " ");
//			h = h.getNextNode();
//		}
		
		//统计字母
		countChar("asdfadsffefqewf");
	}
	
	public static Node reverse(Node head){
		if(head == null){
			return head;
		}
		Node pre = head;
		Node cur = head.getNextNode();
		Node next = null;
		while(cur != null){
			next = cur.getNextNode();
			cur.setNextNode(pre);
			pre = cur;
			cur = next;
		}
		head.setNextNode(null);
		head = pre;
		return head;
	}
	
	public static Node createNode(){
		Node head = new Node(0);
		Node tmp = null;
		Node cur = null;
		for(int i = 1; i<10; i++){
			tmp = new Node(i);
			if(i == 1){
				head.setNextNode(tmp);
			}else{
				cur.setNextNode(tmp);
			}
			cur = tmp;
		}
		
		return head;
	}
	
	//统计字母
	public static void countChar(String s){
		char[] c = s.toCharArray();
		int[] temp = new int[123];
		for(int i = 0; i < c.length; i ++){
			temp[(int)c[i]]++;
		}
		
		for(int i = (int)'A'; i < 123; i ++){
			System.out.println((char)i + " : " + temp[i]);
		}
	}
	
	public static int[] bubbleSort(int[] arr){
		int temp = 0;
		int flag = 1;
		for (int i = 0; i < arr.length-1 && flag == 1; i++) {
			flag = 0;
			for (int j = 0; j<arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
		}
		return arr;
	}
	
	public static int[] quickSort(int[] arr,int left,int right){
		int dp;
		if(left < right){
			dp = partition(arr, left, right);
			quickSort(arr, left, dp -1);
			quickSort(arr, dp + 1, right);
		}
		
		return arr;
	}
	
	public static int partition(int[] arr,int left,int right){
		int pivot = arr[left];
		while(left < right){
			while(left < right && arr[right] >= pivot)
				right--;
			if(left < right)
				arr[left++] = arr[right];
			while(left < right && arr[left] <= pivot)
				left++;
			if(left < right)
				arr[right--] = arr[left];
		}
		arr[left] = pivot;
		return left;
	}
	
	public static int[] concatArray(int[] aArray,int[] bArray){
		int[] cArray = new int[aArray.length + bArray.length];
		int a_index = 0,b_index = 0, i = 0;
		while(a_index < aArray.length && b_index < bArray.length){
			if(aArray[a_index] < bArray[b_index]){
				cArray[i++] = aArray[a_index++];
			}else{
				cArray[i++] = bArray[b_index++];
			}
		}
		
		while(a_index < aArray.length)
			cArray[i++] = aArray[a_index++];
		while(b_index < bArray.length)
			cArray[i++] = bArray[b_index++];
		return cArray;
	}
	
	public static Map<String, String> sortMapKey(Map<String, String> oriMap){
		Map<String, String> sortedMap = new TreeMap<String, String>(new Comparator<String>() {
			public int compare(String key1,String key2){
				int intKey1 = 0, intKey2 = 0;
				try {
					intKey1 = getInt(key1);
					intKey2 = getInt(key2);
				} catch (Exception e) {
					// TODO: handle exception
				}
				return intKey1 - intKey2;
			}
		});
		sortedMap.putAll(oriMap);
		return sortedMap;
		
	}
	
	public static Map<String,String> sortMapValue(Map<String, String> oriMap){
		Map<String, String> sortedMap = new LinkedHashMap<String, String>();
		if(oriMap != null && !oriMap.isEmpty()){
			ArrayList<Map.Entry<String, String>> entryList = new ArrayList<Map.Entry<String,String>>(oriMap.entrySet());
			Collections.sort(entryList, new Comparator<Map.Entry<String, String>>() {

				@Override
				public int compare(Entry<String, String> o1,
						Entry<String, String> o2) {
					// TODO �Զ���ɵķ������
					
					return o1.getValue().compareTo(o2.getValue());
				}
			});
			Iterator<Map.Entry<String, String>> iter = entryList.iterator();
			Map.Entry<String, String> tempEntry = null;
			while (iter.hasNext()) {
				tempEntry = (Map.Entry<String,String>) iter
						.next();
				sortedMap.put(tempEntry.getKey(), tempEntry.getValue());
			}
		}
		return sortedMap;
		
	}
	
	private static int getInt(String str){
		int i = 0;
		try {
			Pattern p = Pattern.compile("^\\d+");
			Matcher m = p.matcher(str);
			if(m.find()){
				i = Integer.valueOf(m.group());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return i;
	}
}
