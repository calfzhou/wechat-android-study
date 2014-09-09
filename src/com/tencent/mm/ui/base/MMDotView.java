package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.p;
import com.tencent.mm.sdk.platformtools.z;

public class MMDotView extends LinearLayout
{
  private int iYH = h.Yt;
  private int iYI = h.Yr;
  private int yz = 9;

  public MMDotView(Context paramContext)
  {
    super(paramContext);
  }

  public MMDotView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }

  @TargetApi(11)
  public MMDotView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }

  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cxa);
    int i = localTypedArray.getResourceId(p.cxb, 0);
    localTypedArray.recycle();
    pt(i);
  }

  public final void ps(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!32@/B4Tb64lLpKKFsASoNqVnOoHB0Jq9fM2", "setMaxCount:%d", arrayOfObject);
    this.yz = paramInt;
  }

  public final void pt(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.v("!32@/B4Tb64lLpKKFsASoNqVnOoHB0Jq9fM2", "setDotCount:%d", arrayOfObject);
    if (paramInt < 0);
    ImageView localImageView1;
    do
    {
      return;
      if (paramInt > this.yz)
      {
        z.i("!32@/B4Tb64lLpKKFsASoNqVnOoHB0Jq9fM2", "large than max count");
        paramInt = this.yz;
      }
      removeAllViews();
      while (paramInt != 0)
      {
        ImageView localImageView2 = (ImageView)View.inflate(getContext(), k.bjM, null);
        localImageView2.setImageResource(this.iYH);
        addView(localImageView2);
        paramInt--;
      }
      localImageView1 = (ImageView)getChildAt(0);
    }
    while (localImageView1 == null);
    localImageView1.setImageResource(this.iYI);
  }

  public final void pu(int paramInt)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    z.v("!32@/B4Tb64lLpKKFsASoNqVnOoHB0Jq9fM2", "setSelectedDot:target index is %d", arrayOfObject1);
    if (paramInt >= getChildCount())
      paramInt = -1 + getChildCount();
    while (true)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      z.v("!32@/B4Tb64lLpKKFsASoNqVnOoHB0Jq9fM2", "setSelectedDot:after adjust index is %d", arrayOfObject2);
      for (int i = 0; i < getChildCount(); i++)
        ((ImageView)getChildAt(i)).setImageResource(this.iYH);
      if (paramInt < 0)
        paramInt = 0;
    }
    ImageView localImageView = (ImageView)getChildAt(paramInt);
    if (localImageView != null)
      localImageView.setImageResource(this.iYI);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMDotView
 * JD-Core Version:    0.6.2
 */