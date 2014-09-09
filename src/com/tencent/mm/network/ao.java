package com.tencent.mm.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import com.tencent.mm.a.k;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.jni.platformcomm.WakerLock;
import com.tencent.mm.protocal.be;
import com.tencent.mm.protocal.bh;
import com.tencent.mm.protocal.f;
import com.tencent.mm.protocal.u;
import com.tencent.mm.sdk.platformtools.cb;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ao extends t
  implements b
{
  private int dTi = 0;
  private long dTj = 0L;
  private long dTk = 0L;
  private WakerLock dTl = null;
  private a dTm;
  private ba dTn;
  private bc dTo;
  private long dTp = 0L;
  private int dTq = -1;
  private be dTr;
  private cm gQj;

  public ao(cm paramcm)
  {
    if (paramcm == null)
      paramcm = new cm();
    this.gQj = paramcm;
    this.dTm = new a(this);
    this.dTl = new WakerLock(bk.getContext());
    this.dTn = new ba(this, this.dTl);
    this.dTo = new bc(this, this.dTl);
  }

  private void a(ak paramak, int paramInt1, int paramInt2)
  {
    paramak.a(this.dTm, this.dTn, paramInt1, paramInt2);
  }

  private void c(int paramInt1, int paramInt2, String paramString)
  {
    z.i("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "handleAutoAuthFail errType=" + paramInt1 + ", inErrCode=" + paramInt2 + ", errMsg=" + paramString);
    if ((paramInt1 == 4) && (paramInt2 == -106))
    {
      z.e("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "handleAutoAuthFail autoauth should not be return MM_ERR_BLOCK_BY_SPAM trans to MM_ERR_AUTH_ANOTHERPLACE");
      paramInt2 = -100;
    }
    bk.Dp().d(paramInt1, paramInt2, paramString);
    if ((paramInt1 == 4) && ((paramInt2 == -100) || (paramInt2 == -205) || (paramInt2 == -213)))
    {
      com.tencent.mm.sdk.platformtools.ak.getContext().getSharedPreferences("auth_hold_prefs", 0).edit().putBoolean("auth_ishold", true).commit();
      reset();
    }
  }

  private static void js(String paramString)
  {
    com.tencent.mm.sdk.platformtools.ak.getContext().getSharedPreferences("ticket_prefs", m.nN()).edit().putString("_auth_ticket", paramString).commit();
    com.tencent.mm.sdk.platformtools.ak.getContext().getSharedPreferences("auth_hold_prefs", 0).edit().remove("auth_ishold").commit();
    z.i("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "oreh save authTicket:%s", new Object[] { paramString });
    z.appenderFlush();
  }

  public final void CV()
  {
    this.dTl.lock(1000L);
    new ay(this, Integer.valueOf(-1)).b(this.gQj);
  }

  public final v CW()
  {
    return bk.Dl();
  }

  public final a Da()
  {
    return this.dTm;
  }

  public final boolean Db()
  {
    if (90000L >= SystemClock.elapsedRealtime() - this.dTk)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Long.valueOf(this.dTk);
      arrayOfObject[1] = Long.valueOf(SystemClock.elapsedRealtime());
      z.w("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "auto limit lastSessionTimeout=%d, curtime=%d", arrayOfObject);
      return false;
    }
    this.dTk = SystemClock.elapsedRealtime();
    this.dTm.l("", this.dTm.oD());
    return true;
  }

  public final byte[] Dc()
  {
    be localbe = this.dTr;
    Object localObject = null;
    if (localbe != null);
    try
    {
      byte[] arrayOfByte = this.dTr.ri();
      localObject = arrayOfByte;
      return localObject;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public final void Y(boolean paramBoolean)
  {
    new au(this, Integer.valueOf(-1), paramBoolean).b(this.gQj);
  }

  public final int a(ak paramak, ac paramac)
  {
    try
    {
      this.dTl.lock(1000L);
      int i = ((Integer)new at(this, Integer.valueOf(-1), paramak, paramac).b(this.gQj)).intValue();
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final void a(int paramInt1, int paramInt2, String paramString, ak paramak, byte[] paramArrayOfByte)
  {
    if (paramInt2 != 0);
    try
    {
      this.dTi = (1 + this.dTi);
      f localf = paramak.tO();
      int i = paramak.getType();
      if (!ch.B(paramArrayOfByte))
      {
        if (i == 126)
          break label761;
        if (i == 380)
          break label761;
      }
      while (true)
      {
        this.dTm.y(paramArrayOfByte);
        switch (paramak.getType())
        {
        case 380:
          if (paramak.getType() == 10)
            break;
          this.dTi = 0;
          break;
        case 381:
        case 126:
          label761: 
          do
          {
            do
            {
              if ((paramInt2 != 0) || (paramInt1 != 0))
                break;
              this.dTm.y(paramArrayOfByte);
              break;
              Object[] arrayOfObject = new Object[3];
              arrayOfObject[0] = Integer.valueOf(paramInt1);
              arrayOfObject[1] = Integer.valueOf(paramInt2);
              arrayOfObject[2] = paramString;
              z.d("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "dkwt auth end ret:[%d,%d][%s]", arrayOfObject);
              if ((localf.tQ() != 0) || (paramInt1 != 0))
                break label793;
              if (paramInt2 != 0)
              {
                break label793;
                com.tencent.mm.sdk.platformtools.ak.getContext().getSharedPreferences("auth_hold_prefs", 0).edit().putBoolean("auth_ishold", true).commit();
                return;
                com.tencent.mm.protocal.c localc2 = paramak.tN();
                this.dTm.e(localf.tV(), localc2.getPassword(), localc2.tL());
                this.dTm.jq(localf.tV());
                js(localf.tR());
                this.dTm.l(localf.qL(), localf.oD());
                k.getString(localf.oD());
                com.tencent.mm.sdk.b.b.aMY();
                return;
              }
              com.tencent.mm.protocal.c localc3 = paramak.tN();
              this.dTm.e(localf.tV(), localc3.getPassword(), localc3.tL());
              this.dTm.jq(localf.tV());
              js(localf.tR());
              this.dTm.l(localf.qL(), localf.oD());
              k.getString(localf.oD());
              com.tencent.mm.sdk.b.b.aMY();
              return;
              if ((paramInt1 == 0) && (paramInt2 == 0))
              {
                bh.l(paramak.tO().tS(), paramak.tO().tT(), paramak.tO().tU());
                this.dTp = SystemClock.elapsedRealtime();
              }
              if ((com.tencent.mm.platformtools.ao.dVY == 10003) && (com.tencent.mm.platformtools.ao.dVZ > 0))
              {
                if (com.tencent.mm.platformtools.ao.dVZ <= 1)
                  com.tencent.mm.platformtools.ao.dVZ = 0;
                bh.l("", "", 0);
                paramInt1 = 4;
              }
              if (this.dTq == -1)
                break label789;
              if ((paramInt1 == 0) && (paramInt2 == 0))
                a(paramak, 0, 0);
              this.dTq = -1;
              return;
              z.i("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "net.end: register done");
              if ((localf.tQ() != 0) || (paramInt1 != 0) || (paramInt2 != 0))
              {
                z.e("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "net.end: reg err: type=" + paramak.getType() + " err=" + paramInt1 + "," + paramInt2 + " errmsg=" + paramString);
                return;
              }
              z.i("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "net.end: reg ok: type=" + paramak.getType());
              com.tencent.mm.protocal.c localc1 = paramak.tN();
              this.dTm.e(localf.tV(), localc1.getPassword(), localc1.tL());
              this.dTm.jq(localf.tV());
              js(localf.tR());
              this.dTm.l(localf.qL(), localf.oD());
              k.getString(localf.oD());
              com.tencent.mm.sdk.b.b.aMY();
              return;
            }
            while ((i != 380) || (paramInt1 != 4));
            if (paramInt2 == -16)
              break;
          }
          while (paramInt2 != -17);
        }
      }
      label789: return;
    }
    catch (RemoteException localRemoteException)
    {
      return;
    }
    label793: switch (paramInt2)
    {
    case -213:
    case -205:
    case -100:
    case -17:
    case -16:
    }
  }

  public final void a(com.tencent.mm.network.a.c paramc)
  {
    bk.Dk().a(paramc);
  }

  public final void a(be parambe)
  {
    this.dTr = parambe;
  }

  public final void a(boolean paramBoolean, String paramString1, String paramString2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, String paramString3, String paramString4)
  {
    this.dTl.lock(1000L);
    List localList1 = u.wo(paramString2);
    List localList2 = u.wo(paramString1);
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = paramString3;
    arrayOfObject[1] = paramString1;
    arrayOfObject[2] = Integer.valueOf(localList2.size());
    arrayOfObject[3] = paramString4;
    arrayOfObject[4] = paramString2;
    arrayOfObject[5] = Integer.valueOf(localList1.size());
    if (paramBoolean);
    HashMap localHashMap1;
    for (String str = "!!!!!CHANGE IDC NOW"; ; str = "false")
    {
      arrayOfObject[6] = str;
      z.d("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "dkidc setIDCHostInfo short:[%s][%s](%d) long:[%s][%s](%d) reset:%s", arrayOfObject);
      localHashMap1 = new HashMap();
      Iterator localIterator1 = localList1.iterator();
      while (localIterator1.hasNext())
      {
        u localu2 = (u)localIterator1.next();
        ArrayList localArrayList2 = (ArrayList)localHashMap1.get(localu2.getHost());
        if (localArrayList2 == null)
        {
          localArrayList2 = new ArrayList();
          localHashMap1.put(localu2.getHost(), localArrayList2);
        }
        localArrayList2.add(localu2.aGR());
      }
    }
    HashMap localHashMap2 = new HashMap();
    Iterator localIterator2 = localList2.iterator();
    while (localIterator2.hasNext())
    {
      u localu1 = (u)localIterator2.next();
      ArrayList localArrayList1 = (ArrayList)localHashMap2.get(localu1.getHost());
      if (localArrayList1 == null)
      {
        localArrayList1 = new ArrayList();
        localHashMap2.put(localu1.getHost(), localArrayList1);
      }
      localArrayList1.add(localu1.aGR());
    }
    new av(this, Integer.valueOf(-1), localHashMap1, localHashMap2, paramArrayOfInt2, paramArrayOfInt1, paramBoolean).b(this.gQj);
  }

  public final int c(String paramString, List paramList)
  {
    return Java2C.c(paramString, paramList);
  }

  public final void c(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.dTl.lock(1000L);
    z.d("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "dkidc setFixedHost debug short:%s long:%s", new Object[] { paramString1, paramString3 });
    if ((ch.jb(paramString1)) || (ch.jb(paramString3)))
    {
      z.w("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "dkidc setFixedHost FAILED ! check assist");
      return;
    }
    new aw(this, Integer.valueOf(-1), paramString1, paramString2, paramString3, paramString4).b(this.gQj);
  }

  public final void cancel(int paramInt)
  {
    this.dTl.lock(1000L);
    new ap(this, paramInt).b(this.gQj);
  }

  protected final void finalize()
  {
    reset();
    super.finalize();
  }

  public final void fl(String paramString)
  {
    this.dTl.lock(1000L);
    new az(this, paramString).b(this.gQj);
  }

  public final String[] getIPsString(boolean paramBoolean)
  {
    return Java2C.getIPsString(paramBoolean);
  }

  public final String getIspId()
  {
    return Java2C.getIspId();
  }

  public final String getNetworkServerIp()
  {
    return Java2C.getNetworkServerIp();
  }

  public final void keepSignalling()
  {
    Java2C.keepSignalling();
  }

  final boolean makeSureAuth()
  {
    if (this.dTm.CS())
      return true;
    if (bk.Dp().Dg())
      return false;
    if (this.dTq != -1)
    {
      z.w("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "auto limit now is getting cert");
      return false;
    }
    if (60000L >= SystemClock.elapsedRealtime() - this.dTj)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Long.valueOf(this.dTj);
      arrayOfObject2[1] = Long.valueOf(SystemClock.elapsedRealtime());
      z.w("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "auto limit lastAutoAuthtime=%d, curtime=%d", arrayOfObject2);
      return false;
    }
    if (com.tencent.mm.sdk.platformtools.ak.getContext().getSharedPreferences("auth_hold_prefs", 0).getBoolean("auth_ishold", false))
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(Process.myPid());
      z.e("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "sendImp hit push hold, pid:%d", arrayOfObject1);
      bk.Dm().post(new aq(this));
      return false;
    }
    this.dTj = SystemClock.elapsedRealtime();
    ak localak = bk.Dp().Dh();
    if (localak != null);
    try
    {
      a(localak, 3, 3);
      label182: return false;
    }
    catch (RemoteException localRemoteException)
    {
      break label182;
    }
  }

  public final void reset()
  {
    this.dTl.lock(1000L);
    new as(this).b(this.gQj);
  }

  public final byte[] rj()
  {
    be localbe = this.dTr;
    Object localObject = null;
    if (localbe != null);
    try
    {
      byte[] arrayOfByte = this.dTr.rj();
      localObject = arrayOfByte;
      return localObject;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public final void setHostInfo(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt)
  {
    this.dTl.lock(1000L);
    new ar(this, paramArrayOfString1, paramArrayOfString2, paramArrayOfInt).b(this.gQj);
  }

  public final void setNewDnsDebugHost(String paramString1, String paramString2)
  {
    if ((ch.jb(paramString1)) && (ch.jb(paramString2)))
    {
      z.d("!32@/B4Tb64lLpKdx3uu06WLRv6g+efXe4sb", "setNewDnsDebugHost FAILED ! check assist");
      return;
    }
    new ax(this, paramString1, paramString2).b(this.gQj);
  }

  public final void setSignallingStrategy(long paramLong1, long paramLong2)
  {
    Java2C.setSignallingStrategy(paramLong1, paramLong2);
  }

  public final void stopSignalling()
  {
    Java2C.stopSignalling();
  }

  public final boolean tx()
  {
    return this.dTi < 5;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.ao
 * JD-Core Version:    0.6.2
 */