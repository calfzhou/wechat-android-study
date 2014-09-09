package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.aq.a;
import com.tencent.mm.g;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public class LauncherUITabView extends RelativeLayout
  implements e
{
  protected int hFC = 0;
  private long iKK = 0L;
  private int iKL = -1;
  protected View.OnClickListener iKM = new bw(this);
  private cm iKN = new bx(this);
  private int iKO = 0;
  private int iKP = 0;
  private int iKQ = 0;
  private boolean iKR = false;
  private int iKS = 0;
  private boolean iKT = false;
  private f iKu;
  private int iLa;
  private Bitmap iLb;
  private ImageView iLc;
  private Matrix iLd = new Matrix();
  protected by iLe;
  protected by iLf;
  protected by iLg;
  protected by iLh;

  public LauncherUITabView(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public LauncherUITabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public LauncherUITabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  private void init()
  {
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setBackgroundResource(com.tencent.mm.f.white);
    localLinearLayout.setId(2307141);
    localLinearLayout.setOrientation(0);
    addView(localLinearLayout, new RelativeLayout.LayoutParams(-1, -2));
    this.iLc = new ImageView(getContext());
    this.iLc.setImageMatrix(this.iLd);
    this.iLc.setScaleType(ImageView.ScaleType.MATRIX);
    this.iLc.setId(2307142);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, a.fromDPToPix(getContext(), 3));
    localLayoutParams.addRule(8, 2307141);
    addView(this.iLc, localLayoutParams);
    by localby1 = oK(0);
    localby1.iLj.setText(n.bQH);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(g.axX));
    localLayoutParams1.weight = 1.0F;
    localLinearLayout.addView(localby1.iLj, localLayoutParams1);
    this.iLe = localby1;
    by localby2 = oK(1);
    localby2.iLj.setText(n.bQI);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(g.axX));
    localLayoutParams2.weight = 1.0F;
    localLinearLayout.addView(localby2.iLj, localLayoutParams2);
    this.iLf = localby2;
    by localby3 = oK(2);
    localby3.iLj.setText(n.bQG);
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(g.axX));
    localLayoutParams3.weight = 1.0F;
    localLinearLayout.addView(localby3.iLj, localLayoutParams3);
    this.iLg = localby3;
    by localby4 = oK(3);
    localby4.iLj.setText(n.bRe);
    LinearLayout.LayoutParams localLayoutParams4 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(g.axX));
    localLayoutParams4.weight = 1.0F;
    localLinearLayout.addView(localby4.iLj, localLayoutParams4);
    this.iLh = localby4;
  }

  private by oK(int paramInt)
  {
    by localby = new by(this);
    localby.iLj = new MMTabView(getContext(), paramInt);
    localby.iLj.setTag(Integer.valueOf(paramInt));
    localby.iLj.setOnClickListener(this.iKM);
    return localby;
  }

  public final void a(f paramf)
  {
    this.iKu = paramf;
  }

  public final void aOp()
  {
    if ((this.iLe == null) || (this.iLf == null) || (this.iLg == null) || (this.iLh == null))
      return;
    this.iLe.iLj.aQj();
    this.iLf.iLj.aQj();
    this.iLg.iLj.aQj();
    this.iLh.iLj.aQj();
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
    this.iLd.setTranslate(this.iLa * (paramFloat + paramInt), 0.0F);
    this.iLc.setImageMatrix(this.iLd);
  }

  public final void er(boolean paramBoolean)
  {
    this.iKR = paramBoolean;
    this.iLg.iLj.eG(paramBoolean);
  }

  public final void es(boolean paramBoolean)
  {
    this.iKT = paramBoolean;
    this.iLh.iLj.eG(paramBoolean);
  }

  public final void oA(int paramInt)
  {
    this.iKP = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.iLf.iLj.Bx(getContext().getString(n.cmN));
        return;
      }
      this.iLf.iLj.Bx(String.valueOf(paramInt));
      return;
    }
    this.iLf.iLj.Bx(null);
  }

  public final void oB(int paramInt)
  {
    this.iKQ = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.iLg.iLj.Bx(getContext().getString(n.cmN));
        return;
      }
      this.iLg.iLj.Bx(String.valueOf(paramInt));
      return;
    }
    this.iLg.iLj.Bx(null);
  }

  public final void oC(int paramInt)
  {
    this.iKS = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.iLh.iLj.Bx(getContext().getString(n.cmN));
        return;
      }
      this.iLh.iLj.Bx(String.valueOf(paramInt));
      return;
    }
    this.iLh.iLj.Bx(null);
  }

  public final void oD(int paramInt)
  {
    this.hFC = paramInt;
    MMTabView localMMTabView1 = this.iLe.iLj;
    ColorStateList localColorStateList1;
    ColorStateList localColorStateList2;
    label59: ColorStateList localColorStateList3;
    label92: MMTabView localMMTabView4;
    if (paramInt == 0)
    {
      localColorStateList1 = getResources().getColorStateList(com.tencent.mm.f.Ph);
      localMMTabView1.setTextColor(localColorStateList1);
      MMTabView localMMTabView2 = this.iLf.iLj;
      if (paramInt != 1)
        break label162;
      localColorStateList2 = getResources().getColorStateList(com.tencent.mm.f.Ph);
      localMMTabView2.setTextColor(localColorStateList2);
      MMTabView localMMTabView3 = this.iLg.iLj;
      if (paramInt != 2)
        break label177;
      localColorStateList3 = getResources().getColorStateList(com.tencent.mm.f.Ph);
      localMMTabView3.setTextColor(localColorStateList3);
      localMMTabView4 = this.iLh.iLj;
      if (paramInt != 3)
        break label192;
    }
    label162: label177: label192: for (ColorStateList localColorStateList4 = getResources().getColorStateList(com.tencent.mm.f.Ph); ; localColorStateList4 = getResources().getColorStateList(com.tencent.mm.f.Ol))
    {
      localMMTabView4.setTextColor(localColorStateList4);
      this.iKK = System.currentTimeMillis();
      this.iKL = this.hFC;
      return;
      localColorStateList1 = getResources().getColorStateList(com.tencent.mm.f.Ol);
      break;
      localColorStateList2 = getResources().getColorStateList(com.tencent.mm.f.Ol);
      break label59;
      localColorStateList3 = getResources().getColorStateList(com.tencent.mm.f.Ol);
      break label92;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt3 - paramInt1);
    z.d("!44@/B4Tb64lLpKf6BwZaHy6XtTBtHJGvRAE6ZpOmb+TUBQ=", "on layout, width %d", arrayOfObject1);
    this.iLa = ((paramInt3 - paramInt1) / 4);
    int i = this.iLa;
    Object[] arrayOfObject2;
    if ((this.iLb == null) || (this.iLb.getWidth() != i))
    {
      arrayOfObject2 = new Object[2];
      if (this.iLb != null)
        break label192;
    }
    label192: for (int j = -1; ; j = this.iLb.getWidth())
    {
      arrayOfObject2[0] = Integer.valueOf(j);
      arrayOfObject2[1] = Integer.valueOf(i);
      z.w("!44@/B4Tb64lLpKf6BwZaHy6XtTBtHJGvRAE6ZpOmb+TUBQ=", "sharp width changed, from %d to %d", arrayOfObject2);
      this.iLb = Bitmap.createBitmap(i, a.fromDPToPix(getContext(), 3), Bitmap.Config.ARGB_8888);
      new Canvas(this.iLb).drawColor(getResources().getColor(com.tencent.mm.f.Ph));
      b(this.hFC, 0.0F);
      this.iLc.setImageBitmap(this.iLb);
      oD(this.hFC);
      return;
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
        this.iLe.iLj.Bx(getContext().getString(n.cmN));
        return;
      }
      this.iLe.iLj.Bx(String.valueOf(paramInt));
      return;
    }
    this.iLe.iLj.Bx(null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LauncherUITabView
 * JD-Core Version:    0.6.2
 */