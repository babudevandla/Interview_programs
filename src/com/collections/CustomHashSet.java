package com.collections;

import java.util.HashMap;

public class CustomHashSet<T> {

	private transient HashMap<Object, Object> map;

    private static final Object PRESENT = new Object();

    public CustomHashSet() {
        map = new HashMap<>();
    }
	public boolean add(Object e) {
		return map.put(e,  PRESENT) == null;
	}
}
