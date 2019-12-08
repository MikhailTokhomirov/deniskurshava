public class Fibonachi {
    public static void main(String[] args) {
        int Fibonachiperamennay1 = 0;
        int Fibonachiperamennay2 = 1;
        int Fibonachiperamennay3;
        for (int i = 0; i <= 23; i++) {
            Fibonachiperamennay3 = Fibonachiperamennay1 + Fibonachiperamennay2;
            Fibonachiperamennay1 = Fibonachiperamennay2;
            Fibonachiperamennay2 = Fibonachiperamennay3;
            System.out.print(Fibonachiperamennay3 + " ");
        }
    }
}


