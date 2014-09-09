package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.mm.pluginsdk.model.downloader.c;

final class j
  implements c
{
  j(AppChooserUI paramAppChooserUI)
  {
  }

  public final void d(String paramString1, String paramString2, boolean paramBoolean)
  {
    if ((paramBoolean) && (AppChooserUI.a(this.hKu) != null))
    {
      AppChooserUI.a(this.hKu).no(p.hKP);
      AppChooserUI.a(this.hKu).notifyDataSetChanged();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.j
 * JD-Core Version:    0.6.2
 */