package example.beaconyx.com.useparcelable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;

import java.util.ArrayList;

/**
 * Created by pdg on 2018-01-29.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goNext();
    }

    private void goNext(){
        Bundle bundle = new Bundle();

        ArrayList<ModelParcelable> modelParcelables = new ArrayList<>();

        for(int i=0; i<10; i++) {
            modelParcelables.add(new ModelParcelable("제목" + String.valueOf(i), "내용" + String.valueOf(i)));
        }

        bundle.putParcelableArrayList("list", modelParcelables);

        Intent intent = new Intent(this, NextActivity.class);
        intent.putExtras(bundle);

        startActivity(intent);
    }
}
