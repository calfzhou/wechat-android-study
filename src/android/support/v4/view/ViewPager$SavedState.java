package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.b.a;
import android.view.View.BaseSavedState;

public class ViewPager$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR = a.a(new cc());
  Parcelable fJ;
  ClassLoader fK;
  int position;

  ViewPager$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel);
    if (paramClassLoader == null)
      paramClassLoader = getClass().getClassLoader();
    this.position = paramParcel.readInt();
    this.fJ = paramParcel.readParcelable(paramClassLoader);
    this.fK = paramClassLoader;
  }

  public ViewPager$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public String toString()
  {
    return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.position);
    paramParcel.writeParcelable(this.fJ, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager.SavedState
 * JD-Core Version:    0.6.2
 */