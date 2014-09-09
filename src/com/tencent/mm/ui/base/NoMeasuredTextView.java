package com.tencent.mm.ui.base;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.BoringLayout.Metrics;
import android.text.Editable.Factory;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Selection;
import android.text.Spannable.Factory;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.mm.sdk.platformtools.ch;

@SuppressLint({"ResourceAsColor"})
public class NoMeasuredTextView extends View
{
  private static final BoringLayout.Metrics jeV = new BoringLayout.Metrics();
  private int ei = 51;
  private ColorStateList fCm;
  private TextPaint gEm = new TextPaint(1);
  private int jM = 0;
  private boolean jbM;
  private int jeA = 0;
  private int jeB = 1;
  private boolean jeC = false;
  private boolean jeD = false;
  private int jeE = -1;
  private boolean jeF = true;
  private BoringLayout jeG;
  private boolean jeH = false;
  private int jeI;
  private Paint.FontMetricsInt jeJ;
  private boolean jeK = false;
  private boolean jeL = false;
  private fm jeM;
  private boolean jeN = false;
  private boolean jeO = false;
  private boolean jeP = false;
  private boolean jeQ = false;
  private int jeR = -1;
  private int jeS = -1;
  private int jeT = -1;
  private int jeU = -1;
  private int jeo;
  private Editable.Factory jep = Editable.Factory.getInstance();
  private Spannable.Factory jeq = Spannable.Factory.getInstance();
  private TextUtils.TruncateAt jer = null;
  private CharSequence jes = "";
  private int jet = fl.jeW;
  private KeyListener jeu;
  private Layout jev;
  private float jew = 1.0F;
  private float jex = 0.0F;
  private int jey = 2147483647;
  private int jez = 1;
  private CharSequence mText = "";
  private int pw = 2147483647;

  static
  {
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.measureText("H");
  }

