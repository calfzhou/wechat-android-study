package com.tencent.mm.ui.player;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.model.an;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.pluginsdk.r;
import com.tencent.mm.pluginsdk.s;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.musicplayer.MusicPlayerUI;
import com.tencent.mm.pluginsdk.ui.musicplayer.q;
import com.tencent.mm.protocal.a.rt;
import com.tencent.mm.protocal.a.tb;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.y.ap;

public class MainMusicPlayerUI extends MusicPlayerUI
  implements m
{
  private final String TAG = "!44@/B4Tb64lLpKonzmIA9mIAHSkogrEXNfFBPqtq2ZixFE=";
  private com.tencent.mm.ac.a jKp;

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    int i;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      aDd().inj = ai.b(this.jKp.yD());
      if (ch.jb(aDd().inj))
        i = 0;
    }
    while (true)
    {
      if (i != 0)
      {
        com.tencent.mm.plugin.f.c.n.fTF.q(10911, "0");
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = aDd().inj;
        z.d("!44@/B4Tb64lLpKonzmIA9mIAHSkogrEXNfFBPqtq2ZixFE=", "ok get lyric: %s", arrayOfObject2);
      }
      while (true)
      {
        int j = 0;
        if (i != 0)
          j = 8;
        mW(j);
        return;
        bg.ii().bX(aDd().inj);
        c(bg.ii().la());
        aae();
        i = 1;
        break;
        com.tencent.mm.plugin.f.c.n.fTF.q(10911, "2");
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(paramInt1);
        arrayOfObject1[1] = Integer.valueOf(paramInt2);
        z.d("!44@/B4Tb64lLpKonzmIA9mIAHSkogrEXNfFBPqtq2ZixFE=", "error get errType: %d, errCode: %d", arrayOfObject1);
      }
      i = 0;
    }
  }

  protected final void a(CdnImageView paramCdnImageView, tb paramtb)
  {
    if ((aDd() == null) || (aDd().imY == 4))
      g.axQ().a(paramCdnImageView, g.axQ().ajz(), paramtb.ine, paramtb.inc);
    rt localrt;
    do
    {
      Bitmap localBitmap3;
      do
      {
        do
        {
          Bitmap localBitmap4;
          do
          {
            do
            {
              Bitmap localBitmap5;
              do
              {
                do
                {
                  return;
                  if ((bg.ii().kQ() == null) || (bg.ii().kP() != 0))
                    break;
                }
                while (!bg.qW().isSDCardAvailable());
                localBitmap5 = ap.yg().a(bg.ii().kp(), com.tencent.mm.aq.a.getDensity(this), false);
              }
              while (localBitmap5 == null);
              paramCdnImageView.setImageBitmap(localBitmap5);
              return;
              if ((bg.ii().kQ() == null) || (bg.ii().kP() != 5))
                break;
            }
            while (!bg.qW().isSDCardAvailable());
            localBitmap4 = ap.yg().b(bg.ii().kp(), com.tencent.mm.aq.a.getDensity(this), false);
          }
          while (localBitmap4 == null);
          paramCdnImageView.setImageBitmap(localBitmap4);
          return;
          if ((bg.ii().kQ() == null) || (bg.ii().kP() != 6))
            break;
        }
        while (!bg.qW().isSDCardAvailable());
        localBitmap3 = ap.yg().b(bg.ii().kp(), com.tencent.mm.aq.a.getDensity(this), false);
      }
      while (localBitmap3 == null);
      paramCdnImageView.setImageBitmap(localBitmap3);
      return;
      if ((bg.ii().kQ() != null) && (bg.ii().kP() == 7))
      {
        Bitmap localBitmap2 = ap.yg().b(bg.ii().kp(), com.tencent.mm.aq.a.getDensity(this), false);
        if (localBitmap2 != null)
        {
          paramCdnImageView.setImageBitmap(localBitmap2);
          return;
        }
        paramCdnImageView.bf(paramtb.ine, bg.ii().kp());
        return;
      }
      localrt = new rt();
      localrt.hPl = aDd().hQq;
      localrt.ihJ = aDd().ine;
      localrt.ihK = aDd().inm;
      localrt.hOh = localrt.ihJ;
    }
    while (am.ayg() == null);
    Bitmap localBitmap1 = am.ayg().a(localrt, paramCdnImageView, hashCode());
    if (localBitmap1 == null)
    {
      am.ayg().W(paramCdnImageView);
      am.ayg().c(localrt, paramCdnImageView, hashCode());
      return;
    }
    paramCdnImageView.setImageBitmap(localBitmap1);
  }

  protected final boolean aDb()
  {
    return false;
  }

  protected final void aDc()
  {
    new Thread(new a(this)).start();
  }

  protected final void aN(byte[] paramArrayOfByte)
  {
    if (bg.ii().la() != null)
      c(bg.ii().la());
  }

  protected final String ajO()
  {
    return aDd().inl;
  }

  protected final int ajT()
  {
    return q.hGQ;
  }

  protected final boolean ajU()
  {
    if (aDd() == null);
    tb localtb;
    do
    {
      do
        return false;
      while (bg.ii().kP() != aDd().imY);
      localtb = bg.ii().la();
    }
    while (localtb == null);
    if ((bg.ii().kQ() != null) && (localtb.imZ != null) && (bg.ii().kQ().equals(localtb.imZ)))
      return true;
    return bg.ii().c(aDd().ini, aDd().inh, aDd().ing);
  }

  protected final boolean ajV()
  {
    return false;
  }

  protected final String ajW()
  {
    tb localtb = aDd();
    if (localtb == null)
      return getString(com.tencent.mm.n.bEc);
    switch (localtb.imY)
    {
    case 2:
    case 3:
    default:
      return getString(com.tencent.mm.n.bEc);
    case 0:
    case 1:
      return getString(com.tencent.mm.n.ckt);
    case 5:
      return getString(com.tencent.mm.n.ccy);
    case 4:
    }
    return getString(com.tencent.mm.n.chV);
  }

  protected final d ajX()
  {
    WorkerProfile localWorkerProfile = WorkerProfile.jdMethod_if();
    if (localWorkerProfile != null)
      return localWorkerProfile.im();
    return null;
  }

  protected final boolean ajY()
  {
    return !ajU();
  }

  protected final String ajZ()
  {
    String str = "";
    switch (aDd().imY)
    {
    case 1:
    case 2:
    case 3:
    default:
      if (am.ayh() != null)
      {
        rt localrt = new rt();
        localrt.hPl = aDd().hQq;
        localrt.ihJ = aDd().ine;
        localrt.ihK = aDd().inm;
        localrt.hOh = localrt.ihJ;
        str = am.ayh().e(localrt);
      }
      return str;
    case 4:
      return g.axQ().qP(aDd().ine);
    case 0:
      return ap.yg().gS(aDd().ink);
    case 5:
      if (aDd().ink == null)
        return "";
      return aDd().ink;
    case 6:
      if (aDd().ink == null)
        return "";
      return aDd().ink;
    case 7:
    }
    if (aDd().ink == null)
      return "";
    return aDd().ink;
  }

  protected final String getAppId()
  {
    String str = bg.ii().le();
    if (ch.jb(str));
    switch (aDd().imY)
    {
    default:
      return str;
    case 5:
      return "wx482a4001c37e2b74";
    case 4:
    }
    return "wx485a97c844086dc9";
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  protected void onDestroy()
  {
    if (this.jKp != null)
      bg.qX().c(this.jKp);
    bg.qX().b(520, this);
    super.onDestroy();
  }

  protected void onPause()
  {
    super.onPause();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.player.MainMusicPlayerUI
 * JD-Core Version:    0.6.2
 */