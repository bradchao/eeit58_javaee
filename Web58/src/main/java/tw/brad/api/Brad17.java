package tw.brad.api;

public class Brad17 {
	private int x, y;
	
	public Brad17(String x, String y) throws Exception {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
	}
	
	public int plus() {
		return x + y;
	}
}
