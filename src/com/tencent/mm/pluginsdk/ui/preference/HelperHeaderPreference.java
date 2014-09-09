package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.tools.gx;

public class HelperHeaderPreference extends Preference
{
  private o hHk = new o();

  public HelperHeaderPreference(Context paramContext)
  {
    super(paramContext);
  }

  public HelperHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public HelperHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void mY(int paramInt)
  {
    this.hHk.status = paramInt;
    super.callChangeListener(null);
  }

  public final void onBindView(View paramView)
  {
    ImageView localImageView = (ImageView)paramView.findViewById(i.ahd);
    TextView localTextView1 = (TextView)paramView.findViewById(i.aRX);
    TextView localTextView2 = (TextView)paramView.findViewById(i.aGn);
    TextView localTextView3 = (TextView)paramView.findViewById(i.axz);
    if (localImageView != null)
      c.a(localImageView, this.hHk.user);
    if (localTextView1 != null)
      switch (this.hHk.status)
      {
      default:
      case 1:
      case 0:
      case 2:
      }
    while (true)
    {
      if (localTextView2 != null)
        localTextView2.setText(this.hHk.dbG);
      if (localTextView3 != null)
        localTextView3.setText(this.hHk.hHl);
      super.onBindView(paramView);
      return;
      localTextView1.setVisibility(0);
      localTextView1.setTextColor(gx.cE(getContext()));
      localTextView1.setText(n.cgu);
      localTextView1.setCompoundDrawablesWithIntrinsicBounds(h.abr, 0, 0, 0);
      continue;
      localTextView1.setVisibility(0);
      localTextView1.setTextColor(gx.cF(getContext()));
      localTextView1.setText(n.cgA);
      localTextView1.setCompoundDrawablesWithIntrinsicBounds(h.abq, 0, 0, 0);
      continue;
      localTextView1.setVisibility(8);
    }
  }

  public final void u(String paramString1, String paramString2, String paramString3)
  {
    this.hHk.user = paramString1;
    this.hHk.dbG = paramString2;
    this.hHk.hHl = paramString3;
    super.callChangeListener(null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference
 * JD-Core Version:    0.6.2
 */