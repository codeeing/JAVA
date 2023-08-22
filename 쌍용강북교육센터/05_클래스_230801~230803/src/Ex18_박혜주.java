// 230802
class Data{
	private int i;
	private double d;
	private String s;
	private char c;
	private boolean b;
	
	// setter
	void setInt(int i){
		this.i = i;
	}
	void setDouble(double d){
		this.d = d;
	}
	void setString(String s){
		this.s = s;
	}
	void setChar(char c){
		this.c = c;
	}
	void setBoolean(boolean b){
		this.b = b;
	}
	
	// getter
	int getInt() {
		return this.i;
	}
	double getDouble() {
		return this.d;
	}
	String getString() {
		return this.s;
	}
	char getChar() {
		return this.c;
	}
	boolean getBoolean() {
		return this.b;
	}
}
public class Ex18_박혜주 {

	public static void main(String[] args) {
		Data data = new Data();
		
		data.setInt(3);
		data.setDouble(5.0);
		data.setString("문자열");
		data.setChar('A');
		data.setBoolean(true);
		
		System.out.println(data.getInt());
		System.out.println(data.getDouble());
		System.out.println(data.getString());
		System.out.println(data.getChar());
		System.out.println(data.getBoolean());
	}

}
