package pl.com.sages.hello;

class ChristmasTree {
    char[][] getPainting() {
        return painting;
    }

    private char[][] painting;


    ChristmasTree() {
        painting = new char[8][8];
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                for (int j = 0; j < 8; j++) {
                    painting[i][j] = '*';
                }

            } else if (i == 7) {
                for (int j = 0; j < 8; j++) {
                    if (j == 3 || j == 4) {
                        painting[i][j] = '|';
                    } else {
                        painting[i][j] = '*';
                    }

                }

            } else if (i % 2 == 1) {
                for (int j = 0; j < 8; j++) {
                    switch (j) {
                        case 3:
                            painting[i][j] = '/';
                            break;
                        case 4:
                            painting[i][j] = '\\';
                            break;
                        default:
                            painting[i][j] = '*';
                            break;
                    }

                }

            } else if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    switch (j) {
                        case 2:
                            painting[i][j] = '/';
                            break;
                        case 3:
                            painting[i][j] = '_';
                            break;
                        case 4:
                            painting[i][j] = '_';
                            break;
                        case 5:
                            painting[i][j] = '\\';
                            break;
                        default:
                            painting[i][j] = '*';
                            break;
                    }

                }

            }
        }
    }


}
