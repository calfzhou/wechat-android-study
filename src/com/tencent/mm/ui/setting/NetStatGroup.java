package com.tencent.mm.ui.setting;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.modelstat.f;
import com.tencent.mm.modelstat.j;
import com.tencent.mm.modelstat.r;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;

public class NetStatGroup extends LinearLayout
{
  private final TextView fPy;
  private LinearLayout jLB;

  public NetStatGroup(Context paramContext)
  {
    this(paramContext, null);
  }

  public NetStatGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    View.inflate(paramContext, k.bkk, this);
    this.jLB = ((LinearLayout)findViewById(i.awX));
    this.fPy = ((TextView)findViewById(i.apt));
  }

  public final void A(int paramInt, boolean paramBoolean)
  {
    String str = DateFormat.format(getContext().getString(n.bKc, new Object[] { "" }), 86400000L * paramInt).toString();
    this.fPy.setText(str);
    z.d("!32@/B4Tb64lLpKaLNAssnLXZsUvORplPeIJ", "NetStat dataTime = " + str);
    this.jLB.removeAllViews();
    int i = 0;
    if (i < 5)
    {
      NetStatUnit localNetStatUnit = new NetStatUnit(getContext());
      int j = paramInt + i;
      f localf = r.Ap().ex(j);
      if (localf != null)
      {
        if (!paramBoolean)
          break label237;
        Object[] arrayOfObject2 = new Object[4];
        arrayOfObject2[0] = Integer.valueOf(localf.dEs);
        arrayOfObject2[1] = Integer.valueOf(localf.dEg);
        arrayOfObject2[2] = Integer.valueOf(localf.dEu);
        arrayOfObject2[3] = Integer.valueOf(localf.dEi);
        z.i("!32@/B4Tb64lLpKaLNAssnLXZqBosLNGOwlA", "dknetflow wifi : %d %d %d %d", arrayOfObject2);
        localNetStatUnit.bk(localf.dEs + localf.dEg, localf.dEu + localf.dEi);
      }
      while (true)
      {
        localNetStatUnit.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0F));
        this.jLB.addView(localNetStatUnit);
        i++;
        break;
        label237: Object[] arrayOfObject1 = new Object[4];
        arrayOfObject1[0] = Integer.valueOf(localf.dEr);
        arrayOfObject1[1] = Integer.valueOf(localf.dEf);
        arrayOfObject1[2] = Integer.valueOf(localf.dEt);
        arrayOfObject1[3] = Integer.valueOf(localf.dEh);
        z.i("!32@/B4Tb64lLpKaLNAssnLXZqBosLNGOwlA", "dknetflow mobile : %d %d %d %d", arrayOfObject1);
        localNetStatUnit.bk(localf.dEr + localf.dEf, localf.dEt + localf.dEh);
      }
    }
  }

  public final void fT(boolean paramBoolean)
  {
    removeAllViews();
    View.inflate(getContext(), k.bkl, this);
    this.jLB = ((LinearLayout)findViewById(i.awX));
    NetStatRuler localNetStatRuler = new NetStatRuler(getContext());
    if (paramBoolean);
    for (String str = "wifi"; ; str = "mobile")
    {
      localNetStatRuler.setTag(str);
      localNetStatRuler.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0F));
      this.jLB.addView(localNetStatRuler);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.NetStatGroup
 * JD-Core Version:    0.6.2
 */