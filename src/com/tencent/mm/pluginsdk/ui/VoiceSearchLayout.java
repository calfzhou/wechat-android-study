package com.tencent.mm.pluginsdk.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.al.f;
import com.tencent.mm.b;
import com.tencent.mm.compatible.audio.e;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.m;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;

public class VoiceSearchLayout extends LinearLayout
{
  private static final int[] enm;
  private static final int[] hAw;
  private static final int[] hAx = arrayOfInt3;
  private final ay enH = new ay(new bh(this), true);
  private View erf = null;
  private boolean fhJ = false;
  private int grR = 0;
  private int hAA = 0;
  private bl hAn = null;
  private Button hAo;
  private boolean hAp = false;
  private int hAq = 0;
  private bm hAr;
  private View hAs;
  private AnimationDrawable hAt;
  private f hAu;
  private boolean hAv = false;
  private int hAy = 0;
  private int hAz = 0;

  static
  {
    int[] arrayOfInt1 = new int[14];
    arrayOfInt1[0] = h.adi;
    arrayOfInt1[1] = h.adj;
    arrayOfInt1[2] = h.adk;
    arrayOfInt1[3] = h.adl;
    arrayOfInt1[4] = h.acV;
    arrayOfInt1[5] = h.acW;
    arrayOfInt1[6] = h.acX;
    arrayOfInt1[7] = h.acY;
    arrayOfInt1[8] = h.acZ;
    arrayOfInt1[9] = h.ada;
    arrayOfInt1[10] = h.adb;
    arrayOfInt1[11] = h.adc;
    arrayOfInt1[12] = h.ade;
    arrayOfInt1[13] = h.adf;
    enm = arrayOfInt1;
    int[] arrayOfInt2 = new int[10];
    arrayOfInt2[0] = h.adi;
    arrayOfInt2[1] = h.adi;
    arrayOfInt2[2] = h.adi;
    arrayOfInt2[3] = h.adj;
    arrayOfInt2[4] = h.adk;
    arrayOfInt2[5] = h.adj;
    arrayOfInt2[6] = h.adi;
    arrayOfInt2[7] = h.adl;
    arrayOfInt2[8] = h.adi;
    arrayOfInt2[9] = h.adi;
    hAw = arrayOfInt2;
    int[] arrayOfInt3 = new int[5];
    arrayOfInt3[0] = h.adg;
    arrayOfInt3[1] = h.adh;
    arrayOfInt3[2] = h.adh;
    arrayOfInt3[3] = h.adh;
    arrayOfInt3[4] = h.adg;
  }

  public VoiceSearchLayout(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }

