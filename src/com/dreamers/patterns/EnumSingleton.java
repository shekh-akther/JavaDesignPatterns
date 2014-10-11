/**
 * 
 */
package com.dreamers.patterns;

/**
 * Singleton Design pattern using Enum. 
 * 
 * @author Shekh
 *
 */
public enum EnumSingleton {
	
	INSTANCE;
	
	private DummySingleton dummySingleton;
	
	private EnumSingleton (){
		dummySingleton = new DummySingleton();
	}
	
	public DummySingleton getInstance() {
		return dummySingleton;
	}

}
