package com.tencent.kingkong;

import android.content.res.Resources;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Process;
import android.util.SparseIntArray;
import com.tencent.kingkong.database.SQLiteClosable;

public class CursorWindow extends SQLiteClosable
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  private static final String STATS_TAG = "MicroMsg.kkdb.CursorWindowStats";
  private static int sCursorWindowSize;
  private static final SparseIntArray sWindowToPidMap;
  private final String mName;
  private int mStartPos;
  public int mWindowPtr;

  static
  {
    int i = Resources.getSystem().getIdentifier("config_cursorWindowSize", "integer", "android");
    sCursorWindowSize = i;
    if (i != 0);
    for (sCursorWindowSize = Resources.getSystem().getInteger(sCursorWindowSize); ; sCursorWindowSize = 2048)
    {
      sCursorWindowSize = 1024 * sCursorWindowSize;
      CREATOR = new CursorWindow.1();
      sWindowToPidMap = new SparseIntArray();
      return;
    }
  }

  private CursorWindow(Parcel paramParcel)
  {
    this.mStartPos = paramParcel.readInt();
    this.mWindowPtr = nativeCreateFromParcel(paramParcel);
    if (this.mWindowPtr == 0)
      throw new CursorWindowAllocationException("Cursor window could not be created from binder.");
    this.mName = nativeGetName(this.mWindowPtr);
  }

  public CursorWindow(String paramString)
  {
    this.mStartPos = 0;
    if ((paramString != null) && (paramString.length() != 0));
    while (true)
    {
      this.mName = paramString;
      this.mWindowPtr = nativeCreate(this.mName, sCursorWindowSize);
      if (this.mWindowPtr != 0)
        break;
      throw new CursorWindowAllocationException("Cursor window allocation of " + sCursorWindowSize / 1024 + " kb failed. " + printStats());
      paramString = "<unnamed>";
    }
    recordNewWindow(Binder.getCallingPid(), this.mWindowPtr);
  }

  @Deprecated
  public CursorWindow(boolean paramBoolean)
  {
    this(null);
  }

  private void dispose()
  {
    if (this.mWindowPtr != 0)
    {
      recordClosingOfWindow(this.mWindowPtr);
      nativeDispose(this.mWindowPtr);
      this.mWindowPtr = 0;
    }
  }

  private static native boolean nativeAllocRow(int paramInt);

  private static native void nativeClear(int paramInt);

  private static native void nativeCopyStringToBuffer(int paramInt1, int paramInt2, int paramInt3, CharArrayBuffer paramCharArrayBuffer);

  private static native int nativeCreate(String paramString, int paramInt);

  private static native int nativeCreateFromParcel(Parcel paramParcel);

  private static native void nativeDispose(int paramInt);

  private static native void nativeFreeLastRow(int paramInt);

  private static native byte[] nativeGetBlob(int paramInt1, int paramInt2, int paramInt3);

  private static native double nativeGetDouble(int paramInt1, int paramInt2, int paramInt3);

  private static native long nativeGetLong(int paramInt1, int paramInt2, int paramInt3);

  private static native String nativeGetName(int paramInt);

  private static native int nativeGetNumRows(int paramInt);

  private static native String nativeGetString(int paramInt1, int paramInt2, int paramInt3);

  private static native int nativeGetType(int paramInt1, int paramInt2, int paramInt3);

  private static native boolean nativePutBlob(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);

  private static native boolean nativePutDouble(int paramInt1, double paramDouble, int paramInt2, int paramInt3);

  private static native boolean nativePutLong(int paramInt1, long paramLong, int paramInt2, int paramInt3);

  private static native boolean nativePutNull(int paramInt1, int paramInt2, int paramInt3);

  private static native boolean nativePutString(int paramInt1, String paramString, int paramInt2, int paramInt3);

  private static native boolean nativeSetNumColumns(int paramInt1, int paramInt2);

  private static native void nativeWriteToParcel(int paramInt, Parcel paramParcel);

  public static CursorWindow newFromParcel(Parcel paramParcel)
  {
    return (CursorWindow)CREATOR.createFromParcel(paramParcel);
  }

  private String printStats()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = Process.myPid();
    SparseIntArray localSparseIntArray1 = new SparseIntArray();
    while (true)
    {
      int i1;
      int i2;
      synchronized (sWindowToPidMap)
      {
        int j = sWindowToPidMap.size();
        if (j == 0)
          return "";
        int k = 0;
        if (k >= j)
        {
          int n = localSparseIntArray1.size();
          i1 = 0;
          i2 = 0;
          if (i1 >= n)
          {
            if (localStringBuilder.length() <= 980)
              break label264;
            str = localStringBuilder.substring(0, 980);
            return "# Open Cursors=" + i2 + str;
          }
        }
        else
        {
          int m = sWindowToPidMap.valueAt(k);
          localSparseIntArray1.put(m, 1 + localSparseIntArray1.get(m));
          k++;
        }
      }
      localStringBuilder.append(" (# cursors opened by ");
      int i3 = localSparseIntArray1.keyAt(i1);
      if (i3 == i)
        localStringBuilder.append("this proc=");
      while (true)
      {
        int i4 = localSparseIntArray1.get(i3);
        localStringBuilder.append(i4 + ")");
        i2 += i4;
        i1++;
        break;
        localStringBuilder.append("pid " + i3 + "=");
      }
      label264: String str = localStringBuilder.toString();
    }
  }

  private void recordClosingOfWindow(int paramInt)
  {
    synchronized (sWindowToPidMap)
    {
      if (sWindowToPidMap.size() == 0)
        return;
      sWindowToPidMap.delete(paramInt);
      return;
    }
  }

  private void recordNewWindow(int paramInt1, int paramInt2)
  {
    synchronized (sWindowToPidMap)
    {
      sWindowToPidMap.put(paramInt2, paramInt1);
      return;
    }
  }

  public boolean allocRow()
  {
    acquireReference();
    try
    {
      boolean bool = nativeAllocRow(this.mWindowPtr);
      return bool;
    }
    finally
    {
      releaseReference();
    }
  }

  public void clear()
  {
    acquireReference();
    try
    {
      this.mStartPos = 0;
      nativeClear(this.mWindowPtr);
      return;
    }
    finally
    {
      releaseReference();
    }
  }

  public void copyStringToBuffer(int paramInt1, int paramInt2, CharArrayBuffer paramCharArrayBuffer)
  {
    if (paramCharArrayBuffer == null)
      throw new IllegalArgumentException("CharArrayBuffer should not be null");
    acquireReference();
    try
    {
      nativeCopyStringToBuffer(this.mWindowPtr, paramInt1 - this.mStartPos, paramInt2, paramCharArrayBuffer);
      return;
    }
    finally
    {
      releaseReference();
    }
  }

  public int describeContents()
  {
    return 0;
  }

  protected void finalize()
  {
    try
    {
      dispose();
      return;
    }
    finally
    {
      super.finalize();
    }
  }

  public void freeLastRow()
  {
    acquireReference();
    try
    {
      nativeFreeLastRow(this.mWindowPtr);
      return;
    }
    finally
    {
      releaseReference();
    }
  }

  public byte[] getBlob(int paramInt1, int paramInt2)
  {
    acquireReference();
    try
    {
      byte[] arrayOfByte = nativeGetBlob(this.mWindowPtr, paramInt1 - this.mStartPos, paramInt2);
      return arrayOfByte;
    }
    finally
    {
      releaseReference();
    }
  }

  public double getDouble(int paramInt1, int paramInt2)
  {
    acquireReference();
    try
    {
      double d = nativeGetDouble(this.mWindowPtr, paramInt1 - this.mStartPos, paramInt2);
      return d;
    }
    finally
    {
      releaseReference();
    }
  }

  public float getFloat(int paramInt1, int paramInt2)
  {
    return (float)getDouble(paramInt1, paramInt2);
  }

  public int getInt(int paramInt1, int paramInt2)
  {
    return (int)getLong(paramInt1, paramInt2);
  }

  public long getLong(int paramInt1, int paramInt2)
  {
    acquireReference();
    try
    {
      long l = nativeGetLong(this.mWindowPtr, paramInt1 - this.mStartPos, paramInt2);
      return l;
    }
    finally
    {
      releaseReference();
    }
  }

  public String getName()
  {
    return this.mName;
  }

  public int getNumRows()
  {
    acquireReference();
    try
    {
      int i = nativeGetNumRows(this.mWindowPtr);
      return i;
    }
    finally
    {
      releaseReference();
    }
  }

  public short getShort(int paramInt1, int paramInt2)
  {
    return (short)(int)getLong(paramInt1, paramInt2);
  }

  public int getStartPosition()
  {
    return this.mStartPos;
  }

  public String getString(int paramInt1, int paramInt2)
  {
    acquireReference();
    try
    {
      String str = nativeGetString(this.mWindowPtr, paramInt1 - this.mStartPos, paramInt2);
      return str;
    }
    finally
    {
      releaseReference();
    }
  }

  public int getType(int paramInt1, int paramInt2)
  {
    acquireReference();
    try
    {
      int i = nativeGetType(this.mWindowPtr, paramInt1 - this.mStartPos, paramInt2);
      return i;
    }
    finally
    {
      releaseReference();
    }
  }

  @Deprecated
  public boolean isBlob(int paramInt1, int paramInt2)
  {
    int i = getType(paramInt1, paramInt2);
    return (i == 4) || (i == 0);
  }

  @Deprecated
  public boolean isFloat(int paramInt1, int paramInt2)
  {
    return getType(paramInt1, paramInt2) == 2;
  }

  @Deprecated
  public boolean isLong(int paramInt1, int paramInt2)
  {
    return getType(paramInt1, paramInt2) == 1;
  }

  @Deprecated
  public boolean isNull(int paramInt1, int paramInt2)
  {
    return getType(paramInt1, paramInt2) == 0;
  }

  @Deprecated
  public boolean isString(int paramInt1, int paramInt2)
  {
    int i = getType(paramInt1, paramInt2);
    return (i == 3) || (i == 0);
  }

  protected void onAllReferencesReleased()
  {
    dispose();
  }

  public boolean putBlob(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    acquireReference();
    try
    {
      boolean bool = nativePutBlob(this.mWindowPtr, paramArrayOfByte, paramInt1 - this.mStartPos, paramInt2);
      return bool;
    }
    finally
    {
      releaseReference();
    }
  }

  public boolean putDouble(double paramDouble, int paramInt1, int paramInt2)
  {
    acquireReference();
    try
    {
      boolean bool = nativePutDouble(this.mWindowPtr, paramDouble, paramInt1 - this.mStartPos, paramInt2);
      return bool;
    }
    finally
    {
      releaseReference();
    }
  }

  public boolean putLong(long paramLong, int paramInt1, int paramInt2)
  {
    acquireReference();
    try
    {
      boolean bool = nativePutLong(this.mWindowPtr, paramLong, paramInt1 - this.mStartPos, paramInt2);
      return bool;
    }
    finally
    {
      releaseReference();
    }
  }

  public boolean putNull(int paramInt1, int paramInt2)
  {
    acquireReference();
    try
    {
      boolean bool = nativePutNull(this.mWindowPtr, paramInt1 - this.mStartPos, paramInt2);
      return bool;
    }
    finally
    {
      releaseReference();
    }
  }

  public boolean putString(String paramString, int paramInt1, int paramInt2)
  {
    acquireReference();
    try
    {
      boolean bool = nativePutString(this.mWindowPtr, paramString, paramInt1 - this.mStartPos, paramInt2);
      return bool;
    }
    finally
    {
      releaseReference();
    }
  }

  public boolean setNumColumns(int paramInt)
  {
    acquireReference();
    try
    {
      boolean bool = nativeSetNumColumns(this.mWindowPtr, paramInt);
      return bool;
    }
    finally
    {
      releaseReference();
    }
  }

  public void setStartPosition(int paramInt)
  {
    this.mStartPos = paramInt;
  }

  public String toString()
  {
    return getName() + " {" + Integer.toHexString(this.mWindowPtr) + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    acquireReference();
    try
    {
      paramParcel.writeInt(this.mStartPos);
      nativeWriteToParcel(this.mWindowPtr, paramParcel);
      releaseReference();
      if ((paramInt & 0x1) != 0);
      return;
    }
    finally
    {
      releaseReference();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.CursorWindow
 * JD-Core Version:    0.6.2
 */