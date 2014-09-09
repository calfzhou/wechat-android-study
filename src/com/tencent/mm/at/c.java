package com.tencent.mm.at;

import android.os.Process;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.z;

final class c
  implements Runnable
{
  c(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
  }

  public final void run()
  {
    if (b.lV())
    {
      z.w("!44@/B4Tb64lLpI67oPDTT86rE/rkKVKjyGP17sNLUXP5EY=", "Hprof is mUploading");
      return;
    }
    if (this.iHt);
    for (String str = a.v(true, false); ; str = null)
    {
      Process.setThreadPriority(10);
      boolean bool = bc.bP(ak.getContext());
      if ((this.iHu) && (!bool))
      {
        z.w("!44@/B4Tb64lLpI67oPDTT86rE/rkKVKjyGP17sNLUXP5EY=", "Hprof no wifi");
        return;
      }
      if ((this.iHv) && (str != null));
      while (true)
      {
        b.L(true);
        b.gZ(str);
        b.L(false);
        return;
        if (this.iHw)
          str = a.iHr;
        else
          str = null;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.c
 * JD-Core Version:    0.6.2
 */