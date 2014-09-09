package com.tencent.mm.modelvoice;

import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.io.RandomAccessFile;
import junit.framework.Assert;

public final class ba
  implements b
{
  private RandomAccessFile dAK = null;
  private String rI = "";

  public ba(String paramString)
  {
    this.rI = paramString;
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
        z.d("!44@/B4Tb64lLpJWCW5Yaa5SO/ng2USwsr0G1/mgjd4+wvk=", "Open file:" + this.dAK + " mode:" + paramString);
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
        z.e("!44@/B4Tb64lLpJWCW5Yaa5SO/ng2USwsr0G1/mgjd4+wvk=", "ERR: OpenFile[" + this.rI + "] failed:[" + localException.getMessage() + "]");
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
      z.d("!44@/B4Tb64lLpJWCW5Yaa5SO/ng2USwsr0G1/mgjd4+wvk=", "Close :" + this.rI);
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public final y J(int paramInt1, int paramInt2)
  {
    y localy = new y();
    if ((paramInt1 < 0) || (paramInt2 <= 0))
    {
      localy.ret = -3;
      return localy;
    }
    if ((this.dAK == null) && (!il("r")))
    {
      localy.ret = -2;
      return localy;
    }
    localy.buf = new byte[paramInt2];
    try
    {
      long l = this.dAK.length();
      this.dAK.seek(paramInt1);
      int i = this.dAK.read(localy.buf, 0, paramInt2);
      z.d("!44@/B4Tb64lLpJWCW5Yaa5SO/ng2USwsr0G1/mgjd4+wvk=", "DBG: ReadFile[" + this.rI + "] readOffset:" + paramInt1 + " readRet:" + i + " fileNow:" + this.dAK.getFilePointer() + " fileSize:" + l);
      if (i < 0)
        i = 0;
      localy.ddA = i;
      localy.dGn = (i + paramInt1);
      localy.ret = 0;
      return localy;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpJWCW5Yaa5SO/ng2USwsr0G1/mgjd4+wvk=", "ERR: ReadFile[" + this.rI + "] Offset:" + paramInt1 + "  failed:[" + localException.getMessage() + "] ");
      Bf();
      localy.ret = -1;
    }
    return localy;
  }

  public final int getFormat()
  {
    return 4;
  }

  public final int write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    if ((paramArrayOfByte.length > 0) && (paramInt1 > 0));
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      if ((this.dAK != null) || (il("rw")))
        break;
      return -1;
    }
    while (true)
    {
      try
      {
        this.dAK.seek(paramInt2);
        this.dAK.write(paramArrayOfByte, 0, paramInt1);
        long l = this.dAK.getFilePointer();
        int i = (int)l;
        int j = paramInt2 + paramInt1;
        if (i == j)
        {
          bool3 = bool1;
          Assert.assertTrue(bool3);
          if (j < 0)
            break label178;
          Assert.assertTrue(bool1);
          return j;
        }
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpJWCW5Yaa5SO/ng2USwsr0G1/mgjd4+wvk=", "ERR: WriteFile[" + this.rI + "] Offset:" + paramInt2 + " failed:[" + localException.getMessage() + "]");
        Bf();
        return -3;
      }
      boolean bool3 = false;
      continue;
      label178: bool1 = false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.ba
 * JD-Core Version:    0.6.2
 */