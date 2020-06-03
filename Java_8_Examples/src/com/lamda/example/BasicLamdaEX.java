package com.lamda.example;

interface Data {
	void display();
}

/*class imp implements In1 {
	public void display() {
		System.out.println("Geek");
	}

}*/

class BasicLamdaEX {
	public static void main(String[] args) {
		//In1 t = new imp();
		Data t = () -> System.out.println("DATA");
		t.display();

	}
}
