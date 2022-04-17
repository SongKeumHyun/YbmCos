package CodeRang;

 class gugudan_loop {
	public static void gugudan(int dan, int depth){

		for(int i = 1; i <= depth; i++){
		    System.out.println(dan + " * " + i + " = " + dan*i);
		}		
	}
	
	public static void main(String[] args) {
		int dan = 2;
		gugudan(dan, 9);
	}
}
