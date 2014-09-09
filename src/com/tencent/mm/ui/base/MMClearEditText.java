package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.TextView.SavedState;
import com.tencent.mm.ar.b;
import com.tencent.mm.g;
import com.tencent.mm.h;
import com.tencent.mm.sdk.platformtools.z;

public class MMClearEditText extends EditText
{
  public String iYA = "";
  public boolean iYB = false;
  int iYC = 0;
  private View.OnFocusChangeListener iYD = null;
  final Drawable iYi = getResources().getDrawable(h.aaf);

  public MMClearEditText(Context paramContext)
  {
    super(paramContext);
    cp();
  }

  public MMClearEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    cp();
  }

  public MMClearEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    cp();
  }

  private void BO(String paramString)
  {
    int i = getSelectionStart();
    setText(b.a(getContext(), paramString, (int)getTextSize(), false));
    int j = getText().length() - paramString.length();
    if (j > 0)
    {
      int k = i + j;
      if (k <= getText().length())
        setSelection(k);
      return;
    }
    setSelection(i);
  }

  private void aRC()
  {
    if ((getText().toString().equals("")) || (!isFocused()))
    {
      aRD();
      return;
    }
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.iYi, getCompoundDrawables()[3]);
  }

  private void aRD()
  {
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
  }

  private void cp()
  {
    this.iYi.setBounds(0, 0, this.iYi.getIntrinsicWidth(), this.iYi.getIntrinsicHeight());
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.iYi.getIntrinsicWidth());
    arrayOfObject[1] = Integer.valueOf(this.iYi.getIntrinsicHeight());
    z.d("!44@/B4Tb64lLpKV1gYdF8HNDrIV/d4j0/6hFGTPpQharhE=", "imgX width %d height %d", arrayOfObject);
    aRC();
    setHeight(this.iYi.getIntrinsicHeight() + 5 * getResources().getDimensionPixelSize(g.PJ));
    setOnTouchListener(new ap(this));
    addTextChangedListener(new aq(this));
    super.setOnFocusChangeListener(new ar(this));
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof TextView.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    if (!this.iYB)
      paramParcelable = View.BaseSavedState.EMPTY_STATE;
    super.onRestoreInstanceState(paramParcelable);
  }

  public boolean onTextContextMenuItem(int paramInt)
  {
    boolean bool = super.onTextContextMenuItem(paramInt);
    String str;
    if (paramInt == 16908322)
    {
      this.iYC = 0;
      str = getText().toString();
    }
    try
    {
      BO(str);
      return bool;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.iYC);
      z.e("!44@/B4Tb64lLpKV1gYdF8HNDrIV/d4j0/6hFGTPpQharhE=", "!!MMClearEditText Exception %d", arrayOfObject);
      if (this.iYC < 3)
      {
        this.iYC = (1 + this.iYC);
        BO(" " + str);
        return bool;
      }
      z.e("!44@/B4Tb64lLpKV1gYdF8HNDrIV/d4j0/6hFGTPpQharhE=", "!!MMClearEditText, IndexOutOfBoundsException cannot fix");
    }
    return bool;
  }

  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.iYD = paramOnFocusChangeListener;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMClearEditText
 * JD-Core Version:    0.6.2
 */