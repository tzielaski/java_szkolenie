package pl.com.sages.hello;

class Book {
    private String title;
    private int pageCount;

    Book(String title, int pageCount) {
        if(pageCount<0){
            System.err.println("A book cannot have a negative number of pages!");
            System.exit(1);
        }
        this.title = title;
        this.pageCount = pageCount;
    }

    static int sumPageCount(Book[] books){
        int sum=0;
        for(Book book: books){
            sum+=book.pageCount;
        }
        return sum;
    }

    static Book getLongestBook(Book[] books){
        int max=0;
        int max_i = 0;
        for(int i=0;i<books.length;i++){
            if(max<books[i].pageCount){
                max=books[i].pageCount;
                max_i=i;
            }
        }
        return books[max_i];
    }

    @Override
    public String toString(){
        return(title + ", pages: " + pageCount);
    }
}
