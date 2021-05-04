package hello;

public class Goldbach {

    public static int isPrime(int tf) {
        int prime = 0;
        if (tf < 2) {
            prime = 0;
        }
        for (int i = 2; i <= tf; i++) {
            if (tf % i == 0 && tf / i > 1 && tf != i) {
                prime = 0;
                break;
            }
            if (tf % i == 0 && tf / i == 1 && tf == i) {
                prime = 1;
            }
        }
        return prime;
    }

    public static int nextPrime(int num) {
        int np = num + 1;
        if (isPrime(np) == 1) {
            return np;
        }
        return nextPrime(num + 1);
    }

    public static void main(String[] args) {
        int[][] primesArr = new int[50][2];
        int k = 1;
        for (int i = 0; i < primesArr.length; i++) {
            for (int j = 0; j < primesArr[i].length; j++) {
//                    while (i > 0) {
//                        primesArr[i][j] = nextPrime(k);
//                        k++;
//                        if (primesArr[i][j] > primesArr[i - 1][j]) {
//                            break;
//                        }
//                    }
                
                primesArr[i][0] = nextPrime(k);
                primesArr[i][1] = nextPrime(k);
                System.out.print("i: " + i + " j: " + j + " == " + primesArr[i][j] + "\t");
            }
            System.out.println("\n");
            k++;
        }
        //            System.out.println(j + " + " + k + " = " + (j + k));
    }
}
