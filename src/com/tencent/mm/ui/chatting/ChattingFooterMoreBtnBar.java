package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.aq.a;
import com.tencent.mm.g;
import com.tencent.mm.h;
import com.tencent.mm.sdk.platformtools.z;

public class ChattingFooterMoreBtnBar extends LinearLayout
{
  private ImageButton eRI;
  private ImageButton jov;
  private ImageButton jow;
  private ImageButton jox;

  public ChattingFooterMoreBtnBar(Context paramContext)
  {
    this(paramContext, null);
    aUN();
  }

  public ChattingFooterMoreBtnBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    aUN();
  }

  private void aUN()
  {
    setOrientation(0);
    setGravity(16);
    setBackgroundResource(h.SV);
    int i = getResources().getDimensionPixelSize(g.PN);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(0, i, 1.0F);
    localLayoutParams1.topMargin = a.fromDPToPix(getContext(), 0);
    this.jov = new ImageButton(getContext());
    this.jov.setImageResource(h.To);
    this.jov.setScaleType(ImageView.ScaleType.CENTER);
    this.jov.setBackgroundResource(0);
    addView(this.jov, localLayoutParams1);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(0, i, 1.0F);
    localLayoutParams2.topMargin = a.fromDPToPix(getContext(), 0);
    this.jox = new ImageButton(getContext());
    this.jox.setImageResource(h.Tm);
    this.jox.setScaleType(ImageView.ScaleType.CENTER);
    this.jox.setBackgroundResource(0);
    addView(this.jox, localLayoutParams2);
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(0, i, 1.0F);
    localLayoutParams3.topMargin = a.fromDPToPix(getContext(), 0);
    this.eRI = new ImageButton(getContext());
    this.eRI.setImageResource(h.Tk);
    this.eRI.setScaleType(ImageView.ScaleType.CENTER);
    this.eRI.setBackgroundResource(0);
    addView(this.eRI, localLayoutParams3);
    LinearLayout.LayoutParams localLayoutParams4 = new LinearLayout.LayoutParams(0, i, 1.0F);
    localLayoutParams4.topMargin = a.fromDPToPix(getContext(), 0);
    this.jow = new ImageButton(getContext());
    this.jow.setImageResource(h.Tn);
    this.jow.setScaleType(ImageView.ScaleType.CENTER);
    this.jow.setBackgroundResource(0);
    addView(this.jow, localLayoutParams4);
  }

  public final void a(int paramInt, View.OnClickListener paramOnClickListener)
  {
    switch (paramInt)
    {
    case 1:
    default:
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      z.w("!44@ZzDoKFw9tuqbSG6bBKzSwwI3A00x1rQTiVfD2QYTczE=", "set button listener error button index %d", arrayOfObject);
      return;
    case 2:
      this.jow.setOnClickListener(paramOnClickListener);
      return;
    case 3:
      this.eRI.setOnClickListener(paramOnClickListener);
      return;
    case 0:
      this.jov.setOnClickListener(paramOnClickListener);
      return;
    case 4:
    }
    this.jox.setOnClickListener(paramOnClickListener);
  }

  public final void qf(int paramInt)
  {
    if (paramInt > 0);
    for (boolean bool = true; ; bool = false)
    {
      this.jov.setClickable(bool);
      this.jov.setEnabled(bool);
      this.jow.setClickable(bool);
      this.jow.setEnabled(bool);
      this.eRI.setClickable(bool);
      this.eRI.setEnabled(bool);
      this.jox.setClickable(bool);
      this.jox.setEnabled(bool);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar
 * JD-Core Version:    0.6.2
 */