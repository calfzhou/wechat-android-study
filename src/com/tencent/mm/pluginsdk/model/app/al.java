package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.network.aj;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.c;
import com.tencent.mm.o.d;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.ui.tools.q;
import com.tencent.mm.protocal.a.cd;
import com.tencent.mm.protocal.a.jt;
import com.tencent.mm.protocal.a.ju;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class al extends ac
{
  private static final String[] hvg = { "wxf109da3e26cf89f1", "wxc56bba830743541e", "wx41dd4f6ef137bd0b" };

  public al(List paramList)
  {
    b localb = new b();
    localb.a(new jt());
    localb.b(new ju());
    localb.fi("/cgi-bin/micromsg-bin/getappinfolist");
    localb.de(451);
    localb.df(0);
    localb.dg(0);
    this.eJc = localb.sU();
    jt localjt = (jt)this.eJc.sO();
    LinkedList localLinkedList = new LinkedList();
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!ch.jb(str))
          localLinkedList.add(ai.iU(str));
      }
    }
    localjt.iaG = localLinkedList;
    localjt.huF = localLinkedList.size();
  }

  private static void a(k paramk, cd paramcd)
  {
    if (paramk == null)
    {
      paramk = new k();
      paramk.field_appId = paramcd.hOd;
    }
    for (int i = 1; ; i = 0)
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = paramcd.hOd;
      arrayOfObject1[1] = Integer.valueOf(paramcd.hRW);
      z.i("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5F/9+GqwVmOR4=", "appid:[%s], appinfoflag:[%d]", arrayOfObject1);
      if ((!paramk.ayE()) || (ch.jb(paramk.field_appName)))
        paramk.field_appName = paramcd.KH;
      if ((!paramk.ayE()) || (ch.jb(paramk.field_appName_en)))
        paramk.field_appName_en = paramcd.hRN;
      if ((!paramk.ayE()) || (ch.jb(paramk.field_appName_tw)))
        paramk.field_appName_tw = paramcd.hRP;
      paramk.field_appDiscription = paramcd.hPB;
      paramk.field_appDiscription_en = paramcd.hRO;
      paramk.field_appDiscription_tw = paramcd.hRQ;
      paramk.field_appWatermarkUrl = paramcd.hRU;
      paramk.field_packageName = paramcd.hOw;
      paramk.field_signature = u.ve(paramcd.hRV);
      paramk.field_appType = paramcd.hPE;
      if ((!ch.jb(paramk.field_appType)) && (paramk.field_appType.startsWith("1")))
        paramk.field_appType = ("," + paramk.field_appType);
      paramk.field_appInfoFlag = paramcd.hRW;
      paramk.field_appVersion = paramcd.hRX;
      paramk.ay(paramcd.hPH);
      paramk.field_appWatermarkUrl = paramcd.hRU;
      if ((!ch.jb(paramcd.hSa)) && (!ch.jb(paramcd.hSb)))
      {
        Object[] arrayOfObject2 = new Object[3];
        arrayOfObject2[0] = paramk.field_appName;
        arrayOfObject2[1] = paramcd.hSa;
        arrayOfObject2[2] = paramcd.hSb;
        z.i("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5F/9+GqwVmOR4=", "get app download url and download md5 : [%s], [%s], [%s]", arrayOfObject2);
        paramk.aA(paramcd.hSa);
        paramk.aF(paramcd.hSb);
      }
      paramk.aG(paramcd.hOx);
      if (paramcd.hRY > paramk.iB())
        paramk.aZ(1);
      paramk.aY(paramcd.hRY);
      String str1 = paramcd.hOw;
      String str2 = paramcd.hOw;
      int j;
      o localo;
      int i1;
      label487: int i2;
      if ((str1 == null) || (str1.length() == 0) || (str2 == null) || (str2.length() == 0))
      {
        j = 1;
        if (j != 0)
          z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5F/9+GqwVmOR4=", "no android app, packageName = " + paramcd.hOw + "appid: " + paramk.field_appId);
        if (paramk.avN())
          q.wd(paramk.field_appId);
        localo = bf.GO();
        if (i == 0)
          break label644;
        if (j == 0)
          break label576;
        i1 = 3;
        paramk.field_status = i1;
        paramk.field_modifyTime = System.currentTimeMillis();
        paramk.field_appIconUrl = paramcd.hRS;
        String str3 = paramk.field_appId;
        i2 = 0;
        if (str3 == null);
      }
      while (true)
      {
        if (i2 < hvg.length)
        {
          if (paramk.field_appId.equals(hvg[i2]))
            paramk.field_status = -1;
        }
        else
        {
          if (localo.b(paramk))
            break label588;
          z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5F/9+GqwVmOR4=", "onGYNetEnd : insert fail");
          return;
          j = 0;
          break;
          label576: i1 = 4;
          break label487;
        }
        i2++;
      }
      label588: bf.ayZ().ab(paramk.field_appId, 1);
      bf.ayZ().ab(paramk.field_appId, 2);
      bf.ayZ().ab(paramk.field_appId, 3);
      bf.ayZ().ab(paramk.field_appId, 4);
      bf.ayZ().ab(paramk.field_appId, 5);
      return;
      label644: int k;
      int n;
      label668: int m;
      if (j != 0)
      {
        k = 3;
        paramk.field_status = k;
        if (paramk.field_appId != null)
        {
          n = 0;
          if (n < hvg.length)
          {
            if (!paramk.field_appId.equals(hvg[n]))
              break label848;
            paramk.field_status = -1;
          }
        }
        if ((paramk != null) && (paramk.field_appIconUrl != null) && (paramk.field_appIconUrl.length() != 0))
          break label854;
        m = 1;
      }
      while (true)
      {
        if (m != 0)
        {
          paramk.field_appIconUrl = paramcd.hRS;
          bf.ayZ().ab(paramk.field_appId, 1);
          bf.ayZ().ab(paramk.field_appId, 2);
          bf.ayZ().ab(paramk.field_appId, 3);
          bf.ayZ().ab(paramk.field_appId, 4);
          bf.ayZ().ab(paramk.field_appId, 5);
        }
        boolean bool = localo.a(paramk, new String[0]);
        z.i("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5F/9+GqwVmOR4=", "update appinfo " + bool + ", appid = " + paramcd.hOd);
        return;
        k = paramk.field_status;
        break;
        label848: n++;
        break label668;
        label854: if ((paramcd == null) || (paramcd.hRZ == null) || (paramcd.hRZ.length() == 0))
          m = 0;
        else if (!paramk.field_appIconUrl.equals(paramcd.hRS))
          m = 1;
        else
          m = 0;
      }
    }
  }

  public final byte[] Ue()
  {
    try
    {
      byte[] arrayOfByte = ((c)this.eJc.tk()).sW();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5F/9+GqwVmOR4=", "toProtBuf failed: " + localException.getMessage());
    }
    return null;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5F/9+GqwVmOR4=", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5F/9+GqwVmOR4=", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    while (true)
    {
      return;
      LinkedList localLinkedList = ((ju)this.eJc.sP()).iaH;
      if ((localLinkedList != null) && (!localLinkedList.isEmpty()))
      {
        Iterator localIterator = localLinkedList.iterator();
        while (localIterator.hasNext())
        {
          cd localcd = (cd)localIterator.next();
          if (localcd != null)
            a(l.F(localcd.hOd, false), localcd);
        }
      }
    }
  }

  public final void ac(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5F/9+GqwVmOR4=", "buf is null");
      return;
    }
    try
    {
      this.eJc.sQ().r(paramArrayOfByte);
      return;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5F/9+GqwVmOR4=", "parse error: " + localException.getMessage());
    }
  }

  public final int getType()
  {
    return 7;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.al
 * JD-Core Version:    0.6.2
 */