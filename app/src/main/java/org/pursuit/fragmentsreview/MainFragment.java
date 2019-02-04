package org.pursuit.fragmentsreview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    View rootView;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        final EditText editText =  rootView.findViewById(R.id.edit_text);

        Button button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextFragment textFragment = new TextFragment();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                String editTextContents = editText.getText().toString();

                ft.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);

                Bundle bundle = new Bundle();
                bundle.putString("main", editTextContents);
                textFragment.setArguments(bundle);
                ft.replace(R.id.fragment_container, textFragment).addToBackStack(null);
                ft.commit();
            }
        });
        return rootView;
    }
}


