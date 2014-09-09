package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import java.lang.ref.WeakReference;

final class aj
  implements View.OnClickListener
{
  aj(ag paramag)
  {
  }

  public final void onClick(View paramView)
  {
    if (!ap.t((Context)ag.e(this.iXb).get(), ag.f(this.iXb)))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("title", ((Context)ag.g(this.iXb).get()).getString(n.bUf));
      localIntent.putExtra("rawUrl", ((Context)ag.h(this.iXb).get()).getString(n.bUb));
      localIntent.putExtra("showShare", false);
      a.b((Context)ag.i(this.iXb).get(), "webview", ".ui.tools.WebViewUI", localIntent);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.aj
 * JD-Core Version:    0.6.2
 */