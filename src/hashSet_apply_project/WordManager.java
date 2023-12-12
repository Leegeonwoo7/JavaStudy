package hashSet_apply_project;

import java.util.HashSet;
import java.util.Set;

public class WordManager {
	private Set<String> words;
	
	public WordManager() {
		this.words = new HashSet<>();
	}
	
	public void addWord(String word) {
		words.add(word);
	}
	
	public void findDuplicates(){
		Set<String> uniqueWords = new HashSet<>();
		Set<String> duplicates = new HashSet<>();
		
		for(String word : words) {
			if(!uniqueWords.add(word)) {
				duplicates.add(word);
			}
		}
		
		if(duplicates.isEmpty()) {
			System.out.println("중복된 단어가 없습니다.");
		}else {
			System.out.println("중복된 단어: " + duplicates);
		}
	}
}
