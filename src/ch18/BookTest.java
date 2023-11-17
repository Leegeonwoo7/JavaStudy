package ch18;

public class BookTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyArr = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		copyArr[0] = new Book();
		copyArr[1] = new Book();
		copyArr[2] = new Book();
		copyArr[3] = new Book();
		copyArr[4] = new Book();

		//깊은복사
		for(int i=0; i<library.length; i++) {
			copyArr[i].setTitle(library[i].getTitle());
			copyArr[i].setAuthor(library[i].getAuthor());
		}
		System.out.println("====library=====");
		for(int i=0; i<library.length; i++) {
			library[i].showInfo();
		}
		System.out.println();
		System.out.println("====copyArr=====");
		for(int i=0; i<library.length; i++) {
			copyArr[i].showInfo();
		}
		
		library[0].setAuthor("라면");
		library[0].setTitle("오잉");
		
		
		System.out.println();
		System.out.println();
		System.out.println("====library=====");
		for(int i=0; i<library.length; i++) {
			library[i].showInfo();
		}
		System.out.println();
		System.out.println("====copyArr=====");
		for(int i=0; i<library.length; i++) {
			copyArr[i].showInfo();
		}
	
	}
}
