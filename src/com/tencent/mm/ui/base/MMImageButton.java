package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.f;

public class MMImageButton extends FrameLayout
{
  private ImageView cKf;
  private TextView fyP;

  public MMImageButton(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public MMImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    FrameLayout.LayoutParams localLayoutParams1 = new FrameLayout.LayoutParams(-2, -2);
    localLayoutParams1.gravity = 17;
    this.cKf = new ImageView(paramContext);
    this.cKf.setLayoutParams(localLayoutParams1);
    addView(this.cKf);
    FrameLayout.LayoutParams localLayoutParams2 = new FrameLayout.LayoutParams(-2, -2);
    localLayoutParams2.gravity = 17;
    this.fyP = new TextView(paramContext);
    this.fyP.setLayoutParams(localLayoutParams2);
    this.fyP.setClickable(false);
    this.fyP.setFocusable(false);
    this.fyP.setFocusableInTouchMode(false);
    this.fyP.setTextColor(a.m(paramContext, f.OB));
    addView(this.fyP);
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.fyP.setEnabled(paramBoolean);
    this.cKf.setEnabled(paramBoolean);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMImageButton
 * JD-Core Version:    0.6.2
 */