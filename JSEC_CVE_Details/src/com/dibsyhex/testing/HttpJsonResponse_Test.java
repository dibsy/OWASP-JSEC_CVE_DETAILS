package com.dibsyhex.testing;

import com.dibsyhex.models.HttpJsonResponse;

public class HttpJsonResponse_Test {

	public static void main(String[] args) {
		HttpJsonResponse httpJsonResponse=new HttpJsonResponse();
		httpJsonResponse.setUrl("http://www.cvedetails.com/json-feed.php?numrows=5&vendor_id=0&product_id=0&version_id=0&hasexp=1&opec=0&opov=0&opcsrf=0&opfileinc=0&opgpriv=0&opsqli=0&opxss=0&opdirt=0&opmemc=0&ophttprs=0&opbyp=0&opginf=0&opdos=0&orderby=3&cvssscoremin=0");
		httpJsonResponse.process();
		

	}

}
