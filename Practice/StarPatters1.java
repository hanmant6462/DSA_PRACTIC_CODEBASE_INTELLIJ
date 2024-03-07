package Practice;

public class StarPatters1 {

    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
 class StarPatters2 {

    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

class StarPatters3 {

    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=1;i<=4;i++){
            for (int j=3;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

class StarPatters4 {

    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=4;k>=i;k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

class StarPatters5 {

    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

class StarPatters6 {

    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=3;k>=i;k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

class StarPatters7 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}


class StarPatters8 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= 1; j--) {
                if(j>i) {
                    System.out.print(" ");
                }else {
                    System.out.print(" *");
                }
            }

            System.out.println("");
        }
    }
}

class StarPatters9 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

class StarPatters10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            for (int l = 3; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

class StarPatters11 {

    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i*2); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


class StarPatters12 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if(i>=2 && j<=i-1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println("");
        }
    }
}


class StarPatters13 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                if(i>=2 && k>1){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println("");
        }
    }
}


class StarPatters14 {

    public static void main(String[] args) {

        for (int i=5;i>=1;i--){
            for (int j=5;j>i;j--){
                System.out.print(" ");
            }
            for (int k =1;k<(i*2);k++){
                if(k>1 && k<(i*2)-1){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println("");
        }
    }
}


class StarPatters15 {

    public static void main(String[] args) {

        for (int i =0;i<5;i++){
            for (int j =0;j<5;j++){
                if(i == j || i+j==5-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

class StarPatters16 {

    public static void main(String[] args) {

        for (int i =1;i<=5;i++){
            for (int j =1;j<=5;j++){
                if(i >= 2 && j >=2 && i<=4 && j <= 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}