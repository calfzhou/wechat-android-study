package com.tencent.mm.compatible.audio;

import com.tencent.mm.compatible.g.a;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

public final class ag
{
  private static int ddM = 100;
  private SimpleMediaRecorder dKZ = new SimpleMediaRecorder(c.dJI);
  private ai dLa = null;
  private a ddJ = new a(ak.getContext());
  private String rI = "";
  private int status = 0;

  public final void a(ai paramai)
  {
    this.dLa = paramai;
  }

  public final boolean cv(String paramString)
  {
    l locall = new l();
    if (this.rI.length() > 0)
    {
      z.e("!44@/B4Tb64lLpIfoY3B/8f1JSRs2jdo+wRyFb+w/ZYBe8A=", "Duplicate Call startRecord , maybe Stop Fail Before");
      return false;
    }
    this.rI = paramString;
    try
    {
      this.ddJ.requestFocus();
      this.dKZ.a(new ah(this));
      this.dKZ.mb();
      this.dKZ.mc();
      this.dKZ.ma();
      this.dKZ.setOutputFile(this.rI);
      this.dKZ.setMaxDuration(3600010);
      this.dKZ.prepare();
      this.dKZ.start();
      z.d("!44@/B4Tb64lLpIfoY3B/8f1JSRs2jdo+wRyFb+w/ZYBe8A=", "StartRecord File[" + this.rI + "] start time:" + locall.nM());
      this.status = 1;
      return true;
    }
    catch (Exception localException)
    {
      this.ddJ.nH();
      z.e("!44@/B4Tb64lLpIfoY3B/8f1JSRs2jdo+wRyFb+w/ZYBe8A=", "StartRecord File[" + this.rI + "] ErrMsg[" + localException.getMessage() + "]");
      this.status = -1;
    }
    return false;
  }

  public final String getFileName()
  {
    return this.rI;
  }

  public final int getMaxAmplitude()
  {
    if (this.status == 1)
    {
      int i = this.dKZ.getMaxAmplitude();
      if (i > ddM)
        ddM = i;
      return i * 100 / ddM;
    }
    return 0;
  }

  public final boolean lZ()
  {
    this.ddJ.nH();
    if (this.dKZ == null)
      return true;
    try
    {
      this.dKZ.md();
      this.dKZ.release();
      this.rI = "";
      this.status = 0;
      return true;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpIfoY3B/8f1JSRs2jdo+wRyFb+w/ZYBe8A=", "StopRecord File[" + this.rI + "] ErrMsg[" + localException.getMessage() + "]");
      this.status = -1;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.ag
 * JD-Core Version:    0.6.2
 */