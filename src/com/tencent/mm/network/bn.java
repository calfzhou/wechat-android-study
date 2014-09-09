package com.tencent.mm.network;

import android.os.RemoteCallbackList;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class bn extends w
{
  private int dUl = 5;
  private long dUm;
  private int dUn = 0;
  private final RemoteCallbackList dUo = new RemoteCallbackList();
  private ay dmV = new ay(new bo(this), false);

  public final int CX()
  {
    if (0L > ch.ab(this.dUm));
    for (int i = 6; ; i = this.dUl)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      z.i("!32@/B4Tb64lLpJlhWc9y/UzPIrDGDo3IGi4", "getNowStatus = %d", arrayOfObject);
      return i;
    }
  }

  public final void CY()
  {
    this.dUo.kill();
  }

  public final long CZ()
  {
    return this.dUm;
  }

  public final boolean c(ag paramag)
  {
    try
    {
      this.dUo.register(paramag);
      return true;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpJlhWc9y/UzPIrDGDo3IGi4", "addListener %s", new Object[] { localException });
    }
    return true;
  }

  public final boolean d(ag paramag)
  {
    try
    {
      boolean bool = this.dUo.unregister(paramag);
      return bool;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpJlhWc9y/UzPIrDGDo3IGi4", "removeListener %s", new Object[] { localException });
    }
    return false;
  }

  public final void et(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.i("!32@/B4Tb64lLpJlhWc9y/UzPIrDGDo3IGi4", "networkChange : %d", arrayOfObject);
    int i = this.dUl;
    int j = 0;
    if (paramInt == i)
      if (j != 0)
        break label164;
    label153: label164: 
    while ((paramInt != 0) && (paramInt != 1))
    {
      return;
      if (4 == paramInt)
      {
        int n = this.dUl;
        j = 0;
        if (n != 3)
          break;
        this.dUl = paramInt;
        j = 1;
        break;
      }
      if (3 == paramInt)
      {
        int k = this.dUl;
        j = 0;
        if (k == 0)
          break;
        int m = this.dUl;
        j = 0;
        if (m == 2)
          break;
        this.dUn = (1 + this.dUn);
        if (this.dUn <= 0)
          break label153;
        this.dUl = 3;
        j = 1;
        break;
      }
      if (5 == paramInt)
      {
        this.dUn = 0;
        this.dUl = 5;
        j = 1;
        break;
      }
      this.dUl = paramInt;
      j = 1;
      break;
    }
    this.dmV.cP(1000L);
  }

  public final void jt(String paramString)
  {
    long l = 0L;
    z.e("!32@/B4Tb64lLpJlhWc9y/UzPIrDGDo3IGi4", "service out of band:" + paramString);
    try
    {
      String[] arrayOfString = paramString.split(",");
      switch (Integer.valueOf(arrayOfString[0]).intValue())
      {
      default:
        this.dUm = 0L;
        return;
      case 1:
      }
      if (arrayOfString.length > 1)
        l = Integer.valueOf(arrayOfString[1]).intValue();
      this.dUm = l;
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.bn
 * JD-Core Version:    0.6.2
 */