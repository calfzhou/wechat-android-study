package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.sdk.platformtools.ak;

public class cq
{
  private static cq dmd;
  private final SharedPreferences dkI = ak.getContext().getSharedPreferences(ak.aHi(), 0);

  public static cq rO()
  {
    try
    {
      if (dmd == null)
        dmd = new cq();
      return dmd;
    }
    finally
    {
    }
  }

  public final void rP()
  {
    this.dkI.edit().putInt("!44@/B4Tb64lLpIq8/rz82HB73s3T0aShOZicGQMdPpMx80=style_id", 21).commit();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cq
 * JD-Core Version:    0.6.2
 */