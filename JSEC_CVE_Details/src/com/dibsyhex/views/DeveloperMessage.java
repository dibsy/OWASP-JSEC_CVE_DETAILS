package com.dibsyhex.views;

public class DeveloperMessage {
	private String jsecMessage;
	private String cveMessage;
	private String developer;
	
	public DeveloperMessage(){
		developer="Developed by Dibyendu Sikdar\nhttps://twitter.com/dibsyhex\nhttps://github.com/dibsy";
		
		cveMessage="www.cvedetails.com provides an easy to use web interface to CVE vulnerability data.\n " +
				   " You can browse for vendors, products and versions and view cve entries, vulnerabilities,\n" +
				   " related to them. You can view statistics about vendors, products and versions of products.\n" +
				   " CVE details are displayed in a single, easy to use page";
		
		jsecMessage="JSEC CVE DETAILS is an opensource application that uses the api provided by cvedetails.com\n"+
					"The developer do not maintain/keep/store all these information about the exploits and other stuffs\n"+
					"This appication just uses the api of the cve details to fetch and display information\n"+
					"The developer should not be held responsible if the information is misused";
	}
	
	
	public String getJsecMessage() {
		return jsecMessage;
	}
	public void setJsecMessage(String jsecMessage) {
		this.jsecMessage = jsecMessage;
	}
	public String getCveMessage() {
		return cveMessage;
	}
	public void setCveMessage(String cveMessage) {
		this.cveMessage = cveMessage;
	}


	public String getDeveloper() {
		return developer;
	}


	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	
	
	
}
