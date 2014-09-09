package com.tencent.mm.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class RemarkInfoPreference extends Preference
{
  private MMActivity cHh;
  private TextView ejS;
  private TextView fWR;
  private ImageView fzX;
  private String gtc;
  private boolean jAT = false;
  private String title;

  public RemarkInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.cHh = ((MMActivity)paramContext);
  }

  public RemarkInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
    setWidgetLayoutResource(k.bjA);
  }

  public final void onBindView(View paramView)
  {
    this.ejS = ((TextView)paramView.findViewById(i.title));
    this.fWR = ((TextView)paramView.findViewById(i.summary));
    this.fzX = ((ImageView)paramView.findViewById(i.ayb));
    if (!this.jAT)
      this.fzX.setVisibility(8);
    while (true)
    {
      if (this.ejS != null)
        this.ejS.setText(this.title);
      if (this.fWR != null)
        this.fWR.setText(this.gtc);
      super.onBindView(paramView);
      return;
      this.fzX.setVisibility(0);
    }
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(k.bjd, localViewGroup);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.RemarkInfoPreference
 * JD-Core Version:    0.6.2
 */