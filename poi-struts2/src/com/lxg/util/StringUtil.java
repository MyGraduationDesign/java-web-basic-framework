package com.lxg.util;

/**
 * 字符串判断工具
 * @author Administrator
 *
 */
public class StringUtil {

	/**
	 * 判断字符串为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if("".equals(str)||str==null){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 判断字符串不为空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		if(!"".equals(str)&&str!=null){
			return true;
		}else{
			return false;
		}
	}
	
}
