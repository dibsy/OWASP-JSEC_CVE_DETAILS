package com.dibsyhex.testing;

import java.util.HashMap;
import java.util.Map;

import com.dibsyhex.models.URL_Parser;

public class URL_Parser_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("vendor_id","0");
		map.put("product_id","0");
		try{
		URL_Parser obj=new URL_Parser(map, 2);
		obj.processURL();
		System.out.println(obj.getUrl());
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
