package com.tencent.mm.modelstat;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;

final class p extends PhoneStateListener
{
  public final void onSignalStrengthsChanged(SignalStrength paramSignalStrength)
  {
    super.onSignalStrengthsChanged(paramSignalStrength);
    l.eA(paramSignalStrength.getCdmaDbm());
    l.eB(paramSignalStrength.getGsmSignalStrength());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.p
 * JD-Core Version:    0.6.2
 */