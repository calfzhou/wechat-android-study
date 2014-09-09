package com.tencent.mm.modelcdntran;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.r;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.protocal.a.cx;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;
import java.util.LinkedList;

public class CdnTransportEngine
{
  public static int drA = 5;
  public static int drB = 10001;
  public static int drC = 10002;
  public static int drD = 100;
  public static int drE = 101;
  public static int drF = 102;
  public static int drG = 103;
  public static int drH = 32768;
  public static int drI = 7340033;
  public static int drt = 1;
  public static int dru = 2;
  public static int drv = 3;
  public static int drw = 1;
  public static int drx = 2;
  public static int dry = 3;
  public static int drz = 4;
  private int dSa = 0;
  private int dSb = 0;
  private String dSc = "";
  private ay dSd = new ay(bg.qQ().getLooper(), new p(this), true);
  private cx drJ = null;
  private cx drK = null;
  private cx drL = null;
  private a drM = null;
  public int[] field_IntInfoList = new int[6];
  public int[] field_app_IntInfoList = new int[6];
  public byte[] field_app_authkey = null;
  public byte[] field_app_frontip1 = null;
  public byte[] field_app_frontip2 = null;
  public byte[] field_app_zoneip1 = null;
  public byte[] field_app_zoneip2 = null;
  public byte[] field_authkey = null;
  public byte[] field_frontip1 = null;
  public byte[] field_frontip2 = null;
  public int[] field_sns_IntInfoList = new int[6];
  public byte[] field_sns_authkey = null;
  public byte[] field_sns_frontip1 = null;
  public byte[] field_sns_frontip2 = null;
  public byte[] field_sns_zoneip1 = null;
  public byte[] field_sns_zoneip2 = null;
  public byte[] field_zoneip1 = null;
  public byte[] field_zoneip2 = null;

