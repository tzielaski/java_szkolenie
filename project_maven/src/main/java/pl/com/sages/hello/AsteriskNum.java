package pl.com.sages.hello;

import static java.lang.Math.floor;

class AsteriskNum extends AsteriskSquare {
    private char number;


     AsteriskNum(int size, char number) {

        super(size);
        if(size%5 != 0){
            System.err.println("The size must be dividable by 5.");
            System.exit(1);
        }
        this.number=number;
        Double dMiddle=floor((double) size/2.);
        int middle = dMiddle.intValue();

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
            break;
            case '2':
                for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    if(i==0 || i == (size - 1) || i==middle){
                        this.charMatrix[i][j]='*';
                    }else if ((i<middle && j==size-1)||i>middle && j==0){
                        this.charMatrix[i][j]='*';
                    }
                    else{
                        this.charMatrix[i][j]=' ';
                    }
                }
            }
                break;
            case '3':
                for(int i=0;i<size;i++){
                    for(int j=0;j<size;j++){
                        if(i==0 || i == (size - 1) || i==middle){
                            this.charMatrix[i][j]='*';
                        }else if ((i<middle && j==size-1)||i>middle && j==size-1){
                            this.charMatrix[i][j]='*';
                        }
                        else{
                            this.charMatrix[i][j]=' ';
                        }
                    }
                }
                break;
            case '4':
                for(int i=0;i<size;i++){
                    for(int j=0;j<size;j++){
                        if(i==middle){
                            this.charMatrix[i][j]='*';
                        }else if ((i<middle && (j==0 ||j==size-1))||i>middle && j==size-1){
                            this.charMatrix[i][j]='*';
                        }
                        else{
                            this.charMatrix[i][j]=' ';
                        }
                    }
                }
                break;
        }
    }
}
