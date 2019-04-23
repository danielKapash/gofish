package daniel.kapash.gofish;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        Fragment mainScreen = new MainScreen();

        transaction.add(R.id.fragment_container, mainScreen);
        transaction.commit();

    }



    public void onGoFishClick() {
        FishermanFragment fishermanFragment = new FishermanFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fishermanFragment);
        transaction.addToBackStack(null);
        transaction.commit();

        Log.d(TAG, "onGoFishClick: yeah!!");
    }

    public void onTextViewClick() {
        Log.d(TAG, "onTextViewClick: yoyoyo");
    }
}
