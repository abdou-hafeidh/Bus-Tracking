package net.simplifiedcoding.androidphpmysql;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class ProfileActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

    }

    public void process(View view) {

        Intent intent = null, chooser=null;
        if(view.getId()== R.id.transtu){
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.google.com/maps/dir/36.8047596,10.1799572/36.8021852,10.1033716/@36.8237286,10.0710323,12z"));
            chooser= Intent.createChooser(intent,"launch Map");
            startActivity(chooser);
        }

    }
    public void launchTcvMaps(View view) {

        Intent intent = null, chooser=null;
        if(view.getId()== R.id.tcv){
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.google.com/maps/dir/36.8047596,10.1799572/36.8535286,10.1729527/@36.8557752,10.1632931,12z"));
            chooser= Intent.createChooser(intent,"launch Map");
            startActivity(chooser);
        }

    }

    public void launchTuniscityMaps(View view) {

        Intent intent = null, chooser=null;
        if(view.getId()== R.id.tuniscity){
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.google.com/maps/dir/36.8009283,10.1916749/36.8477381,10.2171615/@36.8408169,10.2115316,12z"));
            chooser= Intent.createChooser(intent,"launch Map");
            startActivity(chooser);
        }

    }

    public void launchTutMaps(View view) {

        Intent intent = null, chooser=null;
        if(view.getId()== R.id.tut){
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.google.com/maps/dir/36.8009283,10.1916749/36.8524722,10.1595458/@36.852122,10.1561726,12z/"));
            chooser= Intent.createChooser(intent,"launch Map");
            startActivity(chooser);
        }

    }

    public void launchTusMaps(View view) {

        Intent intent = null, chooser=null;
        if(view.getId()== R.id.tus){
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.google.com/maps/dir/36.8077798,10.13546/36.8395398,10.116806/@36.8438603,10.1016106,12z/"));
            chooser= Intent.createChooser(intent,"launch Map");
            startActivity(chooser);
        }

    }


}
