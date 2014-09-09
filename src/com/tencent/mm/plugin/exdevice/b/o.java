package com.tencent.mm.plugin.exdevice.b;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.a.f;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.g.a;
import com.tencent.mm.plugin.exdevice.service.af;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.protocal.a.kk;
import com.tencent.mm.protocal.a.oy;
import com.tencent.mm.protocal.a.oz;
import com.tencent.mm.protocal.a.sr;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.base.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class o
  implements m
{
  private static o eIV;
  private static HashMap eIX = new HashMap();
  private ProgressDialog dWT;
  public q eIW;

  private o()
  {
    long l = ak.getContext().getSharedPreferences("exdevice_pref", 0).getLong(bg.qW().oD(), 0L);
    if (l != 0L)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l);
      com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "this user has synced exdevice, last time is %d", arrayOfObject);
      eIX.put(Integer.valueOf(bg.qW().oD()), Long.valueOf(l));
    }
  }

  public static o Pg()
  {
    if (eIV == null)
      eIV = new o();
    return eIV;
  }

  public static boolean ap(Context paramContext)
  {
    long l = System.currentTimeMillis();
    if (!eIX.containsKey(Integer.valueOf(bg.qW().oD())))
    {
      com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "first time to get bound devices");
      eIX.put(Integer.valueOf(bg.qW().oD()), Long.valueOf(l));
      return true;
    }
    if (l - ((Long)eIX.get(Integer.valueOf(bg.qW().oD()))).longValue() < 86400000L)
    {
      com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "GetBoundHardDevices not now");
      return false;
    }
    if (l - paramContext.getSharedPreferences("exdevice_pref", 0).getLong(bg.qW().oD(), 0L) < 86400000L)
    {
      com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "GetBoundHardDevices not now pp");
      return false;
    }
    return true;
  }

  private static void ar(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "update get bound hard device time : %d", arrayOfObject);
    ak.getContext().getSharedPreferences("exdevice_pref", 0).edit().putLong(bg.qW().oD(), paramLong).commit();
    eIX.put(Integer.valueOf(bg.qW().oD()), Long.valueOf(paramLong));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
    if ((this.dWT != null) && (this.dWT.isShowing()))
      this.dWT.dismiss();
    if ((paramx == null) || (paramInt2 != 0) || (paramInt1 != 0))
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(paramInt2);
      arrayOfObject1[1] = Integer.valueOf(paramInt1);
      com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "do scene failed : %d, %d", arrayOfObject1);
    }
    label680: w localw;
    do
    {
      do
      {
        do
        {
          kk localkk;
          do
          {
            do
            {
              return;
              Object[] arrayOfObject2 = new Object[1];
              arrayOfObject2[0] = Integer.valueOf(paramx.getType());
              com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "scene.getType() = %s", arrayOfObject2);
              if (paramx.getType() != 539)
                break label680;
              if ((paramInt1 == 0) && (paramInt2 == 0))
                break;
              Object[] arrayOfObject5 = new Object[1];
              arrayOfObject5[0] = Integer.valueOf(paramx.getType());
              com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "scene.getType() = %s", arrayOfObject5);
            }
            while (this.eIW == null);
            this.eIW.aP(false);
            return;
            localkk = ((s)paramx).Ph();
            if ((localkk != null) && (localkk.ibd != null))
              break;
          }
          while (this.eIW == null);
          this.eIW.aP(false);
          return;
          ar(ch.CM());
          z.Pp().vT();
          Iterator localIterator = localkk.ibd.iterator();
          while (localIterator.hasNext())
          {
            sr localsr = (sr)localIterator.next();
            if (2 == localsr.imB)
            {
              Object[] arrayOfObject7 = new Object[4];
              arrayOfObject7[0] = localsr.hQL.ieE;
              arrayOfObject7[1] = localsr.hQL.ieD;
              arrayOfObject7[2] = localsr.hQM.ieH;
              arrayOfObject7[3] = localsr.hQM.ieF;
              com.tencent.mm.sdk.platformtools.z.w("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "This Device is unbind, Just leave. deviceId = %s, deviceType = %s, mac = %s, brandName = %s", arrayOfObject7);
            }
            else if ((localsr.hQL != null) && (localsr.hQM != null))
            {
              com.tencent.mm.plugin.exdevice.e.b localb2 = new com.tencent.mm.plugin.exdevice.e.b();
              localb2.field_deviceID = localsr.hQL.ieE;
              localb2.field_deviceType = localsr.hQL.ieD;
              localb2.field_connProto = localsr.hQM.ieI;
              localb2.field_connStrategy = localsr.hQM.ieJ;
              localb2.field_closeStrategy = localsr.hQM.ieK;
              localb2.field_mac = a.lU(a.lV(localsr.hQM.ieH));
              localb2.field_md5Str = f.d(new String(localsr.hQL.ieD + localsr.hQL.ieE).getBytes());
              localb2.field_authKey = localsr.hQM.ieG;
              localb2.field_brandName = localsr.hQM.ieF;
              boolean bool = z.Pp().b(localb2);
              Object[] arrayOfObject6 = new Object[8];
              arrayOfObject6[0] = Boolean.valueOf(bool);
              arrayOfObject6[1] = localb2.field_brandName;
              arrayOfObject6[2] = localb2.field_deviceID;
              arrayOfObject6[3] = localsr.hQL.ieD;
              arrayOfObject6[4] = localb2.field_connProto;
              arrayOfObject6[5] = Integer.valueOf(localb2.field_connStrategy);
              arrayOfObject6[6] = Integer.valueOf(localb2.field_closeStrategy);
              arrayOfObject6[7] = Long.valueOf(localb2.field_mac);
              com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "insert ret = %s, brandName = %s, deviceID = %s, deviceType = %s, connProto = %s, connStrategy = %s, closeStrategy = %s, mac = %s", arrayOfObject6);
            }
          }
        }
        while (this.eIW == null);
        this.eIW.aP(true);
        return;
      }
      while (paramx.getType() != 537);
      localw = (w)paramx;
      ar(0L);
      com.tencent.mm.plugin.exdevice.e.b localb1 = z.Pp().lQ(localw.eJd.ieE);
      if (localb1 != null)
      {
        if ((an.PO().OX() != null) && (!an.PO().OX().au(localb1.field_mac)))
          com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "stopChannel Failed!!!");
        if (!z.Pp().lT(localw.eJd.ieE))
          com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "deleteByDeviceId Failed!!!");
      }
      while ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(paramx.getType());
        com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "scene.getType() = %s", arrayOfObject4);
        return;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = localw.eJd.ieE;
        com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "getByDeviceIdServer Failed!!! DeviceIDServer = %s", arrayOfObject3);
      }
    }
    while ((localw.Pm() != null) && (localw.eJd != null));
    com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "UnbindHardDevice resp or req is null");
  }

  public final void a(Context paramContext, q paramq)
  {
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "startGetBoundHardDevices");
    s locals = new s();
    if ((paramContext != null) && ((paramContext instanceof Activity)) && (!((Activity)paramContext).isFinishing()))
    {
      if ((this.dWT != null) && (this.dWT.isShowing()))
        this.dWT.dismiss();
      paramContext.getString(n.buo);
      this.dWT = e.a(paramContext, paramContext.getString(n.ccw), new p(this, locals, paramq));
    }
    this.eIW = paramq;
    bg.qX().d(locals);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.o
 * JD-Core Version:    0.6.2
 */