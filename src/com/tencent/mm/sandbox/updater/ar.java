package com.tencent.mm.sandbox.updater;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.b.h;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sandbox.c;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Iterator;

public final class ar
  implements al
{
  public int cFr;
  public String cFv;
  public String cHL;
  public String dSO;
  public String desc;
  private Notification djb = null;
  public byte[] dpA;
  private boolean eAk = false;
  public int eZP;
  public String[] iBP;
  public int iBm;
  public com.tencent.mm.b.g iCA;
  public h iCB;
  public boolean iCC = false;
  public boolean iCD = false;
  public boolean iCE = false;
  private long iCF;
  private ah iCG = new ah(this);
  private c iCH = new at(this);
  private com.tencent.mm.sandbox.monitor.g iCw = null;
  private ArrayList iCx = new ArrayList(1);
  public String[] iCy;
  public int iCz = a.hrn;
  private Intent intent = null;
  protected Context mContext = null;
  public int size;
  public int uin;

  private void aMS()
  {
    ak.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", ch.CL() - 86400L).commit();
    s(2, true);
    aMC();
  }

  private void aMT()
  {
    if ((this.eZP == 2) && (!bc.bP(this.mContext)))
    {
      an.aMN();
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "we stop download, when silence and not wifi!");
    }
    do
    {
      do
      {
        return;
        if ((this.eZP == 2) && (ah.AD(this.cHL)))
        {
          z.e("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "the traffice is overload, not download anymore in silence mode!");
          this.iCG.stop();
          return;
        }
        this.iCG.af(this.cHL, this.size);
      }
      while (this.iCw == null);
      s(1, false);
      this.eAk = true;
      this.iCw.a(this.iCH);
      aMD();
    }
    while (this.eZP != 2);
    an.aMN();
  }

  private void aMU()
  {
    boolean bool1 = true;
    cancel();
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "downloadFullPack");
    an.t(this.mContext, 7);
    if ((this.iBP != null) && (this.iBP.length > 0))
    {
      int m = this.size;
      String str3 = this.cHL;
      int n = this.iBm;
      String[] arrayOfString2 = this.iBP;
      if (this.eZP == 2);
      for (boolean bool2 = bool1; ; bool2 = false)
      {
        this.iCw = new aa(m, str3, n, arrayOfString2, bool2);
        aMT();
        return;
      }
    }
    int i = this.size;
    String str1 = this.cHL;
    int j = this.iBm;
    int k = this.uin;
    String str2 = this.dSO;
    byte[] arrayOfByte = this.dpA;
    String[] arrayOfString1 = this.iCy;
    if (this.eZP == 2);
    while (true)
    {
      this.iCw = new x(i, str1, j, k, str2, arrayOfByte, arrayOfString1, bool1);
      break;
      bool1 = false;
    }
  }

  private void ek(boolean paramBoolean)
  {
    int i = 1;
    Object[] arrayOfObject1 = new Object[i];
    arrayOfObject1[0] = Boolean.valueOf(paramBoolean);
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "download() isWifiRetry %s", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(this.eZP);
    arrayOfObject2[i] = Boolean.valueOf(this.eAk);
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "download() downloadMode %s downloading %s", arrayOfObject2);
    if (this.intent == null)
      z.e("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "download() haven't handleCommand");
    do
    {
      return;
      if (this.eAk)
      {
        z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "download() downloading, duplicate download request");
        return;
      }
      if (!m.getExternalStorageState().equals("mounted"))
      {
        z.e("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "no sdcard.");
        ak.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", ch.CL() - 86400L).commit();
        s(2, i);
        aMB();
        return;
      }
      if ((this.eZP == 2) && (!paramBoolean))
        an.u(this.mContext, 0);
      String str1 = com.tencent.mm.sandbox.monitor.g.AB(this.cHL);
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", str1);
      if (str1 == null)
        break;
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "update package already exist.");
      s(i, i);
      AC(str1);
    }
    while ((this.eZP != 2) || (an.AE(this.cHL)));
    an.f(this.cHL, this.desc, this.size, this.eZP);
    return;
    if (this.iCE)
    {
      if (this.iCw != null)
        this.iCw.aMv();
      an.t(this.mContext, 11);
    }
    if ((!this.iCE) && (this.iCC) && (this.iCA != null) && (this.iCB != null))
    {
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "Incresment Update");
      an.t(this.mContext, 5);
      if (!j.u(this.size + this.iCB.getSize()))
      {
        aMS();
        return;
      }
      cancel();
      int k = this.iCB.getSize();
      String str2 = this.cHL;
      int m = this.iBm;
      String str3 = this.iCA.hH() + this.iCB.getUrl();
      String str4 = this.iCB.hJ();
      String str5 = this.iCB.hI();
      if (this.eZP == 2);
      while (true)
      {
        this.iCw = new aa(k, str2, m, str3, str4, str5, i);
        aMT();
        return;
        int j = 0;
      }
    }
    if (!j.u(this.size))
    {
      z.e("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "SDCard is full");
      aMS();
      return;
    }
    aMU();
  }

  public final void AC(String paramString)
  {
    Iterator localIterator = this.iCx.iterator();
    while (localIterator.hasNext())
      ((al)localIterator.next()).AC(paramString);
  }

  public final void Oj()
  {
    ek(false);
  }

  public final boolean QQ()
  {
    return this.eAk;
  }

  public final void a(com.tencent.mm.sandbox.monitor.g paramg)
  {
    Iterator localIterator = this.iCx.iterator();
    while (localIterator.hasNext())
      ((al)localIterator.next()).a(paramg);
  }

  public final void a(al paramal)
  {
    if ((paramal != null) && (!this.iCx.contains(paramal)))
      this.iCx.add(paramal);
  }

  public final void aMB()
  {
    Iterator localIterator = this.iCx.iterator();
    while (localIterator.hasNext())
      ((al)localIterator.next()).aMB();
  }

  public final void aMC()
  {
    Iterator localIterator = this.iCx.iterator();
    while (localIterator.hasNext())
      ((al)localIterator.next()).aMC();
  }

  public final void aMD()
  {
    Iterator localIterator = this.iCx.iterator();
    while (localIterator.hasNext())
      ((al)localIterator.next()).aMD();
  }

  public final long aMR()
  {
    return this.iCF;
  }

  public final void b(al paramal)
  {
    this.iCx.remove(paramal);
  }

  public final void cancel()
  {
    if (this.iCw != null)
    {
      this.eAk = false;
      this.iCw.cancel();
      this.iCw = null;
      this.iCF = System.currentTimeMillis();
      this.iCG.stop();
    }
  }

  public final void ee(boolean paramBoolean)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Boolean.valueOf(paramBoolean);
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "setNetStatChanged isWifi %s", arrayOfObject1);
    this.iCG.ee(paramBoolean);
    if ((this.eZP != 2) || (this.eAk))
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(this.eZP);
      arrayOfObject2[1] = Boolean.valueOf(this.eAk);
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "downloadMode %s downloading %s", arrayOfObject2);
    }
    do
    {
      do
      {
        return;
        if (!paramBoolean)
          break;
      }
      while (!r(this.intent));
      ek(true);
      return;
    }
    while (!this.eAk);
    cancel();
  }

  public final boolean r(Intent paramIntent)
  {
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "handleCommand(Intent intent)");
    if (paramIntent == null)
    {
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "intent == null");
      return false;
    }
    if (this.eAk)
    {
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "downloading, duplicate download request");
      return false;
    }
    an.aMP();
    reset();
    this.intent = paramIntent;
    this.cFr = paramIntent.getIntExtra("intent_extra_updateMode", 0);
    this.cFv = paramIntent.getStringExtra("intent_extra_marketUrl");
    this.iCy = paramIntent.getStringArrayExtra("intent_short_ips");
    this.iCz = paramIntent.getIntExtra("intent_client_version", a.hrn);
    a.hrn = this.iCz;
    this.iBm = paramIntent.getIntExtra("intent_update_type", 3);
    this.dSO = paramIntent.getStringExtra("intent_extra_session");
    this.dpA = paramIntent.getByteArrayExtra("intent_extra_cookie");
    this.uin = paramIntent.getIntExtra("intent_extra_uin", 0);
    this.cHL = paramIntent.getStringExtra("intent_extra_md5");
    this.desc = paramIntent.getStringExtra("intent_extra_desc");
    this.size = paramIntent.getIntExtra("intent_extra_size", 0);
    this.iBP = paramIntent.getStringArrayExtra("intent_extra_download_url");
    this.eZP = paramIntent.getIntExtra("intent_extra_download_mode", 1);
    this.iCE = paramIntent.getBooleanExtra("intent_extra_force_download_full", false);
    String str1 = paramIntent.getStringExtra("intent_extra_patchInfo");
    if (str1 != null)
    {
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "patchXml != null");
      this.iCA = com.tencent.mm.b.g.an(str1);
    }
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(this.eZP);
    arrayOfObject1[1] = Boolean.valueOf(this.eAk);
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "handleCommand() downloadMode %s downloading %s", arrayOfObject1);
    if ((this.iBm == 999) && (this.iBP != null) && (this.iBP.length > 0))
    {
      if (this.eZP == 2)
        z.e("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "error! DOWNLOAD_MODE_SLIENCE download don't go here! we must process it before start download");
      return true;
    }
    if (this.iBP != null)
      for (String str5 : this.iBP)
        z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "download url : " + str5);
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = this.cHL;
    arrayOfObject2[1] = Integer.valueOf(this.size);
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "md5 = %s , size = %s", arrayOfObject2);
    if ((this.cHL == null) || (this.size == 0))
      return false;
    String str4;
    if (this.iCA != null)
    {
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "patchInfo != null");
      String str3 = an.bs(this.mContext);
      this.iCB = this.iCA.am(str3);
      StringBuilder localStringBuilder = new StringBuilder("increase apkMD5 = ").append(str3).append(" : ");
      if (this.iCB == null)
      {
        str4 = "not match";
        z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", str4);
      }
    }
    else
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Boolean.valueOf(this.iCE);
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "forceDownloadFull : %s", arrayOfObject3);
      if ((this.iCB == null) || (com.tencent.mm.sandbox.monitor.g.AA(this.cHL)))
        break label635;
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "isIncresmentUpdate");
      this.iCC = true;
    }
    while (true)
    {
      String str2 = an.aMF();
      if ((!ch.jb(str2)) && (!str2.equals(this.cHL)))
        an.aMQ();
      return true;
      str4 = "match";
      break;
      label635: z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "had try to download full pack.");
    }
  }

  public final void reset()
  {
    cancel();
    this.cFr = 0;
    this.cFv = null;
    this.iCy = null;
    this.iCz = a.hrn;
    this.iBm = 0;
    this.dSO = null;
    this.dpA = null;
    this.uin = 0;
    this.cHL = null;
    this.size = 0;
    this.desc = null;
    this.iBP = null;
    this.iCA = null;
    this.iCB = null;
    this.iCC = false;
    this.iCD = false;
    this.eZP = 0;
    this.iCE = false;
    this.intent = null;
    this.eAk = false;
    this.djb = null;
  }

  public final void s(int paramInt, boolean paramBoolean)
  {
    this.iCD = paramBoolean;
    new cm().postDelayed(new as(this, paramInt), 300L);
  }

  public final void w(int paramInt1, int paramInt2)
  {
    Iterator localIterator = this.iCx.iterator();
    while (localIterator.hasNext())
      ((al)localIterator.next()).w(paramInt1, paramInt2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.ar
 * JD-Core Version:    0.6.2
 */