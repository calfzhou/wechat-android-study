package com.tencent.mm.o;

import android.os.Looper;
import com.tencent.mm.network.r;
import com.tencent.mm.network.v;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import junit.framework.Assert;

public final class ac
  implements m
{
  private static ac doP = null;
  private static int doY = 1;
  private am dkN = null;
  private r doQ;
  private Vector doR = new Vector();
  private Vector doS = new Vector();
  private final Map doT = new HashMap();
  private final ak doU;
  private long doV = 21600000L;
  private boolean doW = false;
  private ay doX = new ay(Looper.getMainLooper(), new ad(this), true);
  private boolean foreground = false;
  private final cm gQj = new ae(this, Looper.getMainLooper());
  private final Object lock = new Object();

  private ac(ak paramak)
  {
    this.doU = paramak;
  }

  public static ac a(ak paramak)
  {
    if (doP == null)
      doP = new ac(paramak);
    return doP;
  }

  private void a(x paramx, int paramInt)
  {
    z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "doSceneImp start: type=" + paramx.getType() + " id=" + paramx.hashCode() + " cur_running_cnt=" + this.doR.size() + " cur_waiting_cnt=" + this.doS.size());
    if ((tB()) && (this.doQ != null))
      z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "run: type=" + paramx.getType() + " id=" + paramx.hashCode() + " cur_running_cnt=" + this.doR.size());
    label332: 
    do
    {
      while (true)
      {
        synchronized (this.lock)
        {
          this.doR.add(paramx);
          z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "runningQueue_size=" + this.doR.size());
          this.dkN.n(new ag(this, paramx));
          if (this.doQ != null)
            break;
          if (this.doU != null)
            break label332;
          z.e("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "prepare dispatcher failed, null queue idle");
          return;
        }
        z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "waited: type=" + paramx.getType() + " id=" + paramx.hashCode() + " cur_waiting_cnt=" + this.doS.size());
        synchronized (this.lock)
        {
          this.doS.add(paramx);
          z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "waitingQueue_size = " + this.doS.size());
        }
      }
      new ay(Looper.getMainLooper(), new aj(this), true).cP(100 * doY);
    }
    while (doY >= 512);
    doY = 2 * doY;
    return;
    doY = 1;
  }

  private void b(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    this.gQj.post(new ai(this, paramx, paramInt1, paramInt2, paramString));
  }

  private boolean e(x paramx)
  {
    int i = paramx.getType();
    switch (i)
    {
    default:
    case 10:
    case 24:
    case 37:
    case 38:
    case 39:
    case 133:
    case 159:
    case 214:
    case 400:
    case 522:
    }
    while (true)
    {
      return true;
      synchronized (this.lock)
      {
        Iterator localIterator1 = this.doR.iterator();
        while (localIterator1.hasNext())
        {
          x localx2 = (x)localIterator1.next();
          if (localx2.getType() == i)
          {
            z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "forbid in running: type=" + paramx.getType() + " id=" + paramx.hashCode() + " cur_running_cnt=" + this.doR.size());
            if (paramx.b(localx2))
              return true;
            if (paramx.a(localx2))
            {
              z.e("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "forbid in running diagnostic: type=" + paramx.getType() + " id=" + paramx.hashCode() + " cur_running_cnt=" + this.doR.size() + " ---" + localx2.hashCode());
              if (!this.foreground)
              {
                z.e("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "forbid in running diagnostic: type=" + paramx.getType() + "acinfo[" + localx2.getInfo() + "] scinfo[" + paramx.getInfo() + "]");
                z.appenderFlush();
                Assert.assertTrue("NetsceneQueue forbid in running diagnostic: type=" + paramx.getType(), false);
              }
              c(localx2);
              return true;
            }
            return false;
          }
        }
        Iterator localIterator2 = this.doS.iterator();
        x localx1;
        do
        {
          if (!localIterator2.hasNext())
            break;
          localx1 = (x)localIterator2.next();
        }
        while (localx1.getType() != i);
        z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "forbid in waiting: type=" + paramx.getType() + " id=" + paramx.hashCode() + " cur_waiting_cnt=" + this.doS.size());
        if (paramx.b(localx1))
          return true;
        if (paramx.a(localx1))
        {
          z.e("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "forbid in waiting diagnostic: type=" + paramx.getType() + " id=" + paramx.hashCode() + " cur_waiting_cnt=" + this.doS.size());
          if (!this.foreground)
          {
            z.appenderFlush();
            Assert.assertTrue("NetsceneQueue forbid in waiting diagnostic: type=" + paramx.getType(), false);
          }
          c(localx1);
          return true;
        }
        return false;
      }
    }
  }

  private void tA()
  {
    while (true)
    {
      int j;
      synchronized (this.lock)
      {
        if (this.doS.size() > 0)
        {
          x localx1 = (x)this.doS.get(0);
          int i = localx1.getPriority();
          j = 1;
          k = i;
          localObject3 = localx1;
          if (j < this.doS.size())
          {
            if (((x)this.doS.get(j)).getPriority() > k)
            {
              this.doS.get(j);
              if (tB())
              {
                x localx2 = (x)this.doS.get(j);
                int n = localx2.getPriority();
                localObject4 = localx2;
                m = n;
                break label187;
              }
            }
          }
          else
          {
            this.doS.remove(localObject3);
            z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "waiting2running waitingQueue_size = " + this.doS.size());
            a((x)localObject3, 0);
          }
        }
        else
        {
          return;
        }
      }
      int m = k;
      Object localObject4 = localObject3;
      label187: j++;
      Object localObject3 = localObject4;
      int k = m;
    }
  }

  private boolean tB()
  {
    return this.doR.size() < 20;
  }

  public final void W(boolean paramBoolean)
  {
    this.doW = paramBoolean;
    if (!this.doW)
    {
      this.doX.aNu();
      return;
    }
    z.e("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "the working process is ready to be killed");
    this.doX.cP(this.doV);
  }

  public final void X(boolean paramBoolean)
  {
    this.foreground = paramBoolean;
    if (this.doQ == null)
    {
      z.e("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "setForeground autoAuth  == null");
      return;
    }
    this.doQ.Y(paramBoolean);
    b.X(paramBoolean);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    paramx.V(true);
    int i = paramx.getType();
    z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "doSceneImp end: type=" + i + " id=" + paramx.hashCode() + " [" + paramInt1 + "," + paramInt2 + "]  cur_running_cnt=" + this.doR.size() + " cur_waiting_cnt=" + this.doS.size() + " errMsg = " + paramString);
    synchronized (this.lock)
    {
      this.doR.remove(paramx);
      z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "runningQueue_size = " + this.doR.size());
      tA();
      b(paramInt1, paramInt2, paramString, paramx);
      if ((this.doW) && (this.doR.isEmpty()) && (this.doS.isEmpty()))
        this.doX.cP(this.doV);
      return;
    }
  }

  public final void a(int paramInt, m paramm)
  {
    synchronized (this.doT)
    {
      if (!this.doT.containsKey(Integer.valueOf(paramInt)))
        this.doT.put(Integer.valueOf(paramInt), new HashSet());
      if (!((Set)this.doT.get(Integer.valueOf(paramInt))).contains(paramm))
        ((Set)this.doT.get(Integer.valueOf(paramInt))).add(paramm);
      return;
    }
  }

  public final void a(am paramam)
  {
    this.dkN = paramam;
  }

  public final void b(int paramInt, m paramm)
  {
    try
    {
      synchronized (this.doT)
      {
        if (this.doT.get(Integer.valueOf(paramInt)) != null)
          ((Set)this.doT.get(Integer.valueOf(paramInt))).remove(paramm);
        label46: return;
      }
    }
    catch (Exception localException)
    {
      break label46;
    }
  }

  public final void b(r paramr)
  {
    this.doQ = paramr;
    tA();
  }

  public final void c(x paramx)
  {
    if (paramx == null)
      return;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramx.hashCode());
    z.b("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "cancel sceneHashCode:%d", arrayOfObject);
    paramx.cancel();
    synchronized (this.lock)
    {
      this.doS.remove(paramx);
      this.doR.remove(paramx);
      return;
    }
  }

  public final void cancel(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.b("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "cancel sceneHashCode:%d", arrayOfObject);
    this.dkN.n(new af(this, paramInt));
  }

  public final boolean d(x paramx)
  {
    Assert.assertTrue(true);
    if (this.dkN != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("worker thread has not been set", bool);
      if (e(paramx))
        break;
      return false;
    }
    a(paramx, 0);
    return true;
  }

  public final String getNetworkServerIp()
  {
    if (this.doQ != null)
      return this.doQ.getNetworkServerIp();
    return "unknown";
  }

  public final void reset()
  {
    if (this.doQ != null)
      this.doQ.reset();
    ty();
    Vector localVector = this.doS;
    this.doS = new Vector();
    Iterator localIterator = localVector.iterator();
    while (localIterator.hasNext())
    {
      x localx = (x)localIterator.next();
      z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "reset::cancel scene " + localx.getType());
      localx.cancel();
      b(3, -1, "doScene failed clearWaitingQueue", localx);
    }
    localVector.clear();
  }

  public final r rk()
  {
    return this.doQ;
  }

  public final boolean tv()
  {
    return this.foreground;
  }

  public final int tw()
  {
    try
    {
      if ((this.doQ != null) && (this.doQ.tF() != null))
        return this.doQ.tF().CX();
      z.e("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "[arthurdan.getNetworkStatus] Notice!!! autoAuth and autoAuth.getNetworkEvent() is null!!!!");
      label42: if (bc.by(com.tencent.mm.sdk.platformtools.ak.getContext()))
        return 1;
      return 0;
    }
    catch (Exception localException)
    {
      break label42;
    }
  }

  public final boolean tx()
  {
    if (this.doQ != null)
      return this.doQ.tx();
    return true;
  }

  public final void ty()
  {
    Vector localVector = this.doR;
    this.doR = new Vector();
    Iterator localIterator = localVector.iterator();
    while (localIterator.hasNext())
    {
      x localx = (x)localIterator.next();
      z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "reset::cancel scene " + localx.getType());
      localx.cancel();
      b(3, -1, "doScene failed clearRunningQueue", localx);
    }
    localVector.clear();
  }

  public final void tz()
  {
    z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "resetDispatcher");
    if (this.doQ != null)
    {
      this.doQ.reset();
      this.doQ = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.ac
 * JD-Core Version:    0.6.2
 */