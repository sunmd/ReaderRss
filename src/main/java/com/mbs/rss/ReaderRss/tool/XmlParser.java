package com.mbs.rss.ReaderRss.tool;

public class XmlParser {
	private static XmlParser instance = null; 
	private XmlParser() {
		super();
	}
	
	public static XmlParser getInstance() {
		if(instance == null) {
			synchronized (XmlParser.class) {
				instance = new XmlParser();
			}
			
		}
		return instance;
	}
}
