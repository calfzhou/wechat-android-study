package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public class DrawerLayout$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR = new g();
  int gA = 0;
  int gB = 0;
  int gz = 0;

  public DrawerLayout$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    this.gz = paramParcel.readInt();
  }

  public DrawerLayout$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.gz);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.DrawerLayout.SavedState
 * JD-Core Version:    0.6.2
 */