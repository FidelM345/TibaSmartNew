package com.example.thebeast.afyahelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.thebeast.afyahelp.cpr.Adult_cpr;
import com.example.thebeast.afyahelp.cpr.Child_cpr;
import com.example.thebeast.afyahelp.cpr.General_cpr;
import com.example.thebeast.afyahelp.cpr.Infant_cpr;
import com.example.thebeast.afyahelp.cpr.Recovery_position;
import com.example.thebeast.afyahelp.respiratory.Adult_Chock;
import com.example.thebeast.afyahelp.respiratory.Asthma;
import com.example.thebeast.afyahelp.respiratory.Chest_wound;
import com.example.thebeast.afyahelp.respiratory.Child_chock;
import com.example.thebeast.afyahelp.respiratory.Fume_inhalation;

public class Quick_access extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_access);
        listView=(ListView) findViewById(R.id.id_list);

        String[]description=getResources().getStringArray(R.array.quick_access);

        Integer[] imgid={
                R.drawable.cprtips,
                R.drawable.cpr_breathing,
                R.drawable.child_cpr,
                R.drawable.infant_breathing,
                R.drawable.recovery_two,
                R.drawable.adult_chock,
                R.drawable.infabt_chock,
                R.drawable.chest_wound,
                R.drawable.asthma2,
                R.drawable.fume2,
                R.drawable.food,
                R.drawable.swallowed,
                R.drawable.alcohol,
                R.drawable.snake,
                R.drawable.spider,
                R.drawable.waspsting,
                R.drawable.jelly,
                R.drawable.dogbite,
                R.drawable.noseblood,
                R.drawable.eyeinjur,
                R.drawable.brusinginjur,
                R.drawable.earbleeding,
                R.drawable.heartattack,
                R.drawable.agina,
                R.drawable.fainting,
                R.drawable.shock,
                R.drawable.burn,
                R.drawable.electric,
                R.drawable.chemical,
                R.drawable.sun_burn,
                R.drawable.hypothermia,
                R.drawable.seizure,
                R.drawable.stroke,
                R.drawable.cerebral
        };


        ListAdapter lady=new CustomAdapter(this,description,imgid);
        listView.setAdapter(lady);

        cpr_content();


    }


    public void cpr_content(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int number=parent.getPositionForView(view);

                if(number==0){

                    Intent i=new Intent(getApplicationContext(), General_cpr.class);
                    startActivity(i);
                }else
                if(number==1){

                    Intent i=new Intent(getApplicationContext(), Adult_cpr.class);
                    startActivity(i);
                }else
                if(number==2){

                    Intent i=new Intent(getApplicationContext(), Child_cpr.class);
                    startActivity(i);
                }
               else
                if(number==3){

                    Intent i=new Intent(getApplicationContext(), Infant_cpr.class);
                    startActivity(i);
                }
               else
                if(number==4){

                    Intent i=new Intent(getApplicationContext(), Recovery_position.class);
                    startActivity(i);
                }

                else
                if(number==5){

                    Intent i=new Intent(getApplicationContext(), Adult_Chock.class);
                    startActivity(i);
                }else
                if(number==6){

                    Intent i=new Intent(getApplicationContext(), Child_chock.class);
                    startActivity(i);
                }else
                if(number==7){

                    Intent i=new Intent(getApplicationContext(), Chest_wound.class);
                    startActivity(i);
                }else
                if(number==8){

                    Intent i=new Intent(getApplicationContext(), Asthma.class);
                    startActivity(i);
                }else
                if(number==9){

                    Intent i=new Intent(getApplicationContext(), Fume_inhalation.class);
                    startActivity(i);
                }

            }
        });


    }















}
