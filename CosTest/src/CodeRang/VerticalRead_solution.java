public class VerticalRead_solution{
	
	public static String solution(String []sample){
		String answer = "";
		
		int maxlenth = 0;
		
		for(int i=0; i<sample.length;i++){
			int tmp = sample[i].length();
			if(maxlenth < tmp)
				maxlenth = tmp;
		}
		
		for(int i=0; i<maxlenth;i++){
			for(int j=0; j<sample.length;j++){
				if(i < sample[j].length())
					answer += sample[j].charAt(i);
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		String []sample1 = {"ABCDE", "abcde", "01234", "FGHIJ", "fghij"};
		String res1 = solution(sample1);
		System.out.println(res1);
		
		String []sample2 = {"AABCDD", "afzz", "09121", "a8EWg6", "P5h3kx"};
		String res2 = solution(sample2);
		System.out.println(res2);
	}
}
