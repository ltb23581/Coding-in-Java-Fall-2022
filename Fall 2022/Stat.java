public class Stat {

	private double[] data;

	public Stat() {
		double d[] = { 0.0 };
		this.data = d;
	}

	public Stat(double[] d) {
		double store[] = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			store[i] = d[i];
		}
		this.data = store;
	}

	public double[] getData() {
		double d[] = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			d[i] = data[i];
		}
		return d;
	}

	public void setData(double[] d) {
		double store[] = d;
		this.data = store;
	}

	public boolean equals(Stat s) {
		double[] data2 = s.getData();
		if (data.length != data2.length) {
			return false;
		}
		for (int i = 0; i < data.length; i++) {
			if (Double.compare(data[i], data2[i]) != 0) {
				return false;
			}
		}
		return true;
	}

	public String toString() {
		if (data == null) {
			return "[]";
		} else {
			String print;
			print = "[";
			for (int i = 0; i < data.length - 1; i++) {
				print = print + data[i] + ",";
			}
			if (data.length == 0) {
				print = print + "]";
			} else {
				print = print + data[data.length - 1] + "]";
			}
			return print;
		}
	}

	public double min() {
		if (data.length == 0) {
			return Double.NaN;
		} else {
			double smallest = data[0];
			for (int i = 1; i < data.length; i++) {
				if (smallest > data[i]) {
					smallest = data[i];
				}
			}
			return smallest;
		}
	}

	public double max() {
		if (data.length == 0) {
			return Double.NaN;
		} else {
			double biggest = data[0];
			for (int i = 1; i < data.length; i++) {
				if (biggest < data[i]) {
					biggest = data[i];
				}
			}
			return biggest;
		}
	}

	public double average() {
		if (data.length == 0) {
			return Double.NaN;
		} else {
			double average = data[0];
			for (int i = 1; i < data.length; i++) {
				average += data[i];
			}
			average = average / data.length;
			return average;
		}
	}

	public double mode() {
		if (data.length == 0) {
			return Double.NaN;
		} else {
			double mode = data[0];
			int saveAmount = 0;
			boolean repeat = false;
			for (int i = 0; i < data.length; i++) {
				int count = 0;
				for (int j = i + 1; j < data.length; j++) {
					if (Double.compare(data[i], data[j]) == 0) {
						count++;
					}
				}
				if (count > saveAmount) {
					repeat = false;
					saveAmount = count;
					mode = data[i];
				} else if (count == saveAmount && saveAmount > 0) {
					repeat = true;
				}
			}
			if ((saveAmount > 0 && repeat == false) || data.length == 1) {
				return mode;
			} else {
				return Double.NaN;
			}
		}
	}
}