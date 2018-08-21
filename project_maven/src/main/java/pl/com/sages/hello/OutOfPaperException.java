package pl.com.sages.hello;

class OutOfPaperException extends Exception {

    OutOfPaperException(String msg){
        super("OutOfPaperException: " + msg);
    }
}
