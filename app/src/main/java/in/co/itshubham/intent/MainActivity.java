package in.co.itshubham.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void  nav(View view){
        Intent intent = new Intent(getApplicationContext(),TabActivity.class);
        startActivity(intent);

    }
    public  void click(View view){
        Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
        startActivity(intent);
//        finish();
//        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
