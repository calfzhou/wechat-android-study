package com.tencent.mm.ui.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public class MMPinProgressBtn$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR = new f();
  private int cK;
  private int pA;

  private MMPinProgressBtn$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    this.cK = paramParcel.readInt();
    this.pA = paramParcel.readInt();
  }

  public MMPinProgressBtn$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.cK);
    paramParcel.writeInt(this.pA);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMPinProgressBtn.SavedState
 * JD-Core Version:    0.6.2
 */