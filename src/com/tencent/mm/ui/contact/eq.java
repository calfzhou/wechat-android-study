package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.ListView;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.ui.base.fy;

final class eq
  implements fy
{
  eq(SelectContactUI paramSelectContactUI)
  {
  }

  public final void kF(String paramString)
  {
    this.jBX.XF();
    SelectContactUI.p(this.jBX).clearFocus();
    if (this.jBX.getString(n.ccR).equals(paramString))
    {
      SelectContactUI.m(this.jBX).setSelection(0);
      SelectContactUI.J(this.jBX);
    }
    String[] arrayOfString;
    int i;
    do
    {
      return;
      do
      {
        do
          arrayOfString = SelectContactUI.g(this.jBX).aWJ();
        while (arrayOfString == null);
        if ("↑".equals(paramString))
        {
          SelectContactUI.m(this.jBX).setSelection(0);
          SelectContactUI.J(this.jBX);
          return;
        }
        boolean bool = "☆".equals(paramString);
        i = 0;
        if (bool)
        {
          int k = SelectContactUI.g(this.jBX).aXB();
          SelectContactUI.m(this.jBX).setSelectionFromTop(k + SelectContactUI.m(this.jBX).getHeaderViewsCount(), SelectContactUI.K(this.jBX).getMeasuredHeight());
          SelectContactUI.L(this.jBX);
          return;
          i++;
        }
      }
      while (i >= arrayOfString.length);
    }
    while (!arrayOfString[i].equals(paramString));
    int j = SelectContactUI.g(this.jBX).getPositionForSection(i);
    SelectContactUI.m(this.jBX).setSelectionFromTop(j + SelectContactUI.m(this.jBX).getHeaderViewsCount(), SelectContactUI.K(this.jBX).getMeasuredHeight());
    SelectContactUI.L(this.jBX);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.eq
 * JD-Core Version:    0.6.2
 */