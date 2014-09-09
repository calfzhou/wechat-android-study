package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.i;
import com.tencent.mm.p;
import com.tencent.mm.sdk.platformtools.z;

public class MaskLayout extends RelativeLayout
{
  private ImageView eTP;
  private Drawable jdD;
  private View view;

  public MaskLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public MaskLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MaskLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cxy, paramInt, 0);
    this.jdD = localTypedArray.getDrawable(p.cxz);
    localTypedArray.recycle();
  }

  private void pM(int paramInt)
  {
    removeView(this.eTP);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    switch (fh.jdE[(paramInt - 1)])
    {
    default:
      localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    case 3:
    case 1:
    case 2:
    case 4:
    }
    while (true)
    {
      addView(this.eTP, localLayoutParams);
      return;
      localLayoutParams.addRule(12);
      localLayoutParams.addRule(11);
      continue;
      localLayoutParams.addRule(12);
      localLayoutParams.addRule(9);
      continue;
      localLayoutParams.addRule(11);
    }
  }

  public final void aTa()
  {
    pM(fi.jdJ);
    this.eTP.setImageDrawable(null);
  }

  public final void b(Bitmap paramBitmap, int paramInt)
  {
    pM(paramInt);
    this.eTP.setImageBitmap(paramBitmap);
  }

  public final View getContentView()
  {
    return this.view;
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.view = findViewById(i.content);
    if (this.view == null)
    {
      z.d("!32@/B4Tb64lLpIrPcdvz+HPJK/coyuoK30x", "%s", new Object[] { "not found view by id, new one" });
      this.view = new View(getContext());
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams.addRule(13);
      this.view.setLayoutParams(localLayoutParams);
      addView(this.view);
    }
    this.eTP = new ImageView(getContext());
    this.eTP.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    this.eTP.setImageDrawable(this.jdD);
    addView(this.eTP);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MaskLayout
 * JD-Core Version:    0.6.2
 */