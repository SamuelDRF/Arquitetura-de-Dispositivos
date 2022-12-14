package pt.uma.tpsi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {

    private float actualTemp;

    private float desiredTemp;

    private float actualHumd;

    private float desiredHumd;

    private int selectedTempFormat;

    private Date date;

    private String messages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actualTemp = 22.0F;
        desiredTemp= 22.0F;
        actualHumd = 50.0F;
        desiredHumd= 50.0F;
        messages= "";
        updateTextField();
        logEvents("The app has started.");
        final Handler handler = new Handler();
        final Runnable r = new Runnable() {
            @Override
            public void run() {
                Random r = new Random();

                if(actualTemp < desiredTemp && r.nextDouble() <= 0.8)
                    actualTemp += 0.5;

                else if(r.nextDouble()<0.7)
                    actualTemp -= 0.5;

                if(r.nextDouble() > 0.5)
                    actualHumd += 0.2;
                else if(r.nextDouble() <= 0.3)
                    actualHumd -= 0.2;

                updateTextField();
                handler.postDelayed(this,1000);

            }
        };
    }



    private void updateTextField(){
        if(selectedTempFormat == 0){
            TextView desiredTempShow = findViewById(R.id.temDEditText);
            desiredTempShow.setText(String.valueOf(desiredTemp+" ºC"));
            TextView actualTempShow = findViewById(R.id.temDEditText);
            actualTempShow.setText(String.valueOf(actualTemp+" ºC"));
            Button changeTempFormatButton = findViewById(R.id.CFButton);
            changeTempFormatButton.setText(" ºF");
        }
        else {
            TextView desiredTempShow = findViewById(R.id.temDEditText);
            desiredTempShow.setText(String.valueOf(desiredTemp+" ºF"));
            TextView actualTempShow = findViewById(R.id.temDEditText);
            actualTempShow.setText(String.valueOf(actualTemp+" ºF"));
            Button changeTempFormatButton = findViewById(R.id.CFButton);
            changeTempFormatButton.setText(" ºC");
        }
    }

    private void logEvents(String informationToLog){
        date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        messages+= simpleDateFormat.format(date) + ": "+ informationToLog +"\n";
    }

    public void changeTempFormatClick(View view){
        if (selectedTempFormat == 0)
            selectedTempFormat = 1;
        else
            selectedTempFormat=0;
        updateTextField();
        logEvents("The app has started.");
    }
}