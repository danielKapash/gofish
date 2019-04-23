package daniel.kapash.gofish;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EnterCodeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EnterCodeFragment extends Fragment {

    private static final String TAG = "EnterCodeFragment";

    public EnterCodeFragment() {
        // Required empty public constructor
    }


    public static EnterCodeFragment newInstance() {
        return new EnterCodeFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_enter_code, container, false);
        EditText editText = v.findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d(TAG, "onTextChanged: " + s);
                if (s.length() == 5) {
                    ((MainActivity) getActivity()).setMainScreenFragmentWithText(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return v;
    }

}
