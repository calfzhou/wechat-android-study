package com.tencent.mm.ui.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.p;
import com.tencent.mm.ui.base.preference.Preference;

public class NetStatPreference extends Preference
{
  private boolean jLC = false;

  public NetStatPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public NetStatPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public NetStatPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cyd, paramInt, 0);
    if (localTypedArray.getInt(p.cye, 0) == 1);
    for (boolean bool = true; ; bool = false)
    {
      this.jLC = bool;
      localTypedArray.recycle();
      int i = n.cgc;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(15);
      setSummary(paramContext.getString(i, arrayOfObject));
      return;
    }
  }

  public final void fU(boolean paramBoolean)
  {
    this.jLC = paramBoolean;
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    LinearLayout localLinearLayout1 = (LinearLayout)paramView.findViewById(i.awX);
    localLinearLayout1.removeAllViews();
    int i = (int)(System.currentTimeMillis() / 86400000L);
    for (int j = 15; j > 0; j -= 5)
    {
      NetStatGroup localNetStatGroup1 = new NetStatGroup(getContext());
      localNetStatGroup1.A(1 + (i - j), this.jLC);
      localLinearLayout1.addView(localNetStatGroup1, -2, -1);
    }
    LinearLayout localLinearLayout2 = (LinearLayout)paramView.findViewById(i.aMH);
    localLinearLayout2.removeAllViews();
    NetStatGroup localNetStatGroup2 = new NetStatGroup(getContext());
    localNetStatGroup2.fT(this.jLC);
    localLinearLayout2.addView(localNetStatGroup2);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), k.biY, localViewGroup);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.NetStatPreference
 * JD-Core Version:    0.6.2
 */