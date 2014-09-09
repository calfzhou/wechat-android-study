package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.aq.a;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

public final class MMGridPaper extends LinearLayout
{
  protected int eDG = 0;
  protected MMDotView eER;
  protected cm eRb;
  protected int iXw = 10;
  protected int iXx = 10;
  final ax iYT = new bi(this);
  final aw iYU = new bh(this);
  protected int iZA = -1;
  protected int iZB = -1;
  protected boolean iZC = false;
  protected int iZD = 0;
  protected int iZE = 0;
  protected bl iZF;
  protected MMFlipper iZe;
  protected bm iZf;
  protected int iZg;
  protected int iZh;
  protected int iZi = 0;
  protected int iZj = 0;
  protected int iZk = 3;
  protected int iZl = 0;
  protected int iZm = -1 + this.iZk;
  protected int iZn = 0;
  protected int iZo = 0;
  protected boolean iZp = false;
  protected int iZq = 9;
  protected int iZr = -1;
  protected int iZs = -1;
  protected int iZt = 96;
  protected int iZu = 96;
  protected boolean iZv = false;
  protected boolean iZw = false;
  protected int iZx = -1;
  protected int iZy = -1;
  protected int iZz = 0;
  protected View ll;

  public MMGridPaper(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public MMGridPaper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  private int aBi()
  {
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    if (localDisplay.getWidth() < localDisplay.getHeight())
      return 1;
    return 2;
  }

  private void aBj()
  {
    z.v("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "MMGridPaper initFlipper");
    if (this.eER == null)
    {
      this.eER = ((MMDotView)findViewById(i.awU));
      this.eER.ps(this.iZq);
    }
    if (this.iZe == null)
    {
      this.iZe = ((MMFlipper)findViewById(i.awV));
      this.iZe.a(this.iYU);
      this.iZe.a(this.iYT);
    }
    aRU();
    aRV();
  }

  private void aRU()
  {
    if ((-1 != this.iZr) && (aBi() == 2))
    {
      View localView2 = findViewById(i.awT);
      LinearLayout.LayoutParams localLayoutParams2 = (LinearLayout.LayoutParams)localView2.getLayoutParams();
      int j = a.fromDPToPix(getContext(), this.iZr);
      if (j != localLayoutParams2.height)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(this.iZr);
        z.i("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "set land mode, special height is %d", arrayOfObject2);
        localLayoutParams2.height = j;
        localView2.setLayoutParams(localLayoutParams2);
      }
    }
    View localView1;
    LinearLayout.LayoutParams localLayoutParams1;
    int i;
    do
    {
      this.eRb.post(new bf(this));
      do
        return;
      while ((-1 == this.iZs) || (aBi() != 1));
      localView1 = findViewById(i.awT);
      localLayoutParams1 = (LinearLayout.LayoutParams)localView1.getLayoutParams();
      i = a.fromDPToPix(getContext(), this.iZs);
    }
    while (i == localLayoutParams1.height);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(this.iZs);
    z.i("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "set port mode, special height is %d", arrayOfObject1);
    localLayoutParams1.height = i;
    localView1.setLayoutParams(localLayoutParams1);
    this.eRb.post(new bg(this));
  }

  private void aRV()
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(this.iZg);
    arrayOfObject1[1] = Integer.valueOf(this.iZh);
    z.v("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "initSubGrid, grid width %d, grid height %d", arrayOfObject1);
    if ((this.iZg == 0) || (this.iZh == 0))
    {
      z.w("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "initSubGrid:gridWithd or gridHeight is 0");
      return;
    }
    int i = a.fromDPToPix(getContext(), this.iZt);
    int j = a.fromDPToPix(getContext(), this.iZu);
    int k = Math.max(this.iZg / i, 1);
    int m = Math.max(this.iZh / j, 1);
    if ((k != this.eDG) || (m != this.iZo))
      this.iZp = true;
    this.eDG = k;
    if (this.iZA != -1)
      this.eDG = Math.min(this.eDG, this.iZA);
    this.iZo = m;
    if (this.iZB != -1)
      this.iZo = Math.min(this.iZo, this.iZB);
    int n = this.eDG * this.iZo;
    this.iZn = 0;
    int i1;
    int i2;
    boolean bool;
    label262: int i10;
    int i11;
    int i3;
    if (this.iZf == null)
    {
      i1 = 0;
      i2 = i1 + 0;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i2);
      arrayOfObject2[1] = Boolean.valueOf(this.iZw);
      z.d("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "totalCount is %d, dialogMode is %B", arrayOfObject2);
      if (i2 < 0)
        break label341;
      bool = true;
      Assert.assertTrue(bool);
      if (this.iZw)
      {
        i10 = be(i2, this.eDG);
        i11 = aBi();
      }
      switch (i11)
      {
      default:
        i3 = 1;
      case 2:
      case 1:
      }
    }
    while (true)
    {
      if (i3 != 0)
        break label583;
      aRU();
      return;
      i1 = this.iZf.getCount();
      break;
      label341: bool = false;
      break label262;
      int i14 = Math.min(i10, this.iZy);
      int i15 = 8 + i14 * (10 + this.iZu);
      Object[] arrayOfObject9 = new Object[5];
      arrayOfObject9[0] = Integer.valueOf(i11);
      arrayOfObject9[1] = Integer.valueOf(i14);
      arrayOfObject9[2] = Integer.valueOf(i15);
      arrayOfObject9[3] = Integer.valueOf(this.iZr);
      arrayOfObject9[4] = Boolean.valueOf(this.iZv);
      z.d("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "orientation[%d], minRows[%d], targetHeight[%d], displayHeight[%d], orientationChange[%B]", arrayOfObject9);
      if (this.iZr != i15)
      {
        this.iZr = i15;
        i3 = 0;
      }
      else
      {
        i3 = 1;
        continue;
        int i12 = Math.min(i10, this.iZx);
        int i13 = 8 + i12 * (10 + this.iZu);
        Object[] arrayOfObject8 = new Object[5];
        arrayOfObject8[0] = Integer.valueOf(i11);
        arrayOfObject8[1] = Integer.valueOf(i12);
        arrayOfObject8[2] = Integer.valueOf(i13);
        arrayOfObject8[3] = Integer.valueOf(this.iZs);
        arrayOfObject8[4] = Boolean.valueOf(this.iZv);
        z.d("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "orientation[%d], minRows[%d], targetHeight[%d], displayHeight[%d], orientationChange[%B]", arrayOfObject8);
        if (this.iZs != i13)
        {
          this.iZs = i13;
          i3 = 0;
        }
        else
        {
          i3 = 1;
        }
      }
    }
    label583: this.iZn = be(i2, n);
    int i4 = -1 + this.iZn;
    int i5 = this.iZi;
    int i6;
    if ((i5 == 0) || (n <= 0))
    {
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(i5);
      arrayOfObject3[1] = Integer.valueOf(n);
      z.w("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "floor:total[%d], length[%d]", arrayOfObject3);
      i6 = 0;
      this.iZj = Math.min(i4, i6);
      this.iZk = Math.min(3, this.iZn);
      this.iZl = Math.min(this.iZn - this.iZk, Math.max(0, this.iZj - (this.iZk >> 1)));
      this.iZm = (-1 + (this.iZl + this.iZk));
      Object[] arrayOfObject4 = new Object[9];
      arrayOfObject4[0] = Integer.valueOf(this.iZt);
      arrayOfObject4[1] = Integer.valueOf(this.iZu);
      arrayOfObject4[2] = Integer.valueOf(this.iZo);
      arrayOfObject4[3] = Integer.valueOf(this.eDG);
      arrayOfObject4[4] = Integer.valueOf(this.iZk);
      arrayOfObject4[5] = Integer.valueOf(this.iZn);
      arrayOfObject4[6] = Integer.valueOf(this.iZj);
      arrayOfObject4[7] = Integer.valueOf(this.iZl);
      arrayOfObject4[8] = Integer.valueOf(this.iZm);
      z.d("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "initSubGrid:item[%ddp,%ddp], row[%d], column[%d], activePage[%d], virtualPage[%d], curVirtualPage[%d], edge[%d, %d]", arrayOfObject4);
      if ((this.iZF == null) || ((this.iZe.getChildCount() != this.iZk) || (this.iZp)))
      {
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = Boolean.valueOf(this.iZp);
        z.w("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "error child count or RowOrColChanged(%B), reset child view", arrayOfObject5);
        this.iZp = false;
        this.iZe.removeAllViews();
        for (int i7 = this.iZl; i7 <= this.iZm; i7++)
        {
          MMGridPaperGridView localMMGridPaperGridView1 = (MMGridPaperGridView)inflate(getContext(), k.bis, null);
          localMMGridPaperGridView1.a(i7, this.iZo, this.eDG, this.iZf);
          localMMGridPaperGridView1.setHorizontalSpacing(a.fromDPToPix(getContext(), this.iXw));
          localMMGridPaperGridView1.setVerticalSpacing(a.fromDPToPix(getContext(), this.iXx));
          this.iZe.addView(localMMGridPaperGridView1, new LinearLayout.LayoutParams(-1, -1));
        }
      }
    }
    while (true)
    {
      int i9;
      if (i9 >= n)
      {
        i9 -= n;
        i6++;
      }
      else
      {
        Object[] arrayOfObject7 = new Object[3];
        arrayOfObject7[0] = Integer.valueOf(i5);
        arrayOfObject7[1] = Integer.valueOf(n);
        arrayOfObject7[2] = Integer.valueOf(i6);
        z.i("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "floor:num[%d], length[%d], result[%d]", arrayOfObject7);
        break;
        int i8 = this.iZl;
        if (i8 <= this.iZm)
        {
          MMGridPaperGridView localMMGridPaperGridView2 = (MMGridPaperGridView)this.iZe.getChildAt(i8 - this.iZl);
          if (localMMGridPaperGridView2.getIndex() != i8)
          {
            Object[] arrayOfObject6 = new Object[2];
            arrayOfObject6[0] = Integer.valueOf(localMMGridPaperGridView2.getIndex());
            arrayOfObject6[1] = Integer.valueOf(i8);
            z.w("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "old index %d, new index %d, reset it", arrayOfObject6);
            localMMGridPaperGridView2.a(i8, this.iZo, this.eDG, this.iZf);
            localMMGridPaperGridView2.notifyDataSetChanged();
          }
          while (true)
          {
            i8++;
            break;
            z.v("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "same grid index, continus");
          }
        }
        aRW();
        return;
        i9 = i5;
        i6 = 0;
      }
    }
  }

  private void aRW()
  {
    z.v("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "set DotView");
    boolean bool;
    if (this.iZn >= 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      this.eER.pt(this.iZn);
      if ((this.iZf != null) && (this.iZn > 1))
        break label129;
      this.eER.setVisibility(8);
      z.v("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "set DotView gone");
    }
    while (true)
    {
      if (this.iZj >= this.iZn)
        this.iZj = (-1 + this.iZn);
      this.iZe.pv(this.iZj - this.iZl);
      this.iZe.pw(this.iZj);
      this.eER.pu(this.iZj);
      return;
      bool = false;
      break;
      label129: this.eER.setVisibility(0);
      z.v("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "set DotView visible");
    }
  }

  private static int be(int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 0)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(paramInt1);
      arrayOfObject2[1] = Integer.valueOf(paramInt2);
      z.w("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "ceil:total[%d], length[%d]", arrayOfObject2);
      return 0;
    }
    while (true)
    {
      int i;
      int j;
      if (i > 0)
      {
        i -= paramInt2;
        j++;
      }
      else
      {
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = Integer.valueOf(paramInt1);
        arrayOfObject1[1] = Integer.valueOf(paramInt2);
        arrayOfObject1[2] = Integer.valueOf(j);
        z.i("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "ceil:num[%d], length[%d], result[%d]", arrayOfObject1);
        return j;
        i = paramInt1;
        j = 0;
      }
    }
  }

  private void init()
  {
    this.eRb = new cm(Looper.getMainLooper());
    View.inflate(getContext(), k.biv, this);
    this.iZz = aBi();
  }

  public final void a(bm parambm)
  {
    boolean bool = true;
    this.iZf = parambm;
    Object[] arrayOfObject = new Object[bool];
    if (parambm == null);
    while (true)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.d("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "setGridPaperAdapter:adapter is null[%B]", arrayOfObject);
      if (this.iZf != null)
        this.iZf.a(new be(this));
      aBj();
      return;
      bool = false;
    }
  }

  public final void aRN()
  {
    this.iZt = 70;
  }

  public final void aRO()
  {
    this.iZu = 70;
  }

  public final void aRP()
  {
    this.iZB = 3;
  }

  public final void aRQ()
  {
    this.iZw = true;
  }

  public final void aRR()
  {
    this.iZy = 3;
    this.iZx = 3;
  }

  public final void aRS()
  {
    this.iXw = 8;
    this.iXx = 15;
  }

  public final void aRT()
  {
    this.ll = null;
    ViewGroup localViewGroup = (ViewGroup)findViewById(i.axo);
    localViewGroup.removeAllViews();
    if (this.ll != null)
      localViewGroup.addView(this.ll);
  }

  @TargetApi(8)
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
    {
      z.d("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "onConfigChanged:" + paramConfiguration.orientation);
      this.iZv = true;
    }
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    arrayOfObject[3] = Integer.valueOf(paramInt4);
    z.d("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "onLayout left=%s top=%s right=%s bottom=%s", arrayOfObject);
    if (this.iZz != aBi())
    {
      this.iZz = aBi();
      z.d("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "onLayout, currentOrientation changed, reAdjustDisplayArea");
      this.iZv = true;
      clearAnimation();
      aRU();
      aRV();
    }
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final void py(int paramInt)
  {
    this.iZA = paramInt;
  }

  public final void refresh()
  {
    this.iZi = (this.iZj * this.eDG * this.iZo);
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(this.iZj);
    arrayOfObject[1] = Integer.valueOf(this.eDG);
    arrayOfObject[2] = Integer.valueOf(this.iZo);
    arrayOfObject[3] = Integer.valueOf(this.iZi);
    z.v("!32@/B4Tb64lLpJ3ysDJ3BtNKcrZSCfaejKv", "refreshed:virtualPage[%d], col[%d], row[%d], scrollCount[%d]", arrayOfObject);
    aBj();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMGridPaper
 * JD-Core Version:    0.6.2
 */