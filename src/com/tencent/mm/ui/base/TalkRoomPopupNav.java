package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.b;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.d;

public class TalkRoomPopupNav extends LinearLayout
{
  private View eUd;
  private ScaleAnimation jfA;
  private Animation jfB;
  private AlphaAnimation jfC;
  private AlphaAnimation jfD;
  private fx jfq;
  private LinearLayout jfr;
  private LinearLayout jfs;
  private LinearLayout jft;
  private ImageView jfu;
  private ImageView jfv;
  private ScaleAnimation jfw;
  private Animation jfx;
  private int jfy = 0;
  private int jfz = 0;

  public TalkRoomPopupNav(Context paramContext)
  {
    super(paramContext);
    DP();
  }

  public TalkRoomPopupNav(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    DP();
  }

  @TargetApi(11)
  public TalkRoomPopupNav(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    DP();
  }

  private void DP()
  {
    inflate(getContext(), k.aSu, this);
    this.jfr = ((LinearLayout)findViewById(i.aFB));
    this.jfs = ((LinearLayout)findViewById(i.apN));
    this.jft = ((LinearLayout)findViewById(i.apL));
    this.eUd = findViewById(i.aFx);
    this.jfu = ((ImageView)findViewById(i.aSv));
    this.jfv = ((ImageView)findViewById(i.aSw));
    this.jfv.setVisibility(8);
    this.jfr.setOnClickListener(new fo(this));
    ((Button)findViewById(i.akt)).setOnClickListener(new fp(this));
    ((Button)findViewById(i.akv)).setOnClickListener(new fq(this));
    this.jfy = this.eUd.getLayoutParams().height;
    this.jfz = this.jfs.getLayoutParams().height;
  }

  public final void BS(String paramString)
  {
    ((TextView)findViewById(i.aTH)).setText(paramString);
  }

  public final void a(fx paramfx)
  {
    this.jfq = paramfx;
  }

  public final void aTt()
  {
    if (this.jfw == null)
    {
      this.jfw = new ScaleAnimation(1.0F, 1.0F, 1.0F * this.jfy / this.jfz, 1.0F);
      this.jfw.setDuration(300L);
      this.jfw.setAnimationListener(new fr(this));
    }
    if (this.jfx == null)
    {
      this.jfx = AnimationUtils.loadAnimation(getContext(), b.Mw);
      this.jfx.setFillAfter(true);
      this.jfx.setAnimationListener(new fs(this));
    }
    ViewGroup.LayoutParams localLayoutParams = this.eUd.getLayoutParams();
    localLayoutParams.height = this.jfz;
    this.eUd.setLayoutParams(localLayoutParams);
    this.eUd.startAnimation(this.jfw);
    this.jfr.startAnimation(this.jfx);
    this.jfs.startAnimation(AnimationUtils.loadAnimation(getContext(), b.Mv));
    this.jfs.setVisibility(0);
  }

  public final void pP(int paramInt)
  {
    if (this.eUd != null)
      this.eUd.setBackgroundResource(paramInt);
  }

  public final void pQ(int paramInt)
  {
    if (this.jfu != null)
      this.jfu.setImageResource(paramInt);
  }

  public final void pR(int paramInt)
  {
    if (paramInt < 0)
      if (this.jfv != null)
        this.jfv.setVisibility(8);
    while (this.jfv == null)
      return;
    this.jfv.setImageResource(paramInt);
    this.jfv.setVisibility(0);
  }

  public final void start()
  {
    if ((this.jfC == null) || (this.jfD == null))
    {
      this.jfC = new AlphaAnimation(0.0F, 1.0F);
      this.jfC.setDuration(1000L);
      this.jfC.setStartOffset(0L);
      this.jfD = new AlphaAnimation(1.0F, 0.0F);
      this.jfD.setDuration(1000L);
      this.jfD.setStartOffset(0L);
      this.jfC.setAnimationListener(new fv(this));
      this.jfD.setAnimationListener(new fw(this));
      this.jfv.startAnimation(this.jfC);
    }
  }

  public final void stop()
  {
    if ((this.jfC != null) && (this.jfD != null))
    {
      d.a(this.jfv, this.jfC);
      d.a(this.jfv, this.jfD);
      this.jfv.clearAnimation();
      this.jfC = null;
      this.jfD = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.TalkRoomPopupNav
 * JD-Core Version:    0.6.2
 */