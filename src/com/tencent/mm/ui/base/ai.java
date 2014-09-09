package com.tencent.mm.ui.base;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

public final class ai
  implements TextWatcher, View.OnKeyListener
{
  private String ffE;
  private ak iYm;
  private aj iYn;
  private al iYo;
  private EditText iYp;
  private int iYq = 4;
  private int mIndex = 0;

  public ai(EditText paramEditText)
  {
    this.iYp = paramEditText;
  }

  public final void a(aj paramaj)
  {
    this.iYn = paramaj;
  }

  public final void a(ak paramak)
  {
    this.iYm = paramak;
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    int i = 0;
    this.ffE = paramEditable.toString();
    String str = "";
    if (this.iYo != null)
      this.iYo.aRE();
    int j = 0;
    while (i < this.ffE.length())
    {
      j++;
      if (j > this.iYq)
        break;
      str = str + this.ffE.charAt(i);
      i++;
    }
    if (j > this.iYq)
    {
      this.iYp.setText(str);
      this.iYp.setSelection(str.length());
    }
    if ((j >= this.iYq) && (this.iYm != null))
      this.iYm.pr(this.mIndex);
  }

  public final void b(al paramal)
  {
    this.iYo = paramal;
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 67) && (this.iYp.getText().toString().trim().length() == 0) && (this.iYn != null))
      this.iYn.pq(this.mIndex);
    return false;
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void pp(int paramInt)
  {
    this.iYq = paramInt;
  }

  public final void setIndex(int paramInt)
  {
    this.mIndex = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ai
 * JD-Core Version:    0.6.2
 */