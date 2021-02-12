package com.example.eslam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Quran extends AppCompatActivity {
    ListView listQuran;
    ArrayAdapter adapter;
    Intent out;
    String[] quranName = {"الفهرس", "1 - الفَاتِحَة" ,"2 - البَقَرَة" ,"3 - آل عِمرَان" ,"4 - النِّسَاء" , "5 - المَائدة" , "6 - الأنعَام", "7 - الأعرَاف", "8 - الأنفَال" , "9 - التوبَة", "10 - يُونس" ,"11 - هُود" ,"12 - يُوسُف" ,"13 - الرَّعْد" , "14 - إبراهِيم" , "15 - الحِجْر", "16 - النَّحْل", "17 - الإسْرَاء" , "18 - الكهْف", "19 - مَريَم" ,"20 - طه" ,"21 - الأنبيَاء" ,"22 - الحَج" , "23 - المُؤمنون" , "24 - النُّور", "25 - الفُرْقان", "26 - الشُّعَرَاء" , "27 - النَّمْل", "28 - القَصَص" ,"29 - العَنكبوت" ,"30 - الرُّوم" ,"31 - لقمَان" , "32 - السَّجدَة" , "33 - الأحزَاب", "34 - سَبَأ", "35 - فَاطِر" ,
            "36 - يس", "37 - الصَّافات" ,"38 - ص" ,"39 - الزُّمَر" ,"40 - غَافِر" , "41 - فُصِّلَتْ" , "42 - الشُّورَى", "43 - الزُّخْرُف", "44 - الدُّخان" , "45 - الجاثِية", "46 - الأحقاف" ,"47 - مُحَمّد" ,"48 - الفَتْح" ,"49 - الحُجُرات" , "50 - ق" , "51 - الذَّاريَات", "52 - الطُّور", "53 - النَّجْم" , "54 - القَمَر", "55 - الرَّحمن" ,"56 - الواقِعَة" ,"57 - الحَديد" ,"58 - المُجادَلة" , "59 - الحَشْر" , "60 - المُمتَحَنة", "61 - الصَّف", "62 - الجُّمُعة" , "63 - المُنافِقُون", "64 - التَّغابُن" ,"65 - الطَّلاق" ,"66 - التَّحْريم" ,"67 - المُلْك" , "68 - القَلـََم" , "69 - الحَاقّـَة", "70 - المَعارِج",
            "71 - نُوح" , "72 - الجِنّ", "73 - المُزَّمّـِل" ,"74 - المُدَّثــِّر" ,"75 - القِيامَة" ,"76 - الإنسان" , "77 - المُرسَلات" , "78 - النـَّبأ", "79 - النـّازِعات", "80 - عَبَس" , "81 - التـَّكْوير", "82 - الإنفِطار" ,"83 - المُطـَفِّفين" ,"84 - الإنشِقاق" ,"85 - البُروج" , "86 - الطّارق" , "87 - الأعلی", "88 - الغاشِيَة", "89 - الفَجْر" , "90 - البَـلـَد", "91 - الشــَّمْس" ,"92 - اللـَّيل" ,"93 - الضُّحی" ,"94 - الشَّرْح" , "95 - التـِّين" , "96 - العَلـَق", "97 - القـَدر", "98 - البَيِّنَة" , "99 - الزلزَلة", "100 - العَادِيات", "101 - القارِعَة", "102 - التَكاثـُر", "103 - العَصْر",
            "104 - الهُمَزَة", "105 - الفِيل", "106 - قـُرَيْش", "107 - المَاعُون", "108 - الكَوْثَر", "109 - الكَافِرُون", "110 - النـَّصر", "111 - المَسَد", "112 - الإخْلَاص", "113 - الفَلَق", "114 - النَّاس", "المصحف كامل"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);
        setTitle("القرآن");
        listQuran = findViewById(R.id.listQuran);
        adapter = new ArrayAdapter<String>(Quran.this, android.R.layout.simple_list_item_1, quranName){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                TextView items = (TextView) super.getView(position, convertView, parent);
                items.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
                items.setPadding(50, 50, 50, 50);
                items.setTextColor(Color.BLACK);
                return items;
            }
        };
        listQuran.setAdapter(adapter);
        listQuran.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                out = new Intent(Quran.this, AllQuran.class);
                if (position == 0) {
                    out.putExtra("PAGE", 618 + 3);
                } else if (position == 1) {
                    out.putExtra("PAGE", 3);
                } else if (position == 2) {
                    out.putExtra("PAGE", 4);
                } else if (position == 3) {
                    out.putExtra("PAGE", 49 + 3);
                } else if (position == 4) {
                    out.putExtra("PAGE", 76 + 3);
                } else if (position == 5) {
                    out.putExtra("PAGE", 105 + 3);
                } else if (position == 6) {
                    out.putExtra("PAGE", 127 + 3);
                } else if (position == 7) {
                    out.putExtra("PAGE", 150 + 3);
                } else if (position == 8) {
                    out.putExtra("PAGE", 176 + 3);
                } else if (position == 9) {
                    out.putExtra("PAGE", 186 + 3);
                } else if (position == 10) {
                    out.putExtra("PAGE", 207 + 3);
                } else if (position == 11) {
                    out.putExtra("PAGE", 220 + 3);
                } else if (position == 12) {
                    out.putExtra("PAGE", 234 + 3);
                } else if (position == 13) {
                    out.putExtra("PAGE", 248 + 3);
                } else if (position == 14) {
                    out.putExtra("PAGE", 254 + 3);
                } else if (position == 15) {
                    out.putExtra("PAGE", 261 + 3);
                } else if (position == 16) {
                    out.putExtra("PAGE", 266 + 3);
                } else if (position == 17) {
                    out.putExtra("PAGE", 281 + 3);
                } else if (position == 18) {
                    out.putExtra("PAGE", 292 + 3);
                } else if (position == 19) {
                    out.putExtra("PAGE", 304 + 3);
                } else if (position == 20) {
                    out.putExtra("PAGE", 311 + 3);
                } else if (position == 21) {
                    out.putExtra("PAGE", 321 + 3);
                } else if (position == 22) {
                    out.putExtra("PAGE", 331 + 3);
                } else if (position == 23) {
                    out.putExtra("PAGE", 341 + 3);
                } else if (position == 24) {
                    out.putExtra("PAGE", 349 + 3);
                } else if (position == 25) {
                    out.putExtra("PAGE", 358 + 3);
                } else if (position == 26) {
                    out.putExtra("PAGE", 366 + 3);
                } else if (position == 27) {
                    out.putExtra("PAGE", 376 + 3);
                } else if (position == 28) {
                    out.putExtra("PAGE", 384 + 3);
                } else if (position == 29) {
                    out.putExtra("PAGE", 396 + 2);
                } else if (position == 30) {
                    out.putExtra("PAGE", 404 + 2);
                } else if (position == 31) {
                    out.putExtra("PAGE", 410 + 3);
                } else if (position == 32) {
                    out.putExtra("PAGE", 414 + 3);
                } else if (position == 33) {
                    out.putExtra("PAGE", 417 + 3);
                } else if (position == 34) {
                    out.putExtra("PAGE", 427 + 3);
                } else if (position == 35) {
                    out.putExtra("PAGE", 434 + 2);
                } else if (position == 36) {
                    out.putExtra("PAGE", 440 + 2);
                } else if (position == 37) {
                    out.putExtra("PAGE", 445 + 3);
                } else if (position == 38) {
                    out.putExtra("PAGE", 452 + 3);
                } else if (position == 39) {
                    out.putExtra("PAGE", 458 + 2);
                } else if (position == 40) {
                    out.putExtra("PAGE", 467 + 2);
                } else if (position == 41) {
                    out.putExtra("PAGE", 476 + 3);
                } else if (position == 42) {
                    out.putExtra("PAGE", 482 + 3);
                } else if (position == 43) {
                    out.putExtra("PAGE", 489 + 2);
                } else if (position == 44) {
                    out.putExtra("PAGE", 495 + 3);
                } else if (position == 45) {
                    out.putExtra("PAGE", 498 + 3);
                } else if (position == 46) {
                    out.putExtra("PAGE", 502 + 2);
                } else if (position == 47) {
                    out.putExtra("PAGE", 506 + 3);
                } else if (position == 48) {
                    out.putExtra("PAGE", 510 + 3);
                } else if (position == 49) {
                    out.putExtra("PAGE", 515 + 2);
                } else if (position == 50) {
                    out.putExtra("PAGE", 517 + 3);
                } else if (position == 51) {
                    out.putExtra("PAGE", 519 + 3);
                } else if (position == 52) {
                    out.putExtra("PAGE", 522 + 3);
                } else if (position == 53) {
                    out.putExtra("PAGE", 525 + 3);
                } else if (position == 54) {
                    out.putExtra("PAGE", 527 + 3);
                } else if (position == 55) {
                    out.putExtra("PAGE", 530 + 3);
                } else if (position == 56) {
                    out.putExtra("PAGE", 533 + 3);
                } else if (position == 57) {
                    out.putExtra("PAGE", 536 + 3);
                } else if (position == 58) {
                    out.putExtra("PAGE", 541 + 3);
                } else if (position == 59) {
                    out.putExtra("PAGE", 544 + 3);
                } else if (position == 60) {
                    out.putExtra("PAGE", 548 + 3);
                } else if (position == 61) {
                    out.putExtra("PAGE", 550 + 3);
                } else if (position == 62) {
                    out.putExtra("PAGE", 552 + 3);
                } else if (position == 63){
                    out.putExtra("PAGE", 553 + 3);
                } else if (position == 64){
                    out.putExtra("PAGE", 555 + 3);
                } else if (position == 65){
                    out.putExtra("PAGE", 557 + 3);
                } else if (position == 66){
                    out.putExtra("PAGE", 559 + 3);
                } else if (position == 67){
                    out.putExtra("PAGE", 561 + 3);
                } else if (position == 68){
                    out.putExtra("PAGE", 564 + 2);
                } else if (position == 69){
                    out.putExtra("PAGE", 565 + 3);
                } else if (position == 70){
                    out.putExtra("PAGE", 567 + 3);
                } else if (position == 71){
                    out.putExtra("PAGE", 569 + 3);
                } else if (position == 72){
                    out.putExtra("PAGE", 571 + 3);
                } else if (position == 73){
                    out.putExtra("PAGE", 573 + 3);
                } else if (position == 74){
                    out.putExtra("PAGE", 574 + 3);
                } else if (position == 75){
                    out.putExtra("PAGE", 576 + 3);
                } else if (position == 76){
                    out.putExtra("PAGE", 577 + 3);
                } else if (position == 77){
                    out.putExtra("PAGE", 579 + 3);
                } else if (position == 78){
                    out.putExtra("PAGE", 581 + 3);
                } else if (position == 79){
                    out.putExtra("PAGE", 582 + 3);
                } else if (position == 80){
                    out.putExtra("PAGE", 584 + 3);
                } else if (position == 81){
                    out.putExtra("PAGE", 585 + 3);
                } else if (position == 82){
                    out.putExtra("PAGE", 586 + 3);
                } else if (position == 83){
                    out.putExtra("PAGE", 586 + 3);
                } else if (position == 84){
                    out.putExtra("PAGE", 588 + 3);
                } else if (position == 85){
                    out.putExtra("PAGE", 589 + 3);
                } else if (position == 86){
                    out.putExtra("PAGE", 590 + 3);
                } else if (position == 87){
                    out.putExtra("PAGE", 590 + 3);
                } else if (position == 88){
                    out.putExtra("PAGE", 591 + 3);
                } else if (position == 89){
                    out.putExtra("PAGE", 592 + 3);
                } else if (position == 90){
                    out.putExtra("PAGE", 593 + 3);
                } else if (position == 91){
                    out.putExtra("PAGE", 594 + 3);
                } else if (position == 92){
                    out.putExtra("PAGE", 594 + 3);
                } else if (position == 93){
                    out.putExtra("PAGE", 595 + 3);
                } else if (position == 94){
                    out.putExtra("PAGE", 595 + 3);
                } else if (position == 95){
                    out.putExtra("PAGE", 596 + 3);
                } else if (position == 96){
                    out.putExtra("PAGE", 596 + 3);
                } else if (position == 97){
                    out.putExtra("PAGE", 597 + 3);
                } else if (position == 98){
                    out.putExtra("PAGE", 597 + 3);
                } else if (position == 99){
                    out.putExtra("PAGE", 598 + 3);
                } else if (position == 100){
                    out.putExtra("PAGE", 598 + 3);
                } else if (position == 101){
                    out.putExtra("PAGE", 599 + 3);
                } else if (position == 102){
                    out.putExtra("PAGE", 599 + 3);
                } else if (position == 103){
                    out.putExtra("PAGE", 600 + 3);
                } else if (position == 104){
                    out.putExtra("PAGE", 600 + 3);
                } else if (position == 105){
                    out.putExtra("PAGE", 600 + 3);
                } else if (position == 106){
                    out.putExtra("PAGE", 601 + 3);
                } else if (position == 107){
                    out.putExtra("PAGE", 601 + 3);
                } else if (position == 108){
                    out.putExtra("PAGE", 601 + 3);
                } else if (position == 109){
                    out.putExtra("PAGE", 602 + 3);
                } else if (position == 110){
                    out.putExtra("PAGE", 602 + 3);
                } else if (position == 111){
                    out.putExtra("PAGE", 602 + 3);
                } else if (position == 112){
                    out.putExtra("PAGE", 603 + 3);
                } else if (position == 113){
                    out.putExtra("PAGE", 603 + 3);
                } else if (position == 114){
                    out.putExtra("PAGE", 603 + 3);
                } else if (position == 115){
                    out.putExtra("PAGE", 0);
                }
                startActivity(out);
            }
        });
    }
}