package com.tencent.mm.o;

import com.tencent.mm.kvcomm.KVReportJni.KVReportJava2C;
import com.tencent.mm.network.a.c;
import com.tencent.mm.network.ac;
import com.tencent.mm.network.ak;
import com.tencent.mm.network.n;
import com.tencent.mm.network.r;
import com.tencent.mm.network.s;
import com.tencent.mm.network.v;
import com.tencent.mm.protocal.be;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

public final class am
  implements r
{
  private final s dpi;

  public am(s params)
  {
    this.dpi = params;
  }

  public final void B(long paramLong)
  {
    try
    {
      this.dpi.setSignallingStrategy(paramLong, 20000L);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void I(String paramString1, String paramString2)
  {
    try
    {
      this.dpi.c(paramString1, null, paramString2, null);
      return;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLk9E8M7LEcizFIn9va4g6+", "set fixed host failed, core service down, %s", new Object[] { localException });
    }
  }

  public final void Y(boolean paramBoolean)
  {
    try
    {
      this.dpi.Y(paramBoolean);
      return;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLk9E8M7LEcizFIn9va4g6+", "change active status failed, core service down, %s", new Object[] { localException });
    }
  }

  public final int a(ak paramak, ac paramac)
  {
    try
    {
      int i = this.dpi.a(paramak, paramac);
      return i;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLk9E8M7LEcizFIn9va4g6+", "remote dispatcher lost, send failed, %s", new Object[] { localException });
    }
    return -1;
  }

  public final void a(c paramc)
  {
    try
    {
      this.dpi.a(paramc);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void a(be parambe)
  {
    try
    {
      this.dpi.a(parambe);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void a(boolean paramBoolean, String paramString1, String paramString2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, String paramString3, String paramString4)
  {
    try
    {
      this.dpi.a(paramBoolean, paramString1, paramString2, paramArrayOfInt1, paramArrayOfInt2, paramInt1, paramInt2, paramString3, paramString4);
      return;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLk9E8M7LEcizFIn9va4g6+", "dkidc setIDCHostInfo ip failed, core service down, %s", new Object[] { localException });
    }
  }

  public final void a(boolean paramBoolean, byte[] paramArrayOfByte)
  {
    KVReportJni.KVReportJava2C.ackKvStrategy(paramBoolean, paramArrayOfByte);
  }

  public final int c(String paramString, List paramList)
  {
    try
    {
      int i = this.dpi.c(paramString, paramList);
      return i;
    }
    catch (Exception localException)
    {
    }
    return -1;
  }

  public final void cancel(int paramInt)
  {
    try
    {
      this.dpi.cancel(paramInt);
      return;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      arrayOfObject[1] = localException;
      z.e("!32@/B4Tb64lLpLk9E8M7LEcizFIn9va4g6+", "cancel remote rr failed, netid=%d, %s", arrayOfObject);
    }
  }

  public final void fl(String paramString)
  {
    try
    {
      this.dpi.fl(paramString);
      return;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLk9E8M7LEcizFIn9va4g6+", "ipxxStatistics remote call error, %s", new Object[] { localException });
    }
  }

  public final String[] getIPsString(boolean paramBoolean)
  {
    try
    {
      String[] arrayOfString = this.dpi.getIPsString(paramBoolean);
      return arrayOfString;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLk9E8M7LEcizFIn9va4g6+", "query remote network server ip failed, %s", new Object[] { localException });
    }
    return null;
  }

  public final String getIspId()
  {
    try
    {
      String str = this.dpi.getIspId();
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final String getNetworkServerIp()
  {
    try
    {
      String str = this.dpi.getNetworkServerIp();
      return str;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLk9E8M7LEcizFIn9va4g6+", "query remote network server ip failed, %s", new Object[] { localException });
    }
    return null;
  }

  public final void keepSignalling()
  {
    try
    {
      this.dpi.keepSignalling();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void reset()
  {
    try
    {
      this.dpi.reset();
      return;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLk9E8M7LEcizFIn9va4g6+", "reset failed, core service down, %s", new Object[] { localException });
    }
  }

  public final void setHostInfo(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt)
  {
    try
    {
      this.dpi.setHostInfo(paramArrayOfString1, paramArrayOfString2, paramArrayOfInt);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void stopSignalling()
  {
    try
    {
      this.dpi.stopSignalling();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final n tE()
  {
    try
    {
      al localal = new al(this.dpi.CU());
      return localal;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLk9E8M7LEcizFIn9va4g6+", "getAccInfo failed, core service down, %s", new Object[] { localException });
    }
    return null;
  }

  public final v tF()
  {
    try
    {
      v localv = this.dpi.CW();
      return localv;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final boolean tx()
  {
    try
    {
      boolean bool = this.dpi.tx();
      return bool;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLk9E8M7LEcizFIn9va4g6+", "core service down, guess network stable, %s", new Object[] { localException });
    }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.am
 * JD-Core Version:    0.6.2
 */