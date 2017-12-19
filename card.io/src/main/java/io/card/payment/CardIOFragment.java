package io.card.payment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;


public class CardIOFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FrameLayout mainLayout = new FrameLayout(getActivity());

        TextView textView = new TextView(getActivity());

        textView.setText("This comes from fragment");
        textView.setTextColor(getResources().getColor(android.R.color.black));

        mainLayout.addView(textView);

        return mainLayout;
    }
}
