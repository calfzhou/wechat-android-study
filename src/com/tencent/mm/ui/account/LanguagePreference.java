package com.tencent.mm.ui.account;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.Preference;

public class LanguagePreference extends Preference
{
  private bf iON;

  public LanguagePreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public LanguagePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public LanguagePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
  }

  public final void a(bf parambf)
  {
    if ((parambf == null) || (ch.jb(parambf.Yh())))
    {
      z.e("!44@/B4Tb64lLpK8wYhJLCaWa94yEHo+P7srfIxUMMDGkJc=", "setInfo info error");
      return;
    }
    this.iON = parambf;
    setKey(parambf.Yh());
  }

  public final bf aQz()
  {
    return this.iON;
  }

  protected final void onBindView(View paramView)
  {
    int i = 1;
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(i.azK);
    CheckBox localCheckBox = (CheckBox)paramView.findViewById(i.aRO);
    int j;
    if (localTextView != null)
    {
      j = i;
      if (localCheckBox == null)
        break label79;
    }
    while (true)
    {
      if ((i & j) != 0)
      {
        localTextView.setText(this.iON.aQA());
        localCheckBox.setChecked(this.iON.aQB());
      }
      return;
      j = 0;
      break;
      label79: i = 0;
    }
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(k.biX, localViewGroup);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.LanguagePreference
 * JD-Core Version:    0.6.2
 */