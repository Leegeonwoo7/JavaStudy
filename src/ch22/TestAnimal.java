package ch22;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다");
	}
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 날아갑니다.");
	}
	public void flying() {
		System.out.println("독수리가 두 날개를 쭉 펴고 날아오릅니다.");
	}
}

public class TestAnimal {
	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(eAnimal);
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		
		TestAnimal test = new TestAnimal();
		test.testDowncasting(animalList);
		
		}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public void testDowncasting(ArrayList<Animal> list) {
		for(int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunt();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}else {
				System.out.println("없는 인스턴스 입니다.");
			}
		}
		
	}
}


