package com.android.internal.telephony;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public abstract class ISms$Stub extends Binder
  implements ISms
{
  private static final String DESCRIPTOR = "com.android.internal.telephony.ISms";
  static final int TRANSACTION_copyMessageToIccEf = 3;
  static final int TRANSACTION_disableCellBroadcast = 8;
  static final int TRANSACTION_enableCellBroadcast = 7;
  static final int TRANSACTION_getAllMessagesFromIccEf = 1;
  static final int TRANSACTION_sendData = 4;
  static final int TRANSACTION_sendMultipartText = 6;
  static final int TRANSACTION_sendText = 5;
  static final int TRANSACTION_updateMessageOnIccEf = 2;

  public ISms$Stub()
  {
    attachInterface(this, "com.android.internal.telephony.ISms");
  }

  public static ISms asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.android.internal.telephony.ISms");
    if ((localIInterface != null) && ((localIInterface instanceof ISms)))
      return (ISms)localIInterface;
    return new ISms.Stub.Proxy(paramIBinder);
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.android.internal.telephony.ISms");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.android.internal.telephony.ISms");
      List localList = getAllMessagesFromIccEf();
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(localList);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.android.internal.telephony.ISms");
      boolean bool4 = updateMessageOnIccEf(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      int i1 = 0;
      if (bool4)
        i1 = 1;
      paramParcel2.writeInt(i1);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.android.internal.telephony.ISms");
      boolean bool3 = copyMessageToIccEf(paramParcel1.readInt(), paramParcel1.createByteArray(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      int n = 0;
      if (bool3)
        n = 1;
      paramParcel2.writeInt(n);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.android.internal.telephony.ISms");
      String str4 = paramParcel1.readString();
      String str5 = paramParcel1.readString();
      int k = paramParcel1.readInt();
      byte[] arrayOfByte = paramParcel1.createByteArray();
      if (paramParcel1.readInt() != 0);
      for (PendingIntent localPendingIntent3 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent3 = null)
      {
        int m = paramParcel1.readInt();
        PendingIntent localPendingIntent4 = null;
        if (m != 0)
          localPendingIntent4 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);
        sendData(str4, str5, k, arrayOfByte, localPendingIntent3, localPendingIntent4);
        paramParcel2.writeNoException();
        return true;
      }
    case 5:
      paramParcel1.enforceInterface("com.android.internal.telephony.ISms");
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      String str3 = paramParcel1.readString();
      PendingIntent localPendingIntent1;
      if (paramParcel1.readInt() != 0)
      {
        localPendingIntent1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label419;
      }
      for (PendingIntent localPendingIntent2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent2 = null)
      {
        sendText(str1, str2, str3, localPendingIntent1, localPendingIntent2);
        paramParcel2.writeNoException();
        return true;
        localPendingIntent1 = null;
        break;
      }
    case 6:
      paramParcel1.enforceInterface("com.android.internal.telephony.ISms");
      sendMultipartText(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArrayList(), paramParcel1.createTypedArrayList(PendingIntent.CREATOR), paramParcel1.createTypedArrayList(PendingIntent.CREATOR));
      paramParcel2.writeNoException();
      return true;
    case 7:
      label419: paramParcel1.enforceInterface("com.android.internal.telephony.ISms");
      boolean bool2 = enableCellBroadcast(paramParcel1.readInt());
      paramParcel2.writeNoException();
      int j = 0;
      if (bool2)
        j = 1;
      paramParcel2.writeInt(j);
      return true;
    case 8:
    }
    paramParcel1.enforceInterface("com.android.internal.telephony.ISms");
    boolean bool1 = disableCellBroadcast(paramParcel1.readInt());
    paramParcel2.writeNoException();
    int i = 0;
    if (bool1)
      i = 1;
    paramParcel2.writeInt(i);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.android.internal.telephony.ISms.Stub
 * JD-Core Version:    0.6.2
 */