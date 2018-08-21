package pl.com.sages.hello;

class AsteriskNum extends AsteriskSquare {
    private char number;


     AsteriskNum(int size, char number) {

        super(size);
        this.number=number;
        switch(number){
            case '0': for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    if((i == 0) || (i == (size - 1)) || (j == 0) || (j == (size - 1))){
                        this.charMatrix[i][j]='*';
                    }else{
                        this.charMatrix[i][j]=' ';
                    }
                }
            }
            break;
            case '1':for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    if(j == (size - 1)){
                        this.charMatrix[i][j]='*';
                    }else{
                        this.charMatrix[i][j]=' ';
                    }
                }
            }
        }
    }
}
