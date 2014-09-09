package com.tencent.mm.sandbox.monitor;

import com.tencent.mm.a.c;
import com.tencent.mm.a.f;
import com.tencent.mm.b.a;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.sandbox.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public abstract class g
  implements b
{
  public static final String iBl = h.dOI;
  protected int iBm;
  protected int iBn;
  protected int iBo;
  protected String iBp;
  private boolean iBq = false;

  public g(int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
  {
    this.iBn = paramInt1;
    this.iBp = paramString;
    this.iBm = paramInt2;
    this.iBq = paramBoolean;
    this.iBo = c.ab(aMt());
    File localFile = new File(iBl);
    if (!localFile.exists())
      localFile.mkdirs();
    z.d("!32@if09O0KMOqclD9U0ckkYxjTHC2iBlkRT", "NetSceneGetUpdatePack : temp path = " + aMt() + " packOffset = " + this.iBo);
  }

  public static boolean AA(String paramString)
  {
    return c.ac(iBl + paramString + ".temp");
  }

  public static String AB(String paramString)
  {
    String str1 = iBl + paramString + ".temp";
    String str2 = iBl + paramString + ".apk";
    if ((c.ac(str1)) && ((a.ak(str1)) || (paramString.equalsIgnoreCase(f.ag(str1)))))
    {
      c.a(iBl, paramString + ".temp", paramString + ".apk");
      return str2;
    }
    if (c.ac(str2))
    {
      if ((a.ak(str2)) || (paramString.equalsIgnoreCase(f.ag(str2))))
      {
        z.d("!32@if09O0KMOqclD9U0ckkYxjTHC2iBlkRT", "getReadyPack update pack ok");
        return str2;
      }
      z.e("!32@if09O0KMOqclD9U0ckkYxjTHC2iBlkRT", "getReadyPack: update pack MD5 not same");
      c.deleteFile(str2);
    }
    return null;
  }

  protected String aMt()
  {
    return iBl + this.iBp + ".temp";
  }

  public String aMu()
  {
    return iBl + this.iBp + ".apk";
  }

  public final void aMv()
  {
    try
    {
      z.d("!32@if09O0KMOqclD9U0ckkYxjTHC2iBlkRT", "deleteTempFile");
      File localFile = new File(aMt());
      if (localFile.exists())
        localFile.delete();
      return;
    }
    catch (Exception localException)
    {
      z.e("!32@if09O0KMOqclD9U0ckkYxjTHC2iBlkRT", "error in deleteTempFile");
    }
  }

  public final boolean aMw()
  {
    boolean bool1 = this.iBq;
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = bc.bP(ak.getContext());
      bool2 = false;
      if (!bool3)
        bool2 = true;
    }
    return bool2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.g
 * JD-Core Version:    0.6.2
 */