package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new q();
  FragmentState[] bL;
  int[] bM;
  BackStackState[] bN;

  public FragmentManagerState()
  {
  }

  public FragmentManagerState(Parcel paramParcel)
  {
    this.bL = ((FragmentState[])paramParcel.createTypedArray(FragmentState.CREATOR));
    this.bM = paramParcel.createIntArray();
    this.bN = ((BackStackState[])paramParcel.createTypedArray(BackStackState.CREATOR));
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedArray(this.bL, paramInt);
    paramParcel.writeIntArray(this.bM);
    paramParcel.writeTypedArray(this.bN, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentManagerState
 * JD-Core Version:    0.6.2
 */