  public VoiceSearchLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }

  @TargetApi(11)
  public VoiceSearchLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }

  private void a(boolean paramBoolean, aa paramaa)
  {
    if (paramBoolean)
    {
      z.d("!44@/B4Tb64lLpKCGRi+LcyHSNJSF5OOP5LMoXistc7C4wY=", "pauseMusic");
      com.tencent.mm.model.bg.qY().my();
    }
    while (true)
    {
      MediaPlayer localMediaPlayer = new MediaPlayer();
      if (paramBoolean);
      try
      {
        localMediaPlayer.setDataSource(getContext(), Uri.parse("android.resource://" + getContext().getPackageName() + "/" + m.brk));
        while (true)
        {
          localMediaPlayer.setAudioStreamType(5);
          localMediaPlayer.setOnCompletionListener(new bi(this, null));
          localMediaPlayer.setOnErrorListener(new bj(this, null));
          localMediaPlayer.prepare();
          localMediaPlayer.setLooping(false);
          localMediaPlayer.start();
          return;
          mz();
          break;
          localMediaPlayer.setDataSource(getContext(), Uri.parse("android.resource://" + getContext().getPackageName() + "/" + m.brj));
        }
      }
      catch (Exception localException)
      {
      }
    }
  }

  private void di(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.hAo.setBackgroundResource(h.acP);
      this.hAt = ((AnimationDrawable)this.hAo.getBackground());
      if (this.hAt != null)
        this.hAt.start();
      return;
    }
    this.hAo.setBackgroundResource(h.acT);
  }

  private void init(Context paramContext)
  {
    this.erf = inflate(paramContext, k.aWe, this);
    this.hAo = ((Button)this.erf.findViewById(i.aWg));
    this.hAs = this.erf.findViewById(i.aWd);
    di(false);
    reset();
  }

  private static void mz()
  {
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSNJSF5OOP5LMoXistc7C4wY=", "resumeMusic");
    com.tencent.mm.model.bg.qY().mz();
  }

  public final void G()
  {
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSNJSF5OOP5LMoXistc7C4wY=", "doStop");
    if (this.hAu != null)
      this.hAu.stop();
  }

  public final void a(bl parambl)
  {
    this.hAn = parambl;
  }

  public final void a(bm parambm)
  {
    this.hAr = parambm;
  }

  public final void aAA()
  {
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSNJSF5OOP5LMoXistc7C4wY=", "doCancel " + this.fhJ);
    if (this.fhJ)
    {
      this.fhJ = false;
      if (this.hAn != null)
        this.hAn.aAG();
    }
    reset();
    if (getVisibility() == 0)
    {
      setVisibility(8);
      if (this.hAr != null)
        this.hAr.dj(false);
    }
    mz();
    if (this.hAu != null)
      this.hAu.cancel();
    if (this.enH != null)
      this.enH.aNu();
  }

  public final void aAB()
  {
    this.hAo.setBackgroundDrawable(null);
    this.hAs.setBackgroundDrawable(null);
    this.hAt = null;
  }

  public final void aAw()
  {
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSNJSF5OOP5LMoXistc7C4wY=", "checkStop " + this.fhJ);
    if (this.fhJ)
    {
      aAA();
      this.fhJ = false;
    }
  }

  public final void aAx()
  {
    this.hAo.setOnClickListener(new bg(this));
  }

  public final void aAy()
  {
    this.hAv = true;
  }

  public final void aAz()
  {
    this.erf.findViewById(i.aWc).setBackgroundResource(0);
  }

  public final void mv(int paramInt)
  {
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSNJSF5OOP5LMoXistc7C4wY=", "doStart " + this.fhJ);
    this.hAq = paramInt;
    this.fhJ = true;
    this.hAp = false;
    if (this.hAn != null)
      this.hAn.aAF();
    setVisibility(0);
    this.enH.cP(50L);
    a(true, null);
    this.hAA = 0;
    this.hAu = new f(new bk(this), paramInt);
    this.hAu.start();
  }

  public final void mw(int paramInt)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.hAs.getLayoutParams();
    localLayoutParams.topMargin = paramInt;
    this.hAs.setLayoutParams(localLayoutParams);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.hAp)
      aAw();
    return true;
  }

  public final void reset()
  {
    this.fhJ = false;
    this.hAp = false;
    di(false);
    this.fhJ = false;
    this.hAp = false;
    this.hAo.setBackgroundResource(h.acT);
    this.hAs.setBackgroundDrawable(getResources().getDrawable(h.acS));
  }

  public void setVisibility(int paramInt)
  {
    Animation localAnimation;
    bm localbm;
    if ((super.getVisibility() != paramInt) && (!this.hAv))
    {
      if (paramInt != 8)
        break label70;
      localAnimation = AnimationUtils.loadAnimation(getContext(), b.Mw);
      startAnimation(localAnimation);
      super.setVisibility(paramInt);
      if (this.hAr != null)
      {
        localbm = this.hAr;
        if (paramInt != 0)
          break label84;
      }
    }
    label70: label84: for (boolean bool = true; ; bool = false)
    {
      localbm.dj(bool);
      return;
      localAnimation = AnimationUtils.loadAnimation(getContext(), b.Mv);
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceSearchLayout
 * JD-Core Version:    0.6.2
 */