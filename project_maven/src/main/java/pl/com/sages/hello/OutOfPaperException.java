package pl.com.sages.hello;

class OutOfPaperException extends RuntimeException {

    OutOfPaperException(String msg){
        super("OutOfPaperException: " + msg);
    }
}
