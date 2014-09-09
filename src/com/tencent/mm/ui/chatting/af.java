package com.tencent.mm.ui.chatting;

import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.tencent.mm.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelvoice.bp;
import com.tencent.mm.modelvoice.bs;
import com.tencent.mm.modelvoice.c;
import com.tencent.mm.n;
import com.tencent.mm.o.p;
import com.tencent.mm.o.q;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ce;
import com.tencent.mm.sdk.platformtools.cf;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.base.en;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class af
  implements c, p, q, ce
{
  private static SensorController elX;
  private int dHr;
  private com.tencent.mm.o.o eNM;
  private cf emd;
  private long eme = -1L;
  private boolean emj = false;
  private boolean enJ = false;
  private boolean gYF;
  private List jmE;
  private long jmF = -1L;
  private cn jmG;
  private hd jmH;
  private cn jmI;
  private boolean jmJ;
  private boolean jmK = true;
  private g jmL = new ag(this);
  private cm jmM = new ai(this, Looper.getMainLooper());

  public af(hd paramhd, String paramString)
  {
    this.jmH = paramhd;
    if (elX == null)
      elX = new SensorController(paramhd.h().getApplicationContext());
    if (this.emd == null)
      this.emd = new cf(paramhd.h().getApplicationContext());
    Cc(paramString);
    a.aGB().a("RevokeMsg", this.jmL);
  }

  private void E(ar paramar)
  {
    if (paramar == null);
    do
    {
      return;
      if (bg.qW().isSDCardAvailable())
        break;
    }
    while (this.jmE.size() <= 0);
    this.jmE.clear();
    en.cp(this.jmH.h());
    return;
    int i = this.jmE.size();
    for (int j = 0; ; j++)
    {
      if (j >= i)
        break label93;
      if (((ar)this.jmE.get(j)).kk() == paramar.kk())
        break;
    }
    label93: if ((this.jmJ) || (this.jmE.size() == 0))
      this.jmE.add(paramar);
    z.d("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "add voice msg :" + this.jmE.size());
  }

  private void aUt()
  {
    int i = this.jmE.size();
    int j = 0;
    int k = -1;
    if (j < i)
      if (((ar)this.jmE.get(j)).kk() != this.jmF)
        break label101;
    label101: for (int m = j; ; m = k)
    {
      j++;
      k = m;
      break;
      if (k != -1)
        this.jmE.remove(k);
      z.d("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "remove voice msg : size = " + this.jmE.size());
      return;
    }
  }

  private void aUx()
  {
    z.d("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "stop play");
    as.AP("keep_app_silent");
    this.jmH.releaseWakeLock();
    aUt();
    if (this.jmE.isEmpty())
    {
      elX.aNC();
      this.emd.aNE();
    }
    this.jmH.aVZ().notifyDataSetChanged();
    this.jmF = -1L;
    aUy();
  }

  private void aUy()
  {
    if (this.jmI != null)
      this.jmI.dismiss();
  }

  private void qc(int paramInt)
  {
    while (true)
    {
      if (this.jmH == null)
        z.e("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "context is null");
      ar localar;
      do
      {
        fn localfn;
        do
        {
          return;
          localfn = this.jmH.aVZ();
          if (localfn == null)
          {
            z.e("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "add next failed: null adapter");
            return;
          }
          z.d("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "position : " + paramInt + "adapter getCount = " + localfn.getCount());
        }
        while ((paramInt < 0) || (paramInt >= localfn.getCount()));
        localar = (ar)localfn.getItem(paramInt);
      }
      while (localar == null);
      if ((localar.aJw()) && (localar.jK() == 0) && (!bs.k(localar)) && (!bs.l(localar)))
        E(localar);
      paramInt++;
    }
  }

  public final void Cc(String paramString)
  {
    this.jmE = new LinkedList();
    this.enJ = false;
    this.jmF = -1L;
    this.gYF = false;
    this.eme = -1L;
    this.jmJ = false;
    this.dHr = 0;
    if (y.dD(paramString))
    {
      this.dHr = 1;
      this.eNM = new com.tencent.mm.modelvoice.ac(this.jmH.h(), 1);
      return;
    }
    this.dHr = 0;
    this.eNM = new com.tencent.mm.modelvoice.ac(this.jmH.h(), 0);
  }

  public final void a(int paramInt, ar paramar)
  {
    if ((paramar == null) || (!paramar.aJw()));
    bp localbp;
    do
    {
      return;
      localbp = new bp(paramar.getContent());
    }
    while (((localbp.getTime() == 0L) && (paramar.jK() == 0)) || ((paramar.getStatus() == 1) && (paramar.jK() == 1)) || ((paramar.jK() == 0) && (localbp.getTime() == -1L)));
    aUo();
    Boolean localBoolean = (Boolean)bg.qW().oQ().get(4115);
    if ((localBoolean == null) || (!localBoolean.booleanValue()))
    {
      bg.qW().oQ().set(4115, Boolean.valueOf(true));
      aUy();
      this.jmI = en.a(this.jmH.h(), this.jmH.getString(n.bzM), 4000L);
    }
    if ((this.eNM.isPlaying()) && (paramar.kk() == this.jmF))
    {
      fh(true);
      return;
    }
    E(paramar);
    if ((paramar.jK() == 0) && (!bs.k(paramar)))
      qc(paramInt + 1);
    aUv();
  }

  public final void aUo()
  {
    z.d("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "clear play list");
    if (this.jmG != null)
      this.jmG.dismiss();
    this.jmE.clear();
  }

  public final void aUp()
  {
    this.jmK = false;
  }

  public final void aUq()
  {
    this.enJ = true;
    fh(true);
    aUo();
  }

  public final void aUr()
  {
    this.enJ = false;
    aUv();
  }

  public final void aUs()
  {
    if (!this.eNM.isPlaying())
      return;
    aUv();
  }

  public final long aUu()
  {
    return this.jmF;
  }

  public final void aUv()
  {
    while (true)
    {
      try
      {
        z.d("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "play next: size = " + this.jmE.size());
        if (this.jmE.size() <= 0)
        {
          this.jmM.sendEmptyMessageDelayed(0, 1000L);
          return;
        }
        long l1 = ((ar)this.jmE.get(0)).kn();
        int i = this.jmE.size();
        int j = 1;
        int k = 0;
        ar localar;
        String str1;
        String str2;
        if (j < i)
        {
          if (l1 > ((ar)this.jmE.get(j)).kn())
          {
            l2 = ((ar)this.jmE.get(j)).kn();
            m = j;
            continue;
          }
        }
        else
        {
          localar = (ar)this.jmE.get(k);
          if (localar == null)
            continue;
          if (localar == null)
            break label619;
          if ((localar.aJw()) || (localar.aJI()))
            continue;
          if (localar.getType() != -1879048190)
            break label607;
          n = 1;
          if (n != 0)
            continue;
          if (localar.getType() != -1879048189)
            break label613;
          i1 = 1;
          continue;
          Assert.assertTrue(bool);
          if (!elX.aND())
          {
            elX.a(this);
            aj localaj = new aj(this);
            if (this.emd.r(localaj))
              this.eme = 0L;
          }
          else
          {
            if ((bg.qW().isSDCardAvailable()) || (ap.jb(localar.kp())))
              continue;
            this.jmE.clear();
            en.cp(this.jmH.h());
            return;
          }
          this.eme = -1L;
          continue;
          if ((bg.qW().isSDCardAvailable()) && (this.jmH.aVY()))
          {
            if (this.jmG != null)
              this.jmG.dismiss();
            this.jmG = en.a(this.jmH.h(), h.Vu, this.jmH.getString(n.byo));
          }
          as.AO("keep_app_silent");
          bs.m(localar);
          this.eNM.stop();
          this.jmH.acquireWakeLock();
          z.v("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "startPlay isSpeakOn:" + this.gYF);
          bg.qY().K(this.gYF);
          str1 = localar.kp();
          if (this.dHr == 1)
          {
            str2 = com.tencent.mm.plugin.voicereminder.a.o.A(str1, false);
            if (this.eNM.a(str2, this.gYF, true, -1))
            {
              this.eNM.a(this);
              this.eNM.a(this);
              this.jmF = localar.kk();
              this.jmH.aVZ().notifyDataSetChanged();
            }
          }
          else
          {
            str2 = bs.gP(str1);
            continue;
          }
          this.jmF = -1L;
          Toast.makeText(this.jmH.h(), this.jmH.getString(n.bzX), 0).show();
          continue;
        }
        long l2 = l1;
        int m = k;
        continue;
        return;
        j++;
        k = m;
        l1 = l2;
        continue;
        if (i1 == 0)
          break label619;
        bool = true;
        continue;
      }
      catch (Exception localException)
      {
        return;
      }
      label607: int n = 0;
      continue;
      label613: int i1 = 0;
      continue;
      label619: boolean bool = false;
    }
  }

  public final void aUw()
  {
    if ((this.eNM != null) && (this.eNM.isPlaying()))
    {
      this.eNM.U(this.gYF);
      bg.qY().K(this.gYF);
    }
  }

  public final void au(boolean paramBoolean)
  {
    boolean bool = true;
    z.d("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "isON:" + paramBoolean + "  hasSkip:" + this.emj + " tick:" + ap.ad(this.eme) + "  lt:" + this.eme);
    if (this.emj)
      if (!paramBoolean)
        this.emj = bool;
    do
    {
      do
      {
        return;
        bool = false;
        break;
        if (this.jmH == null)
        {
          elX.aNC();
          return;
        }
        if ((!paramBoolean) && (this.eme != -1L) && (ap.ad(this.eme) > 400L))
        {
          this.emj = bool;
          return;
        }
        this.emj = false;
      }
      while (this.eNM.ta());
      if (this.jmH.aVY())
      {
        this.gYF = false;
        if (this.jmF != -1L)
          this.jmH.av(paramBoolean);
        while (true)
        {
          aUw();
          return;
          this.jmH.av(bool);
        }
      }
    }
    while (this.jmF == -1L);
    this.jmH.av(paramBoolean);
    new ay(new ak(this, paramBoolean), false).cP(50L);
  }

  public final void b(int paramInt, ar paramar)
  {
    if (paramar == null)
      return;
    aUo();
    Boolean localBoolean = (Boolean)bg.qW().oQ().get(4115);
    if ((localBoolean == null) || (!localBoolean.booleanValue()))
    {
      bg.qW().oQ().set(4115, Boolean.valueOf(true));
      aUy();
      this.jmI = en.a(this.jmH.h(), this.jmH.getString(n.bzM), 4000L);
    }
    if ((this.eNM.isPlaying()) && (paramar.kk() == this.jmF))
    {
      fh(true);
      return;
    }
    E(paramar);
    if ((paramar.jK() == 0) && (!bs.k(paramar)))
      qc(paramInt + 1);
    aUv();
  }

  public final void c(int paramInt, ar paramar)
  {
    if (paramar == null)
      return;
    aUo();
    Boolean localBoolean = (Boolean)bg.qW().oQ().get(4115);
    if ((localBoolean == null) || (!localBoolean.booleanValue()))
    {
      bg.qW().oQ().set(4115, Boolean.valueOf(true));
      aUy();
      this.jmI = en.a(this.jmH.h(), this.jmH.getString(n.bzM), 4000L);
    }
    if ((this.eNM.isPlaying()) && (paramar.kk() == this.jmF))
    {
      fh(true);
      return;
    }
    E(paramar);
    if ((paramar.jK() == 0) && (!bs.k(paramar)))
      qc(paramInt + 1);
    aUv();
  }

  public final void d(int paramInt, ar paramar)
  {
    if (paramar == null)
      return;
    aUo();
    Boolean localBoolean = (Boolean)bg.qW().oQ().get(4115);
    if ((localBoolean == null) || (!localBoolean.booleanValue()))
    {
      bg.qW().oQ().set(4115, Boolean.valueOf(true));
      aUy();
      this.jmI = en.a(this.jmH.h(), this.jmH.getString(n.bzM), 4000L);
    }
    if ((this.eNM.isPlaying()) && (paramar.kk() == this.jmF))
    {
      fh(true);
      return;
    }
    E(paramar);
    if ((paramar.jK() == 0) && (!bs.k(paramar)))
      qc(paramInt + 1);
    aUv();
  }

  public final void ff(boolean paramBoolean)
  {
    this.jmJ = paramBoolean;
    aUo();
  }

  public final void fg(boolean paramBoolean)
  {
    this.gYF = paramBoolean;
  }

  public final void fh(boolean paramBoolean)
  {
    z.d("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "stop play");
    as.AP("keep_app_silent");
    this.eNM.stop();
    this.jmH.releaseWakeLock();
    aUt();
    if (this.jmE.isEmpty())
    {
      elX.aNC();
      this.emd.aNE();
    }
    if (paramBoolean)
      this.jmH.aVZ().notifyDataSetChanged();
    this.jmF = -1L;
    aUy();
  }

  public final boolean isPlaying()
  {
    return this.eNM.isPlaying();
  }

  public final void j(ar paramar)
  {
    if ((this.jmK) && (this.jmE.isEmpty()));
    do
    {
      do
        return;
      while ((paramar == null) || (!paramar.aJw()) || (paramar.jK() == 1) || (paramar.kt() == null) || (!paramar.kt().equals(this.jmH.aUL())) || (!bg.qX().tv()) || (this.jmH.isFinishing()));
      if (bs.l(paramar))
      {
        z.e("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "should not in this route");
        return;
      }
      E(paramar);
    }
    while ((this.enJ) || (this.eNM.isPlaying()) || (!ap.S(this.jmH.h())));
    aUv();
  }

  public final void mj()
  {
    z.v("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "voice play error");
    fh(true);
    aUv();
  }

  public final boolean mw()
  {
    return this.gYF;
  }

  public final void onDestroy()
  {
    release();
    this.jmH = null;
    a.aGB().b("RevokeMsg", this.jmL);
  }

  public final void release()
  {
    if (this.emd != null)
      this.emd.aNE();
  }

  public final void te()
  {
    z.v("!32@/B4Tb64lLpL9Gof3mk3dZYc6k4ntmNaS", "voice play completion isSpeakOn " + this.gYF);
    if (this.jmH != null)
    {
      aUx();
      this.jmH.releaseWakeLock();
      aUv();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.af
 * JD-Core Version:    0.6.2
 */