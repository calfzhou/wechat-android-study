package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.n;
import java.lang.ref.WeakReference;

final class ah
  implements View.OnClickListener
{
  ah(ag paramag)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("title", ((Context)ag.a(this.iXb).get()).getString(n.bUc));
    localIntent.putExtra("rawUrl", ((Context)ag.b(this.iXb).get()).getString(n.bUb));
    localIntent.putExtra("showShare", false);
    a.b((Context)ag.c(this.iXb).get(), "webview", ".ui.tools.WebViewUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.ah
 * JD-Core Version:    0.6.2
 */