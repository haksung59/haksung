package aaa.practiceJava;

public class CodingTest2 {

	public static void main(String[] args) {
		
		String target = "abc";
		String[] words = {"a","b","c","ab","ac","bc","abc"};
		
		int count = 0;
		boolean chk = false;
		
		String[] targetsplit = target.split("");
		for(int i=0; i<words.length; i++) {
			String[] wordssplit = words[i].split("");
			int wordscount = 0;
			for(int j=0; j<wordssplit.length; j++) {
				
				for(int k=0; k<targetsplit.length; k++) {
					if(wordssplit[j].equals(targetsplit[k])) {
						wordscount++;
					}
					if(wordscount==wordssplit.length) {
						chk = true;
					}
				}
				
				if(chk) {
					count++;
					chk = false;
				}
			
			}
		}
		
		System.out.println(count);

	}

}
