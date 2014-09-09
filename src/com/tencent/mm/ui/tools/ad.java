package com.tencent.mm.ui.tools;

import android.widget.ListView;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.fy;

final class ad
  implements fy
{
  ad(CountryCodeUI paramCountryCodeUI)
  {
  }

  public final void kF(String paramString)
  {
    int i = paramString.charAt(0);
    if (this.jPj.getString(n.ccR).equals(paramString))
      CountryCodeUI.b(this.jPj).setSelection(0);
    while (true)
    {
      return;
      int[] arrayOfInt = CountryCodeUI.c(this.jPj).aZM();
      int j = 0;
      if (arrayOfInt != null)
        while (j < arrayOfInt.length)
        {
          if (arrayOfInt[j] == i)
          {
            CountryCodeUI.b(this.jPj).setSelection(j + CountryCodeUI.b(this.jPj).getHeaderViewsCount());
            return;
          }
          j++;
        }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ad
 * JD-Core Version:    0.6.2
 */