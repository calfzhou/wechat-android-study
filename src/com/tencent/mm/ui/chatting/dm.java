package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.g;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.o;
import com.tencent.mm.sdk.platformtools.z;

public final class dm extends RelativeLayout
{
  private LayoutInflater fpT;
  private int joU;

  public dm(LayoutInflater paramLayoutInflater, int paramInt)
  {
    super(paramLayoutInflater.getContext());
    this.fpT = paramLayoutInflater;
    this.joU = paramInt;
    View localView1 = this.fpT.inflate(k.cBm, null);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
    localView1.setId(i.brX);
    localLayoutParams1.setMargins(0, getResources().getDimensionPixelSize(g.PH), 0, getResources().getDimensionPixelSize(g.PH));
    localView1.setVisibility(8);
    addView(localView1, localLayoutParams1);
    TextView localTextView = new TextView(getContext(), null, o.cuy);
    localTextView.setId(i.amj);
    localTextView.setTextSize(1, 12.0F);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(3, i.brX);
    localLayoutParams2.addRule(14);
    localLayoutParams2.setMargins(0, getResources().getDimensionPixelSize(g.PH), 0, getResources().getDimensionPixelSize(g.PH));
    addView(localTextView, localLayoutParams2);
    CheckBox localCheckBox = (CheckBox)LayoutInflater.from(getContext()).inflate(k.bin, this, false);
    localCheckBox.setId(i.alk);
    int i = a.fromDPToPix(getContext(), 20);
    RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(i, i);
    localLayoutParams3.setMargins(0, getResources().getDimensionPixelSize(g.PO), getResources().getDimensionPixelSize(g.PO), 0);
    localLayoutParams3.addRule(3, i.amj);
    localLayoutParams3.addRule(11);
    localLayoutParams3.width = i;
    localLayoutParams3.height = i;
    addView(localCheckBox, localLayoutParams3);
    View localView2 = this.fpT.inflate(this.joU, null);
    int j = localView2.getId();
    if (-1 == j)
    {
      z.v("!44@/B4Tb64lLpKwUcOR+EdWcg2fJDecFVGIxHkQgJMBNWM=", "content view has no id, use defaul id");
      j = i.aln;
      localView2.setId(i.aln);
    }
    RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams4.addRule(3, i.amj);
    localLayoutParams4.addRule(0, i.alk);
    addView(localView2, localLayoutParams4);
    View localView3 = new View(getContext());
    localView3.setId(i.alP);
    localView3.setVisibility(8);
    RelativeLayout.LayoutParams localLayoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams5.addRule(6, j);
    localLayoutParams5.addRule(8, j);
    addView(localView3, localLayoutParams5);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.dm
 * JD-Core Version:    0.6.2
 */