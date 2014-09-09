package com.tencent.mm.plugin.exdevice.a;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.exdevice.b.v;
import com.tencent.mm.plugin.exdevice.c.k;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.f.h;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.HashMap;
import junit.framework.Assert;

final class m extends cm
{
  public m(l paraml, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    int i = -5;
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1QcnoF1HyyhbQ4llIiKd2timuTMAcXsDP", "handleMessage msg.what = " + paramMessage.what);
    switch (paramMessage.what)
    {
    default:
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(paramMessage.what);
      com.tencent.mm.sdk.platformtools.z.f("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1QcnoF1HyyhbQ4llIiKd2timuTMAcXsDP", "unknown message type = %d", arrayOfObject3);
    case 1:
    case 2:
      n localn;
      do
      {
        return;
        g localg2 = (g)paramMessage.obj;
        if (!an.PN().aF(localg2.HW()))
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Long.valueOf(localg2.HW());
          com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1QcnoF1HyyhbQ4llIiKd2timuTMAcXsDP", "This device send other cmd before do auth, device id = %d", arrayOfObject2);
          localg2.b(-2, "", new byte[0]);
          h localh7 = new h(localg2);
          an.PO().a(localh7);
          return;
        }
        if ((i == paramMessage.arg1) || (-3 == paramMessage.arg1) || (-4 == paramMessage.arg1))
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(paramMessage.arg1);
          com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1QcnoF1HyyhbQ4llIiKd2timuTMAcXsDP", "Error Code = %d, reply errorcode to device and close channel", arrayOfObject1);
          localg2.b(-1, "", new byte[0]);
          h localh4 = new h(localg2);
          an.PO().a(localh4);
          return;
        }
        com.tencent.mm.plugin.exdevice.e.b localb = com.tencent.mm.plugin.exdevice.b.z.Pp().lP(localg2.HW());
        if (localb == null)
        {
          com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1QcnoF1HyyhbQ4llIiKd2timuTMAcXsDP", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
          return;
        }
        long l3 = localb.kq();
        if (System.currentTimeMillis() / 1000L < l3)
        {
          com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1QcnoF1HyyhbQ4llIiKd2timuTMAcXsDP", "device has been blocked");
          localg2.b(i, "Device Is Block", null);
          h localh6 = new h(localg2);
          an.PO().a(localh6);
          return;
        }
        long l4 = r.OW();
        k localk = (k)localg2.OQ();
        if (localk == null)
        {
          com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1QcnoF1HyyhbQ4llIiKd2timuTMAcXsDP", "SendDataToManufacturerSvr Request parse failed!!!, Tell device before stop this task");
          localg2.b(-4, "Decode failed", null);
          h localh5 = new h(localg2);
          an.PO().a(localh5);
          return;
        }
        v localv = new v(localg2.HW(), localb.field_deviceType, localb.field_deviceID, l4, ch.CM(), localk.dZx.toByteArray(), localk.ewb);
        bg.qX().d(localv);
        p localp = new p(this.eIq, l4);
        l.a(this.eIq).postDelayed(localp, 30000L);
        q localq4 = new q((byte)0);
        localq4.a(localg2);
        localq4.a(localp);
        localq4.OT();
        l.b(this.eIq).put(Long.valueOf(l4), localq4);
        return;
        localn = (n)paramMessage.obj;
      }
      while ((localn.eIr == 0) && (localn.eIg == 0));
      long l2 = ((v)localn.eIt).HT();
      q localq3 = (q)l.b(this.eIq).get(Long.valueOf(l2));
      if (localq3 == null)
      {
        com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1QcnoF1HyyhbQ4llIiKd2timuTMAcXsDP", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId = " + l2);
        return;
      }
      g localg1 = localq3.OU();
      switch (localn.eIg)
      {
      default:
        i = -1;
      case -417:
      }
      localg1.b(i, localn.eIs, null);
      h localh3 = new h(localq3.OU());
      an.PO().a(localh3);
      l.a(this.eIq).removeCallbacks(localq3.OV());
      l.b(this.eIq).remove(Long.valueOf(l2));
      return;
    case 0:
      long l1 = ((Long)paramMessage.obj).longValue();
      q localq2 = (q)l.b(this.eIq).get(Long.valueOf(l1));
      Assert.assertNotNull(localq2);
      com.tencent.mm.sdk.platformtools.z.w("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1QcnoF1HyyhbQ4llIiKd2timuTMAcXsDP", "SendDataToManufacturerCmd Timeout sessionId = " + l1);
      localq2.OU().b(-1, "", null);
      h localh2 = new h(localq2.OU());
      an.PO().a(localh2);
      l.b(this.eIq).remove(Long.valueOf(l1));
      return;
    case 3:
    }
    o localo = (o)paramMessage.obj;
    q localq1 = (q)l.b(this.eIq).get(Long.valueOf(localo.ein));
    if (localq1 == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!64@/B4Tb64lLpLHXwcx366fGuAuFdkD13I1QcnoF1HyyhbQ4llIiKd2timuTMAcXsDP", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId = " + localo.ein);
      return;
    }
    q.a(localq1).b(0, "", localo.mData);
    h localh1 = new h(localq1.OU());
    an.PO().a(localh1);
    l.a(this.eIq).removeCallbacks(localq1.OV());
    l.b(this.eIq).remove(Long.valueOf(localo.ein));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.m
 * JD-Core Version:    0.6.2
 */