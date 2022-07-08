import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Mayın tarlası oyununa hoş geldin!\n"+
                "Koordinat secerken, bayrak dikmek istersen koordinattan sonra 'f' harfini gir, orneğin: ( 3 1 f)\n +" +
                "tarlanın boyutunu gir, ornegin(4,7) :    ");
        int x,y;
        x=scanner.nextInt();
        y=scanner.nextInt();
        MineSweeper mineSweeper=new MineSweeper(x,y);
        mineSweeper.run();
        scanner.close();
    }
}
