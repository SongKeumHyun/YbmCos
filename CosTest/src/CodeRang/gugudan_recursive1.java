package CodeRang;

 class gugudan_recursive1 {
	public static void gugudan(int dan, int depth){
		if(depth < 1)
			return;
		
		gugudan(dan, depth-1);
		System.out.println(dan + " * " + depth + " = " + dan*depth);
		
	}

	public static void main(String[] args) {
		int dan = 2;
		gugudan(dan, 9);
	}

}
