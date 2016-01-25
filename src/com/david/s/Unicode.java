package com.david.s;

public class Unicode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(toUnicode("好a的asdfa"));
	}
	
	 public static String toUnicode(String str){
         char[]arChar=str.toCharArray();
         int iValue=0;
         String uStr="";
         for(int i=0;i<arChar.length;i++){
             iValue=(int)str.charAt(i);           
             if(iValue<=256){
               // uStr+="& "+Integer.toHexString(iValue)+";";
                 uStr+="\\"+Integer.toHexString(iValue);
             }else{
               // uStr+="&#x"+Integer.toHexString(iValue)+";";
                 uStr+="\\u"+Integer.toHexString(iValue);
             }
         }
         return uStr;
     }

}
