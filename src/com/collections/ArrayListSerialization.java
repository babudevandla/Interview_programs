package com.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArrayListSerialization {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Babu");
		al.add("Sayed");
		al.add("Narasimha");
		al.add("Prakash");
		al.add("Ismail");
		al.add("Nalini");

		try {
			// Serialization
			FileOutputStream fos = new FileOutputStream("D:\\app\\file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			// Deserialization
			FileInputStream fis = new FileInputStream("D:\\\\app\\\\file.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list = (ArrayList) ois.readObject();
			System.out.println(list);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
