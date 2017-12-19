package io.card.development;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import io.card.payment.CardIOActivity;

public class EmbedActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embed);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //CreditCardScanner cardScannerFragment = new Ac();
        CardIOActivity cardScannerFragment = new CardIOActivity();
        fragmentTransaction.add(R.id.creditCardScanner, cardScannerFragment);
        fragmentTransaction.commit();
    }
}
