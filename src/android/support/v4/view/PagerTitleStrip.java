package android.support.v4.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class PagerTitleStrip extends ViewGroup
  implements bv
{
  private static final int[] en = { 16842804, 16842901, 16842904, 16842927 };
  private static final int[] eo = { 16843660 };
  private static final ar er = new as();
  ViewPager eb;
  TextView ec;
  TextView ed;
  TextView ee;
  private int ef = -1;
  private float eg = -1.0F;
  private int eh;
  private int ei;
  private boolean ej;
  private boolean ek;
  private final aq el = new aq(this, (byte)0);
  private WeakReference em;
  private int ep;
  int eq;

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      er = new at();
      return;
    }
  }

  public PagerTitleStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TextView localTextView1 = new TextView(paramContext);
    this.ec = localTextView1;
    addView(localTextView1);
    TextView localTextView2 = new TextView(paramContext);
    this.ed = localTextView2;
    addView(localTextView2);
    TextView localTextView3 = new TextView(paramContext);
    this.ee = localTextView3;
    addView(localTextView3);
    TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, en);
    int i = localTypedArray1.getResourceId(0, 0);
    if (i != 0)
    {
      this.ec.setTextAppearance(paramContext, i);
      this.ed.setTextAppearance(paramContext, i);
      this.ee.setTextAppearance(paramContext, i);
    }
    int j = localTypedArray1.getDimensionPixelSize(1, 0);
    if (j != 0)
    {
      float f = j;
      this.ec.setTextSize(0, f);
      this.ed.setTextSize(0, f);
      this.ee.setTextSize(0, f);
    }
    if (localTypedArray1.hasValue(2))
    {
      int m = localTypedArray1.getColor(2, 0);
      this.ec.setTextColor(m);
      this.ed.setTextColor(m);
      this.ee.setTextColor(m);
    }
    this.ei = localTypedArray1.getInteger(3, 80);
    localTypedArray1.recycle();
    this.eq = this.ed.getTextColors().getDefaultColor();
    this.ep = 153;
    int k = this.ep << 24 | 0xFFFFFF & this.eq;
    this.ec.setTextColor(k);
    this.ee.setTextColor(k);
    this.ec.setEllipsize(TextUtils.TruncateAt.END);
    this.ed.setEllipsize(TextUtils.TruncateAt.END);
    this.ee.setEllipsize(TextUtils.TruncateAt.END);
    boolean bool = false;
    if (i != 0)
    {
      TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(i, eo);
      bool = localTypedArray2.getBoolean(0, false);
      localTypedArray2.recycle();
    }
    if (bool)
    {
      a(this.ec);
      a(this.ed);
      a(this.ee);
    }
    while (true)
    {
      this.eh = ((int)(16.0F * paramContext.getResources().getDisplayMetrics().density));
      return;
      this.ec.setSingleLine();
      this.ed.setSingleLine();
      this.ee.setSingleLine();
    }
  }

  private static void a(TextView paramTextView)
  {
    er.a(paramTextView);
  }

  public final int R()
  {
    return this.eh;
  }

  void a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    int i;
    int k;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i9;
    int i10;
    int i15;
    int i16;
    int i17;
    int i21;
    int i23;
    int i24;
    int i25;
    if (paramInt != this.ef)
    {
      a(paramInt, this.eb.U());
      this.ek = true;
      i = this.ec.getMeasuredWidth();
      int j = this.ed.getMeasuredWidth();
      k = this.ee.getMeasuredWidth();
      int m = j / 2;
      n = getWidth();
      i1 = getHeight();
      i2 = getPaddingLeft();
      i3 = getPaddingRight();
      i4 = getPaddingTop();
      i5 = getPaddingBottom();
      int i6 = i2 + m;
      int i7 = i3 + m;
      int i8 = n - i6 - i7;
      float f = 0.5F + paramFloat;
      if (f > 1.0F)
        f -= 1.0F;
      i9 = n - i7 - (int)(f * i8) - m;
      i10 = i9 + j;
      int i11 = this.ec.getBaseline();
      int i12 = this.ed.getBaseline();
      int i13 = this.ee.getBaseline();
      int i14 = Math.max(Math.max(i11, i12), i13);
      i15 = i14 - i11;
      i16 = i14 - i12;
      i17 = i14 - i13;
      int i18 = i15 + this.ec.getMeasuredHeight();
      int i19 = i16 + this.ed.getMeasuredHeight();
      int i20 = i17 + this.ee.getMeasuredHeight();
      i21 = Math.max(Math.max(i18, i19), i20);
      switch (0x70 & this.ei)
      {
      default:
        i23 = i4 + i15;
        i24 = i16 + i4;
        i25 = i4 + i17;
      case 16:
      case 80:
      }
    }
    while (true)
    {
      this.ed.layout(i9, i24, i10, i24 + this.ed.getMeasuredHeight());
      int i26 = Math.min(i2, i9 - this.eh - i);
      this.ec.layout(i26, i23, i + i26, i23 + this.ec.getMeasuredHeight());
      int i27 = Math.max(n - i3 - k, i10 + this.eh);
      this.ee.layout(i27, i25, i27 + k, i25 + this.ee.getMeasuredHeight());
      this.eg = paramFloat;
      this.ek = false;
      return;
      if ((paramBoolean) || (paramFloat != this.eg))
        break;
      return;
      int i28 = (i1 - i4 - i5 - i21) / 2;
      i23 = i28 + i15;
      i24 = i16 + i28;
      i25 = i28 + i17;
      continue;
      int i22 = i1 - i5 - i21;
      i23 = i22 + i15;
      i24 = i16 + i22;
      i25 = i22 + i17;
    }
  }

  final void a(int paramInt, an paraman)
  {
    if (paraman != null)
      paraman.getCount();
    this.ej = true;
    this.ec.setText(null);
    this.ed.setText(null);
    this.ee.setText(null);
    int i = getWidth() - getPaddingLeft() - getPaddingRight();
    int j = getHeight() - getPaddingTop() - getPaddingBottom();
    int k = View.MeasureSpec.makeMeasureSpec((int)(0.8F * i), -2147483648);
    int m = View.MeasureSpec.makeMeasureSpec(j, -2147483648);
    this.ec.measure(k, m);
    this.ed.measure(k, m);
    this.ee.measure(k, m);
    this.ef = paramInt;
    if (!this.ek)
      a(paramInt, this.eg, false);
    this.ej = false;
  }

  final void a(an paraman1, an paraman2)
  {
    if (paraman1 != null)
    {
      paraman1.unregisterDataSetObserver(this.el);
      this.em = null;
    }
    if (paraman2 != null)
    {
      paraman2.registerDataSetObserver(this.el);
      this.em = new WeakReference(paraman2);
    }
    if (this.eb != null)
    {
      this.ef = -1;
      this.eg = -1.0F;
      a(this.eb.W(), paraman2);
      requestLayout();
    }
  }

  public void g(int paramInt)
  {
    this.eh = paramInt;
    requestLayout();
  }

  int getMinHeight()
  {
    Drawable localDrawable = getBackground();
    int i = 0;
    if (localDrawable != null)
      i = localDrawable.getIntrinsicHeight();
    return i;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ViewParent localViewParent = getParent();
    if (!(localViewParent instanceof ViewPager))
      throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    ViewPager localViewPager = (ViewPager)localViewParent;
    an localan1 = localViewPager.U();
    localViewPager.b(this.el);
    localViewPager.a(this.el);
    this.eb = localViewPager;
    if (this.em != null);
    for (an localan2 = (an)this.em.get(); ; localan2 = null)
    {
      a(localan2, localan1);
      return;
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.eb != null)
    {
      a(this.eb.U(), null);
      this.eb.b(null);
      this.eb.a(null);
      this.eb = null;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.eb != null)
    {
      boolean bool = this.eg < 0.0F;
      float f = 0.0F;
      if (!bool)
        f = this.eg;
      a(this.ef, f, true);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt2);
    if (i != 1073741824)
      throw new IllegalStateException("Must measure with an exact width");
    int n = getMinHeight();
    int i1 = getPaddingTop() + getPaddingBottom();
    int i2 = m - i1;
    int i3 = View.MeasureSpec.makeMeasureSpec((int)(0.8F * k), -2147483648);
    int i4 = View.MeasureSpec.makeMeasureSpec(i2, -2147483648);
    this.ec.measure(i3, i4);
    this.ed.measure(i3, i4);
    this.ee.measure(i3, i4);
    if (j == 1073741824)
    {
      setMeasuredDimension(k, m);
      return;
    }
    setMeasuredDimension(k, Math.max(n, i1 + this.ed.getMeasuredHeight()));
  }

  public void requestLayout()
  {
    if (!this.ej)
      super.requestLayout();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.PagerTitleStrip
 * JD-Core Version:    0.6.2
 */