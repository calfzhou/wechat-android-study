package com.tencent.mm.ui.tools;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.mm.f;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;

final class eu
  implements TextWatcher
{
  eu(MMTextInputUI paramMMTextInputUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str = paramEditable.toString();
    int i;
    if (!MMTextInputUI.c(this.jUa))
    {
      if (str.trim().length() > 0)
        this.jUa.eB(true);
    }
    else
    {
      if (MMTextInputUI.d(this.jUa) <= 0)
        break label253;
      MMTextInputUI.e(this.jUa);
      i = 0;
      label54: if (i >= str.length())
        break label113;
      if (!ch.l(str.charAt(i)))
        break label101;
      MMTextInputUI.a(this.jUa, 2);
    }
    while (true)
    {
      i++;
      break label54;
      this.jUa.eB(false);
      break;
      label101: MMTextInputUI.a(this.jUa, 1);
    }
    label113: if ((MMTextInputUI.f(this.jUa) >= MMTextInputUI.g(this.jUa)) && (MMTextInputUI.f(this.jUa) <= MMTextInputUI.d(this.jUa)))
    {
      this.jUa.eB(true);
      MMTextInputUI.h(this.jUa).setVisibility(0);
      MMTextInputUI.h(this.jUa).setTextColor(this.jUa.getResources().getColor(f.OX));
      TextView localTextView2 = MMTextInputUI.h(this.jUa);
      MMTextInputUI localMMTextInputUI3 = this.jUa;
      int m = n.OX;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(MMTextInputUI.d(this.jUa) - MMTextInputUI.f(this.jUa) >> 1);
      localTextView2.setText(localMMTextInputUI3.getString(m, arrayOfObject2));
      label253: return;
    }
    if (MMTextInputUI.f(this.jUa) > MMTextInputUI.d(this.jUa))
    {
      this.jUa.eB(false);
      MMTextInputUI.h(this.jUa).setVisibility(0);
      MMTextInputUI.h(this.jUa).setTextColor(this.jUa.getResources().getColor(f.OY));
      TextView localTextView1 = MMTextInputUI.h(this.jUa);
      MMTextInputUI localMMTextInputUI2 = this.jUa;
      int k = n.cmm;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(1 + (MMTextInputUI.f(this.jUa) - MMTextInputUI.d(this.jUa) >> 1));
      localTextView1.setText(localMMTextInputUI2.getString(k, arrayOfObject1));
      return;
    }
    MMTextInputUI localMMTextInputUI1 = this.jUa;
    boolean bool;
    if (MMTextInputUI.c(this.jUa))
      bool = true;
    while (true)
    {
      localMMTextInputUI1.eB(bool);
      MMTextInputUI.h(this.jUa).setVisibility(8);
      return;
      int j = MMTextInputUI.f(this.jUa);
      bool = false;
      if (j > 0)
        bool = true;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.eu
 * JD-Core Version:    0.6.2
 */