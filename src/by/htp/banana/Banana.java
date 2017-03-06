package by.htp.banana;

import java.util.Comparator;

public class Banana implements Comparator<Banana>, Comparable<Banana> {
	
	private int size;
	private String taste;
	
	public Banana() {
		super();
	}

	public Banana(int size, String taste) {
		super();
		this.size = size;
		this.taste = taste;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Override
	public int compareTo(Banana compareBanana) {
		int compareSize = compareBanana.getSize()- this.size;
		int compareTaste = rangTaste(compareBanana.getTaste())- rangTaste(this.taste) ;
		return  (compareSize != 0 ? compareSize : compareTaste);
	}
	
	@Override
	public String toString() {
		return "Banana [size=" + size + ", taste=" + taste + "]";
	}

	private static int rangTaste(String taste) {
		int a= 0;
		switch (taste){
			case "awful": a= 1;
			break;
			case "bad": a= 2;
			break;			
			case "normal": a= 3;
			break;
			case "good": a= 4;
			break;			
			case "best": a= 5;
			break;			
		}	
		return a;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + size;
		result = prime * result + ((taste == null) ? 0 : taste.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banana other = (Banana) obj;
		if (size != other.size)
			return false;
		if (taste == null) {
			if (other.taste != null)
				return false;
		} else if (!taste.equals(other.taste))
			return false;
		return true;
	}

	@Override
	public int compare(Banana o1, Banana o2) {
		int compareSize = o2.getSize()- o1.size;
		int compareTaste = rangTaste(o2.getTaste())- rangTaste(o1.taste) ;
		return  (compareSize != 0 ? compareSize : compareTaste);	}
}
