package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;

public class AnimImageView extends TextView
{
  private Context context;
  private boolean dmB = false;
  private boolean iXs = false;
  private AlphaAnimation iXt;
  private AnimationDrawable iXu;
  private AnimationDrawable iXv;
  private int type = 1;

  public AnimImageView(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    aRv();
  }

  public AnimImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    aRv();
  }

  public AnimImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    aRv();
  }

  private void aRv()
  {
    this.iXt = new AlphaAnimation(0.1F, 1.0F);
    this.iXt.setDuration(1000L);
    this.iXt.setRepeatCount(-1);
    this.iXt.setRepeatMode(2);
    this.iXu = new AnimationDrawable();
    Drawable localDrawable1 = getResources().getDrawable(h.TE);
    localDrawable1.setBounds(0, 0, localDrawable1.getIntrinsicWidth(), localDrawable1.getIntrinsicHeight());
    this.iXu.addFrame(localDrawable1, 300);
    Drawable localDrawable2 = getResources().getDrawable(h.TF);
    localDrawable2.setBounds(0, 0, localDrawable2.getIntrinsicWidth(), localDrawable2.getIntrinsicHeight());
    this.iXu.addFrame(localDrawable2, 300);
    Drawable localDrawable3 = getResources().getDrawable(h.TG);
    localDrawable3.setBounds(0, 0, localDrawable3.getIntrinsicWidth(), localDrawable3.getIntrinsicHeight());
    this.iXu.addFrame(localDrawable3, 300);
    this.iXu.setOneShot(false);
    this.iXu.setVisible(true, true);
    this.iXv = new AnimationDrawable();
    Drawable localDrawable4 = getResources().getDrawable(h.Ue);
    localDrawable4.setBounds(0, 0, localDrawable4.getIntrinsicWidth(), localDrawable4.getIntrinsicHeight());
    this.iXv.addFrame(localDrawable4, 300);
    Drawable localDrawable5 = getResources().getDrawable(h.Uf);
    localDrawable5.setBounds(0, 0, localDrawable5.getIntrinsicWidth(), localDrawable5.getIntrinsicHeight());
    this.iXv.addFrame(localDrawable5, 300);
    Drawable localDrawable6 = getResources().getDrawable(h.Ug);
    localDrawable6.setBounds(0, 0, localDrawable6.getIntrinsicWidth(), localDrawable6.getIntrinsicHeight());
    this.iXv.addFrame(localDrawable6, 300);
    this.iXv.setOneShot(false);
    this.iXv.setVisible(true, true);
  }

  public final void Wq()
  {
    switch (this.type)
    {
    default:
    case 1:
      do
        return;
      while (this.dmB);
      this.dmB = true;
      if (this.iXs)
      {
        setCompoundDrawablesWithIntrinsicBounds(this.iXu, null, null, null);
        this.iXu.stop();
        this.iXu.start();
        return;
      }
      setCompoundDrawablesWithIntrinsicBounds(null, null, this.iXv, null);
      this.iXv.stop();
      this.iXv.start();
      return;
    case 0:
    }
    if (this.iXs)
      setBackgroundDrawable(a.n(this.context, h.Tv));
    while (true)
    {
      setAnimation(this.iXt);
      this.iXt.startNow();
      return;
      setBackgroundDrawable(a.n(this.context, h.Ua));
    }
  }

  public final void aRt()
  {
    if (this.iXs)
    {
      setBackgroundDrawable(a.n(this.context, h.Tv));
      return;
    }
    setBackgroundDrawable(a.n(this.context, h.Ua));
  }

  public final void aRu()
  {
    if ((this.iXt != null) && (this.iXt.isInitialized()))
      setAnimation(null);
    if (this.type == 1)
    {
      this.dmB = false;
      setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      this.iXu.stop();
      this.iXv.stop();
    }
  }

  public final void eM(boolean paramBoolean)
  {
    this.iXs = paramBoolean;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.AnimImageView
 * JD-Core Version:    0.6.2
 */