  public CdnTransportEngine(String paramString, a parama)
  {
    init(paramString);
    this.drM = parama;
    b localb = new b(this);
    try
    {
      if ((ao.dWh != null) && (ao.dWh.length() > 0))
        localb.field_WifiEtl = Integer.parseInt(ao.dWh);
      if ((ao.dWi != null) && (ao.dWi.length() > 0))
        localb.field_noWifiEtl = Integer.parseInt(ao.dWi);
      if ((ao.dWj != null) && (ao.dWj.length() > 0))
        localb.field_Ptl = Integer.parseInt(ao.dWj);
      localb.field_onlysendETL = ao.dWl;
      localb.field_onlyrecvPtl = ao.dWm;
      if (ao.dWk);
      for (int i = 0; ; i = 1)
      {
        localb.field_UseLogic = i;
        z.i("!44@/B4Tb64lLpIOAjTgD1JTqYyjqbRxHUgGUCewsAH7DnA=", "java. wxconfig:%s", new Object[] { localb });
        setWXConfig(localb);
        return;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
        z.e("!44@/B4Tb64lLpIOAjTgD1JTqYyjqbRxHUgGUCewsAH7DnA=", "init wxconfig exception:" + localNumberFormatException.getMessage());
    }
  }

  private static void a(keep_SceneResult paramkeep_SceneResult)
  {
    if ((paramkeep_SceneResult != null) && (!ch.jb(paramkeep_SceneResult.field_transInfo)))
    {
      int i = paramkeep_SceneResult.field_transInfo.indexOf("@,");
      if (i > 0)
      {
        paramkeep_SceneResult.report_Part2 = paramkeep_SceneResult.field_transInfo.substring(i + 2);
        paramkeep_SceneResult.field_transInfo = paramkeep_SceneResult.field_transInfo.substring(0, i);
      }
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramkeep_SceneResult.field_transInfo;
      arrayOfObject[1] = paramkeep_SceneResult.report_Part2;
      z.v("!44@/B4Tb64lLpIOAjTgD1JTqYyjqbRxHUgGUCewsAH7DnA=", "transinfo:%s, report_part2:%s", arrayOfObject);
    }
  }

  private boolean a(cx paramcx)
  {
    try
    {
      if (paramcx.hSY > 0)
        this.field_sns_frontip1 = ai.a((vt)paramcx.hSZ.get(0)).getBytes();
      if (paramcx.hSY >= 2)
        this.field_sns_frontip2 = ai.a((vt)paramcx.hSZ.get(1)).getBytes();
      if (paramcx.hTd > 0)
        this.field_sns_zoneip1 = ai.a((vt)paramcx.hTe.get(0)).getBytes();
      if (paramcx.hTd >= 2)
        this.field_sns_zoneip2 = ai.a((vt)paramcx.hTe.get(1)).getBytes();
      this.field_sns_authkey = ai.a(paramcx.hTb);
      this.field_sns_IntInfoList[0] = paramcx.hSV;
      this.field_sns_IntInfoList[1] = paramcx.hQv;
      this.field_sns_IntInfoList[2] = paramcx.hSX;
      this.field_sns_IntInfoList[3] = paramcx.hTc;
      this.field_sns_IntInfoList[4] = i.y(ak.getContext());
      this.field_sns_IntInfoList[5] = paramcx.hTb.aLK();
      this.drK = paramcx;
      return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  private boolean b(cx paramcx)
  {
    try
    {
      if (paramcx.hSY > 0)
        this.field_app_frontip1 = ai.a((vt)paramcx.hSZ.get(0)).getBytes();
      if (paramcx.hSY >= 2)
        this.field_app_frontip2 = ai.a((vt)paramcx.hSZ.get(1)).getBytes();
      if (paramcx.hTd > 0)
        this.field_app_zoneip1 = ai.a((vt)paramcx.hTe.get(0)).getBytes();
      if (paramcx.hTd >= 2)
        this.field_app_zoneip2 = ai.a((vt)paramcx.hTe.get(1)).getBytes();
      this.field_app_authkey = ai.a(paramcx.hTb);
      this.field_app_IntInfoList[0] = paramcx.hSV;
      this.field_app_IntInfoList[1] = paramcx.hQv;
      this.field_app_IntInfoList[2] = paramcx.hSX;
      this.field_app_IntInfoList[3] = paramcx.hTc;
      this.field_app_IntInfoList[4] = i.y(ak.getContext());
      this.field_app_IntInfoList[5] = paramcx.hTb.aLK();
      this.drL = paramcx;
      return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  private native int init(String paramString);

  private native boolean isAvaible();

  public static int keep_callFromJni(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    if (paramInt1 == drD)
      i.a(paramArrayOfByte, "MicroMsg.CdnEngine", paramInt2);
    while (true)
      return 0;
  }

  private native int preMakeCDNConnection();

  private native int setCDNDnsInfo();

  private native void setWXConfig(b paramb);

  private native int uninit();

  public final void a(b paramb)
  {
    z.i("!44@/B4Tb64lLpIOAjTgD1JTqYyjqbRxHUgGUCewsAH7DnA=", "set WXConfig:" + paramb);
    setWXConfig(paramb);
  }

  public final boolean a(cx paramcx1, cx paramcx2, cx paramcx3)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = this.drJ;
    arrayOfObject1[1] = paramcx1;
    z.d("!44@/B4Tb64lLpIOAjTgD1JTqYyjqbRxHUgGUCewsAH7DnA=", "cdntra setCDNDnsInfo old [%s]  new [%s]", arrayOfObject1);
    if (paramcx1 == null)
      return false;
    a(paramcx2);
    b(paramcx3);
    new cx();
    if ((ao.dWf != null) && (ao.dWf.length() >= 7))
    {
      paramcx1.hSZ.clear();
      paramcx1.hSZ.add(new vt().wF(ao.dWf));
      paramcx1.hSZ.add(new vt().wF(ao.dWf));
      paramcx1.hSY = 2;
    }
    if ((ao.dWg != null) && (ao.dWg.length() >= 7))
    {
      paramcx1.hTe.clear();
      paramcx1.hTe.add(new vt().wF(ao.dWg));
      paramcx1.hTe.add(new vt().wF(ao.dWg));
      paramcx1.hTd = 2;
    }
    try
    {
      if (paramcx1.hSY > 0)
      {
        this.field_frontip1 = ai.a((vt)paramcx1.hSZ.get(0)).getBytes();
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = paramcx1.hSZ.get(0);
        z.d("!44@/B4Tb64lLpIOAjTgD1JTqYyjqbRxHUgGUCewsAH7DnA=", "front ip1:%s", arrayOfObject5);
      }
      if (paramcx1.hSY >= 2)
      {
        this.field_frontip2 = ai.a((vt)paramcx1.hSZ.get(1)).getBytes();
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = paramcx1.hSZ.get(1);
        z.d("!44@/B4Tb64lLpIOAjTgD1JTqYyjqbRxHUgGUCewsAH7DnA=", "front ip2:%s", arrayOfObject4);
      }
      if (paramcx1.hTd > 0)
      {
        this.field_zoneip1 = ai.a((vt)paramcx1.hTe.get(0)).getBytes();
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = paramcx1.hTe.get(0);
        z.d("!44@/B4Tb64lLpIOAjTgD1JTqYyjqbRxHUgGUCewsAH7DnA=", "zone ip1:%s", arrayOfObject3);
      }
      if (paramcx1.hTd >= 2)
      {
        this.field_zoneip2 = ai.a((vt)paramcx1.hTe.get(1)).getBytes();
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = paramcx1.hTe.get(1);
        z.d("!44@/B4Tb64lLpIOAjTgD1JTqYyjqbRxHUgGUCewsAH7DnA=", "zone ip2:%s", arrayOfObject2);
      }
      this.field_authkey = ai.a(paramcx1.hTb);
      this.field_IntInfoList[0] = paramcx1.hSV;
      this.field_IntInfoList[1] = paramcx1.hQv;
      this.field_IntInfoList[2] = paramcx1.hSX;
      this.field_IntInfoList[3] = paramcx1.hTc;
      this.field_IntInfoList[4] = i.y(ak.getContext());
      this.field_IntInfoList[5] = paramcx1.hTb.aLK();
      this.drJ = paramcx1;
      setCDNDnsInfo();
      return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public native int cancelDownloadMedia(String paramString);

  public native int cancelUploadMedia(String paramString);

  public byte[] keep_cdnDecodePrepareResponse(String paramString, byte[] paramArrayOfByte)
  {
    if (this.drM != null)
      return this.drM.d(paramString, paramArrayOfByte);
    return null;
  }

  public void keep_cdnGetSkeyBuf(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    if (this.drM != null)
      this.drM.a(paramString, paramByteArrayOutputStream);
  }

  public boolean keep_cdnMakeSureAuth()
  {
    com.tencent.mm.network.n localn = bg.qX().rk().tE();
    localn.l("", localn.oD());
    return bg.qX().d(new j((byte)0));
  }

  public void keep_cdnSendAndRecvData(String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt2 < 0));
    do
    {
      return;
      this.dSa = (paramInt1 + this.dSa);
      this.dSb = (paramInt2 + this.dSb);
      if (!ch.jb(paramString))
        this.dSc = paramString;
    }
    while (this.dSa + this.dSb <= 51200);
    this.dSd.cP(500L);
  }

  public int keep_onDownloadError(String paramString, keep_SceneResult paramkeep_SceneResult)
  {
    if (this.drM != null)
    {
      a(paramkeep_SceneResult);
      this.drM.a(paramString, null, paramkeep_SceneResult);
    }
    return 0;
  }

  public int keep_onDownloadProgress(String paramString, keep_ProgressInfo paramkeep_ProgressInfo)
  {
    if (this.drM != null)
      this.drM.a(paramString, paramkeep_ProgressInfo, null);
    return 0;
  }

  public int keep_onDownloadSuccessed(String paramString, keep_SceneResult paramkeep_SceneResult)
  {
    if (this.drM != null)
    {
      a(paramkeep_SceneResult);
      this.drM.a(paramString, null, paramkeep_SceneResult);
    }
    return 0;
  }

  public int keep_onUploadError(String paramString, keep_SceneResult paramkeep_SceneResult)
  {
    if (this.drM != null)
    {
      a(paramkeep_SceneResult);
      this.drM.a(paramString, null, paramkeep_SceneResult);
    }
    return 0;
  }

  public int keep_onUploadProgress(String paramString, keep_ProgressInfo paramkeep_ProgressInfo)
  {
    if (this.drM != null)
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = paramString;
      arrayOfObject[1] = Integer.valueOf(paramkeep_ProgressInfo.field_toltalLength);
      arrayOfObject[2] = Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength);
      z.v("!44@/B4Tb64lLpIOAjTgD1JTqYyjqbRxHUgGUCewsAH7DnA=", "klem keep_onUploadProgress mediaId:%s, totalLen%d, offset%d", arrayOfObject);
      this.drM.a(paramString, paramkeep_ProgressInfo, null);
    }
    return 0;
  }

  public int keep_onUploadSuccessed(String paramString, keep_SceneResult paramkeep_SceneResult)
  {
    if (this.drM != null)
    {
      z.v("!44@/B4Tb64lLpIOAjTgD1JTqYyjqbRxHUgGUCewsAH7DnA=", "klem keep_onUploadSuccessed mediaId:%s", new Object[] { paramString });
      a(paramkeep_SceneResult);
      this.drM.a(paramString, null, paramkeep_SceneResult);
    }
    return 0;
  }

  public final void release()
  {
    uninit();
    this.drM = null;
  }

  public native int startupDownloadMedia(n paramn);

  public native int startupUploadMedia(n paramn);

  public final boolean vd()
  {
    return this.drJ == null;
  }

  public final int ve()
  {
    return preMakeCDNConnection();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcdntran.CdnTransportEngine
 * JD-Core Version:    0.6.2
 */