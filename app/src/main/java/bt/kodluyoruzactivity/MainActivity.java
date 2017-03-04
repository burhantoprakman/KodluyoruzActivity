package bt.kodluyoruzactivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final String TAG="MAINACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);


        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment myfrag = new SecondFragment();//Fragment türünde kendi fragmentimizi oluşturduk
        fragmentTransaction.add(R.id.activity_SecondFragment_framelayout, myfrag);
        fragmentTransaction.commit();

        //Bu sayede fragment. diyerak fragment içindeki birşeyi çekebiliriz
        MainFragment fragment= (MainFragment) fragmentManager.findFragmentById(R.id.activity_Mainfragment);
        textView2.setText(fragment.getPassedData());
    }
    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs)
    {
        Log.e(TAG,"onCreateView");
        return super.onCreateView(parent, name, context, attrs);

    }
    @Override
    protected void onStop(){
    Log.e(TAG,"onStop");
    }
    @Override
    protected void onStart() {
        Log.e(TAG,"onStart");
        super.onStart();
    }


    @Override
    protected void onResume() {
        Log.e(TAG,"onResume");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG,"onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.e(TAG,"onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.e(TAG,"onRestart");
        super.onRestart();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.e(TAG,"onSaveInstanceState" );
        super.onSaveInstanceState(outState);

    }
}

