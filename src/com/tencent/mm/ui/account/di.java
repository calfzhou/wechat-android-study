package com.tencent.mm.ui.account;

import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.r;

public final class di extends r
{
  private static di iPO = null;
  public String dCF = null;
  public String iPI = null;
  public String iPJ = null;
  public String iPK = null;
  public String iPL = null;
  public byte[] iPM = null;
  public boolean iPN = false;

  public static void a(di paramdi)
  {
    iPO = paramdi;
  }

  public static String aQD()
  {
    if (iPO != null)
      return iPO.dCF;
    return null;
  }

  public static String aQE()
  {
    if (iPO != null)
      return iPO.iPI;
    return null;
  }

  public final void aQC()
  {
    i locali = new i(this.dCF, this.iPI, this.iWa.yY(), "", "", "", 0);
    if (!ch.jb(this.iPJ))
      locali.hu(this.iPJ);
    bg.qX().d(locali);
  }

  protected final void onStart()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.di
 * JD-Core Version:    0.6.2
 */