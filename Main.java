import java.util.Scanner;

public class Main {

    private static void menu() {
        System.out.println("--------Program Menghitung Bangun Ruang--------");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Segitiga");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            menu();
            int pilih = s.nextInt();
            s.nextLine(); // buang newline

            if (pilih == 5) {
                System.out.println("Keluar program...");
                break;
            }

            switch (pilih) {
                case 1: {
                    System.out.println("----------Lingkaran----------");
                    System.out.print("Masukkan jari-jari : ");
                    double r = s.nextDouble(); s.nextLine();
                    System.out.print("Warna : ");
                    String color = s.nextLine();

                    Circle circle = new Circle(r, color);
                    System.out.println("Warna          : " + circle.getColor());
                    System.out.println("Jari-jari      : " + circle.getRadius());
                    System.out.println("Keliling Lingkaran : " + circle.getPerimeter());
                    System.out.println("Luas Lingkaran     : " + circle.getArea());
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("----------Persegi----------");
                    System.out.print("Masukkan panjang sisi : ");
                    double side = s.nextDouble(); s.nextLine();
                    System.out.print("Warna : ");
                    String color = s.nextLine();

                    Square sq = new Square(side, color);
                    System.out.println("Warna        : " + sq.getColor());
                    System.out.println("Panjang Sisi : " + sq.getSide());
                    System.out.println("Keliling Persegi : " + sq.getPerimeter());
                    System.out.println("Luas Persegi     : " + sq.getArea());
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("----------Persegi Panjang----------");
                    System.out.print("Masukkan panjang : ");
                    double p = s.nextDouble();
                    System.out.print("Masukkan lebar   : ");
                    double l = s.nextDouble(); s.nextLine();
                    System.out.print("Warna : ");
                    String color = s.nextLine();

                    Rectangle rp = new Rectangle(p, l, color);
                    System.out.println("Warna          : " + rp.getColor());
                    System.out.println("Panjang & Lebar: " + rp.getLength() + " & " + rp.getWidth());
                    System.out.println("Keliling Persegi Panjang : " + rp.getPerimeter());
                    System.out.println("Luas Persegi Panjang     : " + rp.getArea());
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println("----------Segitiga Siku-Siku----------");
                    System.out.print("Masukkan alas   : ");
                    double a = s.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    double t = s.nextDouble(); s.nextLine();
                    System.out.print("Warna : ");
                    String color = s.nextLine();

                    RightTriangle tri = new RightTriangle(a, t, color);
                    System.out.println("Warna       : " + tri.getColor());
                    System.out.println("Alas & Tinggi : " + tri.getBase() + " & " + tri.getHeight());
                    System.out.println("Keliling Segitiga : " + tri.getPerimeter());
                    System.out.println("Luas Segitiga     : " + tri.getArea());
                    System.out.println();
                    break;
                }
                default:
                    System.out.println("Input tidak valid");
                    System.out.println();
            }
        }
        s.close();
    }
}
