package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.ui.tools.q;
import com.tencent.mm.protocal.a.jv;
import com.tencent.mm.protocal.a.jw;
import com.tencent.mm.protocal.a.tw;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class ak extends x
  implements ab
{
  private static final String[] hvg = { "wxf109da3e26cf89f1", "wxc56bba830743541e", "wx41dd4f6ef137bd0b" };
  private final String appId;
  private final int dSC;
  private m dlH;
  private a dmI;

  public ak(String paramString)
  {
    this.appId = paramString;
    this.dSC = 3;
    b localb = new b();
    localb.a(new jv());
    localb.b(new jw());
    localb.fi("/cgi-bin/micromsg-bin/getappinfo");
    localb.de(231);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    if ((this.appId == null) || (this.appId.length() == 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "doScene fail, appId is null");
      return -1;
    }
    jv localjv = (jv)this.dmI.sO();
    localjv.hsT = this.appId;
    localjv.iaI = this.dSC;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 4) && (paramInt3 == -1011))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", appinfo does not exist");
      bf.GO();
      k localk3 = o.ayJ();
      localk3.field_appId = this.appId;
      bf.GO().a(localk3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    jw localjw = (jw)((a)paramaj).sP();
    String str1 = localjw.iaJ.hOw;
    tw localtw1 = localjw.iaJ;
    k localk1;
    if (localtw1 == null)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "convertToAppInfo : openAppInfo is null");
      localk1 = null;
    }
    while (localk1 == null)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "onGYNetEnd : info is null");
      this.dlH.a(3, -1, paramString, this);
      return;
      localk1 = new k();
      localk1.field_appId = localtw1.hsT;
      localk1.field_appName = localtw1.hOt;
      localk1.field_appDiscription = localtw1.ioL;
      localk1.field_appIconUrl = localtw1.hOu;
      localk1.field_appStoreUrl = localtw1.ioM;
      localk1.field_appVersion = localtw1.hRX;
      localk1.field_appWatermarkUrl = localtw1.ioN;
      localk1.field_packageName = localtw1.hOw;
      localk1.field_signature = u.ve(localtw1.hRV);
      localk1.field_appName_en = localtw1.ioO;
      localk1.field_appName_tw = localtw1.ioQ;
      localk1.field_appDiscription_en = localtw1.ioP;
      localk1.field_appDiscription_tw = localtw1.ioR;
      localk1.field_appInfoFlag = localtw1.hRW;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localk1.field_appId;
      arrayOfObject[1] = Integer.valueOf(localk1.field_appInfoFlag);
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "appid = %s, appInfoFlag = %s", arrayOfObject);
    }
    localk1.field_appType = localjw.hPE;
    tw localtw2 = localjw.iaJ;
    String str2 = localtw2.hOw;
    String str3 = localtw2.hRV;
    if ((str2 == null) || (str2.length() == 0) || (str3 == null) || (str3.length() == 0));
    for (int i = 1; ; i = 0)
    {
      if ((i != 0) || (localk1.avN()))
      {
        z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "no android app, packageName = " + str1);
        q.wd(this.appId);
      }
      if (localk1.field_appId != null)
        break;
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "onGYNetEnd : info.appId is null");
      this.dlH.a(3, -1, paramString, this);
      return;
    }
    if (!localk1.field_appId.equals(this.appId))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "onGYNetEnd : appId is different");
      this.dlH.a(3, -1, paramString, this);
      return;
    }
    o localo = bf.GO();
    k localk2 = localo.uY(this.appId);
    if ((localk2 == null) || (localk2.field_appId == null) || (localk2.field_appId.length() == 0))
    {
      int j;
      if (i != 0)
      {
        j = 3;
        localk1.field_status = j;
        localk1.field_modifyTime = System.currentTimeMillis();
        if (localk1.field_appId == null);
      }
      for (int k = 0; ; k++)
        if (k < hvg.length)
        {
          if (localk1.field_appId.equals(hvg[k]))
            localk1.field_status = -1;
        }
        else
        {
          if (localo.b(localk1))
            break label766;
          z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "onGYNetEnd : insert fail");
          this.dlH.a(3, -1, paramString, this);
          return;
          j = 4;
          break;
        }
      label766: bf.ayZ().ab(this.appId, 1);
      bf.ayZ().ab(this.appId, 2);
      bf.ayZ().ab(this.appId, 3);
      bf.ayZ().ab(this.appId, 4);
      bf.ayZ().ab(this.appId, 5);
    }
    label910: label1474: 
    while (true)
    {
      if (ch.jb(localk1.field_openId))
      {
        z.d("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "onGYNetEnd, openId is null, trigger getAppSetting, appId = " + localk1.field_appId);
        bf.azc().vd(localk1.field_appId);
      }
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
      int m;
      int i1;
      if (i != 0)
      {
        m = 3;
        localk1.field_status = m;
        if (localk1.field_appId != null)
        {
          i1 = 0;
          if (i1 < hvg.length)
          {
            if (!localk1.field_appId.equals(hvg[i1]))
              break label1002;
            localk1.field_status = -1;
          }
        }
        if (localk2 != null)
          break label1008;
        z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "merge failed, some appinfo is null");
      }
      while (true)
      {
        if (localo.a(localk1, new String[0]))
          break label1233;
        z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "onGYNetEnd : update fail");
        this.dlH.a(3, -1, paramString, this);
        return;
        m = localk2.field_status;
        break;
        label1002: i1++;
        break label910;
        label1008: if (localk2.ayE())
        {
          if (!ch.jb(localk2.field_appIconUrl))
            localk1.field_appIconUrl = localk2.field_appIconUrl;
          if (!ch.jb(localk2.field_appName))
            localk1.field_appName = localk2.field_appName;
          if (!ch.jb(localk2.field_appName_en))
            localk1.field_appName_en = localk2.field_appName_en;
          if (!ch.jb(localk2.field_appName_tw))
            localk1.field_appName_tw = localk2.field_appName_tw;
        }
        if ((ch.jb(localk1.field_appId)) || (ch.jb(localk2.field_appId)))
        {
          z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "merge failed, some appid is null");
        }
        else if (!localk1.field_appId.equalsIgnoreCase(localk2.field_appId))
        {
          z.e("!44@/B4Tb64lLpK+IBX8XDgnvsh3Y8SF4w5FcPc8RULIHPI=", "merge failed, appis is different");
        }
        else
        {
          localk1.field_openId = localk2.field_openId;
          localk1.field_authFlag = localk2.field_authFlag;
          localk1.ax(localk2.iw());
          localk1.ay(localk2.ix());
          localk1.az(localk2.iy());
          localk1.aA(localk2.iz());
          localk1.aB(localk2.iA());
        }
      }
      label1233: int n;
      if ((localk2 == null) || (localk2.field_appIconUrl == null) || (localk2.field_appIconUrl.length() == 0))
        n = 1;
      while (true)
      {
        if (n == 0)
          break label1474;
        bf.ayZ().ab(this.appId, 1);
        bf.ayZ().ab(this.appId, 2);
        bf.ayZ().ab(this.appId, 3);
        bf.ayZ().ab(this.appId, 4);
        bf.ayZ().ab(this.appId, 5);
        break;
        if (!ch.jb(localk1.iT()))
        {
          if (ch.jb(localk2.iT()))
            n = 1;
          else if (!localk2.iT().equals(localk2.iT()))
            n = 1;
        }
        else if (!ch.jb(localk1.iU()))
        {
          if (ch.jb(localk2.iU()))
            n = 1;
          else if (!localk2.iU().equals(localk2.iU()))
            n = 1;
        }
        else if ((localk1.field_appIconUrl == null) || (localk1.field_appIconUrl.length() == 0))
          n = 0;
        else if (!localk2.field_appIconUrl.equals(localk1.field_appIconUrl))
          n = 1;
        else
          n = 0;
      }
    }
  }

  public final String getAppId()
  {
    return this.appId;
  }

  public final int getType()
  {
    return 231;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ak
 * JD-Core Version:    0.6.2
 */