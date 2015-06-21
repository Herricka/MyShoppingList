package com.herricka.aaron.myshoppinglist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Aaron on 6/19/2015.
 */
public class ListItemFragment extends Fragment {
    private list_item mListItem;
    private EditText mTitleField;
    private EditText mPriceField;
    private EditText mQuantityField;
    private EditText mLocationField;
    private Spinner  mType;
    private CheckBox mPurchasedCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mListItem = new list_item();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_list_item, parent, false);

        mTitleField = (EditText)v.findViewById(R.id.list_item_title);
        mTitleField.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence c, int start, int before, int count) {
                mListItem.setTitle(c.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence c, int start, int count, int after) {
                // Intentionally left blank
            }

            @Override
            public void afterTextChanged(Editable c) {
                // This one too
            }
        });

        mPriceField = (EditText)v.findViewById(R.id.list_item_price);
        mPriceField.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.v("EditText", mPriceField.getText().toString());
            }

            ;

        });

        mQuantityField = (EditText)v.findViewById(R.id.list_item_quantity);
        mQuantityField.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.v("EditText", mQuantityField.getText().toString());
            };

        });

        mLocationField = (EditText)v.findViewById(R.id.list_item_location);
        mLocationField.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.v("EditText", mLocationField.getText().toString());
            };

        });

        mType = (Spinner)v.findViewById(R.id.type_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                R.array.type_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mType.setAdapter(adapter);

        mPurchasedCheckBox = (CheckBox)v.findViewById(R.id.list_item_purchased);
        mPurchasedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Set the list item purchased property
                mListItem.setPurchased(isChecked);
            }
        });


        return v;
    }


}
