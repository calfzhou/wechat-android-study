package com.tencent.mm.app;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.am.a;
import com.tencent.mm.c.a.kt;
import com.tencent.mm.c.a.ku;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ch;

final class r extends g
{
  r(WorkerProfile paramWorkerProfile)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    kt localkt = (kt)parame;
    Context localContext = localkt.cOg.context;
    String str = localkt.cOg.cOh;
    if ((localContext == null) || (ch.jb(str)))
      return false;
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", str);
    a.b(localContext, "webview", ".ui.tools.WebViewUI", localIntent);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.r
 * JD-Core Version:    0.6.2
 */