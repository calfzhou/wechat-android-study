package com.tencent.mm.ui.contact;

import android.widget.ListView;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.fy;

final class j
  implements fy
{
  j(e parame)
  {
  }

  public final void kF(String paramString)
  {
    if (this.jxW.getString(n.ccR).equals(paramString))
      e.c(this.jxW).setSelection(0);
    String[] arrayOfString;
    int i;
    do
    {
      return;
      do
      {
        do
          arrayOfString = e.a(this.jxW).aWJ();
        while (arrayOfString == null);
        if ("↑".equals(paramString))
        {
          e.c(this.jxW).setSelection(0);
          return;
        }
        boolean bool = "☆".equals(paramString);
        i = 0;
        if (bool)
        {
          e.c(this.jxW).setSelection(e.c(this.jxW).getHeaderViewsCount());
          return;
          i++;
        }
      }
      while ((i >= arrayOfString.length) || (arrayOfString[i] == null));
    }
    while (!arrayOfString[i].equals(paramString));
    int j = e.a(this.jxW).getPositionForSection(i);
    e.c(this.jxW).setSelection(j + e.c(this.jxW).getHeaderViewsCount());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.j
 * JD-Core Version:    0.6.2
 */