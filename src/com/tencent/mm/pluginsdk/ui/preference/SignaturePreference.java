package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.preference.Preference;

public class SignaturePreference extends Preference
{
  public SignaturePreference(Context paramContext)
  {
    super(paramContext);
  }

  public SignaturePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SignaturePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    localViewGroup.setPadding(0, 0, 0, 0);
    View.inflate(getContext(), k.bjf, localViewGroup);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.SignaturePreference
 * JD-Core Version:    0.6.2
 */