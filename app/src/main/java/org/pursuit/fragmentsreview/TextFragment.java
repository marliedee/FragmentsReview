package org.pursuit.fragmentsreview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TextFragment extends Fragment {
    private View rootView;
    private TextView textview;

    public TextFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_text, container, false);
        textview =  rootView.findViewById(R.id.text_view);
        Bundle bundle1 = getArguments();
        String textFromEditText = bundle1.getString("main", "");
        textview.setText(textFromEditText);

        return rootView;
    }

}
