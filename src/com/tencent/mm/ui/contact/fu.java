package com.tencent.mm.ui.contact;

import android.widget.ListView;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.fy;

final class fu
  implements fy
{
  fu(SnsAddressUI paramSnsAddressUI)
  {
  }

  public final void kF(String paramString)
  {
    if (this.jCy.getString(n.ccR).equals(paramString))
      SnsAddressUI.a(this.jCy).setSelection(0);
    String[] arrayOfString;
    int i;
    do
    {
      return;
      do
      {
        do
          arrayOfString = SnsAddressUI.b(this.jCy).aWJ();
        while (arrayOfString == null);
        if ("↑".equals(paramString))
        {
          SnsAddressUI.a(this.jCy).setSelection(0);
          return;
        }
        boolean bool = "☆".equals(paramString);
        i = 0;
        if (bool)
        {
          SnsAddressUI.a(this.jCy).setSelection(SnsAddressUI.b(this.jCy).aXL());
          return;
          i++;
        }
      }
      while (i >= arrayOfString.length);
    }
    while (!arrayOfString[i].equals(paramString));
    int j = SnsAddressUI.b(this.jCy).getPositionForSection(i);
    SnsAddressUI.a(this.jCy).setSelection(j + SnsAddressUI.a(this.jCy).getHeaderViewsCount());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fu
 * JD-Core Version:    0.6.2
 */