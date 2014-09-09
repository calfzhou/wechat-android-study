package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.n;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.mm.g;
import com.tencent.mm.i;
import com.tencent.mm.k;

public class ActivityChooserView extends ViewGroup
{
  private final s nN;
  private final t nO;
  private final LinearLayout nP;
  private final Drawable nQ;
  private final FrameLayout nR;
  private final ImageView nS;
  private final FrameLayout nT;
  private final ImageView nU;
  private final int nV;
  n nW;
  private final DataSetObserver nX = new p(this);
  private final ViewTreeObserver.OnGlobalLayoutListener nY = new q(this);
  private ListPopupWindow nZ;
  private PopupWindow.OnDismissListener oa;
  private boolean ob;
  private int oc = 4;
  private boolean od;
  private int oe;

  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, com.tencent.mm.p.cvA, paramInt, 0);
    this.oc = localTypedArray.getInt(com.tencent.mm.p.cvC, 4);
    Drawable localDrawable = localTypedArray.getDrawable(com.tencent.mm.p.cvB);
    localTypedArray.recycle();
    LayoutInflater.from(getContext()).inflate(k.bao, this, true);
    this.nO = new t(this, (byte)0);
    this.nP = ((LinearLayout)findViewById(i.aep));
    this.nQ = this.nP.getBackground();
    this.nT = ((FrameLayout)findViewById(i.apv));
    this.nT.setOnClickListener(this.nO);
    this.nT.setOnLongClickListener(this.nO);
    this.nU = ((ImageView)this.nT.findViewById(i.axK));
    this.nR = ((FrameLayout)findViewById(i.asf));
    this.nR.setOnClickListener(this.nO);
    this.nS = ((ImageView)this.nR.findViewById(i.axK));
    this.nS.setImageDrawable(localDrawable);
    this.nN = new s(this, (byte)0);
    this.nN.registerDataSetObserver(new r(this));
    Resources localResources = paramContext.getResources();
    this.nV = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(g.PU));
  }

  private ListPopupWindow cK()
  {
    if (this.nZ == null)
    {
      this.nZ = new ListPopupWindow(getContext());
      this.nZ.setAdapter(this.nN);
      this.nZ.setAnchorView(this);
      this.nZ.cT();
      this.nZ.setOnItemClickListener(this.nO);
      this.nZ.setOnDismissListener(this.nO);
    }
    return this.nZ;
  }

  public final boolean cI()
  {
    if (cK().isShowing())
    {
      cK().dismiss();
      ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
      if (localViewTreeObserver.isAlive())
        localViewTreeObserver.removeGlobalOnLayoutListener(this.nY);
    }
    return true;
  }

  public final boolean cJ()
  {
    return cK().isShowing();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    j localj = this.nN.cM();
    if (localj != null)
      localj.registerObserver(this.nX);
    this.od = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    j localj = this.nN.cM();
    if (localj != null)
      localj.unregisterObserver(this.nX);
    ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
    if (localViewTreeObserver.isAlive())
      localViewTreeObserver.removeGlobalOnLayoutListener(this.nY);
    if (cK().isShowing())
      cI();
    this.od = false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.nP.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
    if (!cK().isShowing())
      cI();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    LinearLayout localLinearLayout = this.nP;
    if (this.nT.getVisibility() != 0)
      paramInt2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 1073741824);
    measureChild(localLinearLayout, paramInt1, paramInt2);
    setMeasuredDimension(localLinearLayout.getMeasuredWidth(), localLinearLayout.getMeasuredHeight());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActivityChooserView
 * JD-Core Version:    0.6.2
 */