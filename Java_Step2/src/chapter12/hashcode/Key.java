package chapter12.hashcode;

import java.util.Objects;

public class Key {

	public int number;
	public int name;
	public int addr;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}

		return false;
	}

}
