package com.tencent.mm.ui.tools;

import android.graphics.Bitmap;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.tencent.mm.ak.m;
import com.tencent.mm.ak.p;
import com.tencent.mm.ak.q;
import com.tencent.mm.ak.r;
import com.tencent.mm.ak.t;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.bm;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.VideoView;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.chatting.na;
import com.tencent.mm.ui.chatting.ne;
import com.tencent.mm.ui.video.VideoPlayerUI;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;

public final class dm extends s
  implements t, az
{
  public static boolean jqP = false;
  private ay dWw;
  private HashMap jSE = new HashMap();
  private g jSF;
  private final SparseArray jSG = new SparseArray();

  public dm(bt parambt)
  {
    super(parambt);
    m.AL().a(this, Looper.getMainLooper());
    f localf = a.aGB();
    na localna = new na(ne.jvx, parambt.jQK);
    this.jSF = localna;
    localf.a("RevokeMsg", localna);
    this.dWw = new ay(this, true);
  }

  private void a(ar paramar, q paramq)
  {
    if ((!bm.ab(this.jOZ.jQK.aPI())) && (!jqP))
    {
      com.tencent.mm.ui.base.e.a(this.jOZ.jQK.aPI(), com.tencent.mm.n.cnT, com.tencent.mm.n.buo, new dn(this, paramar, paramq), null);
      return;
    }
    b(paramar, paramq);
  }

  private void a(ar paramar, q paramq, int paramInt)
  {
    String str = m.AL().ib(paramar.kp());
    boolean bool = p.hS(str);
    if (paramar.aJL())
      Toast.makeText(this.jOZ.jQK, com.tencent.mm.n.cnU, 0).show();
    dp localdp;
    do
    {
      do
      {
        return;
        localdp = qM(paramInt);
      }
      while (localdp == null);
      if ((paramq.AX() != 0) || (bool))
        break;
    }
    while ((com.tencent.mm.compatible.c.v.dNG.dMU == 1) && (VideoPlayerUI.a(paramq.getFileName(), this.jOZ.jQK.aPI(), bool)));
    localdp.gg(true);
    if ((localdp.baD().jSP.aTz() != null) && (localdp.baD().jSP.aTz().equals(str)) && (!localdp.baD().jSP.aTC()))
    {
      localdp.baD().jSP.start();
      this.dWw.cP(300L);
      this.jSG.put(paramInt, paramq);
      this.jOZ.jQK.gf(false);
    }
    while (true)
    {
      localdp.baD().jSQ.setVisibility(8);
      return;
      localdp.baD().jSP.BT(str);
      localdp.baD().jSP.start();
      break;
      if (!VideoPlayerUI.a(paramq.getFileName(), this.jOZ.jQK.aPI(), bool))
        Toast.makeText(this.jOZ.jQK.aPI(), this.jOZ.jQK.getString(com.tencent.mm.n.coa), 0).show();
    }
  }

  private void a(dp paramdp)
  {
    if (paramdp == null)
      return;
    if (paramdp.baD().jSP.isPlaying())
      paramdp.baD().jSP.pause();
    this.dWw.aNu();
  }

  private boolean a(do paramdo)
  {
    if (paramdo == null)
      return false;
    m.AL().a(this);
    if (this.jOZ.jQK.W() == paramdo.pos)
    {
      dp localdp = qM(paramdo.pos);
      if (localdp != null)
        localdp.baD().jSQ.setVisibility(8);
      this.jOZ.jQK.bf(true);
      this.jOZ.jQK.bas();
      return true;
    }
    bt localbt = this.jOZ;
    int i = paramdo.pos;
    localbt.jQQ.qN(i);
    return false;
  }

  public static q aj(ar paramar)
  {
    if (!bt.ad(paramar))
      return null;
    return com.tencent.mm.ak.v.ij(paramar.kp());
  }

  private void b(ar paramar, q paramq)
  {
    if ((paramar == null) || (paramq == null));
    dp localdp;
    do
    {
      return;
      com.tencent.mm.ak.v.ii(paramar.kp());
      m.AL().a(this, Looper.getMainLooper());
      localdp = this.jOZ.bah();
    }
    while (localdp == null);
    this.jOZ.jQK.bf(false);
    localdp.baD().jSQ.setVisibility(0);
    localdp.baD().jSQ.setProgress(com.tencent.mm.ak.v.e(paramq));
  }

  public final String a(int paramInt, q paramq)
  {
    if (paramq == null)
      paramq = aj(this.jOZ.qP(paramInt));
    if (paramq == null)
      return null;
    return ap.eY(paramq.AU());
  }

  public final boolean a(dp paramdp, ar paramar, int paramInt)
  {
    super.a(paramdp, paramar, paramInt);
    q localq = aj(paramar);
    if (paramar == null)
      z.e("!56@/B4Tb64lLpLBmJVf7YIa+Q0DySMF8OO+9EtK5+9xHvkINcgFGS8a+w==", "msg is null!!");
    while (true)
    {
      return false;
      if (this.jSE != null)
        this.jSE.put(paramar.kp(), new do(paramar, paramInt));
      while (localq != null)
      {
        Bitmap localBitmap = com.tencent.mm.sdk.platformtools.e.c(m.AL().ic(paramar.kp()), 1.0F);
        if (paramdp.baD().jSP.isPlaying())
          paramdp.baD().jSP.stopPlayback();
        paramdp.baD().jSQ.setVisibility(8);
        paramdp.gg(false);
        paramdp.baD().jSO.setImageBitmap(localBitmap);
        return true;
        z.e("!56@/B4Tb64lLpLBmJVf7YIa+Q0DySMF8OO+9EtK5+9xHvkINcgFGS8a+w==", "mCacheMap is null!");
      }
    }
  }

  public final void baA()
  {
    SparseArray localSparseArray = this.jOZ.aSY();
    for (int i = 0; i < localSparseArray.size(); i++)
    {
      int j = localSparseArray.keyAt(i);
      if ((localSparseArray.get(j) != null) && (((View)localSparseArray.get(j)).getTag() != null))
      {
        dp localdp = (dp)((View)localSparseArray.get(j)).getTag();
        if ((localdp.baD().jSN.getVisibility() == 0) && (localdp.baD().jSP.getVisibility() == 0) && (localdp != null))
        {
          localdp.baD().jSQ.setVisibility(8);
          localdp.baD().jSP.stopPlayback();
          localdp.gg(false);
        }
      }
    }
    this.dWw.aNu();
    this.jSG.clear();
  }

  public final void c(ar paramar, int paramInt)
  {
    if (paramar == null)
      break label4;
    while (true)
    {
      label4: return;
      if (bt.ad(paramar))
      {
        q localq = aj(paramar);
        if (localq == null)
          break;
        if (this.jOZ.jQK.bat())
        {
          a(qM(paramInt));
          this.jOZ.jQK.gf(true);
          return;
        }
        if (!bg.qW().isSDCardAvailable())
        {
          en.cp(this.jOZ.jQK.aPI());
          return;
        }
        if (paramar.jK() == 0)
        {
          if ((localq.getStatus() != 113) && (localq.getStatus() != 198))
            break label126;
          a(paramar, localq);
        }
        while (paramar.jK() == 1)
        {
          a(paramar, localq, paramInt);
          return;
          label126: if (localq.getStatus() == 199)
            a(paramar, localq, paramInt);
          if (localq.getStatus() == 111)
            a(paramar, localq);
          if (localq.getStatus() == 112)
            a(paramar, localq);
        }
      }
    }
  }

  public final void detach()
  {
    this.dWw.aNu();
    a.aGB().b("RevokeMsg", this.jSF);
    baA();
    super.detach();
    this.jSE.clear();
    this.jSE = null;
    m.AL().a(this);
    this.jSG.clear();
  }

  public final void eX(String paramString)
  {
    if ((ap.jb(paramString)) || (this.jSE == null));
    dp localdp;
    do
    {
      return;
      do localdo;
      ar localar;
      q localq;
      int i;
      while ((i < localdp.baD().jSQ.getMax()) || (!a(localdo)))
      {
        do
        {
          do
          {
            do
            {
              do
                localdo = (do)this.jSE.get(paramString);
              while (localdo == null);
              localar = localdo.cCp;
            }
            while ((localar == null) || (localar.kp() == null) || (!localar.kp().equals(paramString)));
            localq = aj(localar);
          }
          while (localq == null);
          if ((!localar.aJL()) && (localq.getStatus() != 198))
            break;
        }
        while (!a(localdo));
        Toast.makeText(this.jOZ.jQK, com.tencent.mm.n.cnU, 0).show();
        return;
        i = com.tencent.mm.ak.v.e(localq);
        localdp = qM(localdo.pos);
        if ((this.jOZ.jQK.W() != localdo.pos) || (localdp == null))
          break;
        this.jOZ.jQK.bf(false);
        localdp.baD().jSQ.setVisibility(0);
        localdp.baD().jSQ.setProgress(i);
      }
      a(localar, localq, this.jOZ.jQK.W());
      return;
    }
    while (localdp != null);
  }

  public final boolean kJ()
  {
    dp localdp = this.jOZ.bah();
    if (localdp == null)
      return false;
    if (localdp.baD().jSN.getVisibility() != 0)
      return false;
    int i = this.jOZ.jQK.W();
    q localq = (q)this.jSG.get(i);
    if (localq == null)
    {
      this.jOZ.jQK.Do(a(i, localq));
      rh(i);
      return false;
    }
    if (!localdp.baD().jSP.isPlaying())
    {
      this.jOZ.jQK.Do(a(i, localq));
      rh(i);
      return false;
    }
    int j = Math.max(0, -1 + (localq.AU() - localdp.baD().jSP.getCurrentPosition() / 1000));
    this.jOZ.jQK.Do(ap.eY(j));
    return true;
  }

  public final void pause(int paramInt)
  {
    a(qM(paramInt));
    this.jOZ.jQK.gf(true);
  }

  public final void rh(int paramInt)
  {
    this.jSG.remove(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.dm
 * JD-Core Version:    0.6.2
 */