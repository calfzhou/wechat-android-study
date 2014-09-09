package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Fragment$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new f();
  final Bundle aT;

  Fragment$SavedState(Bundle paramBundle)
  {
    this.aT = paramBundle;
  }

  Fragment$SavedState(Parcel paramParcel)
  {
    this.aT = paramParcel.readBundle();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(this.aT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.Fragment.SavedState
 * JD-Core Version:    0.6.2
 */