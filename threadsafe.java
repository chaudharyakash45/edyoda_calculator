
package com.crunchify;
 
public class CrunchifySingleton {
 
	private static CrunchifySingleton instance = null;
 
	protected CrunchifySingleton() {
	}
 
	
	public static CrunchifySingleton getInstance() {
		if (instance == null) {
			
			synchronized (CrunchifySingleton.class) {
				if (instance == null) {
					instance = new CrunchifySingleton();
				}
			}
		}
		return instance;
	}
}