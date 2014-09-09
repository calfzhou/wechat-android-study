package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.Iterator;
import java.util.List;

public class BizInfoPayInfoIconPreference extends Preference
{
  private LayoutInflater gJ;
  private LinearLayout jCM;
  private List jCN;
  private int jCO = -1;

  public BizInfoPayInfoIconPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public BizInfoPayInfoIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public BizInfoPayInfoIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.gJ = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    setLayoutResource(k.biA);
  }

  private void Mg()
  {
    if (this.jCM == null);
    while (true)
    {
      return;
      this.jCM.removeAllViews();
      if (this.jCO >= 0)
      {
        int i = this.jCO;
        int j = 0;
        label31: if (j < 5)
        {
          if (i > 0)
            break label55;
          qC(h.Sw);
        }
        while (true)
        {
          j++;
          break label31;
          break;
          label55: if (i <= 10)
          {
            qC(h.Su);
            i -= 20;
          }
          else
          {
            qC(h.Sv);
            i -= 20;
          }
        }
      }
      if (this.jCN != null)
      {
        Iterator localIterator = this.jCN.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          CdnImageView localCdnImageView = new CdnImageView(getContext());
          localCdnImageView.setUrl(str);
          LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(a.fromDPToPix(getContext(), 20), a.fromDPToPix(getContext(), 20));
          localLayoutParams.rightMargin = a.fromDPToPix(getContext(), 6);
          this.jCM.addView(localCdnImageView, localLayoutParams);
        }
      }
    }
  }

  private void qC(int paramInt)
  {
    ImageView localImageView = (ImageView)this.gJ.inflate(k.bdy, null);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(a.fromDPToPix(getContext(), 20), a.fromDPToPix(getContext(), 20));
    localLayoutParams.rightMargin = a.fromDPToPix(getContext(), 6);
    localImageView.setImageResource(paramInt);
    this.jCM.addView(localImageView, localLayoutParams);
  }

  public final void bj(List paramList)
  {
    this.jCN = paramList;
    Mg();
  }

  public final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.jCM = ((LinearLayout)paramView.findViewById(i.summary));
    Mg();
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    this.gJ.inflate(k.bdA, localViewGroup);
    return localView;
  }

  public final void qB(int paramInt)
  {
    if (paramInt == this.jCO)
      return;
    this.jCO = paramInt;
    Mg();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.BizInfoPayInfoIconPreference
 * JD-Core Version:    0.6.2
 */