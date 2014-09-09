package com.tencent.mm.modelsimple;

import com.tencent.mm.compatible.g.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.n.ab;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public final class at
{
  private static boolean dDc = false;
  private static int dDd = 3;
  private static long dDe = 0L;
  private static m dlH = null;

  public static void run()
  {
    if (dDc)
    {
      z.i("!56@/B4Tb64lLpIuznxMDiXSbP9MkXbTW1ymAAAVGtTaecfQD5lkiwWqpQ==", "is uploading hdHeadImg now!");
      return;
    }
    if ((dDe == 0L) || (ch.ad(dDe) > 180000L))
    {
      dDe = ch.CN();
      dDd = 3;
    }
    if (dDd <= 0)
    {
      z.i("!56@/B4Tb64lLpIuznxMDiXSbP9MkXbTW1ymAAAVGtTaecfQD5lkiwWqpQ==", "frequency limit");
      return;
    }
    dDd = -1 + dDd;
    String str = h.dOS + "temp.avatar.hd";
    if (!new File(str).exists())
    {
      z.d("!56@/B4Tb64lLpIuznxMDiXSbP9MkXbTW1ymAAAVGtTaecfQD5lkiwWqpQ==", "has uploaded HDHeadImg and delete it");
      return;
    }
    if (dlH == null)
      dlH = new au(str);
    bg.qX().a(157, dlH);
    ab localab = new ab(1, str);
    bg.qX().d(localab);
    dDc = true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.at
 * JD-Core Version:    0.6.2
 */