package com.bridgelabz;

public class CreateHtml {

	StringBuilder html;
	
	CreateHtml(String fname, String lname, String email, String contact){
		html = new StringBuilder();
		html.append("<!doctype html>\n" + 
				"\n" + 
				"<html>\n" + 
				"\n" + 
				"<head>\n" + 
				"	<title> Details </title>\n" + 
				"	<meta charset = \"utf-8\">\n" + 
				"</head>\n" + 
				"\n" + 
				"<body>\n" + 
				"	<ul>\n");
		
		html.append("<li>" + "Name: " + fname + " " + lname + "</li>\n");
		html.append("<li>" + "Email ID: " + email + "</li>\n");
		html.append("<li>" + "Contact: " + contact + "</li>\n");
		html.append("</ul>\n" + 
				"<a href=\"Edit.html\"> Edit your data </a><br>\n" +
				"<form action = \"LogOut\"   method = \"post\">\n" + 
				"<input type = \"submit\" value = \"Log Out\">\n" + 
				"<input type = \"submit\" value = \"View All Users\" formaction = \"Viewall\">\n" + 
				"<input type = \"submit\" value = \"Delete Account\" formaction = \"Delete\">\n" + 
				"</form>" +
				"</body>\n" + 
				"</html>");
	}
	
	String getHtml() {
		return html.toString();
	}
}
