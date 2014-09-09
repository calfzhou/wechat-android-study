package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.n;

final class s
  implements View.OnClickListener
{
  s(SendFeedBackUI paramSendFeedBackUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("rawUrl", this.jLO.getString(n.ctL));
    a.b(this.jLO.aPI(), "webview", ".ui.tools.WebViewUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.s
 * JD-Core Version:    0.6.2
 */