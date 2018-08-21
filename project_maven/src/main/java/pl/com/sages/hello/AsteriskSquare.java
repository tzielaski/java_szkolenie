package pl.com.sages.hello;

public class AsteriskSquare {
    char[][] charMatrix;
    int size;


    AsteriskSquare(int size) {
        this.size = size;
        this.charMatrix = new char[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                this.charMatrix[i][j]='*';
            }
        }
    }

    AsteriskSquare() {
        size=0;
        charMatrix=null;
    }

    public char[][] getCharMatrix() {
        return charMatrix;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(char[] pixelRow:charMatrix){
            for(char pixel:pixelRow){
                stringBuilder.append(pixel);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
