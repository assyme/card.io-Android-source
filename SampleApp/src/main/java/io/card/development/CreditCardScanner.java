package io.card.development;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;

/**
 * Created by asadpalekar on 12/10/17.
 */

public class CreditCardScanner extends Fragment {

    private static final int SCAN_REQUEST_CODE = 24;
    private Button mBtnScan;


    public CreditCardScanner() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_credit_card_scanner, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //activate the scan card intent here
        Intent scanIntent = new Intent(view.getContext(), CardIOActivity.class);

        // customize the values to suit our needs
        scanIntent.putExtra(CardIOActivity.EXTRA_SUPPRESS_MANUAL_ENTRY, true);
        scanIntent.putExtra(CardIOActivity.EXTRA_SUPPRESS_CONFIRMATION, true);
        scanIntent.putExtra(CardIOActivity.EXTRA_HIDE_CARDIO_LOGO, true);
        scanIntent.putExtra(CardIOActivity.EXTRA_SUPPRESS_MANUAL_ENTRY, true);

        startActivityForResult(scanIntent, SCAN_REQUEST_CODE);

        /*mBtnScan = (Button) view.findViewById(R.id.btn_scan_card);

        mBtnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == SCAN_REQUEST_CODE) {
            String resultDataStr;

            if (data != null && data.hasExtra(CardIOActivity.EXTRA_SCAN_RESULT)) {
                CreditCard scanResult = data.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT);

                //TODO: Load the card details as much as you have move to the next screen.
                //Intent intent = new Intent(getContext(), AddCardManuallyActivity.class);

                //intent.putExtra(AddCardManuallyActivity.EXTRA_CARD_NUMBER, scanResult.cardNumber);
                /*if (scanResult.isExpiryValid()) {
                    intent.putExtra(AddCardManuallyActivity.EXTRA_EXPIRY_MONTH, scanResult.expiryMonth);
                    intent.putExtra(AddCardManuallyActivity.EXTRA_EXPIRY_YEAR, scanResult.expiryYear);
                }

                if (scanResult.cardholderName != null && !scanResult.cardholderName.isEmpty()) {
                    intent.putExtra(AddCardManuallyActivity.EXTRA_CARD_HOLDER_NAME, scanResult.cardholderName);
                }

                startActivity(intent);*/

            }
        }
    }

    /*public void showScanActivity(View view) {

        //activate the scan card intent here
        Intent scanIntent = new Intent(this.getContext(), CardIOActivity.class);

        // customize the values to suit our needs
        scanIntent.putExtra(CardIOActivity.EXTRA_SUPPRESS_MANUAL_ENTRY, true);
        scanIntent.putExtra(CardIOActivity.EXTRA_SUPPRESS_CONFIRMATION, true);

        startActivityForResult(scanIntent, SCAN_REQUEST_CODE);

    }*/
}
