package com.tencent.mm.plugin.exdevice.b;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.Looper;
import com.tencent.mm.c.a.ba;
import com.tencent.mm.c.a.bb;
import com.tencent.mm.c.a.bd;
import com.tencent.mm.c.a.be;
import com.tencent.mm.c.a.bf;
import com.tencent.mm.c.a.fj;
import com.tencent.mm.c.a.fl;
import com.tencent.mm.c.a.fm;
import com.tencent.mm.c.a.fn;
import com.tencent.mm.c.a.fo;
import com.tencent.mm.c.a.gq;
import com.tencent.mm.c.a.kx;
import com.tencent.mm.c.a.lc;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.exdevice.f.j;
import com.tencent.mm.plugin.exdevice.service.af;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.protocal.a.oy;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.Iterator;
import java.util.LinkedList;

public final class l
{
  public static void C(String paramString, int paramInt)
  {
    gq localgq = new gq();
    localgq.cLI.op = 2;
    localgq.cLI.cKL = paramString;
    localgq.cLI.cLJ = paramInt;
    com.tencent.mm.sdk.c.a.aGB().a(localgq, Looper.getMainLooper());
  }

  public static void D(String paramString, int paramInt)
  {
    gq localgq = new gq();
    localgq.cLI.op = 1;
    localgq.cLI.cKL = paramString;
    localgq.cLI.cKI = paramInt;
    com.tencent.mm.sdk.c.a.aGB().a(localgq, Looper.getMainLooper());
  }

