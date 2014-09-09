package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.g;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public class LauncherUIBottomTabView extends RelativeLayout
  implements e
{
  protected int hFC = 0;
  private int iKA;
  private int iKB;
  private int iKC;
  private int iKD = 0;
  private int iKE;
  private int iKF;
  private int iKG;
  private int iKH;
  private int iKI;
  private int iKJ;
  private long iKK = 0L;
  private int iKL = -1;
  protected View.OnClickListener iKM = new bt(this);
  private cm iKN = new bu(this);
  private int iKO = 0;
  private int iKP = 0;
  private int iKQ = 0;
  private boolean iKR = false;
  private int iKS = 0;
  private boolean iKT = false;
  private f iKu;
  protected bv iKv;
  protected bv iKw;
  protected bv iKx;
  protected bv iKy;
  private int iKz = 0;

  public LauncherUIBottomTabView(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public LauncherUIBottomTabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public LauncherUIBottomTabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  private bv a(int paramInt, ViewGroup paramViewGroup)
  {
    bv localbv = new bv(this);
    localbv.iKV = LayoutInflater.from(getContext()).inflate(k.cBt, paramViewGroup, false);
    localbv.iKW = ((TabIconView)localbv.iKV.findViewById(i.axG));
    localbv.iKX = ((TextView)localbv.iKV.findViewById(i.bUz));
    localbv.iKY = ((TextView)localbv.iKV.findViewById(i.cAA));
    localbv.iKZ = ((ImageView)localbv.iKV.findViewById(i.bOB));
    localbv.iKV.setTag(Integer.valueOf(paramInt));
    localbv.iKV.setOnClickListener(this.iKM);
    return localbv;
  }

  private void init()
  {
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setOrientation(0);
    addView(localLinearLayout, new RelativeLayout.LayoutParams(-1, -2));
    bv localbv1 = a(0, localLinearLayout);
    localbv1.iKX.setText(n.bRh);
    localbv1.iKX.setTextColor(getResources().getColor(com.tencent.mm.f.ajr));
    localbv1.iKW.bb(h.aQa, h.aQb);
    localbv1.iKY.setVisibility(4);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(g.Pt));
    localLayoutParams1.weight = 1.0F;
    localLinearLayout.addView(localbv1.iKV, localLayoutParams1);
    this.iKv = localbv1;
    bv localbv2 = a(1, localLinearLayout);
    localbv2.iKX.setText(n.bQI);
    localbv2.iKX.setTextColor(getResources().getColor(com.tencent.mm.f.akq));
    localbv2.iKW.bb(h.aPU, h.aPZ);
    localbv2.iKY.setVisibility(4);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(g.Pt));
    localLayoutParams2.weight = 1.0F;
    localLinearLayout.addView(localbv2.iKV, localLayoutParams2);
    this.iKx = localbv2;
    bv localbv3 = a(2, localLinearLayout);
    localbv3.iKX.setText(n.bQG);
    localbv3.iKX.setTextColor(getResources().getColor(com.tencent.mm.f.akq));
    localbv3.iKW.bb(h.aQc, h.aRq);
    localbv3.iKY.setVisibility(4);
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(g.Pt));
    localLayoutParams3.weight = 1.0F;
    localLinearLayout.addView(localbv3.iKV, localLayoutParams3);
    this.iKw = localbv3;
    bv localbv4 = a(3, localLinearLayout);
    localbv4.iKX.setText(n.bRe);
    localbv4.iKX.setTextColor(getResources().getColor(com.tencent.mm.f.akq));
    localbv4.iKW.bb(h.aSa, h.aSb);
    localbv4.iKY.setVisibility(4);
    LinearLayout.LayoutParams localLayoutParams4 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(g.Pt));
    localLayoutParams4.weight = 1.0F;
    localLinearLayout.addView(localbv4.iKV, localLayoutParams4);
    this.iKy = localbv4;
    this.iKz = getResources().getColor(com.tencent.mm.f.ajr);
    this.iKA = ((0xFF0000 & this.iKz) >> 16);
    this.iKB = ((0xFF00 & this.iKz) >> 8);
    this.iKC = (0xFF & this.iKz);
    this.iKD = getResources().getColor(com.tencent.mm.f.akq);
    this.iKE = ((0xFF0000 & this.iKD) >> 16);
    this.iKF = ((0xFF00 & this.iKD) >> 8);
    this.iKG = (0xFF & this.iKD);
    this.iKH = (this.iKA - this.iKE);
    this.iKI = (this.iKB - this.iKF);
    this.iKJ = (this.iKC - this.iKG);
  }

  public final void a(f paramf)
  {
    this.iKu = paramf;
  }

  public final void aOp()
  {
    if ((this.iKv != null) && (this.iKx != null) && (this.iKw == null));
  }

  public final int aOq()
  {
    return this.iKO;
  }

  public final int aOr()
  {
    return this.iKP;
  }

  public final int aOs()
  {
    return this.iKQ;
  }

  public final int aOt()
  {
    return this.iKS;
  }

  public final boolean aOu()
  {
    return this.iKR;
  }

  public final boolean aOv()
  {
    return this.iKT;
  }

  public final int aOw()
  {
    return this.hFC;
  }

  public final void b(int paramInt, float paramFloat)
  {
    int i = (int)(255.0F * paramFloat);
    int j = 255 - i;
    int k = -16777216 + (((int)(paramFloat * this.iKH + this.iKE) << 16) + ((int)(paramFloat * this.iKI + this.iKF) << 8) + (int)(paramFloat * this.iKJ + this.iKG));
    int m = -16777216 + (((int)(this.iKH * (1.0F - paramFloat) + this.iKE) << 16) + ((int)(this.iKI * (1.0F - paramFloat) + this.iKF) << 8) + (int)(this.iKJ * (1.0F - paramFloat) + this.iKG));
    switch (paramInt)
    {
    default:
      return;
    case 0:
      this.iKv.iKW.pb(j);
      this.iKx.iKW.pb(i);
      this.iKv.iKX.setTextColor(m);
      this.iKx.iKX.setTextColor(k);
      return;
    case 1:
      this.iKx.iKW.pb(j);
      this.iKw.iKW.pb(i);
      this.iKx.iKX.setTextColor(m);
      this.iKw.iKX.setTextColor(k);
      return;
    case 2:
    }
    this.iKw.iKW.pb(j);
    this.iKy.iKW.pb(i);
    this.iKw.iKX.setTextColor(m);
    this.iKy.iKX.setTextColor(k);
  }

  public final void er(boolean paramBoolean)
  {
    int i = 4;
    this.iKR = paramBoolean;
    this.iKw.iKY.setVisibility(i);
    ImageView localImageView = this.iKw.iKZ;
    if (paramBoolean)
      i = 0;
    localImageView.setVisibility(i);
  }

  public final void es(boolean paramBoolean)
  {
    int i = 4;
    this.iKT = paramBoolean;
    this.iKy.iKY.setVisibility(i);
    ImageView localImageView = this.iKy.iKZ;
    if (paramBoolean)
      i = 0;
    localImageView.setVisibility(i);
  }

  public final void oA(int paramInt)
  {
    this.iKP = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.iKx.iKY.setText(getContext().getString(n.cmN));
        this.iKx.iKY.setVisibility(0);
        this.iKx.iKZ.setVisibility(4);
        return;
      }
      this.iKx.iKY.setText(String.valueOf(paramInt));
      this.iKx.iKY.setVisibility(0);
      this.iKx.iKZ.setVisibility(4);
      return;
    }
    this.iKx.iKY.setText("");
    this.iKx.iKY.setVisibility(4);
  }

  public final void oB(int paramInt)
  {
    this.iKQ = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.iKw.iKY.setText(getContext().getString(n.cmN));
        this.iKw.iKY.setVisibility(0);
        this.iKw.iKZ.setVisibility(4);
        return;
      }
      this.iKw.iKY.setText(String.valueOf(paramInt));
      this.iKw.iKY.setVisibility(0);
      this.iKw.iKZ.setVisibility(4);
      return;
    }
    this.iKw.iKY.setText("");
    this.iKw.iKY.setVisibility(4);
  }

  public final void oC(int paramInt)
  {
    this.iKS = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.iKy.iKY.setText(getContext().getString(n.cmN));
        this.iKy.iKY.setVisibility(0);
        this.iKy.iKZ.setVisibility(4);
        return;
      }
      this.iKy.iKY.setText(String.valueOf(paramInt));
      this.iKy.iKY.setVisibility(0);
      this.iKy.iKZ.setVisibility(4);
      return;
    }
    this.iKy.iKY.setText("");
    this.iKy.iKY.setVisibility(4);
  }

  public final void oD(int paramInt)
  {
    this.hFC = paramInt;
    switch (paramInt)
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      this.iKK = System.currentTimeMillis();
      this.iKL = this.hFC;
      return;
      this.iKv.iKW.pb(255);
      this.iKw.iKW.pb(0);
      this.iKx.iKW.pb(0);
      this.iKy.iKW.pb(0);
      this.iKv.iKX.setTextColor(this.iKz);
      this.iKw.iKX.setTextColor(this.iKD);
      this.iKx.iKX.setTextColor(this.iKD);
      this.iKy.iKX.setTextColor(this.iKD);
      continue;
      this.iKv.iKW.pb(0);
      this.iKw.iKW.pb(255);
      this.iKx.iKW.pb(0);
      this.iKy.iKW.pb(0);
      this.iKv.iKX.setTextColor(this.iKD);
      this.iKw.iKX.setTextColor(this.iKz);
      this.iKx.iKX.setTextColor(this.iKD);
      this.iKy.iKX.setTextColor(this.iKD);
      continue;
      this.iKv.iKW.pb(0);
      this.iKw.iKW.pb(0);
      this.iKx.iKW.pb(255);
      this.iKy.iKW.pb(0);
      this.iKv.iKX.setTextColor(this.iKD);
      this.iKw.iKX.setTextColor(this.iKD);
      this.iKx.iKX.setTextColor(this.iKz);
      this.iKy.iKX.setTextColor(this.iKD);
      continue;
      this.iKv.iKW.pb(0);
      this.iKw.iKW.pb(0);
      this.iKx.iKW.pb(0);
      this.iKy.iKW.pb(255);
      this.iKv.iKX.setTextColor(this.iKD);
      this.iKw.iKX.setTextColor(this.iKD);
      this.iKx.iKX.setTextColor(this.iKD);
      this.iKy.iKX.setTextColor(this.iKz);
    }
  }

  public final void oz(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpKf6BwZaHy6XtTBtHJGvRAE6ZpOmb+TUBQ=", "updateMainTabUnread %d", arrayOfObject);
    this.iKO = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.iKv.iKY.setText(getContext().getString(n.cmN));
        this.iKv.iKY.setVisibility(0);
        this.iKv.iKZ.setVisibility(4);
        return;
      }
      this.iKv.iKY.setText(String.valueOf(paramInt));
      this.iKv.iKY.setVisibility(0);
      this.iKv.iKZ.setVisibility(4);
      return;
    }
    this.iKv.iKY.setText("");
    this.iKv.iKY.setVisibility(4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LauncherUIBottomTabView
 * JD-Core Version:    0.6.2
 */