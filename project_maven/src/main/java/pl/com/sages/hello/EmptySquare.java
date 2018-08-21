package pl.com.sages.hello;

class EmptySquare extends AsteriskSquare {


    EmptySquare(int size) {
        this.size = size;
        this.charMatrix = new char[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if((i == 0) || (i == (size - 1)) || (j == 0) || (j == (size - 1))){
                    this.charMatrix[i][j]='*';
                }else{
                    this.charMatrix[i][j]=' ';
                }
            }
        }
    }


}
