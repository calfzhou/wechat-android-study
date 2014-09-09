package com.tencent.mm.ui.contact;

import android.widget.ListView;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.ui.base.fy;

final class gj
  implements fy
{
  gj(VoipAddressUI paramVoipAddressUI)
  {
  }

  public final void kF(String paramString)
  {
    if (this.jCH.getString(n.ccR).equals(paramString))
    {
      VoipAddressUI.g(this.jCH).setSelection(0);
      VoipAddressUI.i(this.jCH);
    }
    String[] arrayOfString;
    int i;
    int j;
    do
    {
      return;
      do
      {
        do
          arrayOfString = VoipAddressUI.a(this.jCH).aWJ();
        while (arrayOfString == null);
        if ("↑".equals(paramString))
        {
          VoipAddressUI.g(this.jCH).setSelection(0);
          VoipAddressUI.i(this.jCH);
          return;
        }
        i = VoipAddressUI.g(this.jCH).getHeaderViewsCount();
        boolean bool = "☆".equals(paramString);
        j = 0;
        if (bool)
        {
          VoipAddressUI.g(this.jCH).setSelectionFromTop(i + VoipAddressUI.a(this.jCH).aXh(), VoipAddressUI.e(this.jCH).getMeasuredHeight());
          VoipAddressUI.j(this.jCH);
          return;
          j++;
        }
      }
      while (j >= arrayOfString.length);
    }
    while (!arrayOfString[j].equals(paramString));
    int k = VoipAddressUI.a(this.jCH).getPositionForSection(j);
    VoipAddressUI.g(this.jCH).setSelectionFromTop(k + i, VoipAddressUI.e(this.jCH).getMeasuredHeight());
    VoipAddressUI.j(this.jCH);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.gj
 * JD-Core Version:    0.6.2
 */