package android.support.v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class ActionBarView$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR = new i();
  int nw;
  boolean nx;

  private ActionBarView$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    this.nw = paramParcel.readInt();
    if (paramParcel.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.nx = bool;
      return;
    }
  }

  ActionBarView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.nw);
    if (this.nx);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarView.SavedState
 * JD-Core Version:    0.6.2
 */