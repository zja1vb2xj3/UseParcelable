package example.beaconyx.com.useparcelable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.ArrayList;

/**
 * Created by pdg on 2018-01-29.
 */

public class NextActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            ArrayList<ModelParcelable> modelParcelables = bundle.getParcelableArrayList("list");

            for(ModelParcelable m : modelParcelables){
                System.out.println("title : " + m.getTitle());
                System.out.println("content : " + m.getContent());
            }
        }
    }
}
