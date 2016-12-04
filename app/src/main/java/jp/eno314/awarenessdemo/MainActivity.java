package jp.eno314.awarenessdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.awareness.Awareness;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GoogleApiClient client = new GoogleApiClient.Builder(getApplicationContext())
                .addApi(Awareness.API)
                .build();
        client.connect();
    }
}
