package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.mm.i;
import com.tencent.mm.p;

public final class ImagePreference extends Preference
{
  private ImageView gHX = null;
  private k jgP = new k();

  public ImagePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ImagePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(com.tencent.mm.k.bjp);
    setWidgetLayoutResource(com.tencent.mm.k.bjA);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cwT);
    int i = localTypedArray.getResourceId(p.cwU, 0);
    if (i > 0)
    {
      this.jgP.setImageResource(i);
      this.jgP.c(this.gHX);
    }
    localTypedArray.recycle();
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.gHX = ((ImageView)paramView.findViewById(i.ayb));
    this.jgP.c(this.gHX);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.aoO);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), com.tencent.mm.k.bjp, localViewGroup);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.ImagePreference
 * JD-Core Version:    0.6.2
 */