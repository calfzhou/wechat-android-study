package com.android.internal.telephony;

import android.os.Bundle;
import android.os.IInterface;
import java.util.List;

public abstract interface ITelephony extends IInterface
{
  public abstract void answerRingingCall();

  public abstract void call(String paramString);

  public abstract void cancelMissedCallsNotification();

  public abstract void dial(String paramString);

  public abstract int disableApnType(String paramString);

  public abstract boolean disableDataConnectivity();

  public abstract void disableLocationUpdates();

  public abstract int enableApnType(String paramString);

  public abstract boolean enableDataConnectivity();

  public abstract void enableLocationUpdates();

  public abstract boolean endCall();

  public abstract int getActivePhoneType();

  public abstract int getCallState();

  public abstract int getCdmaEriIconIndex();

  public abstract int getCdmaEriIconMode();

  public abstract String getCdmaEriText();

  public abstract boolean getCdmaNeedsProvisioning();

  public abstract Bundle getCellLocation();

  public abstract int getDataActivity();

  public abstract int getDataState();

  public abstract List getNeighboringCellInfo();

  public abstract int getNetworkType();

  public abstract int getVoiceMessageCount();

  public abstract boolean handlePinMmi(String paramString);

  public abstract boolean hasIccCard();

  public abstract boolean isDataConnectivityPossible();

  public abstract boolean isIdle();

  public abstract boolean isOffhook();

  public abstract boolean isRadioOn();

  public abstract boolean isRinging();

  public abstract boolean isSimPinEnabled();

  public abstract boolean setRadio(boolean paramBoolean);

  public abstract boolean showCallScreen();

  public abstract boolean showCallScreenWithDialpad(boolean paramBoolean);

  public abstract void silenceRinger();

  public abstract boolean supplyPin(String paramString);

  public abstract void toggleRadioOnOff();

  public abstract void updateServiceLocation();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.android.internal.telephony.ITelephony
 * JD-Core Version:    0.6.2
 */