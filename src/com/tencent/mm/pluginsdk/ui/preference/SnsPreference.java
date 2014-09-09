package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.c.a.hy;
import com.tencent.mm.c.a.ia;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.s;
import com.tencent.mm.protocal.a.rt;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.p;
import com.tencent.mm.ui.widget.QImageView;
import java.util.LinkedList;
import java.util.List;

public final class SnsPreference extends Preference
  implements p
{
  private MMActivity cHh;
  private List gfe = new LinkedList();
  private QImageView hHY = null;
  private QImageView hHZ = null;
  private QImageView hIa = null;
  private int hIb = 255;
  private w hIc = new w();
  private String mTitle = "";

  public SnsPreference(Context paramContext)
  {
    this(paramContext, null);
    this.cHh = ((MMActivity)paramContext);
  }

  public SnsPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    this.cHh = ((MMActivity)paramContext);
  }

  public SnsPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.cHh = ((MMActivity)paramContext);
    this.mTitle = paramContext.getString(n.bDd);
    setLayoutResource(k.biA);
  }

  private void aDl()
  {
    if (this.hHY != null)
    {
      this.hHY.setImageResource(com.tencent.mm.f.white);
      this.hHY.setVisibility(4);
    }
    if (this.hHZ != null)
    {
      this.hHZ.setImageResource(com.tencent.mm.f.white);
      this.hHZ.setVisibility(4);
    }
    if (this.hIa != null)
    {
      this.hIa.setImageResource(com.tencent.mm.f.white);
      this.hIa.setVisibility(4);
    }
    if ((this.hHY != null) && (this.gfe.size() > 0))
    {
      this.hHY.setVisibility(0);
      if (!j.nI())
        this.hHY.setImageResource(h.Xr);
    }
    else if ((this.hHZ != null) && (this.gfe.size() >= 2))
    {
      this.hHZ.setVisibility(0);
      if (j.nI())
        break label242;
      this.hHZ.setImageResource(h.Xr);
    }
    while (true)
    {
      if ((this.hIa != null) && (this.gfe.size() >= 3))
      {
        this.hIa.setVisibility(0);
        if (j.nI())
          break label277;
        this.hIa.setImageResource(h.Xr);
      }
      return;
      am.ayg().b((rt)this.gfe.get(0), this.hHY, this.cHh.hashCode());
      break;
      label242: am.ayg().b((rt)this.gfe.get(1), this.hHZ, this.cHh.hashCode());
    }
    label277: am.ayg().b((rt)this.gfe.get(2), this.hIa, this.cHh.hashCode());
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.hHY = ((QImageView)paramView.findViewById(i.ayc));
    this.hHY.setAlpha(this.hIb);
    this.hHY.setImageDrawable(this.hIc);
    this.hHZ = ((QImageView)paramView.findViewById(i.ayd));
    this.hHZ.setAlpha(this.hIb);
    this.hHZ.setImageDrawable(this.hIc);
    this.hIa = ((QImageView)paramView.findViewById(i.aye));
    this.hIa.setAlpha(this.hIb);
    this.hIa.setImageDrawable(this.hIc);
    ((TextView)paramView.findViewById(i.afM)).setText(this.mTitle);
    aDl();
    if ((paramView == null) || (this.gfe == null))
      return;
    Context localContext = getContext();
    int i = n.bVM;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.gfe.size());
    paramView.setContentDescription(localContext.getString(i, arrayOfObject));
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(k.biM, localViewGroup);
    return localView;
  }

  public final void vO(String paramString)
  {
    if (paramString == null)
      return;
    this.gfe.clear();
    hy localhy = new hy();
    localhy.cMy.cMA = paramString;
    a.aGB().g(localhy);
    if (localhy.cMz.cMB != null)
      this.gfe.add(localhy.cMz.cMB);
    if (localhy.cMz.cMC != null)
      this.gfe.add(localhy.cMz.cMC);
    if (localhy.cMz.cMD != null)
      this.gfe.add(localhy.cMz.cMD);
    aDl();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.SnsPreference
 * JD-Core Version:    0.6.2
 */