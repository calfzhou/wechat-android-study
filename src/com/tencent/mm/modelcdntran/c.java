package com.tencent.mm.modelcdntran;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.ag;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class c
  implements a, m, as
{
  private Map dSe = new HashMap();
  private ag drO = new d(this);
  private Queue drP = new LinkedList();
  private Map drQ = new HashMap();
  private Map drR = new HashMap();
  private String drS = "";
  private long drT = 0L;

  public c()
  {
    bg.a(this.drO);
    if (bg.oE())
      bg.qW().oQ().a(this);
    bg.qX().a(379, this);
  }

  public static boolean vf()
  {
    int i = ch.a((Integer)bg.qW().oQ().get(144385), 0);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(i);
    arrayOfObject[1] = Integer.valueOf(i & 0x1);
    arrayOfObject[2] = Boolean.valueOf(ao.dVS);
    z.d("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "cdntra cdnBitSet:%d res:%d Test.forceCDNTrans:%b", arrayOfObject);
    if (ao.dVS)
      return true;
    return (i & 0x1) > 0;
  }

  public final int a(String paramString, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    if (ch.jb(paramString))
    {
      z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "cdn callback mediaid is null");
      return -1;
    }
    if ((paramkeep_ProgressInfo == null) && (paramkeep_SceneResult == null))
    {
      z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "cdn callback info all null");
      return -2;
    }
    if (paramkeep_ProgressInfo != null)
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(paramkeep_ProgressInfo.field_toltalLength);
      arrayOfObject[1] = Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength);
      arrayOfObject[2] = Boolean.valueOf(paramkeep_ProgressInfo.field_mtlnotify);
      z.d("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "CDN progress. total:%d, cur:%d, canshow:%b", arrayOfObject);
    }
    long l = ch.CM();
    int i;
    if (this.dSe.get(paramString) != null)
      if (((Integer)this.dSe.get(paramString)).intValue() > 0)
        i = ((Integer)this.dSe.get(paramString)).intValue();
    while (true)
      if ((i != 0) && (l - this.drT < i) && (paramkeep_SceneResult == null) && (paramkeep_ProgressInfo != null) && (!paramkeep_ProgressInfo.field_mtlnotify) && (paramString.equals(this.drS)))
      {
        return -3;
        if (((Integer)this.dSe.get(paramString)).intValue() == -1)
          i = 200;
      }
      else
      {
        this.drT = l;
        this.drS = paramString;
        bg.qQ().n(new h(this, paramString, paramkeep_ProgressInfo, paramkeep_SceneResult));
        return 0;
        i = 0;
      }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx.getType() != 379);
    do
    {
      return;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(paramx.getType());
      arrayOfObject[1] = Integer.valueOf(paramInt1);
      arrayOfObject[2] = Integer.valueOf(paramInt2);
      z.d("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "cdntra onSceneEnd it will tryStart sceneType:%d [%d,%d]", arrayOfObject);
    }
    while ((!bg.oE()) || (k.vm().vd()));
    bg.qQ().n(new e(this));
  }

  public final void a(int paramInt, ap paramap, Object paramObject)
  {
    if (!bg.oE());
    int i;
    do
    {
      return;
      i = ch.h(paramObject, 0);
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Integer.valueOf(paramInt);
      arrayOfObject1[1] = Integer.valueOf(i);
      arrayOfObject1[2] = paramap;
      z.d("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "onNotifyChange event:%d obj:%d stg:%s", arrayOfObject1);
      if ((paramap != bg.qW().oQ()) || (i <= 0))
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(i);
        arrayOfObject2[1] = paramap;
        z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "onNotifyChange error obj:%d stg:%s", arrayOfObject2);
        return;
      }
    }
    while (i != 144385);
    bg.qX().d(new j());
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    if (ch.jb(paramString))
    {
      z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "cdn callback getauthbuf mediaid is null");
      return;
    }
    n localn = (n)this.drR.get(paramString);
    if (localn == null)
    {
      z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", " getauthbuf task in jni get info failed mediaid:%s", new Object[] { paramString });
      return;
    }
    if (localn.dsw != null)
    {
      localn.dsw.a(paramString, paramByteArrayOutputStream);
      return;
    }
    z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "getCdnAuthInfo fail, null taskcallback.");
  }

  public final boolean a(n paramn)
  {
    return a(paramn, -1);
  }

  public final boolean a(n paramn, int paramInt)
  {
    if (paramn == null)
    {
      z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "addRecvTask task info is null");
      return false;
    }
    if (ch.jb(paramn.field_mediaId))
    {
      z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "addRecvTask mediaId is null");
      return false;
    }
    if (paramn.field_fileId == null)
      paramn.field_fileId = "";
    if (paramn.field_aesKey == null)
      paramn.field_aesKey = "";
    paramn.dsv = false;
    bg.qQ().n(new f(this, paramInt, paramn));
    return true;
  }

  public final boolean b(n paramn)
  {
    if (ch.jb(paramn.field_mediaId))
    {
      z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "addSendTask mediaId is null");
      return false;
    }
    if (paramn.field_fileId == null)
      paramn.field_fileId = "";
    if (paramn.field_aesKey == null)
      paramn.field_aesKey = "";
    paramn.dsv = true;
    bg.qQ().n(new g(this, paramn));
    return true;
  }

  public final byte[] d(String paramString, byte[] paramArrayOfByte)
  {
    if (ch.jb(paramString))
    {
      z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "cdn callback decodePrepareResponse mediaid is null");
      return null;
    }
    n localn = (n)this.drR.get(paramString);
    if (localn == null)
    {
      z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", " decodePrepareResponse task in jni get info failed mediaid:%s", new Object[] { paramString });
      return null;
    }
    if (localn.dsw != null)
      return localn.dsw.d(paramString, paramArrayOfByte);
    z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "decodePrepareResponse fail, null taskcallback.");
    return null;
  }

  public final boolean fO(String paramString)
  {
    n localn = (n)this.drR.remove(paramString);
    int i;
    if (localn != null)
    {
      i = k.vm().cancelUploadMedia(paramString);
      com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(i.dsk);
      arrayOfObject2[1] = Integer.valueOf(localn.field_fileType);
      arrayOfObject2[2] = Long.valueOf(ch.CM() - localn.field_startTime);
      localn1.d(10769, arrayOfObject2);
    }
    while (true)
    {
      this.drQ.remove(paramString);
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = paramString;
      arrayOfObject1[1] = localn;
      arrayOfObject1[2] = Integer.valueOf(i);
      z.d("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "cdntra cancelSendTask mediaid:%s mapremove:%s engine ret:%d", arrayOfObject1);
      return true;
      i = 0;
    }
  }

  public final boolean fP(String paramString)
  {
    n localn = (n)this.drR.remove(paramString);
    int i;
    if (localn != null)
    {
      i = k.vm().cancelDownloadMedia(paramString);
      com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(i.dsj);
      arrayOfObject2[1] = Integer.valueOf(localn.field_fileType);
      arrayOfObject2[2] = Long.valueOf(ch.CM() - localn.field_startTime);
      localn1.d(10769, arrayOfObject2);
    }
    while (true)
    {
      this.drQ.remove(paramString);
      this.dSe.remove(paramString);
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = paramString;
      arrayOfObject1[1] = localn;
      arrayOfObject1[2] = Integer.valueOf(i);
      z.d("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", arrayOfObject1);
      return true;
      i = 0;
    }
  }

  public final void release()
  {
    if (bg.oE())
      bg.qW().oQ().b(this);
    bg.b(this.drO);
    bg.qX().b(379, this);
  }

  public final void vg()
  {
    if (!bg.oE());
    label641: label772: 
    while (true)
    {
      return;
      if (k.vm().vd())
      {
        z.w("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "cdntra Not init cdn dnsinfo , will retry after set info");
        bg.qX().d(new j());
        return;
      }
      String str1 = com.tencent.mm.f.e.or().getValue("EnableCDNUploadImg");
      String str2 = com.tencent.mm.f.e.or().getValue("ProgJPEGUploadSizeLimitWifi");
      String str3 = com.tencent.mm.f.e.or().getValue("ProgJPEGUploadSizeLimit3G");
      String str4 = com.tencent.mm.f.e.or().getValue("ProgJPEGDownloadSizeLimit");
      if ((ch.jb(str1)) || (ch.jb(str2)) || (ch.jb(str3)) || (ch.jb(str4)))
      {
        z.w("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "CDN.STREAM, configure invalid.");
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(this.drP.size());
        z.d("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "tryStart queue:%d", arrayOfObject1);
      }
      while (true)
      {
        if (this.drP.isEmpty())
          break label772;
        String str5 = (String)this.drP.poll();
        n localn = (n)this.drQ.remove(str5);
        if (localn == null)
        {
          z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "task queue is empty , maybe bug here");
          return;
          while (true)
          {
            try
            {
              b localb = new b(k.vm());
              if (Integer.valueOf(str1).intValue() != 1)
                break label434;
              n = 0;
              localb.field_UseLogic = n;
              localb.field_WifiEtl = Integer.valueOf(str2).intValue();
              localb.field_noWifiEtl = Integer.valueOf(str3).intValue();
              localb.field_Ptl = Integer.valueOf(str4).intValue();
              localb.field_onlysendETL = ao.dWl;
              localb.field_onlyrecvPtl = ao.dWm;
              if (!ao.dWk)
                break label440;
              i1 = 0;
              localb.field_UseLogic = i1;
              if (!ch.jb(ao.dWh))
                localb.field_WifiEtl = Integer.valueOf(ao.dWh).intValue();
              if (!ch.jb(ao.dWi))
                localb.field_noWifiEtl = Integer.valueOf(ao.dWi).intValue();
              if (!ch.jb(ao.dWj))
                localb.field_Ptl = Integer.valueOf(ao.dWj).intValue();
              z.i("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "CDN.STREAM.CONFIG:%s", new Object[] { localb });
              k.vm().a(localb);
            }
            catch (NumberFormatException localNumberFormatException)
            {
              Object[] arrayOfObject5 = new Object[1];
              arrayOfObject5[0] = localNumberFormatException.getMessage();
              z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "parse cfg exception:%s", arrayOfObject5);
            }
            break;
            label434: int n = 1;
            continue;
            label440: int i1 = 1;
          }
        }
        localn.field_startTime = ch.CM();
        if (localn.dsv)
        {
          Object[] arrayOfObject3 = new Object[2];
          int j;
          if (localn.field_fullpath == null)
          {
            j = -1;
            label479: arrayOfObject3[0] = Integer.valueOf(j);
            if (localn.field_thumbpath != null)
              break label641;
          }
          for (int k = -1; ; k = localn.field_thumbpath.length())
          {
            arrayOfObject3[1] = Integer.valueOf(k);
            z.i("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "tryStart send file:%d thumb:%d", arrayOfObject3);
            if (localn.field_fullpath == null)
              localn.field_fullpath = "";
            if (localn.field_thumbpath == null)
              localn.field_thumbpath = "";
            int m = k.vm().startupUploadMedia(localn);
            if (m == 0)
              break label654;
            Object[] arrayOfObject4 = new Object[2];
            arrayOfObject4[0] = Integer.valueOf(m);
            arrayOfObject4[1] = localn.field_mediaId;
            z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "startupUploadMedia error:%d clientid:%s", arrayOfObject4);
            if (localn.dsw == null)
              break;
            localn.dsw.a(localn.field_mediaId, m, null, null);
            break;
            j = localn.field_fullpath.length();
            break label479;
          }
          label654: this.drR.put(localn.field_mediaId, localn);
        }
        else
        {
          int i = k.vm().startupDownloadMedia(localn);
          if (i != 0)
          {
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = Integer.valueOf(i);
            arrayOfObject2[1] = localn.field_mediaId;
            z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "startupDownloadMedia error:%d clientid:%s", arrayOfObject2);
            if (localn.dsw != null)
              localn.dsw.a(localn.field_mediaId, i, null, null);
          }
          else
          {
            this.drR.put(localn.field_mediaId, localn);
          }
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcdntran.c
 * JD-Core Version:    0.6.2
 */