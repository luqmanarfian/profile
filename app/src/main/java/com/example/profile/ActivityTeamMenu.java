package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ActivityTeamMenu extends AppCompatActivity {

    RecyclerView recyclerView2;
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter, recyclerViewAdapter2;
    ArrayList<itemModel> data, data2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_menu);

        recyclerView = findViewById(R.id.recyclerviewTeam);
        recyclerView2 = findViewById(R.id.recyclerviewTeam2);
        recyclerView.setHasFixedSize(true);
        recyclerView2.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView2.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        data = new ArrayList<>();

        data.add(new itemModel("Stewart D. Hall", "Chairman, Business & Finance Networking", R.drawable.profil_steward_donald));
        data.add(new itemModel("Eric Thomas Maine", "Business Development Strategy", R.drawable.profil_eric_maine));
        data.add(new itemModel("Rahardja Alimhamzah", "Finance and Banking Relations", R.drawable.profil_raharja_alimhamzah));
        data.add(new itemModel("Robert Sean King", "Business, Mining and Metals Networking", R.drawable.profil_robert_sean_king));

        data2 = new ArrayList<>();
        data2.add(new itemModel("Eka Budi Saputra", "Managing Partner Business & Technology", R.drawable.profil_ekabudi_saputra));
        data2.add(new itemModel("Muhanto Hatta", "Head of Government Relations", R.drawable.profil_muhantopng));
        data2.add(new itemModel("Budi Hartanto", "Head of Legal, Corp. Secretary & Public Com", R.drawable.profil_budi));
        data2.add(new itemModel("Sri Wahyudi", "Head of Compliance", R.drawable.profil_yudi));
        data2.add(new itemModel("Yudo Hutomo", "Head of Regulatory Affairs", R.drawable.profil_yudo));
        data2.add(new itemModel("Tri Adriani", "Head of Marketing & Merchant Network", R.drawable.profil_rani));
        data2.add(new itemModel("Gede Adnawa", "Head of Corp. Gov., Auditor & Risk Management", R.drawable.profil_gede));
        data2.add(new itemModel("Lailatus Saadah", "Head of  Accounting and Administration", R.drawable.profil_lailatus));
        data2.add(new itemModel("Yani Rustiani", "Head of HRD and General Affair", R.drawable.profil_yani));
        data2.add(new itemModel("Bagus Ali", "Chief Technology Officer (CTO)", R.drawable.profil_bagus));
        data2.add(new itemModel("Rahmad Ilham", "Head of Ecosystem Connectivity & Integration", R.drawable.profil_ilham));
        data2.add(new itemModel("Haraldi Ikhsan", "Head of Blockchain Ecosystem Development", R.drawable.profil_haraldi));
        data2.add(new itemModel("Alifka Aditya", "Head of Market System Development", R.drawable.profil_alifka));
        data2.add(new itemModel("Feby Tri Saputra", "Head of Infrastructure, Net. & Cyber Security", R.drawable.profil_febi));
        data2.add(new itemModel("Khilyatul Akbar", "Head of Mobile Ecosystsem", R.drawable.profil_akbar));
        data2.add(new itemModel("Irfan Harianto", "Head of Product and Design", R.drawable.profil_irfanhariantoooo));
        data2.add(new itemModel("Nadia Fachyar", "Content and Copywriter Manager", R.drawable.profil_nadia));
        data2.add(new itemModel("Imam Rachmansyah", "Web Applications Dev. Manager", R.drawable.profil_imam));
        data2.add(new itemModel("Afif Hilman", "System Administrator Dev. Manager", R.drawable.profil_afif));
        data2.add(new itemModel("Shafira Pramatana", "Mobile Ecosystsem Manager", R.drawable.profil_shafira));
        data2.add(new itemModel("Saskia Maulansyah", "Software Quality Assurance Manager", R.drawable.profil_saski));
        data2.add(new itemModel("Mariska Serly", "Front End Development Manager", R.drawable.profil_mariska));
        data2.add(new itemModel("Iqbal Choironi", "Back End Development Manager", R.drawable.profil_miqbalchoi));
        data2.add(new itemModel("Taufiq Rahman", "Video Editor & Graphic Design Manager", R.drawable.profil_taufiq));
        data2.add(new itemModel("Fira Apriani", "Operation Manager", R.drawable.profil_fira));
        data2.add(new itemModel("Nofianti Ayu", "Video Content and News Manager", R.drawable.profil_nofi));
        data2.add(new itemModel("Luqman Arfian", "Operation & Networking", R.drawable.profil_lukman));
        data2.add(new itemModel("Reyhandita Pradana", "Operation & Web Admin", R.drawable.profil_reyhan));
        data2.add(new itemModel("Aqib Luqman", "Operation & Web Admin", R.drawable.profil_aqib));
        data2.add(new itemModel("Zidane Ramadhani", "Digital Marketing Manager", R.drawable.profil_zidane));
        data2.add(new itemModel("Akmal Rizqullah", "Digital Marketing Executive", R.drawable.profil_akmal));
        data2.add(new itemModel("Ihza Razan", "Digital Marketing Executive", R.drawable.profil_ihza));
        data2.add(new itemModel("Sultan Fahad", "Event Collaborator Manager", R.drawable.profil_sultan));
        data2.add(new itemModel("Anisa Rachmadya", "Business Analytic & Research Manager", R.drawable.profil_anisa));
        data2.add(new itemModel("Reza Ardy", "Event Collaborator Executive", R.drawable.profil_rezaardy));

        recyclerViewAdapter = new adapterRecyclerview(data);
        recyclerViewAdapter2 = new adapterRecyclerview(data2);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView2.setAdapter(recyclerViewAdapter2);

    }

    public void backHome(View view) {
            //button for back to Home Page
            Intent intent = new Intent(ActivityTeamMenu.this, MainActivity.class);
            startActivity(intent);
    }
}