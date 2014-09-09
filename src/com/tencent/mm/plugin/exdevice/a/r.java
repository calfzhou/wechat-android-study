package com.tencent.mm.plugin.exdevice.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

final class r
{
  private static r eIz = null;
  private long eIy;

  private r()
  {
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localSharedPreferences != null)
    {
      l = localSharedPreferences.getLong("local_message_seq", l);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l);
      z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "lasted seq id is %d", arrayOfObject);
    }
    this.eIy = l;
  }

  public static long OW()
  {
    if (eIz == null)
      eIz = new r();
    r localr = eIz;
    if (9223372036854775807L == localr.eIy)
    {
      z.w("!56@/B4Tb64lLpL5AbGeSR0XjjEEh0gGvyrLMIuwkGb9431gLazkiIv0Rg==", "Sequence Data-overrun!!!");
      localr.eIy = 0L;
    }
    long l = 1L + localr.eIy;
    localr.eIy = l;
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localSharedPreferences != null)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l);
      z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "save locall seq id : %d", arrayOfObject);
      localSharedPreferences.edit().putLong("local_message_seq", l).commit();
    }
    return l;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.r
 * JD-Core Version:    0.6.2
 */