package CodeRang;

 class gugudan_recursive2 {
	public static void gugudan(int dan, int depth){
		if(depth > 9)
			return;
		
		System.out.println(dan + " * " + depth + " = " + dan*depth);
		gugudan(dan, depth+1);
		
		
	}

	public static void main(String[] args) {
		int dan = 2;
		gugudan(dan, 1);
	}

}
