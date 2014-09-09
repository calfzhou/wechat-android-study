package com.tencent.mm.y;

import android.net.TrafficStats;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.tencent.mm.c.a.gt;
import com.tencent.mm.c.a.gu;
import com.tencent.mm.c.a.j;
import com.tencent.mm.c.a.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import java.util.Stack;

public final class a extends g
  implements i
{
  private c dwF;
  private Stack dwG;
  private long dwH = 0L;
  private int dwI = 0;
  private boolean dwJ = false;
  private long dwK = 0L;
  private int dwL = 0;
  private boolean dwM = false;
  private long dwN = 0L;
  private long dwO = 0L;
  private int dwP;
  private int dwQ;
  private ay dwR = new ay(new b(this), false);

  public a(Looper paramLooper)
  {
    super(0);
    this.dwF = new c(this, paramLooper);
    this.dwG = new Stack();
    this.dwP = Process.myUid();
    this.dwQ = xE();
    com.tencent.mm.sdk.c.a.aGB().a("PauseAutoGetBigImg", this);
    com.tencent.mm.sdk.c.a.aGB().a("AutoGetBigImgOccChanged", this);
  }

  private static int xE()
  {
    Integer localInteger = (Integer)bg.qW().oQ().get(327681);
    if ((localInteger == null) || (3 == localInteger.intValue()))
      return 1;
    return localInteger.intValue();
  }

  private boolean xF()
  {
    if (this.dwQ == 0)
      this.dwQ = xE();
    if (2 == this.dwQ)
    {
      z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "user don't want to get image automatically");
      return false;
    }
    boolean bool = bc.bP(ak.getContext());
    if (4 == this.dwQ)
    {
      z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "always to download image automatically");
      return true;
    }
    if ((1 == this.dwQ) && (bool))
    {
      z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "use wifi to download image automatically");
      return true;
    }
    z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "don't allow to download image automatcially");
    return false;
  }

  public final void N(long paramLong)
  {
    if (!xF())
      return;
    synchronized (this.dwG)
    {
      if (this.dwG.size() >= 100)
        this.dwG.remove(0);
      this.dwG.push(Long.valueOf(paramLong));
      this.dwK = System.currentTimeMillis();
      start();
      return;
    }
  }

  public final void X(boolean paramBoolean)
  {
    z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "is foreground: " + paramBoolean);
    this.dwJ = paramBoolean;
    this.dwK = System.currentTimeMillis();
  }

  public final void a(int paramInt1, Object paramObject, int paramInt2, int paramInt3, x paramx)
  {
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
      z.e("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "img " + paramLong1 + " download failed");
    while (true)
    {
      this.dwH = 0L;
      if (!xF())
        z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "don't allow auto download, clear task list");
      synchronized (this.dwG)
      {
        this.dwG.clear();
        return;
        z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "img " + paramLong1 + " has been downloaded");
      }
    }
    this.dwO = TrafficStats.getUidTxBytes(this.dwP);
    this.dwR.cP(1000L);
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    int j;
    if (parame.getId().equals("PauseAutoGetBigImg"))
    {
      gt localgt = (gt)parame;
      int i = this.dwL;
      if (localgt.cLK.tn)
      {
        j = 1;
        this.dwL = (j + i);
        if (this.dwL < 0)
        {
          this.dwL = 0;
          z.e("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "mPauseCnt < 0");
        }
        z.i("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "req pause: " + localgt.cLK.tn + " count:" + this.dwL);
        start();
      }
    }
    do
    {
      do
      {
        return false;
        j = -1;
        break;
      }
      while (!parame.getId().equals("AutoGetBigImgOccChanged"));
      this.dwQ = ((j)parame).cHn.mode;
      z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "mode = " + this.dwQ);
    }
    while (xF());
    synchronized (this.dwG)
    {
      this.dwG.clear();
      return false;
    }
  }

  public final void b(long paramLong, Object paramObject)
  {
    z.i("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "img " + paramLong + " has been canceled");
  }

  public final void dO(int paramInt)
  {
    z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "chattingMaskResId change from " + this.dwI + " to " + paramInt);
    this.dwI = paramInt;
  }

  public final void detach()
  {
    synchronized (this.dwG)
    {
      this.dwG.clear();
      this.dwH = 0L;
      ap.yh().a(this);
      com.tencent.mm.sdk.c.a.aGB().b("PauseAutoGetBigImg", this);
      com.tencent.mm.sdk.c.a.aGB().b("AutoGetBigImgOccChanged", this);
      return;
    }
  }

  public final void handleMessage(Message paramMessage)
  {
    if (1 == paramMessage.what)
    {
      if ((!this.dwJ) && (System.currentTimeMillis() - this.dwK > 1200000L))
        z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "running to long in blackground");
    }
    else
      return;
    if ((this.dwH != 0L) || (this.dwG.size() <= 0) || (this.dwL != 0) || (this.dwM))
    {
      z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "curMsgId: " + this.dwH + " size: " + this.dwG.size() + " cnt: " + this.dwL + " pauseOnMonitor: " + this.dwM);
      return;
    }
    ar localar;
    l locall;
    synchronized (this.dwG)
    {
      this.dwH = ((Long)this.dwG.pop()).longValue();
      localar = bg.qW().oV().cV(this.dwH);
      locall = ap.yg().S(localar.kl());
      if (locall.xT() == 1)
      {
        z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", this.dwH + " already has hd thumb");
        this.dwH = 0L;
        start();
        return;
      }
    }
    z.d("!44@/B4Tb64lLpIIg7zAXvxzP2DKDVA2S8s32QCNeB5uDSg=", "start download " + this.dwH);
    ap.yh().a(locall.xM(), localar.kk(), Long.valueOf(this.dwH), this.dwI, this);
  }

  public final void start()
  {
    this.dwF.sendEmptyMessage(1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.a
 * JD-Core Version:    0.6.2
 */