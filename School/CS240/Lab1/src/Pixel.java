
public class Pixel {
	private int red;
	private int green;
	private int blue;
	
	public Pixel(int r, int g, int b){
		red = r;
		green = g;
		blue = b;
	}
	
	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}
	
	public void printPixel(){
		System.out.println("RGB: " + red + ", " + green + ", " + blue);
	}
	
	public void invert(){
		red = 255 - red;
		green = 255- green;
		blue = 255 - blue;
	}
	
	public void grayScale(){
		int gray = (red + green + blue)/3;
		red = gray;
		green = gray;
		blue = gray;
	}
	
	public void setAll(int v){
		red = v;
		green = v;
		blue = v;
	}
}
