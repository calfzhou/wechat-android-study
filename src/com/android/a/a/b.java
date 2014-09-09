package com.android.a.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class b extends Binder
  implements a
{
  public static a a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
    if ((localIInterface != null) && ((localIInterface instanceof a)))
      return (a)localIInterface;
    return new c(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.android.vending.billing.IInAppBillingService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
      int k = b(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(k);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
      int j = paramParcel1.readInt();
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      Bundle localBundle3;
      if (paramParcel1.readInt() != 0)
      {
        localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        Bundle localBundle4 = a(j, str1, str2, localBundle3);
        paramParcel2.writeNoException();
        if (localBundle4 == null)
          break label202;
        paramParcel2.writeInt(1);
        localBundle4.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        return true;
        localBundle3 = null;
        break;
        paramParcel2.writeInt(0);
      }
    case 3:
      paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
      Bundle localBundle2 = a(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localBundle2 != null)
      {
        paramParcel2.writeInt(1);
        localBundle2.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 4:
      label202: paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
      Bundle localBundle1 = a(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localBundle1 != null)
      {
        paramParcel2.writeInt(1);
        localBundle1.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 5:
    }
    paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
    int i = c(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
    paramParcel2.writeNoException();
    paramParcel2.writeInt(i);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.android.a.a.b
 * JD-Core Version:    0.6.2
 */