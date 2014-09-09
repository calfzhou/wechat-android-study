package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import java.util.LinkedList;
import java.util.List;

public final class bi
{
  private static boolean cPv;
  private TelephonyManager iFa;
  private PhoneStateListener iFb;
  private List iFc = new LinkedList();

  public static boolean ta()
  {
    return cPv;
  }

  public final void a(bk parambk)
  {
    this.iFc.add(parambk);
  }

  public final void ca(Context paramContext)
  {
    if (this.iFa == null)
      this.iFa = ((TelephonyManager)paramContext.getSystemService("phone"));
    if (this.iFb == null)
      this.iFb = new bj(this);
    this.iFa.listen(this.iFb, 32);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bi
 * JD-Core Version:    0.6.2
 */