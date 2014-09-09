package android.support.v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class AbsSpinnerICS$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR = new d();
  long mw;
  int position;

  private AbsSpinnerICS$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    this.mw = paramParcel.readLong();
    this.position = paramParcel.readInt();
  }

  AbsSpinnerICS$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public String toString()
  {
    return "AbsSpinner.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " selectedId=" + this.mw + " position=" + this.position + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.mw);
    paramParcel.writeInt(this.position);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.AbsSpinnerICS.SavedState
 * JD-Core Version:    0.6.2
 */