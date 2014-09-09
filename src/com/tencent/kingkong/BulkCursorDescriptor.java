package com.tencent.kingkong;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class BulkCursorDescriptor
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new BulkCursorDescriptor.1();
  public String[] columnNames;
  public int count;
  public IBulkCursor cursor;
  public boolean wantsAllOnMoveCalls;
  public CursorWindow window;

  public final int describeContents()
  {
    return 0;
  }

  public final void readFromParcel(Parcel paramParcel)
  {
    this.cursor = BulkCursorNative.asInterface(paramParcel.readStrongBinder());
    this.columnNames = readStringArray(paramParcel);
    if (paramParcel.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.wantsAllOnMoveCalls = bool;
      this.count = paramParcel.readInt();
      if (paramParcel.readInt() != 0)
        this.window = ((CursorWindow)CursorWindow.CREATOR.createFromParcel(paramParcel));
      return;
    }
  }

  public final String[] readStringArray(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    String[] arrayOfString = null;
    if (i >= 0)
      arrayOfString = new String[i];
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return arrayOfString;
      arrayOfString[j] = paramParcel.readString();
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStrongBinder(this.cursor.asBinder());
    paramParcel.writeStringArray(this.columnNames);
    if (this.wantsAllOnMoveCalls);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      paramParcel.writeInt(this.count);
      if (this.window == null)
        break;
      paramParcel.writeInt(1);
      this.window.writeToParcel(paramParcel, paramInt);
      return;
    }
    paramParcel.writeInt(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.BulkCursorDescriptor
 * JD-Core Version:    0.6.2
 */