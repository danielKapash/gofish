package daniel.kapash.gofish;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setMainScreenFragmentWithText("Tap me!!");

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
        EnterCodeFragment enterCodeFragment = new EnterCodeFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, enterCodeFragment);
        transaction.addToBackStack(null);
        transaction.commit();

        Log.d(TAG, "onTextViewClick: yoyoyo");
    }

    public void setMainScreenFragmentWithText(String text) {
        MainScreen mainScreenFragment = new MainScreen();
        Bundle args = new Bundle();
        args.putString("text", text);
        mainScreenFragment.setArguments(args);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, mainScreenFragment);
        transaction.commit();
    }
}
