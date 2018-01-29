package example.beaconyx.com.useparcelable;

import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by pdg on 2018-01-29.
 */

public class ModelParcelable implements Parcelable {

    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public ModelParcelable(String title, String content){
        this.title = title;
        this.content = content;
    }

    public ModelParcelable(Parcel in){
        title = in.readString();
        content = in.readString();
    }

    public static final Creator<ModelParcelable> CREATOR = new Creator<ModelParcelable>() {
        @Override
        public ModelParcelable createFromParcel(Parcel in) {
            return new ModelParcelable(in);
        }

        @Override
        public ModelParcelable[] newArray(int size) {
            return new ModelParcelable[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(content);
    }
}
