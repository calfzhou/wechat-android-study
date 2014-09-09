package com.tencent.mm.ui.bindlinkedin;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;

final class f
  implements View.OnClickListener
{
  f(BindLinkedInUI paramBindLinkedInUI)
  {
  }

  public final void onClick(View paramView)
  {
    String str = (String)bg.qW().oQ().get(286723);
    if (!ch.jb(str))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", str);
      localIntent.putExtra("geta8key_username", x.pG());
      a.b(this.jjm, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.f
 * JD-Core Version:    0.6.2
 */