package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;

public class ChattingTranslateView extends LinearLayout
{
  private ImageView jru;
  private TextView jrv;
  private hb jrw = null;
  private boolean jrx = false;

  public ChattingTranslateView(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public ChattingTranslateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public ChattingTranslateView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet);
    init();
  }

  private void a(hb paramhb)
  {
    if (this.jrx)
      super.setVisibility(8);
    while (this.jrw == paramhb)
      return;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.jrw;
    arrayOfObject[1] = paramhb;
    z.d("!44@/B4Tb64lLpKwUcOR+EdWcrEYD8dwvm3wvSBPRtXIgAg=", "from status %s to status %s", arrayOfObject);
    this.jrw = paramhb;
    switch (ha.jry[paramhb.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      invalidate();
      return;
      super.setVisibility(8);
      continue;
      super.setVisibility(0);
      this.jru.setImageResource(h.aco);
      this.jrv.setText(n.bAq);
      continue;
      super.setVisibility(0);
      this.jru.setImageResource(h.acn);
      this.jrv.setText(n.bAp);
    }
  }

  private void init()
  {
    int i = (int)TypedValue.applyDimension(1, 3.0F, getResources().getDisplayMetrics());
    this.jru = new ImageView(getContext());
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams1.gravity = 16;
    localLayoutParams1.setMargins(i, i, 0, i);
    this.jru.setLayoutParams(localLayoutParams1);
    addView(this.jru);
    this.jrv = new TextView(getContext());
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams2.setMargins(i, i, i, i);
    localLayoutParams2.gravity = 16;
    this.jrv.setLayoutParams(localLayoutParams2);
    this.jrv.setTextSize(1, 11.0F);
    this.jrv.setTextColor(-1);
    addView(this.jrv);
    setBackgroundResource(h.Tu);
    a(hb.jrz);
  }

  public final void aVi()
  {
    a(hb.jrz);
  }

  public final void aVj()
  {
    a(hb.jrA);
  }

  public final void aVk()
  {
    a(hb.jrB);
  }

  public final boolean aVl()
  {
    return this.jrw == hb.jrB;
  }

  public final boolean aVm()
  {
    return this.jrw == hb.jrA;
  }

  public final boolean aVn()
  {
    return this.jrw == hb.jrz;
  }

  public final void fm(boolean paramBoolean)
  {
    this.jrx = paramBoolean;
    if (paramBoolean)
      super.setVisibility(8);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingTranslateView
 * JD-Core Version:    0.6.2
 */