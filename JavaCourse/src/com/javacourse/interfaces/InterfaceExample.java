package com.javacourse.interfaces;

interface one_1{
	void print_one();
}
interface one_2{
	void print_one();
}
interface one_3 extends one_1,one_2{
	void print_three();
}

class TestInterface implements one_3{

	@Override
	public void print_one() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void print_three() {
		// TODO Auto-generated method stub
		
	}

}
public class InterfaceExample {

	public static void main(String[] args) {

	}

}
