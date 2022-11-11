public class Main {
    public static void main(String[] args) {


        for (int i=2; i<=100; i++)// yazdıracağımız sayı döngüsü
        {
            int control=0; // her sayı da kontrolu sıfırlamak için ilk for un içine yazdım
            for (int j=2; j<=i; j++) // bölünen sayıların döngüsü
            {
                if (j!=i && i%j==0) // sayı kendisi değilse bölünen bir sayı varsa control değişkenini arttırıyoruz
                {
                    control++;
                }
            }
            if(control==0) // control değişkeni 0'sa kendisi hariç bölünen bir sayı yoktur
                System.out.print(i+" ");

        }

    }
}