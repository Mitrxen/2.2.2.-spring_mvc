package web.model;

public class Car {
	private String model;
	private int series;
	private Color color;
	
	public Car() {
		this.model = "Some model";
		this.series = (int)(Math.random() * 100) + 1900;
		switch((int)(Math.random() * 5)) {
			case 0: this.color = Color.WHITE; break;
			case 1: this.color = Color.BLACK; break;
			case 2: this.color = Color.RED; break;
			case 3: this.color = Color.BLUE; break;
			case 4: this.color = Color.GREEN; break;
		}
		
	}

	public Car(String model, int series, Color color) {
		super();
		this.model = model;
		this.series = series;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
