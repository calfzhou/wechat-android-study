package com.tencent.mm.pluginsdk.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.pluginsdk.model.downloader.FileDownloadManger;
import com.tencent.mm.pluginsdk.model.x;
import com.tencent.mm.pluginsdk.model.y;

final class g
  implements View.OnClickListener
{
  g(AppChooserUI paramAppChooserUI)
  {
  }

  public final void onClick(View paramView)
  {
    int i;
    if (AppChooserUI.a(this.hKu) != null)
    {
      i = AppChooserUI.a(this.hKu).aER();
      if (i != p.hKN)
        break label232;
      if ((AppChooserUI.b(this.hKu) != null) && (AppChooserUI.b(this.hKu).isShowing()))
      {
        AppChooserUI.a(this.hKu).no(p.hKO);
        AppChooserUI.a(this.hKu).notifyDataSetChanged();
      }
      this.hKu.aPI();
      FileDownloadManger.h(AppChooserUI.f(this.hKu).Dz(), AppChooserUI.f(this.hKu).ayA(), "", "qq_browser_apk_md5");
      y.ayB();
      y.mn(AppChooserUI.g(this.hKu));
      if (AppChooserUI.g(this.hKu) == 0)
      {
        if (!AppChooserUI.h(this.hKu))
          break label188;
        localn2 = n.fTF;
        arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(4);
        arrayOfObject2[1] = Integer.valueOf(AppChooserUI.i(this.hKu));
        localn2.d(11168, arrayOfObject2);
      }
    }
    label188: label232: 
    while (i != p.hKP)
    {
      n localn2;
      Object[] arrayOfObject2;
      return;
      n localn1 = n.fTF;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(3);
      arrayOfObject1[1] = Integer.valueOf(AppChooserUI.i(this.hKu));
      localn1.d(11168, arrayOfObject1);
      return;
    }
    this.hKu.cD(AppChooserUI.j(this.hKu));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.g
 * JD-Core Version:    0.6.2
 */