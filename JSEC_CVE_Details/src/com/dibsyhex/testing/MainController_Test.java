package com.dibsyhex.testing;

import java.util.HashMap;
import java.util.Map;

import com.dibsyhex.controllers.MainController;

public class MainController_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("vendor_id","0");
		map.put("product_id","0");
		
		MainController obj=new MainController(map, 2);
		System.out.println(obj.getUrl());
	}

}
