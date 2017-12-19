package io.card.development;

import android.app.Activity;
import android.os.Bundle;

import io.card.payment.CardIOFragment;

public class Embed extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embed);

        // initialize the fragment and inject it
        CardIOFragment cardIOFragment = new CardIOFragment();
        getFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, cardIOFragment)
                .commit();
    }
}
