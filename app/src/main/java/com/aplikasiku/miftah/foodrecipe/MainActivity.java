package com.aplikasiku.miftah.foodrecipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView namaResep;
    ImageView gambarResep;
    RecyclerView recyclerView;

    @Override
    protected void OnCreate(Bundle saveInstantState){
        super.onCreate(saveInstantState);
        setContentView(R.layout.activity_main);
        namaResep = (TextView)findViewById(R.id.text1);
        gambarResep = (ImageView)findViewById(R.id.myImage);
        recyclerView = (RecyclerView)findViewById(R.id.tv_repep);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        String[]namaResep = {"Ca Kangkung","Kering Tempe", "Nasi Goreng", "Puding", "Sayur Asem", "Sayur Bayam"};
        int[] gambarResep = {R.drawable.ca_kangkung,R.drawable.kering_tempe,R.drawable.nasgor,R.drawable.puding, R.drawable.sayur_asem, R.drawable.sayur_bayam};

         String[] detailResep = {
                 "Bahan-Bahan Ca Kangkung" +
                 "\n" +
                         "2 ikat Kangkung\n" +
                         "1 sendok makan Minyak Goreng\n" +
                         "2 siung Bawang Putih\n" +
                         "3 butir Bawang Merah\n" +
                         "2 buah Cabai Merah\n" +
                         "2 buah Cabai Hijau\n" +
                         "1 buah Tomat\n" +
                         "50 ml Air\n" +
                         "1 sendok makan Saus Tiram\n" +
                         "secukupnya Garam \n" +
                         "Cara Memasak ca Kangkung" +
                         "1. Panaskan minyak, tumis bawang putih, bawang merah dan cabai hingga harum.\n" +
                         "2. Tuangkan air dan saos tiram, biarkan mendidih kemudian masukkan kangkung dan tomat. masak sampai setengah matang, bumbui dengan garam. Angkat dan sajikan.\n"
                 ,
                 "Bahan-Bahan Kering Tempe\n" +
                         "300 gram tempe, iris tipis kecil, goreng hingga kering\n" +
                         "4 buah cabai merah, buang bijinya. Iris halus, goreng\n" +
                         "2 sendok makan bawang goreng\n" +
                         "2 siung bawang putih\n" +
                         "1 cm lengkuas, memarkan\n" +
                         "1 lembar daun salam\n" +
                         "75 gram gula merah \n" +
                         "50 cc air\n" +
                         "1 sendok teh air asam jawa\n" +
                         "Garam\n" +
                         "Cara Memasak Kering Tempe:\n" +
                         "1.Haluskan bawang putih, tumis hingga harum.\n" +
                         "2.Tambahkan lengkuas dan salam. Kemudian aduk.\n" +
                         "3.Masukkan gula merah yang telah diiris/diserut, garam dan air.\n" +
                         "4.Aduk hingga gula larut, masukkan irisan tempe dan aduk sampai rata.\n" +
                         "5.Terakhir masukkan bawang goreng, cabai iris dan air asam. Aduk rata.\n",
                 "Bahan - Bahan Nasi Goreng:" +
                         "\n" +
                         "    5 piring nasi\n" +
                         "    75 g smoke beef\n" +
                         "    2 buah sosis, potong lingkaran\n" +
                         "    2-3 butir telur ayam\n" +
                         "    100 g cumi\n" +
                         "    100 g udang\n" +
                         "    100 g kacang polong\n" +
                         "    50 g jamur kancing\n" +
                         "    100 g daging ayam yang sudah di rebus, potong dadu\n" +
                         "    3 sdm mentega untuk menumis\n" +
                         "Cara Memasak Nasi Goreng" +
                         "\n" +
                         "   1. Langkahh pertama masukan mentega ke dalam wajan hingga mencair\n" +
                         "   2. Kemudian masukan bawang bombay kemudian bawang putih dan bawang merah yang sudah diiris hingga harum\n" +
                         "   3. Masukan potongan ayam , tumis\n" +
                         "   4. Kemudian masukan udang,cumi, smoke beef aduk hingga merata dan setengah matang\n" +
                         "   5. Selanjutnya masukan telur hingga tercampur di atas wajan, aduk rata\n" +
                         "   6. Lalu masukan jamur kancing, kacang polong dan cabai merah . Aduk hingga tercampur\n" +
                         "   7. Masukan juga nasi putih dan aduk hhingga benar benar tercampur\n" +
                         "   8. Kemudian masukan bumbu yang diberikan sambal terasi, hingga nasi berubah menjadi merah dan tercampur\n" +
                         "   9. Jangan lupa untuk memberikan kecap manis sesuai dengan selera, aduk hingga rata\n" +
                         "   10.Terakhir masukan bumbu , garam , kaldu bubuk hingga merata, aduk dan hidangkan selagi panas\n",
                 "Bahan-Bahan Membuat Puding:" +
                         "1 Bungkus agar-agar bubuk\n" +
                         "\n" +
                         "-500 Ml susu segar\n" +
                         "\n" +
                         "-20 Gram cokelat bubuk pekat, cairkan dengan sedikit air panas" +
                         "-¼ Sdt garam\n" +
                         "\n" +
                         "-50 Gram dark cooking chocolate\n" +
                         "\n" +
                         "-2 Butir kuning telur\n" +
                         "\n" +
                         "-100 Gram gula pasir\n" +
                         "Cara Memasak Puding:\n" +
                         "1. Masak susu, gula pasir, dan agar-agar sampai mendidih.Masukkan cairan cokelat bubuk, dan dark cooking chocolate aduk sampai rata." +
                         "2. Kocok lepas kuning telur, sisihkan.Tambahkan sedikit adonan agar-agar aduk rata.\n"+
                         "3. Tuang kembali ke dalam adonan agar-agar sambil dimasak dengan api kecil sampai mendidih.\n" +
                         "4. Tuang adonan ke dalam cetakan kecil bervolume 200 ml dan sisihkan hingga beku.\n" +
                         "5. Keluarkan dari cetakan, potong sesuai kelopak lekukan.\n",
                 "Bahan-Bahan Sayur Asem:" +
                         "- Kacang panjang 1 ikat, potong pendek sekitar 3 cm.\n" +
                         "- Jagung manis 2 buah, potong menjadi beberapa bagian.\n" +
                         "- Kacang tanah 150 gram\n" +
                         "- Labu siam 2 buah\n" +
                         "- Lengkuas 3 cm\n" +
                         "- Air 700 ml\n" +
                         "- Asam jawa  1 sdm\n" +
                         "- Gula merah 40 gram \n" +
                         "- Cabai merah 3 buah\n" +
                         "- Bawang merah 9 butir\n" +
                         "- Bawang putih 5 siung\n" +
                         "- Kemiri 5 buah\n" +
                         "- Terasi secukupnya\n" +
                         "- Garam secukupnya\n" +
                         "Cara Memasak Sayur Asem\n" +
                         "1. Siapkan panci dan masukkan air lalu rebus hingga air mendidih.\n" +
                         "2. Setelah air mendidih, masukkan bumbu halus yang telah di haluskan sebelumnya.\n" +
                         "3. Kemudian di susul dengan memasukkan jagung manis dan juga kacang tanah.\n" +
                         "4. Selanjutnya masukkan juga labu siam dan lengkuas, tunggu sekitar 4 menit.\n" +
                         "5. Yang terakhir,  masukkan gula merah dan asem jawa, tunggu sekitar 5 menit atau hingga semua bahan matang.\n" +
                         "6. Angkat dan sayur asem jawa siap di hidangkan.\n",
                 "Bahan - Bahan Sayur Bayam:\n" +
                         "    -300 gr daun bayam\n" +
                         "    -100 gr wortel, iris bulat tipis\n" +
                         "    -1 liter air\n" +
                         "    4 butir bawang merah, iris halus\n" +
                         "    2 siung bawang putih, iris halus\n" +
                         "    3 cm temukunci (jika suka)\n" +
                         "    2 lembar daun salam\n" +
                         "    2 sdt garam\n" +
                         "    1 sdt gula pasir\n" +
                         "Cara Memasak Sayur Bayam:\n" +
                         "    1.Didihkan air, masukkan bawang putih, bawang merah, daun salam dan temukunci.\n" +
                         "    2.Setelah bumbu layu, masukkan wortel dan masak hingga wortel setengah matang.\n" +
                         "    3.Masukkan daun bayam, didihkan kembali sebentar. Angkat sayur dan sajikan hangat.\n"};

         String[] titleBar = {"Ca Kangkung", "Kering Tempe", "Nasi Goreng", "Puding", "Sayur Asem", "Sayur Bayam"};

        ArrayList<Resep>resepArrayList = new ArrayList<>();

        for (int i = 0; i<namaResep.length; i++) {
            Resep resep=new Resep(namaResep[i], namaResep[i], gambarResep[i], detailResep[i], titleBar[i]);
            resepArrayList.add(Resep);
        }
        MyOwnAdapter MyOwnAdapter = new MyOwnAdapter(this, resepArrayList);
        recyclerView.setAdapter(MyOwnAdapter);

         }
    }

