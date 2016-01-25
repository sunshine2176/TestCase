package com.david.s;


public class BinaryTree {
	int data;
	BinaryTree left;
	BinaryTree right;
	
	public BinaryTree(int data) {
		// TODO 自动生成的构造函数存根
		this.data = data;
		left = null;
		right = null;
	}
	
	public void insert(BinaryTree root,int data){
		if(data > root.data){
			if(root.right == null){
				root.right = new BinaryTree(data);
			}else{
				insert(root.right, data);
			}
		}else{
			if(root.left == null){
				root.left = new BinaryTree(data);
			}else{
				insert(root.left,data);
			}
		}
	}
	
//	public Map<String,String> sortMapKey(Map<String, String> map){
//		Map<String, String> sortMap = new TreeMap<String, String>(new Comparator<String>() {
//			public int compare(String o1,String o2){
//				return o1.compareTo(o2);
//			}
//		});
//		sortMap.putAll(map);
//		return sortMap;
//	}
//	
//	public Map<String,String> sortMapValue(Map<String, String> map){
//		Map<String, String> sortMap = new LinkedHashMap<String,String>();
//		ArrayList<Map.Entry<String, String>> entryList = new ArrayList<Map.Entry<String,String>>(map.entrySet());
//		Collections.sort(entryList, new Comparator<Map.Entry<String, String>>() {
//			public int compare(Entry<String, String> o1,Entry<String,String> o2){
//				return o1.getValue().compareTo(o2.getValue());
//			}
//		});
//		for (Entry<String, String> entry : entryList) {
//			sortMap.put(entry.getKey(), entry.getValue());
//		}
//		
//		return sortMap;
//	}
	
}
