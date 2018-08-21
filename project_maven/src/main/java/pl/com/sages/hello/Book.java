package pl.com.sages.hello;

class Book {
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

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
        Book longestBook=null;
        for(Book book: books){
            if(max<book.pageCount){
                max=book.pageCount;
                longestBook=book;
            }
        }
        return longestBook;
    }

    @Override
    public String toString(){
        return(title + ", pages: " + pageCount);
    }
}
