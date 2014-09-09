package com.tencent.mm.modelfriend;

import com.tencent.mm.c.a.cu;
import com.tencent.mm.c.a.cv;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class m extends g
{
  public m()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof cu))
      return false;
    cu localcu = (cu)parame;
    localcu.cJg.cJj = true;
    if (!ch.jb(aa.gw(localcu.cJf.cJh)))
    {
      localcu.cJg.cJj = false;
      return false;
    }
    if (!ch.jb(aa.gw(localcu.cJf.cJi)))
    {
      localcu.cJg.cJj = false;
      return false;
    }
    z.i("!64@/B4Tb64lLpISOYcLaKm7W1QqXzG1JnWL1rmNsLE7dnhsNrZV5csiI8CQhN3SjA2j", "mobile fmessage not found by phonemd5 or fullphonemd5");
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.m
 * JD-Core Version:    0.6.2
 */