package com.tencent.mm.plugin.exdevice.b;

import android.content.Context;
import android.os.Looper;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.exdevice.service.af;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.plugin.exdevice.service.ap;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class f
{
  private static int eIM = 0;
  private com.tencent.mm.plugin.exdevice.service.k eII;
  private ap eIJ;
  private HashMap eIK;
  private HashMap eIL;

  public f()
  {
    an.PO().a(new g(this));
    if (this.eIJ == null)
      this.eIJ = new k(this);
    this.eIK = new HashMap();
    this.eIL = new HashMap();
  }

  public static int Pb()
  {
    return eIM;
  }

  public static void ap(long paramLong)
  {
    if (an.PO().OX() != null)
    {
      boolean bool = an.PO().OX().au(paramLong);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Long.valueOf(paramLong);
      arrayOfObject[1] = Boolean.valueOf(bool);
      z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "now stop the devide channel : %d, result : %b", arrayOfObject);
    }
  }

  private boolean b(String paramString, long paramLong, int paramInt)
  {
    try
    {
      int i = bg.qX().tw();
      boolean bool;
      if ((i != 5) && (i != 1))
      {
        z.e("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "now network is not avaiable, notify directly");
        bool = false;
      }
      while (true)
      {
        return bool;
        if (this.eIL.containsKey(Long.valueOf(paramLong)))
        {
          Object[] arrayOfObject3 = new Object[2];
          arrayOfObject3[0] = paramString;
          arrayOfObject3[1] = Long.valueOf(paramLong);
          z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "now the device is syncing data : %s, %d, Just leave!!!", arrayOfObject3);
          bool = false;
        }
        else
        {
          ay localay = new ay(Looper.getMainLooper(), new i(this, paramLong, paramString, paramInt), false);
          long l = com.tencent.mm.plugin.exdevice.g.a.PY();
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Long.valueOf(l);
          z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "now sync time out is : %d", arrayOfObject1);
          localay.cP(l);
          this.eIL.put(Long.valueOf(paramLong), localay);
          if (an.PO().OX() != null)
          {
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = paramString;
            arrayOfObject2[1] = Long.valueOf(paramLong);
            z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "start channel now : %s, %d", arrayOfObject2);
            bool = an.PO().OX().a(paramLong, paramInt, this.eIJ);
          }
          else
          {
            z.e("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "MMExDeviceCore.getTaskQueue().getDispatcher() == null");
            bool = false;
          }
        }
      }
    }
    finally
    {
    }
  }

  public final void Pc()
  {
    if (this.eII != null)
      ak.getContext().unbindService(this.eII);
  }

  public final void Pd()
  {
    if ((this.eIK != null) && (!this.eIK.isEmpty()))
    {
      Iterator localIterator = this.eIK.entrySet().iterator();
      while (localIterator.hasNext())
        ((ay)((Map.Entry)localIterator.next()).getValue()).aNu();
      this.eIK.clear();
    }
  }

  public final void a(String paramString, long paramLong, int paramInt)
  {
    a(paramString, paramLong, paramInt, false);
  }

  public final void a(String paramString, long paramLong, int paramInt, boolean paramBoolean)
  {
    com.tencent.mm.plugin.exdevice.e.a.g("shut_down_device", paramLong);
    if (this.eII == null)
    {
      this.eII = new com.tencent.mm.plugin.exdevice.service.k();
      this.eII.a(new h(this, paramInt, paramString, paramLong, paramBoolean));
      this.eII.aq(ak.getContext());
      return;
    }
    b(paramString, paramLong, paramInt, paramBoolean);
  }

  public final void ao(long paramLong)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "StopSyncTimer, device Id = %d", arrayOfObject1);
    if (this.eIL.containsKey(Long.valueOf(paramLong)))
    {
      z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "Switch from main view to chatting view before exdevice sync timeout, just stop MTimerHandler");
      ay localay = (ay)this.eIL.remove(Long.valueOf(paramLong));
      if (localay != null)
        localay.aNu();
    }
    else
    {
      return;
    }
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Long.valueOf(paramLong);
    z.e("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "Remove deviceId(%d) from syncTimeOutMap failed!!!", arrayOfObject2);
  }

  public final void aq(long paramLong)
  {
    ay localay = (ay)this.eIK.remove(Long.valueOf(paramLong));
    if (localay != null)
      localay.aNu();
  }

  public final void b(String paramString, long paramLong, int paramInt, boolean paramBoolean)
  {
    z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "doConnect");
    boolean bool;
    if (paramBoolean)
      bool = b(paramString, paramLong, paramInt);
    while (true)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Boolean.valueOf(bool);
      z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "startChannel Ret = %s", arrayOfObject2);
      return;
      if (bg.qX().tw() != 5)
      {
        z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "now network is not avaiable, notify directly");
        bool = false;
      }
      else
      {
        if (this.eIK.containsKey(Long.valueOf(paramLong)))
        {
          Object[] arrayOfObject4 = new Object[3];
          arrayOfObject4[0] = paramString;
          arrayOfObject4[1] = Long.valueOf(paramLong);
          arrayOfObject4[2] = Integer.valueOf(paramInt);
          z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "now the device is connecting, reset timer : brand name = %s, deviceid = %d, bluetooth version = %d", arrayOfObject4);
          ay localay2 = (ay)this.eIK.get(Long.valueOf(paramLong));
          localay2.aNu();
          localay2.cP(30000L);
        }
        while (true)
        {
          if (an.PO().OX() != null)
            break label292;
          Object[] arrayOfObject3 = new Object[3];
          arrayOfObject3[0] = paramString;
          arrayOfObject3[1] = Long.valueOf(paramLong);
          arrayOfObject3[2] = Integer.valueOf(paramInt);
          z.w("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "MMExDeviceCore.getTaskQueue().getDispatcher() == null, Just leave, brand name is %s, device id is %d, bluetooth version is %d", arrayOfObject3);
          bool = false;
          break;
          Object[] arrayOfObject1 = new Object[3];
          arrayOfObject1[0] = paramString;
          arrayOfObject1[1] = Long.valueOf(paramLong);
          arrayOfObject1[2] = Integer.valueOf(paramInt);
          z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "the device is not connecting, brand name = %s, deviceid = %d, bluetooth version = %d", arrayOfObject1);
          ay localay1 = new ay(Looper.getMainLooper(), new j(this, paramLong, paramString, paramInt), false);
          localay1.cP(30000L);
          this.eIK.put(Long.valueOf(paramLong), localay1);
        }
        label292: bool = an.PO().OX().a(paramLong, paramInt, this.eIJ);
      }
    }
  }

  public final void gS(int paramInt)
  {
    try
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "setConnectMode, mode = %d", arrayOfObject);
      eIM = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.f
 * JD-Core Version:    0.6.2
 */