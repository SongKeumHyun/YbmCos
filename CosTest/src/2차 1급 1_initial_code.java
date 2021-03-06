
class Solution21 {
    interface Book{
        public int getRentalPrice(int day);
    }
    
    class ComicBook implements Book {
    	public int getRentalPrice(int day){
            int cost = 500;
            day -= 2;
            if(day > 0)
                cost += day *200;
            return cost;
        }
    }
    
    class Novel implements Book {
    	public int getRentalPrice(int day){
            int cost = 1000;
            day -= 3;
            if(day > 0)
                cost += day *300;
            return cost;
        }
    }

    public int solution21(String[] bookTypes, int day) {
        Book[] books = new Book[50];
        int length = bookTypes.length;
        for(int i = 0; i < length; ++i){
            if(bookTypes[i].equals("comic"))
                books[i] = new ComicBook();
            else if(bookTypes[i].equals("novel"))
                books[i] = new Novel();   
        }
        int totalPrice = 0;
        for(int i = 0; i < length; ++i)
            totalPrice += books[i].getRentalPrice(day);
        return totalPrice;
    }


    // �븘�옒�뒗 �뀒�뒪�듃耳��씠�뒪 異쒕젰�쓣 �빐蹂닿린 �쐞�븳 main 硫붿냼�뱶�엯�땲�떎.
    public static void main(String[] args) {
        Solution21 sol = new Solution21();
        String[] bookTypes = {"comic", "comic", "novel"};
        int day = 4;
        int ret = sol.solution21(bookTypes, day);

        // [�떎�뻾] 踰꾪듉�쓣 �늻瑜대㈃ 異쒕젰 媛믪쓣 蹂� �닔 �엳�뒿�땲�떎.
        System.out.println("solution 硫붿냼�뱶�쓽 諛섑솚 媛믪� " + ret + " �엯�땲�떎.");
    }
}