package com.tencent.map.location;

import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class f
{
  private static f Ly;
  private List LA = new ArrayList();
  private String Lx;
  private long Lz = 0L;
  private List a = new ArrayList();

  private static boolean a(StringBuffer paramStringBuffer)
  {
    try
    {
      double d = new JSONObject(paramStringBuffer.toString()).getJSONObject("location").getDouble("accuracy");
      boolean bool1 = d < 5000.0D;
      boolean bool2 = false;
      if (bool1)
        bool2 = true;
      return bool2;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  private boolean a(List paramList)
  {
    if (paramList == null);
    do
    {
      return false;
      int i;
      if (this.LA != null)
      {
        int k = 0;
        i = 0;
        if (k < this.LA.size())
        {
          String str = ((i)this.LA.get(k)).Lx;
          for (int m = 0; ; m++)
            if ((str != null) && (m < paramList.size()))
            {
              if (str.equals(((ScanResult)paramList.get(m)).BSSID))
                i++;
            }
            else
            {
              k++;
              break;
            }
        }
      }
      else
      {
        i = 0;
      }
      int j = paramList.size();
      if ((j >= 6) && (i >= 1 + j / 2))
        return true;
      if ((j < 6) && (i >= 2))
        return true;
    }
    while ((this.LA.size() > 2) || (paramList.size() > 2) || (Math.abs(System.currentTimeMillis() - this.Lz) > 30000L));
    return true;
  }

  public static f gX()
  {
    if (Ly == null)
      Ly = new f();
    return Ly;
  }

  public final void U(String paramString)
  {
    this.Lx = paramString;
  }

  public final void a()
  {
    this.Lx = null;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, List paramList)
  {
    this.Lz = System.currentTimeMillis();
    this.Lx = null;
    this.a.clear();
    h localh = new h((byte)0);
    localh.a = paramInt1;
    localh.b = paramInt2;
    localh.KZ = paramInt3;
    localh.La = paramInt4;
    this.a.add(localh);
    if (paramList != null)
    {
      this.LA.clear();
      for (int i = 0; i < paramList.size(); i++)
      {
        i locali = new i((byte)0);
        locali.Lx = ((ScanResult)paramList.get(i)).BSSID;
        this.LA.add(locali);
      }
    }
  }

  public final String b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, List paramList)
  {
    if ((this.Lx == null) || (this.Lx.length() < 10));
    label237: label251: 
    do
    {
      return null;
      String str = this.Lx;
      if ((str == null) || (paramList == null));
      for (str = null; ; str = null)
      {
        long l;
        do
        {
          this.Lx = str;
          if (this.Lx == null)
            break;
          if ((this.a == null) || (this.a.size() <= 0))
            break label251;
          h localh = (h)this.a.get(0);
          if ((localh.a != paramInt1) || (localh.b != paramInt2) || (localh.KZ != paramInt3) || (localh.La != paramInt4))
            break;
          if (((this.LA != null) && (this.LA.size() != 0)) || ((paramList != null) && (paramList.size() != 0)))
            break label237;
          return this.Lx;
          l = Math.abs(System.currentTimeMillis() - this.Lz);
        }
        while (((l <= 30000L) || (paramList.size() <= 2)) && ((l <= 45000L) || (paramList.size() > 2)) && (a(new StringBuffer(str))));
      }
      if (a(paramList))
        return this.Lx;
    }
    while (!a(paramList));
    return this.Lx;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.f
 * JD-Core Version:    0.6.2
 */