  public NoMeasuredTextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public NoMeasuredTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.gEm.density = getResources().getDisplayMetrics().density;
    setDrawingCacheEnabled(false);
    this.jeJ = this.gEm.getFontMetricsInt();
    aTr();
    this.jbM = true;
    this.jeA = 1;
    this.jey = 1;
    this.jeB = 1;
    this.jez = 1;
    requestLayout();
    invalidate();
    this.jer = null;
    if (this.jev != null)
    {
      aTp();
      requestLayout();
      invalidate();
    }
  }

  private void a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    fm localfm = this.jeM;
    int i;
    if ((paramDrawable1 != null) || (paramDrawable2 != null))
      i = 1;
    while (i == 0)
    {
      if (localfm != null)
      {
        if (localfm.jfn == 0)
          this.jeM = null;
      }
      else
      {
        invalidate();
        return;
        i = 0;
        continue;
      }
      if (localfm.jfd != null)
        localfm.jfd.setCallback(null);
      localfm.jfd = null;
      if (localfm.jfb != null)
        localfm.jfb.setCallback(null);
      localfm.jfb = null;
      if (localfm.jfe != null)
        localfm.jfe.setCallback(null);
      localfm.jfe = null;
      if (localfm.jfc != null)
        localfm.jfc.setCallback(null);
      localfm.jfc = null;
      localfm.jfl = 0;
      localfm.jfh = 0;
    }
    label405: 
    while (true)
    {
      localfm.jfm = 0;
      localfm.jfi = 0;
      localfm.jfj = 0;
      localfm.jff = 0;
      localfm.jfk = 0;
      localfm.jfg = 0;
      break;
      if (localfm == null)
      {
        localfm = new fm(this);
        this.jeM = localfm;
      }
      if ((localfm.jfd != paramDrawable1) && (localfm.jfd != null))
        localfm.jfd.setCallback(null);
      localfm.jfd = paramDrawable1;
      if ((localfm.jfb != null) && (localfm.jfb != null))
        localfm.jfb.setCallback(null);
      localfm.jfb = null;
      if ((localfm.jfe != paramDrawable2) && (localfm.jfe != null))
        localfm.jfe.setCallback(null);
      localfm.jfe = paramDrawable2;
      if ((localfm.jfc != null) && (localfm.jfc != null))
        localfm.jfc.setCallback(null);
      localfm.jfc = null;
      Rect localRect = localfm.jfa;
      int[] arrayOfInt = getDrawableState();
      if (paramDrawable1 != null)
      {
        paramDrawable1.setState(arrayOfInt);
        paramDrawable1.copyBounds(localRect);
        paramDrawable1.setCallback(this);
        localfm.jfh = localRect.width();
        localfm.jfl = localRect.height();
      }
      while (true)
      {
        if (paramDrawable2 == null)
          break label405;
        paramDrawable2.setState(arrayOfInt);
        paramDrawable2.copyBounds(localRect);
        paramDrawable2.setCallback(this);
        localfm.jfi = localRect.width();
        localfm.jfm = localRect.height();
        break;
        localfm.jfl = 0;
        localfm.jfh = 0;
      }
    }
  }

  private int aTo()
  {
    int i = 0x70 & this.ei;
    Layout localLayout = this.jev;
    int j = 0;
    int k;
    int m;
    if (i != 48)
    {
      k = getMeasuredHeight() - getExtendedPaddingTop() - getExtendedPaddingBottom();
      m = localLayout.getHeight();
      j = 0;
      if (m < k)
      {
        if (i != 80)
          break label66;
        j = k - m;
      }
    }
    return j;
    label66: return k - m >> 1;
  }

  private void aTp()
  {
    if (((this.jev instanceof BoringLayout)) && (this.jeG == null))
      this.jeG = ((BoringLayout)this.jev);
    this.jev = null;
  }

  private void aTq()
  {
    if (this.jeC);
    for (int i = this.pw - getCompoundPaddingLeft() - getCompoundPaddingRight(); ; i = getRight() - getLeft() - getCompoundPaddingLeft() - getCompoundPaddingRight())
    {
      if (i <= 0)
        i = 0;
      bi(i, i);
      return;
    }
  }

  private void aTr()
  {
    if (this.jeI == 0)
      this.jeI = ((int)(2.0D + Math.ceil(this.jeJ.descent - this.jeJ.ascent)));
  }

  private void bi(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0);
    for (int i = 0; ; i = paramInt1)
    {
      Layout.Alignment localAlignment;
      switch (0x7 & this.ei)
      {
      default:
        localAlignment = Layout.Alignment.ALIGN_NORMAL;
        if ((this.jer == null) || (this.jeu != null))
          break;
      case 1:
      case 5:
      }
      for (int j = 1; ; j = 0)
      {
        if (j == 0)
          break label139;
        this.jev = new StaticLayout(this.jes, 0, this.jes.length(), this.gEm, i, localAlignment, this.jew, this.jex, this.jeF, this.jer, paramInt2);
        return;
        localAlignment = Layout.Alignment.ALIGN_CENTER;
        break;
        localAlignment = Layout.Alignment.ALIGN_OPPOSITE;
        break;
      }
      label139: this.jev = new StaticLayout(this.jes, this.gEm, i, localAlignment, this.jew, this.jex, this.jeF);
      return;
    }
  }

  private int getCompoundPaddingBottom()
  {
    fm localfm = this.jeM;
    if ((localfm == null) || (localfm.jfc == null) || (!this.jeQ))
      return getPaddingBottom();
    return getPaddingBottom() + localfm.jfn + localfm.jfg;
  }

  private int getCompoundPaddingLeft()
  {
    fm localfm = this.jeM;
    if ((localfm == null) || (localfm.jfd == null) || (!this.jeN))
      return getPaddingLeft();
    return getPaddingLeft() + localfm.jfn + localfm.jfh;
  }

  private int getCompoundPaddingRight()
  {
    fm localfm = this.jeM;
    if ((localfm == null) || (localfm.jfe == null) || (!this.jeO))
      return getPaddingRight();
    return getPaddingRight() + localfm.jfn + localfm.jfi;
  }

  private int getCompoundPaddingTop()
  {
    fm localfm = this.jeM;
    if ((localfm == null) || (localfm.jfb == null) || (!this.jeP))
      return getPaddingTop();
    return getPaddingTop() + localfm.jfn + localfm.jff;
  }

  private int getExtendedPaddingBottom()
  {
    int i;
    if ((this.jev == null) || (this.jez != 1))
      i = getCompoundPaddingBottom();
    int k;
    int m;
    int n;
    do
    {
      do
      {
        return i;
        if (this.jev.getLineCount() <= this.jey)
          return getCompoundPaddingBottom();
        int j = getCompoundPaddingTop();
        i = getCompoundPaddingBottom();
        k = getHeight() - j - i;
        m = this.jev.getLineTop(this.jey);
      }
      while (m >= k);
      n = 0x70 & this.ei;
      if (n == 48)
        return i + k - m;
    }
    while (n == 80);
    return i + (k - m) / 2;
  }

  private int getExtendedPaddingTop()
  {
    int i;
    if ((this.jev == null) || (this.jez != 1))
      i = getCompoundPaddingTop();
    int k;
    int m;
    int n;
    do
    {
      do
      {
        return i;
        if (this.jev.getLineCount() <= this.jey)
          return getCompoundPaddingTop();
        i = getCompoundPaddingTop();
        int j = getCompoundPaddingBottom();
        k = getHeight() - i - j;
        m = this.jev.getLineTop(this.jey);
      }
      while (m >= k);
      n = 0x70 & this.ei;
    }
    while (n == 48);
    if (n == 80)
      return i + k - m;
    return i + (k - m) / 2;
  }

  private void updateTextColors()
  {
    int i = this.fCm.getColorForState(getDrawableState(), 0);
    int j = this.jeo;
    int k = 0;
    if (i != j)
    {
      this.jeo = i;
      k = 1;
    }
    if (k != 0)
      invalidate();
  }

  public final void aTn()
  {
    int i = 0x7 & this.ei;
    int j = 0;
    if (5 != i)
      j = 1;
    if (53 != this.ei)
      invalidate();
    this.ei = 53;
    if ((this.jev != null) && (j != 0))
    {
      int k = this.jev.getWidth();
      bi(k, getWidth() - getCompoundPaddingLeft() - getCompoundPaddingRight());
    }
  }

  public final void ac(float paramFloat)
  {
    Context localContext = getContext();
    if (localContext == null);
    for (Resources localResources = Resources.getSystem(); ; localResources = localContext.getResources())
    {
      float f = TypedValue.applyDimension(0, paramFloat, localResources.getDisplayMetrics());
      if (f != this.gEm.getTextSize())
      {
        this.gEm.setTextSize(f);
        this.jeJ = this.gEm.getFontMetricsInt();
        this.jeI = ((int)(2.0D + Math.ceil(this.jeJ.descent - this.jeJ.ascent)));
        if (this.jev != null)
        {
          aTp();
          requestLayout();
          invalidate();
        }
      }
      return;
    }
  }

  protected int computeHorizontalScrollRange()
  {
    if (this.jev != null)
      return this.jev.getWidth();
    return super.computeHorizontalScrollRange();
  }

  protected int computeVerticalScrollExtent()
  {
    return getHeight() - getCompoundPaddingTop() - getCompoundPaddingBottom();
  }

  protected int computeVerticalScrollRange()
  {
    if (this.jev != null)
      return this.jev.getHeight();
    return super.computeVerticalScrollRange();
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.fCm != null) && (this.fCm.isStateful()))
      updateTextColors();
    fm localfm = this.jeM;
    if (localfm != null)
    {
      int[] arrayOfInt = getDrawableState();
      if ((localfm.jfb != null) && (localfm.jfb.isStateful()))
        localfm.jfb.setState(arrayOfInt);
      if ((localfm.jfc != null) && (localfm.jfc.isStateful()))
        localfm.jfc.setState(arrayOfInt);
      if ((localfm.jfd != null) && (localfm.jfd.isStateful()))
        localfm.jfd.setState(arrayOfInt);
      if ((localfm.jfe != null) && (localfm.jfe.isStateful()))
        localfm.jfe.setState(arrayOfInt);
    }
  }

  public final void eX(boolean paramBoolean)
  {
    this.jeN = paramBoolean;
  }

  public final void eY(boolean paramBoolean)
  {
    this.jeO = paramBoolean;
  }

  public final void eZ(boolean paramBoolean)
  {
    this.jeL = paramBoolean;
  }

  public int getBaseline()
  {
    if (this.jev == null)
      return super.getBaseline();
    if ((0x70 & this.ei) != 48);
    for (int i = aTo(); ; i = 0)
      return i + getExtendedPaddingTop() + this.jev.getLineBaseline(0);
  }

  public void getFocusedRect(Rect paramRect)
  {
    if (this.jev == null)
    {
      super.getFocusedRect(paramRect);
      return;
    }
    int i = Selection.getSelectionEnd(this.mText);
    if (i < 0)
    {
      super.getFocusedRect(paramRect);
      return;
    }
    int j = this.jev.getLineForOffset(i);
    paramRect.top = this.jev.getLineTop(j);
    paramRect.bottom = this.jev.getLineBottom(j);
    paramRect.left = ((int)this.jev.getPrimaryHorizontal(i));
    paramRect.right = (1 + paramRect.left);
    int k = getCompoundPaddingLeft();
    int m = getExtendedPaddingTop();
    if ((0x70 & this.ei) != 48)
      m += aTo();
    paramRect.offset(k, m);
  }

  public final TextPaint getPaint()
  {
    return this.gEm;
  }

  public final float getTextSize()
  {
    return this.gEm.getTextSize();
  }

  public void invalidateDrawable(Drawable paramDrawable)
  {
    Rect localRect;
    int i;
    int j;
    fm localfm;
    if (verifyDrawable(paramDrawable))
    {
      localRect = paramDrawable.getBounds();
      i = getScrollX();
      j = getScrollY();
      localfm = this.jeM;
      if (localfm != null)
      {
        if (paramDrawable != localfm.jfd)
          break label129;
        int i5 = getCompoundPaddingTop();
        int i6 = getCompoundPaddingBottom();
        int i7 = getBottom() - getTop() - i6 - i5;
        i += getPaddingLeft();
        j += i5 + (i7 - localfm.jfl) / 2;
      }
    }
    while (true)
    {
      invalidate(i + localRect.left, j + localRect.top, i + localRect.right, j + localRect.bottom);
      return;
      label129: if (paramDrawable == localfm.jfe)
      {
        int i2 = getCompoundPaddingTop();
        int i3 = getCompoundPaddingBottom();
        int i4 = getBottom() - getTop() - i3 - i2;
        i += getRight() - getLeft() - getPaddingRight() - localfm.jfi;
        j += i2 + (i4 - localfm.jfm) / 2;
      }
      else if (paramDrawable == localfm.jfb)
      {
        int n = getCompoundPaddingLeft();
        int i1 = getCompoundPaddingRight();
        i += n + (getRight() - getLeft() - i1 - n - localfm.jfj) / 2;
        j += getPaddingTop();
      }
      else if (paramDrawable == localfm.jfc)
      {
        int k = getCompoundPaddingLeft();
        int m = getCompoundPaddingRight();
        i += k + (getRight() - getLeft() - m - k - localfm.jfk) / 2;
        j += getBottom() - getTop() - getPaddingBottom() - localfm.jfg;
      }
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getCompoundPaddingLeft();
    int j = getCompoundPaddingTop();
    int k = getCompoundPaddingRight();
    int m = getCompoundPaddingBottom();
    int n = getScrollX();
    int i1 = getScrollY();
    int i2 = getRight();
    int i3 = getLeft();
    int i4 = getBottom();
    int i5 = getTop();
    int i6 = getWidth();
    int i7 = getHeight();
    fm localfm = this.jeM;
    float f1 = -1.0F;
    float f3;
    if (localfm != null)
    {
      int i17 = i4 - i5 - m - j;
      int i18 = i2 - i3 - k - i;
      if ((this.jeN) && (localfm.jfd != null))
      {
        paramCanvas.save();
        paramCanvas.translate(n + getPaddingLeft(), i1 + j + (i17 - localfm.jfl) / 2);
        localfm.jfd.draw(paramCanvas);
        paramCanvas.restore();
      }
      if ((this.jeO) && (localfm.jfe != null))
      {
        paramCanvas.save();
        if (!this.jeH)
          break label668;
        f3 = this.gEm.measureText(this.mText, 0, this.mText.length());
        f1 = f3;
        paramCanvas.translate(f3 + n - getPaddingRight(), j + i1 + (i17 - localfm.jfm) / 2);
        localfm.jfe.draw(paramCanvas);
        paramCanvas.restore();
      }
      if ((this.jeP) && (localfm.jfb != null))
      {
        paramCanvas.save();
        paramCanvas.translate(n + i + (i18 - localfm.jfj) / 2, i1 + getPaddingTop());
        localfm.jfb.draw(paramCanvas);
        paramCanvas.restore();
      }
      if ((this.jeQ) && (localfm.jfc != null))
      {
        paramCanvas.save();
        paramCanvas.translate(n + i + (i18 - localfm.jfk) / 2, i1 + i4 - i5 - getPaddingBottom() - localfm.jfg);
        localfm.jfc.draw(paramCanvas);
        paramCanvas.restore();
      }
    }
    int i8 = this.jeo;
    this.gEm.setColor(i8);
    this.gEm.drawableState = getDrawableState();
    paramCanvas.save();
    int i9 = getExtendedPaddingTop();
    int i10 = getExtendedPaddingBottom();
    paramCanvas.clipRect(i + n, i9 + i1, n + (i2 - i3 - k), i1 + (i4 - i5 - i10));
    int i11 = 0x70 & this.ei;
    int i12 = 0;
    int i13 = 0;
    if (i11 != 48)
    {
      i13 = aTo();
      i12 = aTo();
    }
    paramCanvas.translate(i, i9 + i13);
    int i15;
    if (this.jeH)
    {
      float f2 = (i7 - (this.jeJ.bottom - this.jeJ.top)) / 2 - this.jeJ.top;
      int i14 = 0x7 & this.ei;
      i15 = 0;
      int i16;
      if (i14 != 3)
      {
        i16 = 0x7 & this.ei;
        i15 = 0;
      }
      switch (i16)
      {
      default:
        label636: paramCanvas.drawText(this.mText, 0, this.mText.length(), i15, f2, this.gEm);
      case 5:
      case 1:
      }
    }
    while (true)
    {
      paramCanvas.restore();
      return;
      label668: f3 = FloatMath.ceil(Layout.getDesiredWidth(this.jes, this.gEm));
      break;
      if (f1 == -1.0F)
        f1 = this.gEm.measureText(this.mText, 0, this.mText.length());
      i15 = (int)(i6 - getPaddingRight() - f1);
      break label636;
      if (f1 == -1.0F)
        f1 = this.gEm.measureText(this.mText, 0, this.mText.length());
      i15 = (int)(i6 - getPaddingRight() - f1) / 2;
      break label636;
      if (this.jev == null)
        aTq();
      this.jev.draw(paramCanvas, null, null, i12 - i13);
    }
  }

  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    CharSequence localCharSequence = getContentDescription();
    if (ch.jb((String)localCharSequence))
      localCharSequence = this.mText;
    paramAccessibilityNodeInfo.setText(localCharSequence);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.jeK) && (getMeasuredWidth() > 0))
    {
      setText(TextUtils.ellipsize(this.mText, this.gEm, getMeasuredWidth() - getCompoundPaddingRight() - getCompoundPaddingLeft(), TextUtils.TruncateAt.END));
      this.jeK = false;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    View.MeasureSpec.getMode(paramInt1);
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getSize(paramInt2);
    if (j == 0)
    {
      setMeasuredDimension(j, this.jeI);
      return;
    }
    if (this.jeH)
    {
      if (this.jeI == 0)
        aTr();
      setMeasuredDimension(j, this.jeI);
      return;
    }
    int m = getCompoundPaddingLeft() + getCompoundPaddingRight();
    int n;
    label118: int i5;
    if (this.jeC)
    {
      n = this.pw - m;
      if (this.jev != null)
        break label160;
      bi(n, n);
      if (i != 1073741824)
        break label197;
      this.jeE = -1;
      i5 = k;
    }
    label160: label195: label197: Layout localLayout;
    while (true)
    {
      scrollTo(0, 0);
      setMeasuredDimension(j, i5);
      return;
      n = j - m;
      break;
      if (this.jev.getWidth() != n);
      for (int i1 = 1; ; i1 = 0)
      {
        if (i1 == 0)
          break label195;
        bi(n, n);
        break;
      }
      break label118;
      localLayout = this.jev;
      if (localLayout != null)
        break label237;
      i5 = 0;
      this.jeE = i5;
      if (i == -2147483648)
        i5 = Math.min(i5, k);
    }
    label237: int i2 = localLayout.getLineCount();
    int i3 = getCompoundPaddingTop() + getCompoundPaddingBottom();
    int i4 = i3 + localLayout.getLineTop(i2);
    if (this.jez == 1)
    {
      if (i2 > this.jey)
      {
        i4 = i3 + (localLayout.getLineTop(this.jey) + localLayout.getBottomPadding());
        i2 = this.jey;
      }
      label310: if (this.jeB != 1)
        break label390;
      if (i2 < this.jeA)
        i4 += Math.round(this.gEm.getFontMetricsInt(null) * this.jew + this.jex) * (this.jeA - i2);
    }
    while (true)
    {
      i5 = Math.max(i4, getSuggestedMinimumHeight());
      break;
      i4 = Math.min(i4, this.jey);
      break label310;
      label390: i4 = Math.max(i4, this.jeA);
    }
  }

  public final void pN(int paramInt)
  {
    if (paramInt != this.jeR)
    {
      this.jeR = paramInt;
      Drawable localDrawable = getResources().getDrawable(paramInt);
      if ((localDrawable != null) && ((this.jeM == null) || (this.jeM.jfd != localDrawable)))
      {
        localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
        a(localDrawable, null);
      }
    }
  }

  public final void pO(int paramInt)
  {
    if (paramInt != this.jeS)
    {
      this.jeS = paramInt;
      Drawable localDrawable = getResources().getDrawable(paramInt);
      if ((localDrawable != null) && ((this.jeM == null) || (this.jeM.jfe != localDrawable)))
      {
        localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
        a(null, localDrawable);
      }
    }
  }

  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 != getPaddingLeft()) || (paramInt3 != getPaddingRight()) || (paramInt2 != getPaddingTop()) || (paramInt4 != getPaddingBottom()))
      aTp();
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    invalidate();
  }

  public final void setText(CharSequence paramCharSequence)
  {
    int i = this.jet;
    if (paramCharSequence == null)
      paramCharSequence = "";
    label58: int j;
    if (!paramCharSequence.equals(this.mText))
    {
      if (!(paramCharSequence instanceof Spanned))
        break label156;
      this.jeH = false;
      if ((i != fl.jeY) && (this.jeu == null))
        break label164;
      paramCharSequence = this.jep.newEditable(paramCharSequence);
      j = getCompoundPaddingRight() + getCompoundPaddingLeft();
      if (this.jeL)
      {
        if (!this.jeC)
          break label183;
        int i1 = this.pw;
        if (getMeasuredWidth() > 0)
          i1 = Math.min(this.pw, getMeasuredWidth());
        paramCharSequence = TextUtils.ellipsize(paramCharSequence, this.gEm, i1 - j, TextUtils.TruncateAt.END);
      }
    }
    while (true)
    {
      this.jet = i;
      this.mText = paramCharSequence;
      this.jes = paramCharSequence;
      if (!this.jeH)
        break label220;
      aTr();
      invalidate();
      return;
      label156: this.jeH = true;
      break;
      label164: if (i != fl.jeX)
        break label58;
      paramCharSequence = this.jeq.newSpannable(paramCharSequence);
      break label58;
      label183: if (getMeasuredWidth() > 0)
        paramCharSequence = TextUtils.ellipsize(paramCharSequence, this.gEm, getMeasuredWidth() - j, TextUtils.TruncateAt.END);
      else
        this.jeK = true;
    }
    label220: if (getWidth() != 0)
    {
      if (this.jev == null)
      {
        aTq();
        if (this.jev.getHeight() != getHeight())
          requestLayout();
        invalidate();
        return;
      }
      int k = this.jev.getHeight();
      int m = this.jev.getWidth();
      bi(m, m - j);
      if (this.jer != TextUtils.TruncateAt.MARQUEE)
      {
        if ((getLayoutParams().height != -2) && (getLayoutParams().height != -1))
        {
          invalidate();
          return;
        }
        int n = this.jev.getHeight();
        if ((n == k) && (n == getHeight()))
        {
          invalidate();
          return;
        }
      }
    }
    requestLayout();
    invalidate();
  }

  public final void setTextColor(ColorStateList paramColorStateList)
  {
    if (paramColorStateList == null)
      throw new NullPointerException();
    if (this.fCm == paramColorStateList)
      return;
    this.fCm = paramColorStateList;
    updateTextColors();
  }

  public final void setTypeface(Typeface paramTypeface)
  {
    if (this.gEm.getTypeface() != paramTypeface)
    {
      this.gEm.setTypeface(paramTypeface);
      if (this.jev != null)
      {
        aTp();
        requestLayout();
        invalidate();
      }
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool = super.verifyDrawable(paramDrawable);
    if ((!bool) && (this.jeM != null))
    {
      if ((paramDrawable == this.jeM.jfd) || (paramDrawable == this.jeM.jfb) || (paramDrawable == this.jeM.jfe) || (paramDrawable == this.jeM.jfc))
        bool = true;
    }
    else
      return bool;
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.NoMeasuredTextView
 * JD-Core Version:    0.6.2
 */