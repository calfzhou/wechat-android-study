package com.android.internal.telephony;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

class ISms$Stub$Proxy
  implements ISms
{
  private IBinder mRemote;

  ISms$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.mRemote;
  }

  public boolean copyMessageToIccEf(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.android.internal.telephony.ISms");
      localParcel1.writeInt(paramInt);
      localParcel1.writeByteArray(paramArrayOfByte1);
      localParcel1.writeByteArray(paramArrayOfByte2);
      this.mRemote.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      boolean bool = false;
      if (i != 0)
        bool = true;
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public boolean disableCellBroadcast(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.android.internal.telephony.ISms");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      boolean bool = false;
      if (i != 0)
        bool = true;
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public boolean enableCellBroadcast(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.android.internal.telephony.ISms");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      boolean bool = false;
      if (i != 0)
        bool = true;
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public List getAllMessagesFromIccEf()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.android.internal.telephony.ISms");
      this.mRemote.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      ArrayList localArrayList = localParcel2.createTypedArrayList(SmsRawData.CREATOR);
      return localArrayList;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public String getInterfaceDescriptor()
  {
    return "com.android.internal.telephony.ISms";
  }

  public void sendData(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.android.internal.telephony.ISms");
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        localParcel1.writeInt(paramInt);
        localParcel1.writeByteArray(paramArrayOfByte);
        if (paramPendingIntent1 != null)
        {
          localParcel1.writeInt(1);
          paramPendingIntent1.writeToParcel(localParcel1, 0);
          if (paramPendingIntent2 != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent2.writeToParcel(localParcel1, 0);
            this.mRemote.transact(4, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      localParcel1.writeInt(0);
    }
  }

  public void sendMultipartText(String paramString1, String paramString2, List paramList1, List paramList2, List paramList3)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.android.internal.telephony.ISms");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeStringList(paramList1);
      localParcel1.writeTypedList(paramList2);
      localParcel1.writeTypedList(paramList3);
      this.mRemote.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void sendText(String paramString1, String paramString2, String paramString3, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.android.internal.telephony.ISms");
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        localParcel1.writeString(paramString3);
        if (paramPendingIntent1 != null)
        {
          localParcel1.writeInt(1);
          paramPendingIntent1.writeToParcel(localParcel1, 0);
          if (paramPendingIntent2 != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent2.writeToParcel(localParcel1, 0);
            this.mRemote.transact(5, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      localParcel1.writeInt(0);
    }
  }

  public boolean updateMessageOnIccEf(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.android.internal.telephony.ISms");
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeByteArray(paramArrayOfByte);
      this.mRemote.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      boolean bool = false;
      if (i != 0)
        bool = true;
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.android.internal.telephony.ISms.Stub.Proxy
 * JD-Core Version:    0.6.2
 */