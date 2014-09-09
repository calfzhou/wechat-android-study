package com.tencent.mm.ui.contact;

import android.view.View;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.z;

final class el
  implements com.tencent.mm.pluginsdk.ui.ap
{
  el(SelectContactUI paramSelectContactUI)
  {
  }

  public final void vt(String paramString)
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[bool];
    arrayOfObject[0] = paramString;
    z.d("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "onSearchTextChange  %s", arrayOfObject);
    String str = com.tencent.mm.platformtools.ap.iV(paramString);
    SelectContactUI.b(this.jBX, bool);
    SelectContactUI.y(this.jBX);
    dp localdp = SelectContactUI.g(this.jBX);
    SelectContactUI localSelectContactUI2;
    if (!com.tencent.mm.platformtools.ap.jb(paramString))
    {
      localdp.fv(bool);
      if (!SelectContactUI.z(this.jBX))
        break label216;
      localSelectContactUI2 = this.jBX;
      if (!com.tencent.mm.platformtools.ap.jb(paramString))
        break label208;
    }
    label208: for (int j = fl.jCe; ; j = fl.jCd)
    {
      localSelectContactUI2.qy(j);
      if ((SelectContactUI.A(this.jBX)) && (SelectContactUI.B(this.jBX) != null))
      {
        View localView2 = SelectContactUI.B(this.jBX).findViewById(i.akC);
        if (localView2 != null)
          localView2.setVisibility(8);
      }
      if ((SelectContactUI.C(this.jBX)) && (SelectContactUI.D(this.jBX) != null))
      {
        View localView1 = SelectContactUI.D(this.jBX).findViewById(i.akC);
        if (localView1 != null)
          localView1.setVisibility(8);
      }
      SelectContactUI.d(this.jBX, str);
      return;
      bool = false;
      break;
    }
    label216: SelectContactUI localSelectContactUI1 = this.jBX;
    if (com.tencent.mm.platformtools.ap.jb(paramString));
    for (int i = fl.jCg; ; i = fl.jCd)
    {
      localSelectContactUI1.qy(i);
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.el
 * JD-Core Version:    0.6.2
 */