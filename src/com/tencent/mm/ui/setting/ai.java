package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.n;

final class ai
  implements View.OnClickListener
{
  ai(SettingsAboutMMFooterPreference paramSettingsAboutMMFooterPreference, View paramView)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("title", this.dYk.getResources().getString(n.bVG));
    localIntent.putExtra("rawUrl", this.dYk.getResources().getString(n.cnh));
    localIntent.putExtra("showShare", false);
    a.b(this.dYk.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ai
 * JD-Core Version:    0.6.2
 */