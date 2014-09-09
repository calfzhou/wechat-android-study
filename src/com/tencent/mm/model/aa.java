package com.tencent.mm.model;

import com.tencent.mm.a.c;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class aa
{
  private af dkp = null;
  private BlockingQueue dkq = new ArrayBlockingQueue(80);
  public ad dkr = null;
  cm gQj = new ab(this, bg.qQ().getLooper());

  public static String h(String paramString, int paramInt)
  {
    if (paramString == null)
      return null;
    return bg.qW().pa() + "/reader_" + paramInt + "_" + f.d(paramString.getBytes()) + ".jpg";
  }

  public final String d(String paramString, int paramInt1, int paramInt2)
  {
    String str = h(paramString, paramInt1);
    z.d("!32@/B4Tb64lLpINwg6pdiU5D99hnbItqI3s", "getPicfileByUrl type:" + paramInt1 + " url:" + paramString);
    try
    {
      boolean bool = c.ac(str);
      if (bool)
        return str;
    }
    catch (Exception localException1)
    {
    }
    try
    {
      this.dkq.add(new ae(this, paramString, str, paramInt2));
      if ((this.dkp == null) || (!this.dkp.isAlive()))
      {
        this.dkp = new af(this);
        this.dkp.start();
      }
      label112: return null;
    }
    catch (Exception localException2)
    {
      break label112;
    }
  }

  public final void qt()
  {
    if (this.dkp != null)
      this.dkp.dkw = true;
    this.dkp = null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.aa
 * JD-Core Version:    0.6.2
 */