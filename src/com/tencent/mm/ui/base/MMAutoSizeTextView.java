package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.sdk.platformtools.z;

public class MMAutoSizeTextView extends TextView
{
  private float hFw;
  private float hFx;
  private Paint hFy;
  private float hFz;

  public MMAutoSizeTextView(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public MMAutoSizeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public MMAutoSizeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  private void ad(String paramString, int paramInt)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = paramString;
    arrayOfObject1[1] = Integer.valueOf(paramInt);
    z.i("!44@/B4Tb64lLpLS6P3BqH8AcjtW4wLTxOu6r5EIqKGWvwI=", "autoAdjustTextSize[text=%s, viewWidth=%d]", arrayOfObject1);
    if (paramInt <= 0)
      return;
    int i = paramInt - getPaddingLeft() - getPaddingRight();
    float f = this.hFz;
    this.hFy.setTextSize(f);
    while (true)
    {
      if ((f > this.hFw) && (this.hFy.measureText(paramString) > i))
      {
        f -= 1.0F;
        if (f <= this.hFw)
          f = this.hFw;
      }
      else
      {
        Object[] arrayOfObject2 = new Object[4];
        arrayOfObject2[0] = Float.valueOf(f);
        arrayOfObject2[1] = Float.valueOf(this.hFz);
        arrayOfObject2[2] = Float.valueOf(this.hFy.measureText(paramString));
        arrayOfObject2[3] = Integer.valueOf(i);
        z.i("!44@/B4Tb64lLpLS6P3BqH8AcjtW4wLTxOu6r5EIqKGWvwI=", "try size[%f], maxSize[%f], measureTextSize[%f], availableWidth[%d]", arrayOfObject2);
        setTextSize(0, f);
        return;
      }
      this.hFy.setTextSize(f);
    }
  }

  private void init()
  {
    setSingleLine();
    setEllipsize(TextUtils.TruncateAt.END);
    this.hFw = a.fromDPToPix(getContext(), 8);
    this.hFx = a.fromDPToPix(getContext(), 22);
    this.hFy = new Paint();
    this.hFy.set(getPaint());
    this.hFz = getTextSize();
    if (this.hFz <= this.hFw)
      this.hFz = this.hFx;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    z.w("!44@/B4Tb64lLpLS6P3BqH8AcjtW4wLTxOu6r5EIqKGWvwI=", "on size changed");
    if (paramInt1 != paramInt3)
      ad(getText().toString(), paramInt1);
  }

  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    z.w("!44@/B4Tb64lLpLS6P3BqH8AcjtW4wLTxOu6r5EIqKGWvwI=", "on text changed");
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    ad(paramCharSequence.toString(), getWidth());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMAutoSizeTextView
 * JD-Core Version:    0.6.2
 */