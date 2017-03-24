package mx.cic.mismapas;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton ibTeotihuacan;
    ImageButton ibChapultepec;
    ImageButton ibMonumento;
    ImageButton ibBellasArtes;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        ibTeotihuacan = (ImageButton) findViewById(R.id.ibTeotihuacan);
        ibChapultepec = (ImageButton) findViewById(R.id.ibChapultepec);
        ibMonumento = (ImageButton) findViewById(R.id.ibMonumento);
        ibBellasArtes = (ImageButton) findViewById(R.id.ibBellasArtes);

        ibTeotihuacan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, MapsActivity.class);
                i.putExtra("Lat", 19.697890);
                i.putExtra("Long", -98.844380);
                i.putExtra("lugar", "Teotihuacán");
                startActivity(i);
            }
        });
        ibBellasArtes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, MapsActivity.class);
                i.putExtra("Lat", 19.435200);
                i.putExtra("Long", -99.141200);
                i.putExtra("lugar", "Bellas Artes");
                startActivity(i);
            }
        });
        ibMonumento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, MapsActivity.class);
                i.putExtra("Lat", 19.436209);
                i.putExtra("Long", -99.154630);
                i.putExtra("lugar", "Monumento a la Revolución");
                startActivity(i);
            }
        });
        ibChapultepec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, MapsActivity.class);
                i.putExtra("Lat", 19.419481);
                i.putExtra("Long", -99.189456);
                i.putExtra("lugar", "Chapultepec");
                startActivity(i);
            }
        });
    }

    public void irMapa(View v){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }
}