  private static boolean Pe()
  {
    com.tencent.mm.plugin.exdevice.e.c localc = z.Pp();
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = localc.rawQuery("select * from HardDeviceInfo where mac > 0 and connProto like 3", new String[0]);
    if (localCursor == null)
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGsZEje3hjt8VnDEh5Lcm6I9vjOYhiPQ4Eg==", "get cursor is null");
    while (localLinkedList.isEmpty())
    {
      com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "get harddevice info is null or empty");
      return false;
      if (localCursor.moveToFirst())
        do
        {
          com.tencent.mm.plugin.exdevice.e.b localb2 = new com.tencent.mm.plugin.exdevice.e.b();
          localb2.b(localCursor);
          localLinkedList.add(localb2);
        }
        while (localCursor.moveToNext());
      localCursor.close();
    }
    z.Pr().gS(2);
    Iterator localIterator = localLinkedList.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.exdevice.e.b localb1 = (com.tencent.mm.plugin.exdevice.e.b)localIterator.next();
      com.tencent.mm.storage.i locali = com.tencent.mm.model.bg.qW().oT().ys(localb1.field_brandName);
      if ((locali == null) || (!com.tencent.mm.g.a.cv(locali.getType())))
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localb1.field_brandName;
        com.tencent.mm.sdk.platformtools.z.e("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "%s is not my contact now, may be has been deleted", arrayOfObject1);
      }
      else if ((0x4 & localb1.field_connStrategy) == 0)
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(localb1.field_connStrategy);
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "Connect Strategy is %d, no need to sync in main ui", arrayOfObject3);
      }
      else
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localb1.field_brandName;
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "now try to connect %s", arrayOfObject2);
        z.Pr().a(localb1.field_brandName, localb1.field_mac, 0, true);
      }
    }
    return true;
  }

  private static boolean l(int paramInt, String paramString)
  {
    int i = -1;
    com.tencent.mm.q.a locala = com.tencent.mm.q.r.fE(paramString);
    if (locala == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "bizInfo is null");
      return false;
    }
    com.tencent.mm.q.e locale = locala.tY();
    if ((locale == null) || (locale.uw() == null) || (!locale.uw().uE()))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "this is not hardware biz");
      return false;
    }
    com.tencent.mm.plugin.exdevice.e.b localb = z.Pp().lR(paramString);
    if (localb == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "hdInfo error");
      return false;
    }
    if (ch.ja(localb.field_connProto).equals("4"))
    {
      C(paramString, i);
      D(paramString, i);
      com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "Wifi biz, Just leave");
      return true;
    }
    if (!com.tencent.mm.plugin.c.a.d.a.Ib())
    {
      com.tencent.mm.sdk.platformtools.z.w("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "System bluetooth is close");
      D(paramString, 0);
      return false;
    }
    D(paramString, i);
    if ((0x1 & localb.field_connStrategy) <= 0)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(localb.field_connStrategy);
      com.tencent.mm.sdk.platformtools.z.e("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "Error connect stragegy(%d), Just leave!!!", arrayOfObject2);
      return false;
    }
    if (ch.ja(localb.field_connProto).contains("1"))
    {
      if (BluetoothAdapter.getDefaultAdapter() != null);
      for (int m = 1; m == 0; m = 0)
      {
        com.tencent.mm.sdk.platformtools.z.e("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "device is BC, but you phone not support BC.");
        return false;
      }
      i = 1;
    }
    while (true)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramInt);
      com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "receive ExDeviceOpInChattingUIEventListener, op = %d", arrayOfObject1);
      if (paramInt != 0)
        break label430;
      z.Pr().ao(localb.field_mac);
      int j = an.PN().aB(localb.field_mac);
      int k = 0;
      if (j == 2)
        k = 1;
      if (k == 0)
        break;
      com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "has connected this device : " + localb.field_brandName);
      C(localb.field_brandName, 2);
      return true;
      if (ch.ja(localb.field_connProto).contains("3"))
      {
        if (!com.tencent.mm.plugin.c.a.d.a.ak(ak.getContext()))
        {
          D(paramString, 1);
          com.tencent.mm.sdk.platformtools.z.e("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "device is BLE, but you phone not support BLE.");
          return false;
        }
        i = 0;
      }
    }
    if (!com.tencent.mm.plugin.exdevice.service.m.ar(ak.getContext()))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "service not running");
      return true;
    }
    z.Pr().gS(1);
    z.Pr().a(localb.field_brandName, localb.field_mac, i);
    while (true)
    {
      return true;
      label430: if (paramInt == 1)
      {
        z.Pr().a(localb.field_brandName, localb.field_mac, i);
      }
      else if (paramInt == 2)
      {
        z.Pr();
        f.ap(localb.field_mac);
      }
    }
  }

  public final boolean c(com.tencent.mm.sdk.c.e parame)
  {
    if ((parame instanceof fn))
    {
      com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "handleSwitchViewEvent");
      fn localfn = (fn)parame;
      int i3 = localfn.cKK.cDf;
      int i4 = localfn.cKK.cKM;
      String str3 = localfn.cKK.cKL;
      com.tencent.mm.plugin.exdevice.e.b localb2 = z.Pp().lR(str3);
      if ((localb2 == null) || (ch.jb(localb2.field_brandName)))
      {
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "get hdinfo by brandName failed : %s", new Object[] { str3 });
        return false;
      }
      if (ch.ja(localb2.field_connProto).equals("4"))
      {
        D(str3, -1);
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "Wifi biz, Just leave");
        return true;
      }
      if (!com.tencent.mm.plugin.c.a.d.a.Ib())
      {
        com.tencent.mm.sdk.platformtools.z.w("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "System bluetooth is close");
        D(str3, 0);
        return false;
      }
      D(str3, -1);
      com.tencent.mm.plugin.exdevice.service.o localo = an.PN().aC(localb2.field_mac);
      if (localo == null)
      {
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "can not find the hardevice connect state");
        return false;
      }
      if (localo.cLJ == 2)
      {
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "notify the connect device %s", new Object[] { str3 });
        j localj = new j(i3, i4, localb2.field_mac);
        an.PO().a(localj);
      }
      f localf = z.Pr();
      if (i3 == 1);
      for (int i5 = 1; ; i5 = 0)
      {
        localf.gS(i5);
        if (i3 != 2)
          break;
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "now exit chattingui, do not notify change the subtitle");
        z.Pr().aq(localb2.field_mac);
        if ((2 != localo.cLJ) && (localo.cLJ != 0))
        {
          Object[] arrayOfObject5 = new Object[2];
          arrayOfObject5[0] = Integer.valueOf(localo.cLJ);
          arrayOfObject5[1] = str3;
          com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "now the device not connect, try to stop connetct, connet state is %d, device is %s", arrayOfObject5);
          if (an.PO().OX() != null)
            an.PO().OX().au(localo.eKo);
        }
        return true;
      }
      C(str3, localo.cLJ);
      return true;
    }
    if ((parame instanceof fl))
    {
      com.tencent.mm.plugin.exdevice.f.i locali = new com.tencent.mm.plugin.exdevice.f.i(((fl)parame).cKJ.cDf);
      an.PO().a(locali);
      return true;
    }
    if ((parame instanceof bd))
    {
      com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "handleOpInChattingUIEvent");
      bd localbd = (bd)parame;
      if (ch.jb(localbd.cIh.cDi))
      {
        com.tencent.mm.sdk.platformtools.z.e("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "ExDeviceOpInChattingUIEventListener, userName is null");
        return false;
      }
      if ((localbd.cIh.op == 0) && (o.ap(ak.getContext())))
      {
        o.Pg().a(localbd.cIh.context, new n(this, localbd));
        return true;
      }
      int i2 = localbd.cIh.op;
      String str2 = localbd.cIh.cDi;
      return l(i2, str2);
    }
    if ((parame instanceof ba))
    {
      com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "receive ExDeviceBindHardDeviceEvent");
      ba localba = (ba)parame;
      int i1 = localba.cIe.cDf;
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Integer.valueOf(i1);
      com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "now optype is %d", arrayOfObject4);
      if (i1 == 1)
      {
        r localr1 = new r(localba.cIe.cIg);
        com.tencent.mm.model.bg.qX().d(localr1);
        localba.cIf.cDg = localr1;
      }
      while (true)
      {
        return true;
        if ((i1 == 2) && (localba.cIe.cDg != null))
        {
          r localr2 = (r)localba.cIe.cDg;
          com.tencent.mm.model.bg.qX().c(localr2);
        }
      }
    }
    if ((parame instanceof bf))
    {
      com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "receive ExDeviceUnBindHardDeviceEvent");
      z.Pr().gS(0);
      bf localbf = (bf)parame;
      if (ch.jb(localbf.cIi.cIj))
      {
        com.tencent.mm.sdk.platformtools.z.e("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "brandName is null, can not unbind device");
        return false;
      }
      com.tencent.mm.plugin.exdevice.e.b localb1 = z.Pp().lR(localbf.cIi.cIj);
      if (localb1 == null)
      {
        com.tencent.mm.sdk.platformtools.z.e("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "hdInfo error");
        return false;
      }
      oy localoy = new oy();
      localoy.ieE = localb1.field_deviceID;
      localoy.ieD = localb1.field_deviceType;
      w localw = new w(localoy);
      com.tencent.mm.model.bg.qX().d(localw);
      return true;
    }
    if ((parame instanceof kx))
    {
      com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "receive StopAllChannelEvent");
      long[] arrayOfLong = com.tencent.mm.plugin.exdevice.e.a.lN("conneted_device");
      if (!com.tencent.mm.plugin.exdevice.e.a.lO("conneted_device"))
        com.tencent.mm.sdk.platformtools.z.e("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "removeFromSharedPreferences failed!!!");
      if ((arrayOfLong != null) && (arrayOfLong.length > 0) && (an.PO().OX() != null))
      {
        int m = arrayOfLong.length;
        for (int n = 0; n < m; n++)
        {
          long l5 = arrayOfLong[n];
          an.PO().OX().au(l5);
        }
      }
      z.Pr().Pc();
      return true;
    }
    if ((parame instanceof lc))
    {
      com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "receive SyncExdeviceDataEvent");
      int i = com.tencent.mm.model.bg.qX().tw();
      if ((i != 5) && (i != 1))
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(i);
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "net work state is not connected, now state is %d", arrayOfObject3);
        return false;
      }
      String str1 = com.tencent.mm.f.e.or().getValue("DeviceAutoSyncClose");
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "handleSyncExdeviceDataEvent, auto sync has close : %s", new Object[] { str1 });
      if ((!ch.jb(str1)) && (str1.equalsIgnoreCase("1")))
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "auto sync has closed, ignore this sync request");
      for (int j = 0; j == 0; j = 1)
      {
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "not allowed to sync exdevice data");
        return false;
      }
      if (!com.tencent.mm.plugin.c.a.d.a.ak(ak.getContext()))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(Build.VERSION.SDK_INT);
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "now sdk version not support ble device : %d", arrayOfObject2);
        return false;
      }
      if (!com.tencent.mm.plugin.c.a.d.a.Ib())
      {
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "Bluetooth is not open, Just leave");
        return false;
      }
      long l1 = com.tencent.mm.plugin.exdevice.g.a.PX();
      SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("exdevice_pref", 0);
      if (localSharedPreferences != null)
      {
        long l2 = localSharedPreferences.getLong("device_auto_sync_last_time", 0L);
        long l3 = ch.CM();
        long l4 = l3 - l2;
        Object[] arrayOfObject1 = new Object[4];
        arrayOfObject1[0] = Long.valueOf(l2);
        arrayOfObject1[1] = Long.valueOf(l1);
        arrayOfObject1[2] = Long.valueOf(l3);
        arrayOfObject1[3] = Long.valueOf(l4);
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "last sync time :%d, inteval config : %d, now time in millsecons is %d,  nowTime - lasysynctime = %d", arrayOfObject1);
        if (l4 > l1)
          localSharedPreferences.edit().putLong("device_auto_sync_last_time", l3).commit();
      }
      for (int k = 1; k == 0; k = 0)
      {
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "it is not the time to sync data");
        return false;
      }
      z.Pr();
      if (f.Pb() == 1)
      {
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "it is in brand");
        return false;
      }
      if (o.ap(ak.getContext()))
      {
        com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "now need to get bound harddevices");
        o.Pg().a(null, new m(this));
        return true;
      }
      com.tencent.mm.sdk.platformtools.z.i("!56@mGXR/vVzLfMaKBAVLl0J+hAdeLm89+sk4Jbqj3kvb3/BJBgTwV/SHA==", "now do not need to get bound device, do sync directly");
      return Pe();
    }
    return !(parame instanceof fj);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.l
 * JD-Core Version:    0.6.2
 */