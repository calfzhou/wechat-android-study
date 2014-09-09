package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;
import com.tencent.mm.g;
import com.tencent.mm.h;
import com.tencent.mm.sdk.platformtools.z;

public class MMVisiblePasswordEditText extends EditText
{
  public String iYA = "";
  final Drawable jdA = getResources().getDrawable(h.Wp);
  private boolean jdB = false;
  final Drawable jdz = getResources().getDrawable(h.Wo);

  public MMVisiblePasswordEditText(Context paramContext)
  {
    super(paramContext);
    cp();
  }

  public MMVisiblePasswordEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    cp();
  }

  public MMVisiblePasswordEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    cp();
  }

  private void aSZ()
  {
    int i = getSelectionStart();
    int j = getSelectionEnd();
    if (this.jdB)
    {
      setInputType(1);
      setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.jdA, getCompoundDrawables()[3]);
    }
    while (true)
    {
      setSelection(i, j);
      return;
      setInputType(129);
      setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.jdz, getCompoundDrawables()[3]);
    }
  }

  private void cp()
  {
    this.jdz.setBounds(0, 0, this.jdz.getIntrinsicWidth(), this.jdz.getIntrinsicHeight());
    this.jdA.setBounds(0, 0, this.jdA.getIntrinsicWidth(), this.jdA.getIntrinsicHeight());
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.jdz.getIntrinsicWidth());
    arrayOfObject[1] = Integer.valueOf(this.jdz.getIntrinsicHeight());
    z.d("!56@/B4Tb64lLpIeSqVHC6FpCitb8mM4LSwL+kVR6pUSVkqLG7RV2oSlOw==", "closeEye width %d height %d", arrayOfObject);
    aSZ();
    setHeight(this.jdz.getIntrinsicHeight() + 5 * getResources().getDimensionPixelSize(g.PJ));
    setOnTouchListener(new fg(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMVisiblePasswordEditText
 * JD-Core Version:    0.6.2
 */