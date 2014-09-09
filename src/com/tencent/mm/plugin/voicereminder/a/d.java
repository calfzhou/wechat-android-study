package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import junit.framework.Assert;

public final class d
{
  private RandomAccessFile dAK = null;
  private String rI = "";

  public d(String paramString)
  {
    this.rI = paramString;
  }

  public static int id(String paramString)
  {
    boolean bool;
    File localFile;
    if (paramString.length() >= 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      localFile = new File(paramString);
      if (localFile.exists())
        break label36;
    }
    label36: int i;
    do
    {
      return 0;
      bool = false;
      break;
      i = (int)localFile.length();
    }
    while (i <= 0);
    return i;
  }

  private boolean il(String paramString)
  {
    boolean bool1;
    if (this.rI.length() >= 0)
      bool1 = true;
    while (true)
    {
      Assert.assertTrue(bool1);
      boolean bool2;
      label25: boolean bool3;
      if (this.dAK == null)
      {
        bool2 = true;
        Assert.assertTrue(bool2);
        if ((!paramString.equals("r")) && (!paramString.equals("rw")))
          break label116;
        bool3 = true;
        Assert.assertTrue(bool3);
        z.d("!44@/B4Tb64lLpKbU59mf71RZFzMaOEttCECeZZozT7o7i8=", "Open file:" + this.dAK + " mode:" + paramString);
      }
      try
      {
        this.dAK = new RandomAccessFile(this.rI, paramString);
        return true;
        bool1 = false;
        continue;
        bool2 = false;
        break label25;
        label116: bool3 = false;
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpKbU59mf71RZFzMaOEttCECeZZozT7o7i8=", "ERR: OpenFile[" + this.rI + "] failed:[" + localException.getMessage() + "]");
        this.dAK = null;
      }
    }
    return false;
  }

  public final void Bf()
  {
    if (this.dAK != null);
    try
    {
      this.dAK.close();
      this.dAK = null;
      z.d("!44@/B4Tb64lLpKbU59mf71RZFzMaOEttCECeZZozT7o7i8=", "Close :" + this.rI);
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public final e lo(int paramInt)
  {
    e locale = new e();
    if (paramInt < 0)
    {
      locale.ret = -3;
      return locale;
    }
    if ((this.dAK == null) && (!il("r")))
    {
      locale.ret = -2;
      return locale;
    }
    locale.buf = new byte[6000];
    try
    {
      long l = this.dAK.length();
      this.dAK.seek(paramInt);
      int i = this.dAK.read(locale.buf, 0, 6000);
      z.d("!44@/B4Tb64lLpKbU59mf71RZFzMaOEttCECeZZozT7o7i8=", "DBG: ReadFile[" + this.rI + "] readOffset:" + paramInt + " readRet:" + i + " fileNow:" + this.dAK.getFilePointer() + " fileSize:" + l);
      if (i < 0)
        i = 0;
      locale.ddA = i;
      locale.dGn = (i + paramInt);
      locale.ret = 0;
      return locale;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpKbU59mf71RZFzMaOEttCECeZZozT7o7i8=", "ERR: ReadFile[" + this.rI + "] Offset:" + paramInt + "  failed:[" + localException.getMessage() + "] ");
      Bf();
      locale.ret = -1;
    }
    return locale;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.d
 * JD-Core Version:    0.6.2
 */