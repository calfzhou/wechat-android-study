package com.android.internal.telephony;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class ITelephony$Stub extends Binder
  implements ITelephony
{
  private static final String DESCRIPTOR = "com.android.internal.telephony.ITelephony";
  static final int TRANSACTION_answerRingingCall = 6;
  static final int TRANSACTION_call = 2;
  static final int TRANSACTION_cancelMissedCallsNotification = 13;
  static final int TRANSACTION_dial = 1;
  static final int TRANSACTION_disableApnType = 22;
  static final int TRANSACTION_disableDataConnectivity = 24;
  static final int TRANSACTION_disableLocationUpdates = 20;
  static final int TRANSACTION_enableApnType = 21;
  static final int TRANSACTION_enableDataConnectivity = 23;
  static final int TRANSACTION_enableLocationUpdates = 19;
  static final int TRANSACTION_endCall = 5;
  static final int TRANSACTION_getActivePhoneType = 31;
  static final int TRANSACTION_getCallState = 28;
  static final int TRANSACTION_getCdmaEriIconIndex = 32;
  static final int TRANSACTION_getCdmaEriIconMode = 33;
  static final int TRANSACTION_getCdmaEriText = 34;
  static final int TRANSACTION_getCdmaNeedsProvisioning = 35;
  static final int TRANSACTION_getCellLocation = 26;
  static final int TRANSACTION_getDataActivity = 29;
  static final int TRANSACTION_getDataState = 30;
  static final int TRANSACTION_getNeighboringCellInfo = 27;
  static final int TRANSACTION_getNetworkType = 37;
  static final int TRANSACTION_getVoiceMessageCount = 36;
  static final int TRANSACTION_handlePinMmi = 15;
  static final int TRANSACTION_hasIccCard = 38;
  static final int TRANSACTION_isDataConnectivityPossible = 25;
  static final int TRANSACTION_isIdle = 10;
  static final int TRANSACTION_isOffhook = 8;
  static final int TRANSACTION_isRadioOn = 11;
  static final int TRANSACTION_isRinging = 9;
  static final int TRANSACTION_isSimPinEnabled = 12;
  static final int TRANSACTION_setRadio = 17;
  static final int TRANSACTION_showCallScreen = 3;
  static final int TRANSACTION_showCallScreenWithDialpad = 4;
  static final int TRANSACTION_silenceRinger = 7;
  static final int TRANSACTION_supplyPin = 14;
  static final int TRANSACTION_toggleRadioOnOff = 16;
  static final int TRANSACTION_updateServiceLocation = 18;

  public ITelephony$Stub()
  {
    attachInterface(this, "com.android.internal.telephony.ITelephony");
  }

  public static ITelephony asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.android.internal.telephony.ITelephony");
    if ((localIInterface != null) && ((localIInterface instanceof ITelephony)))
      return (ITelephony)localIInterface;
    return new ITelephony.Stub.Proxy(paramIBinder);
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
      paramParcel2.writeString("com.android.internal.telephony.ITelephony");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      dial(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      call(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      boolean bool18 = showCallScreen();
      paramParcel2.writeNoException();
      int i21 = 0;
      if (bool18)
        i21 = 1;
      paramParcel2.writeInt(i21);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      if (paramParcel1.readInt() != 0);
      for (boolean bool16 = true; ; bool16 = false)
      {
        boolean bool17 = showCallScreenWithDialpad(bool16);
        paramParcel2.writeNoException();
        int i20 = 0;
        if (bool17)
          i20 = 1;
        paramParcel2.writeInt(i20);
        return true;
      }
    case 5:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      boolean bool15 = endCall();
      paramParcel2.writeNoException();
      int i19 = 0;
      if (bool15)
        i19 = 1;
      paramParcel2.writeInt(i19);
      return true;
    case 6:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      answerRingingCall();
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      silenceRinger();
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      boolean bool14 = isOffhook();
      paramParcel2.writeNoException();
      int i18 = 0;
      if (bool14)
        i18 = 1;
      paramParcel2.writeInt(i18);
      return true;
    case 9:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      boolean bool13 = isRinging();
      paramParcel2.writeNoException();
      int i17 = 0;
      if (bool13)
        i17 = 1;
      paramParcel2.writeInt(i17);
      return true;
    case 10:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      boolean bool12 = isIdle();
      paramParcel2.writeNoException();
      int i16 = 0;
      if (bool12)
        i16 = 1;
      paramParcel2.writeInt(i16);
      return true;
    case 11:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      boolean bool11 = isRadioOn();
      paramParcel2.writeNoException();
      int i15 = 0;
      if (bool11)
        i15 = 1;
      paramParcel2.writeInt(i15);
      return true;
    case 12:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      boolean bool10 = isSimPinEnabled();
      paramParcel2.writeNoException();
      int i14 = 0;
      if (bool10)
        i14 = 1;
      paramParcel2.writeInt(i14);
      return true;
    case 13:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      cancelMissedCallsNotification();
      paramParcel2.writeNoException();
      return true;
    case 14:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      boolean bool9 = supplyPin(paramParcel1.readString());
      paramParcel2.writeNoException();
      int i13 = 0;
      if (bool9)
        i13 = 1;
      paramParcel2.writeInt(i13);
      return true;
    case 15:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      boolean bool8 = handlePinMmi(paramParcel1.readString());
      paramParcel2.writeNoException();
      int i12 = 0;
      if (bool8)
        i12 = 1;
      paramParcel2.writeInt(i12);
      return true;
    case 16:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      toggleRadioOnOff();
      paramParcel2.writeNoException();
      return true;
    case 17:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      if (paramParcel1.readInt() != 0);
      for (boolean bool6 = true; ; bool6 = false)
      {
        boolean bool7 = setRadio(bool6);
        paramParcel2.writeNoException();
        int i11 = 0;
        if (bool7)
          i11 = 1;
        paramParcel2.writeInt(i11);
        return true;
      }
    case 18:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      updateServiceLocation();
      paramParcel2.writeNoException();
      return true;
    case 19:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      enableLocationUpdates();
      paramParcel2.writeNoException();
      return true;
    case 20:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      disableLocationUpdates();
      paramParcel2.writeNoException();
      return true;
    case 21:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      int i10 = enableApnType(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i10);
      return true;
    case 22:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      int i9 = disableApnType(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i9);
      return true;
    case 23:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      boolean bool5 = enableDataConnectivity();
      paramParcel2.writeNoException();
      int i8 = 0;
      if (bool5)
        i8 = 1;
      paramParcel2.writeInt(i8);
      return true;
    case 24:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      boolean bool4 = disableDataConnectivity();
      paramParcel2.writeNoException();
      int i7 = 0;
      if (bool4)
        i7 = 1;
      paramParcel2.writeInt(i7);
      return true;
    case 25:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      boolean bool3 = isDataConnectivityPossible();
      paramParcel2.writeNoException();
      int i6 = 0;
      if (bool3)
        i6 = 1;
      paramParcel2.writeInt(i6);
      return true;
    case 26:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      Bundle localBundle = getCellLocation();
      paramParcel2.writeNoException();
      if (localBundle != null)
      {
        paramParcel2.writeInt(1);
        localBundle.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 27:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      List localList = getNeighboringCellInfo();
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(localList);
      return true;
    case 28:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      int i5 = getCallState();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i5);
      return true;
    case 29:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      int i4 = getDataActivity();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i4);
      return true;
    case 30:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      int i3 = getDataState();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i3);
      return true;
    case 31:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      int i2 = getActivePhoneType();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i2);
      return true;
    case 32:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      int i1 = getCdmaEriIconIndex();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i1);
      return true;
    case 33:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      int n = getCdmaEriIconMode();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(n);
      return true;
    case 34:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      String str = getCdmaEriText();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      return true;
    case 35:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      boolean bool2 = getCdmaNeedsProvisioning();
      paramParcel2.writeNoException();
      int m = 0;
      if (bool2)
        m = 1;
      paramParcel2.writeInt(m);
      return true;
    case 36:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      int k = getVoiceMessageCount();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(k);
      return true;
    case 37:
      paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
      int j = getNetworkType();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(j);
      return true;
    case 38:
    }
    paramParcel1.enforceInterface("com.android.internal.telephony.ITelephony");
    boolean bool1 = hasIccCard();
    paramParcel2.writeNoException();
    int i = 0;
    if (bool1)
      i = 1;
    paramParcel2.writeInt(i);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.android.internal.telephony.ITelephony.Stub
 * JD-Core Version:    0.6.2
 */