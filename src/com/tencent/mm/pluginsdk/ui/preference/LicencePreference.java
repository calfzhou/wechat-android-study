package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.base.preference.Preference;

public class LicencePreference extends Preference
{
  private CheckBox hHm;
  private Button hHn;
  private String hHo;
  private boolean hHp = false;
  private View.OnClickListener hHq;

  public LicencePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public LicencePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.bjt);
  }

  public final void onBindView(View paramView)
  {
    super.onBindView(paramView);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    this.hHm = ((CheckBox)localView.findViewById(i.aeS));
    this.hHn = ((Button)localView.findViewById(i.aeR));
    this.hHn.setOnClickListener(new p(this));
    if (!ch.jb(this.hHo))
      this.hHn.setText(this.hHo);
    this.hHm.setChecked(this.hHp);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.LicencePreference
 * JD-Core Version:    0.6.2
 */